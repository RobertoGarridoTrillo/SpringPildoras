package com._02InversionSimplificado;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class ClaseA {

   public static void main (String[] args)
   {
      // creacion de objetos de tipo claseB
      ClaseB claseB = new ClaseB();

      // uso de los objetos creados
      System.out.println(claseB.getInterfaceB());
   }
}
