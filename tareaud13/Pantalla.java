package tareaud13;

import java.util.ArrayList;

public class Pantalla {

	// Atributos
	private ArrayList<Figura> figuras;

	public Pantalla() {
		figuras = new ArrayList<>();
	}

	public void anadeFigura(Figura f) {
		figuras.add(f);
	}

	public void modificaFigura(char c) {
		// Recorre el ArrayList de figuras y modifica el carácter de dibujo de cada una
		for (Figura f : figuras) {
			f.setCharacter(c);
		}
	}

	public void listaFiguras() {
		for (Figura f : figuras) {
			System.out.println(f.nombre());
		}
	}

	public int areaPantalla() {
		int areaTotal = 0;
		// Recorre el ArrayList de figuras y suma el área de cada una
		for (Figura f : figuras) {
			areaTotal += f.area();
		}
		return areaTotal;
	}

	public void muestraPantalla() {
		// Recorre el ArrayList de figuras y dibuja cada una en pantalla
		for (Figura f : figuras) {
			f.dibujar();
			System.out.println();
		}
	}
}
