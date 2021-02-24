package edu.curso;

public class Microondas {

	int tempo;
	boolean ligado;
	int tipoAlimento;
	int frequencia;
	boolean aberto;

	public Microondas(int tempo, boolean ligado, int tipoAlimento, int frequencia, boolean aberto) {
		super();
		this.tempo = tempo;
		this.ligado = ligado;
		this.tipoAlimento = tipoAlimento;
		this.frequencia = frequencia;
		this.aberto = aberto;
	}

	public void programaAutomatico(int tipo) {
		if (!aberto && !ligado) {
			switch (tipo) {

			case 1:
				this.tempo = 10;
				break;

			case 2:
				this.tempo = 15;
				break;

			case 3:
				this.tempo = 30;
				break;

			default:
				this.tempo = 0;
				break;
			}
		}
	}

}
