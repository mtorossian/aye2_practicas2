package aye2.practica6;

public class Empleado {
	private int numero;
	private String nombre;
	
	public Empleado() {
		numero = 0;
		nombre = " ";
	}
	
	public Empleado(int n, String nombre) ( 	//SHADOWING
			numero = n;
			this.nombre = nombre;
	}

	public int getNumero () {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getNombre () {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void verDatos() {
		System.out.println("empleado:" + numero + "nombre" + nombre);
	}
		
			
	
	public int getNumero() {
		return numero;
		
	}

}