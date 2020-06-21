package com._03InversionConInterfaces;

/**
 *
 * @author Roberto Garrido Trillo 
 */
public class Secretario implements Empleados
{
	@Override
	public String getTareas ()
	{
		return "Gestionar la agenda de los jefes";
	}
}
