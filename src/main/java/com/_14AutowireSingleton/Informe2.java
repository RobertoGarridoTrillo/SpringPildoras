package com._14AutowireSingleton;

import org.springframework.stereotype.Component;

/**
 *
 * @author Roberto Garrido Trillo
 */
@Component
public class Informe2 implements ICrearInforme {

   @Override
   public String getInforme ()
   {
      return "Presentación de informe del segundo trimeste";
   }

}
