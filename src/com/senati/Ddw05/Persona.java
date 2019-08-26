package com.senati.Ddw05;

public class Persona {
	//Atributo de la Clase
	int id;
	String nombre;
	String apellido;
	String sexo;
	String fnacimiento;
	public Persona(int id, String nombre, String apellido, String sexo, String fnacimiento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.fnacimiento = fnacimiento;
	}
	public Persona() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getFnacimiento() {
		return fnacimiento;
	}
	public void setFnacimiento(String fnacimiento) {
		this.fnacimiento = fnacimiento;
	}
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", sexo=" + sexo
				+ ", fnacimiento=" + fnacimiento + "]";
	}


}
