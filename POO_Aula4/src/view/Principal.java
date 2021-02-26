package view;

import model.Aluno;

public class Principal {

	public static void main(String[] args) {
		new Aluno();
		
		Principal p = new Principal();
		p.soma(5, 6, 1, 5);
		p.soma(19, 11);
		p.soma(19, 11, 30);
	}

	public void soma(int n1, int n2) {
		System.out.println("Soma2 : " + (n1 + n2));
	}

	public void soma(int n1, int n2, int n3) {
		System.out.println("Soma3 : " + (n1 + n2 + n3));
	}

	public void soma(int... numeros) {
		int s = 0;
		for (int n : numeros) {
			s += n;
		}
		System.out.println("SomaN : " + s);
	}

}
