package controlador;

import entidades.Libro;
import modelo.LibroD;
import modelo.ServicioException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/EliminarSocio.htm")
public class EliminarSocio {

    @Autowired
    private LibroD crud;

    @RequestMapping(method = RequestMethod.POST)
    public String crear(@RequestParam("txtisbn") String isbn, 
            @RequestParam("txtnombrelibro") String nombre,
            @RequestParam("txtnombreautor") String autor, 
            @RequestParam("txtstock") String stock, Model m) throws ServicioException {

        if (isbn.trim().equals("") || nombre.trim().equals("") || autor.trim().equals("") || stock.trim().equals("")) {

            String campos = "Campos Vacios";
            m.addAttribute("error", campos);
            return "Error";
        } else {
            int Nisbn =0;
            int Nstock=0;
            int verificacion = 0;
            try {
            Nisbn = Integer.parseInt(isbn);
            Nstock = Integer.parseInt(stock);
            } catch(NumberFormatException e){
                
                String error = "ISBN y Stock, son campos numerico";
                m.addAttribute("error", error);
                verificacion = 1;
                return "Error";
            }
            if (verificacion ==0) {
                if (crud.BuscarJPQL(Nisbn) == null)
                crud.CrearJPQL(new Libro(Nisbn, nombre, autor, Nstock));                
                String registrado = "Ha registrado Correctamente el libro!";
                m.addAttribute("exitoso", registrado);
                return "Exito";

            } else {

                String existencia = "El Libro ya se encuentra Registrado!";
                m.addAttribute("error", existencia);
                return "Error";

            }
            

        }

    }

}