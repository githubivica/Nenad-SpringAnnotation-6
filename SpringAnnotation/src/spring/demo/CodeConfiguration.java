package spring.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("spring.demo")
@PropertySource("classpath:profa.properties")
public class CodeConfiguration {
	
	
	@Bean
	public Oblast nekaOblast() {
		return new Hobi();
	}
	
	@Bean
	public Profesor profesorIstorije() {
		
		return new ProfesorIstorije(nekaOblast());
	}
}
