package controller;

import br.gui.listagenerica.Lista;

public class ControllerHash {
	
	// vetor de lista
	Lista[] vetor;

	public ControllerHash() {
		vetor = new Lista[2];
		inicializarTabelaHash();
	}

	// inicializando cada índice do vetor com uma lista
	private void inicializarTabelaHash() {
		int tamanho = vetor.length;
		for (int i = 0; i < tamanho; i++) {
			vetor[i] = new Lista();
		}
	}
	
	public void adicionarNum(int num) {
		int posicao = hash(num);
		vetor[posicao].addFirst(num);
	}
	
    // Função hash
    private int hash(int valor) {
        return valor % 2; // 0 = par, 1 = ímpar
    }
    
    // uso de ternaria (condição ? valor_se_verdadeiro : valor_se_falso); (i == 0 ? "pares" : "ímpares")
    public void exibirTabela() throws Exception {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Índice " + i + " (" + (i == 0 ? "pares" : "ímpares") + "): ");
            int tamanho = vetor[i].size();
            for (int j = 0; j < tamanho; j++) {
                System.out.print(vetor[i].get(j) + " ");
            }
            System.out.println();
        }
    }

}
