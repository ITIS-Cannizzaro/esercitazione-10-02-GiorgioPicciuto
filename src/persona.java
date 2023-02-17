public abstract class persona  {
	String Agente;
	String Cliente;
	String Prenotazione;
	String Volo;
	protected persona(String agente, String cliente, String prenotazione, String volo) {
		super();
		Agente = agente;
		Cliente = cliente;
		Prenotazione = prenotazione;
		Volo = volo;
	}
}
class agente {
	String Prenotazione;
	String Cliente;
	String Volo;
	int Costo;
	public agente(String prenotazione, String cliente, String volo, int costo) {
		Prenotazione = prenotazione;
		Cliente = cliente;
		Volo = volo;
		Costo = costo;
	}
	
}

class cliente {
	String Prenotazione;
	String Costo;
	String Volo;
	public cliente(String prenotazione, String costo, String volo) {
		Prenotazione = prenotazione;
		Costo = costo;
		Volo = volo;
	}
	
}

class prenotazione {
	int Costo;
	String Volo;
	String Cliente;
	public prenotazione(int costo, String volo, String cliente) {
		Costo = costo;
		Volo = volo;
		Cliente = cliente;
	}
	
}

class volo {
	int Costo;
	String Prenotazione;
	String Cliente;
	public volo(int costo, String prenotazione, String cliente) {
		Costo = costo;
		Prenotazione = prenotazione;
		Cliente = cliente;
	}
	
	
}