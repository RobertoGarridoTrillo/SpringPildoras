package com._16Configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class Uso {

   public static void main (String[] args)
   {

      // leer el class de configuracion del archivo XML
      // ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext10.xml");
      
      // Leer archivo de configuracion del archivo con annotations
      AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(ArchivoConfig.class);

      // pedir bean
      InterfaceA antonio = contexto.getBean("claseA", InterfaceA.class);
      InterfaceA lucia = contexto.getBean("claseA", InterfaceA.class);

      // usar bean
      System.out.println("Estoy en Uso.java, usando bean \n" + antonio.metodoInterfaceA() + "\n");
      System.out.println("Estoy en Uso.java, usando bean \n" + lucia.metodoInterfaceA() + "\n");

      // cerrar contexto
      contexto.close();
   }
}
