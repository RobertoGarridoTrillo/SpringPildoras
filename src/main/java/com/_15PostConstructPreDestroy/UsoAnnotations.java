package com._15PostConstructPreDestroy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class UsoAnnotations {

   public static void main (String[] args)
   {
      // leer xml
      ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext10.xml");

      // pedir bean
      IEmpleados antonio = contexto.getBean("comercial", IEmpleados.class);

      // usar bean
      System.out.println(antonio.getInforme());

      // cerrar contexto
      contexto.close();
   }
}
