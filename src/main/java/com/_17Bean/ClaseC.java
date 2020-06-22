package com._17Bean;

public class ClaseC implements InterfaceC {

   // campo de clase para la inyeccion
   private InterfaceD interfaceD;

   // constructor
   public ClaseC (InterfaceD interfaceD)
   {
      this.interfaceD = interfaceD;
   }

   @Override
   public String metodoInterfaceC ()
   {
      return "Estoy es metodoInterfaceC de la clase C\n" + interfaceD.metodoInterfaceD();
   }

}
