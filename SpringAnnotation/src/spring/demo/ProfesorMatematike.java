package spring.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("profaMatematike")  // U zagradi je bean id, sami smo imenovali bean
@Scope("prototype")			// Prototype scope
public class ProfesorMatematike implements Profesor {
	
	private Oblast oblast;
	
	
	@Autowired // Constructor injection
	public ProfesorMatematike(@Qualifier("primenjenaOblast")Oblast oblast) {
		super();
		this.oblast = oblast;
	}


	@Override
	public String getGreeting() {
		return "Pozdrav od profesora matematike ";
	}
	@Override
	public String getOblastRada() {
		return oblast.getOblast();
	}
	
	@PostConstruct
	public void inicijalizacija() {
		System.out.println("Ovo je post init metod");
	}
	@PreDestroy
	public void unisti() {
		System.out.println("Ovo je pre destroy"); 
	}
	
	
}
