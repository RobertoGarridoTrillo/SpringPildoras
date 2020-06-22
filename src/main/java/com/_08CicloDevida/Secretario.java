package com._08CicloDevida;

/**
 *
 * @author Roberto Garrido Trillo
 */
public class Secretario implements IEmpleados {

   public Secretario (ICreacionInformes informeNuevo)
   {
      this.informeNuevo = informeNuevo;
   }

   @Override
   public String getInforme ()
   {
      return "Informe creado por el Secretario: " + informeNuevo.getinforme();
   }

   public void init ()
   {
      System.out.println("Dentro del método init");
   }

   // método destroy. Ejecutar tareas despues de que el bean haya sido usado
   public void destroy ()
   {
      System.out.println("Dentro del metodo destroy");
   }


   // Creacion de campo tipo CreacionInforme (interface)
   private ICreacionInformes informeNuevo;
}
