package com._14AutowireSingleton;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class UsoAnnotations {

   public static void main (String[] args)
   {
      // leer xml
      ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext09.xml");

      // pedir bean
      IEmpleados antonio = contexto.getBean("comercial", IEmpleados.class);
      IEmpleados lucia = contexto.getBean("comercial", IEmpleados.class);

// usar bean
      System.out.println(antonio.getInforme());
      System.out.println(lucia.getTareas());

      System.out.println(antonio);
      System.out.println(lucia);
      if (antonio.equals(lucia)) {
         System.out.println("Son iguales");
      } else {
         System.out.println("son diferentes");
      }


      // cerrar contexto
      contexto.close();
   }
}
