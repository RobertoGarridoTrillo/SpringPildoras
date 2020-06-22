package com._16Configuration;

import org.springframework.stereotype.Component;

/**
 *
 * @author Roberto Garrido Trillo
 */
@Component
public class ClaseB implements InterfaceB {

   @Override
   public String metodoInterfaceB ()
   {
      return "Estoy es metodoInterfaceB de la clase B";
   }

}
