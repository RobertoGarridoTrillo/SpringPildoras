package com._17Bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class Uso {

   public static void main (String[] args)
   {

      // Leer archivo de configuracion del archivo con annotations
      AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(ArchivoConfig.class);

      // pedir bean
      InterfaceC antonio = contexto.getBean("claseC", InterfaceC.class);

      // usar bean
      System.out.println("Estoy en Uso.java, usando bean \n" + antonio.metodoInterfaceC() + "\n");
     // System.out.println("Estoy en Uso.java, usando bean \n" + antonio.metodoInterfaceA() + "\n");

      // cerrar contexto
      contexto.close();
   }
}
