package model.entites;

import model.enums.Cor;

public abstract class FiguraAbstract implements Figura {
	private Cor cor;

	public FiguraAbstract(Cor cor) {
		super();
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}
	
	
}
