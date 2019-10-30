package services;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	CalculadoraPontuacaoBoliche calculadora = new CalculadoraPontuacaoBoliche();
	int[] jogadaSemStrikeOuSpare = {1,4, 4,5, 6,1, 5,1, 1,0, 1,7, 3,6, 4,1, 2,1, 6,0};
	int[] jogadaComStrike = {0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 10, 2,3, 0,0};
	int[] jogadaComSpare = {2,8, 2,3, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0};
	int[] jogadaComStrikeESpare = {1,4, 4,5, 6,4, 5,5, 10, 0,1, 7,3, 6,4, 10, 2,8};
	int[] jogoPerfeito = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
			
	@Test
	void jogadaSemStrikeOuSpareTest() {		
		assertEquals(59, testaJogada(jogadaSemStrikeOuSpare));
	}
	
	@Test
	void jogadaComStrikeTest() {	
		assertEquals(20, testaJogada(jogadaComStrike));
	}
	
	@Test
	void jogadaComSpareTest() {		
		assertEquals(17, testaJogada(jogadaComSpare));
	}
	
	@Test
	void jogadaComStrikeESpareTest() {		
		assertEquals(127, testaJogada(jogadaComStrikeESpare));
	}
	
	@Test
	void jogoPerfeitoTest() {		
		assertEquals(300, testaJogada(jogoPerfeito));
	}
	
	private int testaJogada(int[] jogadas) {
		return calculadora.pontuacaoDoJogo(jogadas);
	}

}
