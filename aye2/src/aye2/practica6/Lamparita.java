package aye2.practica6;

public class Lamparita {

	enum EstadoLamparita {ENCENDIDA, APAGADA};
	
	private EstadoLamparita estado;
	
	//private booleano estado;
	
	public Lamparita() {
		estado = EstadoLamparita.APAGADA;
	}
	public void encender () {
		estado = EstadoLamparita.ENCENDIDA;
	}
	public void apagar () {
		estado = EstadoLamparita.APAGADA;
	}
	
	public EstadoLamparita getEstado () {
		return estado;
	}
	
}
