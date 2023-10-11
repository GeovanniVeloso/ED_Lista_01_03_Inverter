package view;

import controller.InverteController;
import model.Lista;

public class Principal {

	public static void main(String[] args) {
		
		int[]vetor = {3,5,18,12,9,7,6,2,13,4,16};
		Lista<Integer> lista = new Lista<Integer>();
		InverteController ic = new InverteController();
		
		for(int i = 10; i >= 0; i--) {
			lista.addFirst(vetor[i]);
		}
		
		ic.inverteLista(lista);
		
		try {
			System.out.println(lista.get(0));
		} catch (Exception e) {
			System.err.println(e);
			System.err.println("Erro ao imprimir o primeiro valor");
		}
		
		int size = lista.size();
		
		try {
			System.out.println(lista.get(size -1));
		} catch (Exception e) {
			System.err.println(e);
			System.err.println("Erro ao imprimir o ultimo valor");
		}
		
		for (int i = 0; i< 11; i++) {
			try {
				System.out.println(lista.get(i));
			} catch (Exception e) {
				System.err.println(e);
			}
		}
	}

}
