package spring.demo;

import org.springframework.beans.factory.annotation.Value;

public class ProfesorIstorije implements Profesor{
	@Value("${profa.ime}")
	private String ime;
		
	private Oblast oblast;
	
	public ProfesorIstorije(Oblast oblast) {
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
		return "Pozdrav od profe istorije!" + getIme();
	}

	@Override
	public String getOblastRada() {
		return oblast.getOblast();
	}

}
