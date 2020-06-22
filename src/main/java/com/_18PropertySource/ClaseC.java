package com._18PropertySource;

import org.springframework.beans.factory.annotation.Value;

public class ClaseC implements InterfaceC {

   // campo de clase para la inyeccion
   private InterfaceD interfaceD;

   // campos de clase para inyectar los valores de las propiedades
   @Value ("${email}")
   private String email;
   @Value ("${usuario}")
   private String usuario;

   // constructor
   public ClaseC (InterfaceD interfaceD)
   {
      this.interfaceD = interfaceD;
   }

   // metodos para rescatar los valores de las propiedades inyectados
   public String getEmail ()
   {
      return email;
   }

   public String getUsuario ()
   {
      return usuario;
   }

   @Override
   public String metodoInterfaceC ()
   {
      return "Estoy es metodoInterfaceC de la clase C\n" + interfaceD.metodoInterfaceD();
   }
}
