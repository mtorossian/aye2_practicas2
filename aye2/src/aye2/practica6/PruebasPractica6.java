package aye2.practica6;

public class PruebasPractica6 {

	public static void main(String[] args) {
		
		Lamparita lamp1 = new Lamparita ();
		
		System.out.println ("La lamparita esta" + lamp1.getEstado().toString());
		
		lamp1.encender();
		
		System.out.println((" La lamparita esta " + lamp1.getEstado () );

	}

}

	//Ejercicio 6 : Prueba de Hora

	Hora h1 = new Hora(1, 140, 160);
	
	System.out.println( "La hora h1 es : "  + h1);
	
	System.out.println( )
	
	
	
	
	//Ejercicio 7: Empleado
	
	Empleado emp = new Empleado(1, "Pepe");
	emp.verDatos();
	}
	
	