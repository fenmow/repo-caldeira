public class Main {
	public static void main(String[] args) {
		
		Boolean poEhdragaoGuerreiro = false;
		int distanciaTaiLung = 10;
		
		while (distanciaTaiLung > 0 && !poEhdragaoGuerreiro) {
		    treinar();
		    distanciaTaiLung--;
		    if (distanciaTaiLung > 0) {
		        System.out.println("Tai Lung ainda nao chegou. Po pode continuar treinando.");
		    }
		}
		
        System.out.println("Tai Lung esta aqui. A batalha final vai comecar.");
	}
	
	public static void treinar() {
	    int quantidadeFlexoes = 1;
	    
	    while (quantidadeFlexoes <= 10) {
	        System.out.println("Po fez "+quantidadeFlexoes+" flexoes\n");
	        quantidadeFlexoes++;
	    }
	}
}
