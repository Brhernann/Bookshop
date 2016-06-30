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
    private SocioD cnn;

    @RequestMapping(method = RequestMethod.POST)
    public String crear(@RequestParam("txtrut") String rut,
            @RequestParam("txtnombre") String nombre,
            @RequestParam("txtapellido") String apellido,
            @RequestParam("txtcorreo") String correo,
            @RequestParam("txttelefonono") String telefono, Model m) throws ServicioException {

        if (rut.trim().equals("") || nombre.trim().equals("")
                || apellido.trim().equals("") || correo.trim().equals("") || telefono.trim().equals("")) {

            String campos = "Los campos estan vacio";
            m.addAttribute("error", campos);
            return "Error";
        } else {

            int Ntelefono;

            try {
                Ntelefono = Integer.parseInt(telefono);
            } catch (Exception e) {

                String numerico = "Inserte un numero valido";
                m.addAttribute("error", numerico);
                return "Error";

            }

            Socios soc = cnn.BuscarJPQL(rut);

            if (soc == null) {

                cnn.CrearJPQL(soc);
                String registrado = "Ha registrado Correctamente el libro!";
                m.addAttribute("exitoso", registrado);
                return "Exito";
            } else {

                String existencia = "El Usuario ya se encuentra Registrado!";
                m.addAttribute("error", existencia);
                return "Error";

            }

        }

    }

}
