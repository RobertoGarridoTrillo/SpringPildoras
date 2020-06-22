package com._16Configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Roberto Garrido Trillo
 */
@Component
public class ClaseA implements InterfaceA {

   // campo de clase de tipo objeto que vamos a inyectar
   @Autowired
   private InterfaceB interfaceB;

   @Override
   public String metodoInterfaceA ()
   {
      return "Estoy es metodoInterfaceA de la clase A \n" +
               interfaceB.metodoInterfaceB();
   }

}
