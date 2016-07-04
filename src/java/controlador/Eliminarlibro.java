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
@RequestMapping("/EliminarLibro.htm")
public class Eliminarlibro {

//    @Autowired
//    private LibroD crud;
//
//    @RequestMapping(method = RequestMethod.POST)
//    public String crear(@RequestParam("txtisbn") String isbn, Model m) throws ServicioException {
//        
//        if (isbn.trim().equals("")) {
//
//            String campos = "Campos Vacios";
//            m.addAttribute("error", campos);
//            return "Error";
//        } else {
//            int Nisbn = 0;
//            int verificacion = 0;
//            try {
//            Nisbn = Integer.parseInt(isbn);
//            } catch(NumberFormatException e){
//                
//                String error = "ISBN, es un campo númerico";
//                m.addAttribute("error", error);
//                verificacion = 1;
//                return "Error";
//            }
//            if (crud.BorrarLibro(li)) {               
//                String borrado = "Se han borrado los datos del libro";
//                m.addAttribute("exitoso", borrado);
//                return "Exito";
//
//            } else {
//                String existencia = "El Libro ya se encuentra Registrado!";
//                m.addAttribute("error", existencia);
//                return "Error";
//
//            }
//            
//
//        }
//
//    }

}