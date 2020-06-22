package com._06Inyeccion_Mitocode;

/**
 *
 * @author Roberto Garrido Trillo 
 */
public class Messi
{
	private IEquipo equipo;
		
	public Messi (IEquipo equipo) {
		this. equipo = equipo;
	}
	
	public void mostrarEquipo () {
		equipo. mostrar ();
	}
}
