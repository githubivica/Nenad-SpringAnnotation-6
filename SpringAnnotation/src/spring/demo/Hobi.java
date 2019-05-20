package spring.demo;

import org.springframework.stereotype.Component;

@Component
public class Hobi implements Oblast {

	@Override
	public String getOblast() {
		return "Ovo je moj hobi!";
	}

}
