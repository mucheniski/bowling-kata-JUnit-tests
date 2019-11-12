package services;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	CalculadoraPontuacaoBoliche calculadora = new CalculadoraPontuacaoBoliche();	
	int[] jogoSemStrikeOuSpare = {0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 1,2, 3,0, 0,0};
	
	@Test
	void jogoSemStrikeOuSpareTest() {
		assertEquals(6, resultadoJogo(jogoSemStrikeOuSpare));
	}
	
	private int resultadoJogo(int[] jogadas) {
		return calculadora.pontuacaoDoJogo(jogadas); 
	}	

}
