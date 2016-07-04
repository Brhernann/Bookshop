package controlador;

import entidades.Socios;
import modelo.ServicioException;
import modelo.SocioD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/CrearSocio.htm")
public class CrearSocio {
    
    @Autowired
    private SocioD crud;
    
    @RequestMapping(method = RequestMethod.POST)
    public String crear(@RequestParam("txtrut") String rut, 
            @RequestParam("txtnombre") String nombre,
            @RequestParam("txtapellido") String apellido,
            @RequestParam("txtcorreo") String correo,
            @RequestParam("txttelefono") String fono, Model m) throws ServicioException {
        
        if (rut.trim().equals("") || nombre.trim().equals("")|| apellido.trim().equals("")||
                correo.trim().equals("") || fono.trim().equals("")){
            
            String campos = "Campos Vacios";
            m.addAttribute("error", campos);
            return "Error";
        }
        else{
            int telefono = 0;
            int verificacion = 0;
            try {
                telefono = Integer.parseInt(fono);
            } catch (NumberFormatException e) {
                
                String error = "Telefono es campo numerico";
                m.addAttribute("error", error);
                verificacion = 1;
                return "Error";
                
            }
            if (verificacion == 0){
                Socios s = new Socios(rut, nombre, apellido, correo, telefono);
                
                if (crud.BuscarJPQL(rut) == null)
                    crud.CrearJPQL(new Socios(rut, nombre, apellido, correo, telefono));
                    String registrado = "Socio registrado correctamente";
                    m.addAttribute("exitoso", registrado);
                    return "Exito";    
                
            }else{
                    
                    String existencia = "El Socio ya se encuentra Registrado!";
                    m.addAttribute("error", existencia);
                    return "Error";
                 
                }
            }
        
    }

}
