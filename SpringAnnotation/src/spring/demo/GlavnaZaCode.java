package spring.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GlavnaZaCode {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CodeConfiguration.class);
		Profesor p = context.getBean("profesorIstorije",Profesor.class);
		
		System.out.println(p.getGreeting());
		System.out.println(p.getOblastRada());
		
		context.close();
	}

}
