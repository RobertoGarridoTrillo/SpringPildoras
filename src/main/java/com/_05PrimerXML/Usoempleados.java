package com._05PrimerXML;

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
      // Usar el bean
      System.out.println(roberto.getTareas());
      // Cerrar el contexto
      contexto.close();
   }

}
