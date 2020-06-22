package com._06Singleton;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class Usoempleados {

   public static void main (String[] args)
   {
      // crear el contexto
      ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
      // pedir el bean
      IEmpleados roberto = contexto.getBean("miEmpleado", IEmpleados.class);
      IEmpleados pedro = contexto.getBean("miEmpleado", IEmpleados.class);

      System.out.println(roberto);
      System.out.println(pedro);
      if (roberto.equals(pedro)) {
         System.out.println("Son iguales");
      } else {
         System.out.println("son diferentes");

         // Cerrar el contexto
         contexto.close();
      }

   }
}
