package edu.curso;

public class AntenaTV {

	private int frequencia;
	private int valor;
	private String posicao;
	private String tipoAntena;
	private String tipoCabo;

	public AntenaTV(int frequencia, int valor, String posicao, String tipoAntena, String tipoCabo) {
		super();
		this.frequencia = frequencia;
		this.valor = valor;
		this.posicao = posicao;
		this.tipoAntena = tipoAntena;
		this.tipoCabo = tipoCabo;
	}

	public int defineCanal() {
		int canal;

		if (frequencia < 10) {
			canal = 2;
		} else if (frequencia < 20) {
			canal = 4;
		} else if (frequencia < 30) {
			canal = 5;
		} else {
			canal = 0;
		}
		return canal;
	}

	public void exibeFrequenciaAtual() {
		System.out.println("Frequência atual da antena: " + frequencia);
	}

	public void defineFrequencia(int frequencia) {
		this.frequencia = frequencia;
	}

	public int getFrequencia() {
		return frequencia;
	}

	public void setFrequencia(int frequencia) {
		this.frequencia = frequencia;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public String getTipoAntena() {
		return tipoAntena;
	}

	public void setTipoAntena(String tipoAntena) {
		this.tipoAntena = tipoAntena;
	}

	public String getTipoCabo() {
		return tipoCabo;
	}

	public void setTipoCabo(String tipoCabo) {
		this.tipoCabo = tipoCabo;
	}

}
