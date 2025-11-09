package view;

import controller.ControllerHash;

public class Principal {

	public static void main(String[] args) {
		int[] vetor = new int[10];
		
        for (int i = 0; i < 10; i++) {
            vetor[i] = (int) (Math.random() * 11);
        }
        
        ControllerHash ch = new ControllerHash();
        
        for (int n : vetor) {
	    	ch.adicionarNum(n);
	    }
        
        
        try {
			ch.exibirTabela();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
        
	}

}
