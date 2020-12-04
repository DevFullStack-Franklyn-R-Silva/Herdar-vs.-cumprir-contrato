package model.entites;

import model.enums.Cor;

public class Circulo extends FiguraAbstract {
	private Double raio;

	public Circulo(Cor cor, Double raio) {
		super(cor);
		this.raio = raio;
	}

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}

	@Override
	public Double area() {
		return Math.PI * raio * raio;
	}

}
