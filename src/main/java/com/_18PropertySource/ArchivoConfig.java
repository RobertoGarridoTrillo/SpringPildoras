package com._18PropertySource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 *
 * @author Roberto Garrido Trillo
 */
@Configuration
@ComponentScan("com._18PropertySource")
@PropertySource("classpath:valor.propiedades")
public class ArchivoConfig {

   // Definir el bean para ClaseD que devuelve el objeto de tipo ClaseD
   @Bean
   public ClaseD claseD ()
   {
      return new ClaseD();
   }

   // Definir el bean para ClaseC e inyectar dependencias de la claseD
   @Bean
   public ClaseC claseC ()
   {
      return new ClaseC(claseD());
   }
}
