/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import modelo.ServicioException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com> 
 */
@Controller
@RequestMapping("/CrearSocio.htm")
public class Direcionsocio{@RequestMapping(method = RequestMethod.GET) 

  public String mandar() throws ServicioException{
      
      return  "CrearSocio";
  }
  
}