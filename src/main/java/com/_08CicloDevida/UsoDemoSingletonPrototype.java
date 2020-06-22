package com._08CicloDevida;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class UsoDemoSingletonPrototype {

   public static void main (String[] args)
   {
      // crear el contexto
      ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext03.xml");

      // pedir el bean
      Secretario maria = contexto.getBean("miSecretario", Secretario.class);
      Secretario pedro = contexto.getBean("miSecretario", Secretario.class);

      System.out.println(maria);
      System.out.println(pedro);
      if (maria.equals(pedro)) {
         System.out.println("Son iguales");
      } else {
         System.out.println("son diferentes");
      }
      
      // uso del bean
      System.out.println(maria.getInforme());
      // cerrar contexto
      contexto.close();

   }
}
