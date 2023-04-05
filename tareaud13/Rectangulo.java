package tareaud13;

public class Rectangulo implements Figura {
	
	// Atributos
	private int base;
	private int altura;
	private char character;
	
	//Constructor
	public Rectangulo(int base, int altura, char character) {
		this.base = base;
		this.altura = altura;
		this.character = character;
	}
	
	//Metodos de la interfaz Figura
	
	@Override
	public String nombre() {
		return "Rectangulo";
	}
	@Override
	public void dibujar() {
		char c = this.character;
		//Creo un array bidimensional con la altura y la base del rectangulo
		char array [][] = new char [altura][base];
		
		//Relleno el array con el caracter
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				array[i][j] = c;
			}
		}
		//Imprimo el array
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
	@Override
	public int area() {
		//El area del rectangulo es base x altura
		return base*altura;
	}
	@Override
	public void setCharacter(char c) {
		this.character = c;
		
	}
	@Override
	public char getCharacter() {
		return this.character;
	}

	@Override
	public String toString() {
	    return "Rectángulo de " + base + "x" + altura;
	}

	
	
}
