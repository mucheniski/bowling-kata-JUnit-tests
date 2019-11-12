package services;

public class CalculadoraPontuacaoBoliche {		
	
	private static final int STRIKE = 10;
	private static final int TOTALRODADAS = 10;
	
	public int pontuacaoDoJogo(int[] jogadas) { 
				
		int somaPontos = 0;		
		int rodada = 0;
		int contaJogadas = 0;
		
		for (int i = 0; i < jogadas.length; i++) {
			somaPontos += jogadas[i];
			contaJogadas++;
			if (isStrike(jogadas[i])) {
				rodada++;
				if(isUltimaRodada(rodada)) {
					somaPontos += bonusStrike(jogadas[i+1], jogadas[i+2]);
					return somaPontos;
				}
				else {
					somaPontos += bonusStrike(jogadas[i+1], jogadas[i+2]);
				}
				contaJogadas = 0;
			}
			
			if (contaJogadas == 2) {
				rodada++;
				if (isSpare(jogadas[i], jogadas[i-1])) {
					if (isUltimaRodada(rodada)) {
						somaPontos += bonusSpare(jogadas[i+1]);
						return somaPontos;
					}
					else {
						somaPontos += bonusSpare(jogadas[i+1]);
					}
				}
				contaJogadas = 0;
			}
			
		}
		
		return somaPontos;
		
	}
	
	private Boolean isStrike(int pontos) {
		return pontos == STRIKE;
	}
	
	private Boolean isSpare(int jogadaAtual, int jogadaAnterior) {
		return (jogadaAtual + jogadaAnterior) == STRIKE;
	}
	
	private Boolean isUltimaRodada(int rodada) {
		return rodada == TOTALRODADAS;
	}
	
	private int bonusStrike(int jogada1, int jogada2) {
		return jogada1 + jogada2;
	}
	
	private int bonusSpare(int jogada) {
		return jogada;
	}

}
