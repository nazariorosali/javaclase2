package com.senati.Ddw05;

import com.senati.Ddw05.Persona;

public class ImplementarPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Datos Registrados");
		
		Persona obre1= new Persona(1,"Mati","Mattos","M","26-12-200");
		Persona obre2= new Persona(2,"Alex","Gomez","M","02-02-02");
		Persona obre3= new Persona(3,"Carla","More","F","20-09-200");
		Persona obre4= new Persona(4,"Alfredo","Cortez","M","03-12-200");
		Persona obre5= new Persona(5,"Daniel","Ramos","M","22-09-200");
		
		
		Persona Ger1= new Persona (1,"Flor","Lopez","F","29-10-2001");
		
		
		System.out.println(obre1.toString());
		System.out.println(obre2.toString());
		System.out.println(obre3.toString());
		System.out.println(obre4.toString());
		System.out.println(obre5.toString());
		
		System.out.println(Ger1.toString());
		


	}

}
