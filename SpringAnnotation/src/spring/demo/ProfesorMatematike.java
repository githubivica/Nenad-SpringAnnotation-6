package spring.demo;

public class ProfesorMatematike implements Profesor {
	
	private String ime;
	
	private Oblast oblast;
	
	
	public ProfesorMatematike(Oblast oblast) {
		super();
		this.oblast = oblast;
	}
	
	public ProfesorMatematike(String ime) {
		super();
		this.ime = ime;
	}
	
	public ProfesorMatematike(String ime, Oblast oblast) {
		super();
		this.ime = ime;
		this.oblast = oblast;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	@Override
	public String getGreeting() {
		return "Pozdrav od profesora matematike " + getIme();
	}
	@Override
	public String getOblastRada() {
		return oblast.getOblast();
	}
	
	
	
}
