package com._03InversionConInterfaces;

/**
 *
 * @author Roberto Garrido Trillo 
 */
public class Usoempleados
{
	public static void main (String [] args)
	{
		// creacion de objetos de tipo empleado
		//Empleados Empleado1 = new Jefe ();
		Empleados Empleado1 = new Secretario ();

		// uso de los objetos creados
		System.out.println(Empleado1.getTareas());
	}
}

