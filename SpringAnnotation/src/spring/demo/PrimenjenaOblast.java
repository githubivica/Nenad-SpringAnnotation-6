package spring.demo;

import org.springframework.stereotype.Component;

@Component
public class PrimenjenaOblast implements Oblast {

	@Override
	public String getOblast() {
		return "Ja se bavim ovim naukama!";
	}

}
