package com._10AutowiredConstructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Roberto Garrido Trillo 
 */
public class UsoAnnotations
{
	public static void main (String [] args)
	{
		// leer xml
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext05.xml");

		// pedir bean
		IEmpleados antonio = contexto. getBean ("comercial", IEmpleados.class);

		// usar bean
		System.out.println(antonio. getInforme ());
		System.out.println(antonio. getTareas ());

		// cerrar contexto
		contexto. close ();
	}
}
