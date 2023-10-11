package controller;

import model.Lista;

public class InverteController {

	public InverteController() {
		super();
	}

	public void inverteLista(Lista<Integer> lista) {
		int size = lista.size();
		if (!lista.isEmpty()) {
			int cont = 1;
			int aux = 0;
			do {
				try {
					aux = lista.get(size - 1);
					lista.removeLast();
				} catch (Exception e) {
					System.err.println(e + "Erro na linha 21 do Inverte Controller");
				}
				try {
					lista.add(aux, cont - 1);
				} catch (Exception e) {
					System.err.println(e + "Erro na linha 26 do Inverte Controller");
				}
				cont++;
			} while (cont < size);
		}
	}
}