package com._04InversionConInterfacesSimplificado;

/**
 *
 * @author Roberto Garrido Trillo 
 */
public class ClaseC implements InterfaceB
{

	@Override
	public String getInterfaceB ()
	{
		return "Estoy en getInterfaceB de la claseC";
	}
}

