package testes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import facade.Lab3Facade;

public class Testes {
	
	private Lab3Facade lab3;
	
	@Before
	public void configure() {
		lab3 = Lab3Facade.getInstance();
	}
	
	@Test
	public void testaLerArquivoComKeyWords(){
		Assert.assertEquals(true,lab3.lerKeyWords("java keywords.txt"));
		Assert.assertEquals(true,lab3.lerKeyWords());
		Assert.assertEquals(false,lab3.lerKeyWords("naoExisteArquivoComEssePath"));
		Assert.assertEquals(false,lab3.lerKeyWords("nemComEsse.txt"));
	}
	
	@Test
	public void testaContagemPalavras(){
	}
}