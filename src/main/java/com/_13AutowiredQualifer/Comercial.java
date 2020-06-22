package com._13AutowiredQualifer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 *
 * @author Roberto Garrido Trillo
 */
@Component
public class Comercial implements IEmpleados {
   // campo de clase de tipo objeto que vamos a inyectar

   @Autowired
   @Qualifier("informe1")
   private ICrearInforme nuevoInforme;


   public void setNuevoInforme (ICrearInforme nuevoInforme)
   {
      this.nuevoInforme = nuevoInforme;
   }

   @Override
   public String getTareas ()
   {
      return "Vender, vender y vender más";
   }


   @Override
   public String getInforme ()
   {
      return "Esto es un informe generado por el comercial \n" +
              nuevoInforme.getInforme();
   }
}
