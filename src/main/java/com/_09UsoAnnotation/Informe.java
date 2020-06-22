package com._09UsoAnnotation;

import org.springframework.stereotype.Component;

/**
 *
 * @author Roberto Garrido Trillo 
 */
@Component
public class Informe implements ICrearInforme
{

	@Override
	public String getInforme ()
	{

		return "Presentación de informe del primer trimeste";
	}

}
