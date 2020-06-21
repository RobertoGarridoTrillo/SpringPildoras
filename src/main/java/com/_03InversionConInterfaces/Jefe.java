package com._03InversionConInterfaces;

/**
 *
 * @author Roberto Garrido Trillo 
 */
public class Jefe implements Empleados
{
	@Override
	public String getTareas ()
	{
		return "Las cuestiones relativas a los jefes";
	}
}

