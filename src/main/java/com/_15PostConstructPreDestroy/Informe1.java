package com._15PostConstructPreDestroy;

import org.springframework.stereotype.Component;

/**
 *
 * @author Roberto Garrido Trillo 
 */
@Component
public class Informe1 implements ICrearInforme
{

	@Override
	public String getInforme ()
	{
		return "Presentación de informe del primer trimeste";
	}

} 
