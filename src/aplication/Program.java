package aplication;

import java.util.Locale;
import java.util.Scanner;

import model.entites.Circulo;
import model.entites.FiguraAbstract;
import model.entites.Retangulo;
import model.enums.Cor;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		FiguraAbstract s1 = new Circulo(Cor.PRETO, 2.0);
		FiguraAbstract s2 = new Retangulo(Cor.BRANCO, 3.0, 4.0);

		System.out.println("Circle color: " + s1.getCor());
		System.out.println("Circle area: " + String.format("%.3f", s1.area()));
		System.out.println("Rectangle color: " + s2.getCor());
		System.out.println("Rectangle area: " + String.format("%.3f", s2.area()));
		sc.close();
	}

}
