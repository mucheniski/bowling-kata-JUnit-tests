package services;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	CalculadoraPontuacaoBoliche calculadora = new CalculadoraPontuacaoBoliche();	
	int[] jogoSemStrikeOuSpare = {0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 1,2, 3,0, 0,0};
	int[] jogoComStrike = {0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 10, 2,3, 0,0};
	int[] jogoComSpare = {0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 2,8, 2,3, 0,0};
	int[] jogoComSpareEStrike = {1,4, 4,5, 6,4, 5,5, 10, 0,1, 7,3, 6,4, 10, 2,8, 6};
	int[] jogoPerfeito = {10 , 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
	
	@Test
	void jogoSemStrikeOuSpareTest() {
		assertEquals(6, resultadoJogo(jogoSemStrikeOuSpare));
	}
	
	@Test
	void jogoComStrikeTest() {
		assertEquals(20, resultadoJogo(jogoComStrike));
	}
	
	@Test
	void jogoComSpareTest() {
		assertEquals(17, resultadoJogo(jogoComSpare));
	}
	
	@Test
	void jogoComSpareEStrikeTest() {
		assertEquals(133, resultadoJogo(jogoComSpareEStrike));
	}
	
	@Test
	void jogoPerfeitoTest() {
		assertEquals(300, resultadoJogo(jogoPerfeito));
	}
	
	private int resultadoJogo(int[] jogadas) {
		return calculadora.pontuacaoDoJogo(jogadas); 
	}	

}
