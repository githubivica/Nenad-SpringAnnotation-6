package spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ProfesorGeografije implements Profesor {
	
	
	private Oblast oblast;
	
	public Oblast getOblast() {
		return oblast;
	}

	public void setOblast(Oblast oblast) {
		this.oblast = oblast;
	}
	
	@Autowired // Method injection
	@Qualifier("primenjenaOblast")
	public void nekaBezvezeMetoda(Oblast oblast) {
		this.oblast = oblast;
	}
	
	@Override
	public String getGreeting() {
		return "Pozdrav od profesora geografije ";
	}
	@Override
	public String getOblastRada() {
		return oblast.getOblast();
	}
}
