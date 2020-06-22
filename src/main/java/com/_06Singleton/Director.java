package com._06Singleton;

/**
 *
 * @author Roberto Garrido Trillo 
 */
public class Director implements IEmpleados
{
	@Override
	public String getTareas ()
	{
		return "Soy un Director y gestiono la plantilla de la empresa";
	}
}

