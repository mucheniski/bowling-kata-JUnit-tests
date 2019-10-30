package services;

public class CalculadoraPontuacaoBoliche {
	
	private static final int STRIKE = 10;	
	
	public int pontuacaoDoJogo(int[] jogadas) { 

		int soma = 0;
		int contaJogadas = 0;
		int rodada = 0;
		
		
		// TODO: Implementar a regra para a última rodada
		
		for (int i = 0; i < jogadas.length; i++) {
			contaJogadas++;
			soma += jogadas[i];
			if (isStrike(jogadas[i])) {
				if (temProximaJogadaStrike(i, jogadas.length)) {
					soma += bonusStrike(jogadas[i+1], jogadas[i+2]);
				}				
				contaJogadas = 0;
			}
			if(contaJogadas == 2) {	
				rodada++;
				if (isSpare(jogadas[i], jogadas[i-1])) {
					if (temProximaJogadaSpare(i, jogadas.length)) {
						soma += bonusSpare(jogadas[i+1]);						
					}
				}
				contaJogadas = 0;				
			}

		}
		
		return soma;		
	}
	
	private Boolean isStrike(int valorJogada) {
		return valorJogada == STRIKE;
	}
	
	private int bonusStrike(int jogada1, int jogada2) {
		return jogada1 + jogada2;
	}	

	private Boolean isSpare(int jogada1, int jogada2) {
		return (jogada1 + jogada2) == STRIKE;
	}
	
	private int bonusSpare(int valorJogada) {
		return valorJogada;
	}	
	
	private Boolean temProximaJogadaSpare(int posicaoJogada, int tamanhoVetor) {
		return posicaoJogada < (tamanhoVetor-1);
	}
	
	private Boolean temProximaJogadaStrike(int posicaoJogada, int tamanhoVetor) {
		return posicaoJogada < (tamanhoVetor-2);
	}

}
