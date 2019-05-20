package spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ProfesorFizike implements Profesor {
	
	@Autowired // Field injection (ne treba mi setter)
	@Qualifier("hobi")
	private Oblast oblast;
	
	
	@Override
	public String getGreeting() {
		return "Pozdrav od profesora fizike ";
	}
	@Override
	public String getOblastRada() {
		return oblast.getOblast();
	}
}
