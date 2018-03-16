package br.com.caelum.desafio;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class PalindromoTest {

	private Palindromo palindromo;


	@Before
	public void setUp(){
		palindromo = new Palindromo();
	}
	
	@Test
	public void testShouldSayThatAbaIsAPalindrom(){
		
		// cenário
		String parametro = "aba";
		
		// ação
		boolean ehPalindromo = palindromo.ehPalindromo(parametro);
		
		// avaliação
		Assert.assertEquals(true, ehPalindromo);
	}
	
	
	@Test
	public void testShouldSayThatAbbIsNotAPalindrom(){
		
		String word = "abb";
		
		Assert.assertEquals(false, palindromo.ehPalindromo(word));
		
	}
}
