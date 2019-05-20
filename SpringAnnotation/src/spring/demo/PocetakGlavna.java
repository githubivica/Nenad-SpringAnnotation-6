package spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PocetakGlavna {

	public static void main(String[] args) {
		

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Profesor p = context.getBean("profaMatematike",Profesor.class);
		Profesor p1 = context.getBean("profesorFizike",Profesor.class);
		
		System.out.println(p.getGreeting());
		System.out.println(p.getOblastRada());
		System.out.println(p1.getGreeting());
		System.out.println(p1.getOblastRada());
		//System.out.println(p.getOblastRada());
		
		context.close();


	}

}
