package services;

public class CalculadoraPontuacaoBoliche {		
	
	private static final int STRIKE = 10;
	private static final int TOTALRODADAS = 10;
	
	public int pontuacaoDoJogo(int[] jogadas) { 
				
		int somaPontos = 0;
		int qteJogadas = jogadas.length;
		
		for (int i = 0; i < qteJogadas; i++) {
			somaPontos += jogadas[i];
		}
		
		return somaPontos;
		
	}

}
