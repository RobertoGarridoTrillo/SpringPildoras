package com._18PropertySource;

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
      ClaseC bean = contexto.getBean("claseC", ClaseC.class);

      // usar bean
      System.out.println("Estoy en Uso.java, usando bean \n" + bean.metodoInterfaceC() + "\n");

      // usar bean para la inyeccion de valores de propiedades
      System.out.println("Email: " + bean.getEmail() + "\n");
      System.out.println("Usuario: " + bean.getUsuario() + "\n");

      // cerrar contexto
      contexto.close();
   }
}
 