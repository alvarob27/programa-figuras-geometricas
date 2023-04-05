package tareaud13;

import java.util.Arrays;

public class Triangulo implements Figura {

	 // Atributos
	private int lado;
	private String tipo;
	private char character;

	// Constructor
	public Triangulo(int lado, String tipo, char character) {
		this.lado = lado;
		this.tipo = tipo;
		this.character = character;
	}


	 // Métodos de la interfaz Figura
	
	@Override
	public void setCharacter(char c) {
		this.character = c;

	}

	@Override
	public char getCharacter() {
		return this.character;
	}

	@Override
	public String nombre() {
		return "Triangulo";

	}

	
	@Override
	public void dibujar() {
		 // Se crea un array bidimensional de caracteres para almacenar el dibujo del triángulo
        char array[][] = new char[lado][lado];
        // Se llena el array con espacios en blanco
        for (int i = 0; i < lado; i++) {
            Arrays.fill(array[i], ' ');
        }
        // Se guarda el carácter a utilizar en una variable local
        char c = this.character;
        // Se comprueba el tipo de triángulo y se dibuja
        if (tipo.equalsIgnoreCase("a")) {
            // Tipo a
            for (int i = 0; i < lado; i++) {
                for (int j = 0; j < lado; j++) {
                    if (j < lado - i) {
                        array[i][j] = c;
                    } else {
                        array[i][j] = ' ';
                    }
                }
            }
        } else if (tipo.equalsIgnoreCase("b")) {
            // Tipo b
            for (int i = 0; i < lado; i++) {
                for (int j = 0; j < lado; j++) {
                    if (j >= i) {
                        array[i][j] = c;
                    } else {
                        array[i][j] = ' ';
                    }
                }
            }
        } else if (tipo.equalsIgnoreCase("c")) {
            // Tipo c
            for (int i = 0; i < lado; i++) {
                for (int j = 0; j <= i; j++) {
                    array[i][j] = c;
                }
            }
        } else if (tipo.equalsIgnoreCase("d")) {
            // Tipo d
            for (int i = 0; i < lado; i++) {
                for (int j = 0; j < lado; j++) {
                    if (i + j >= lado - 1) {
                        array[i][j] = c;
                    }
                }
            }
        }
        // Se imprime el dibujo del triángulo
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

	@Override
	public int area() {
		// El área del triángulo es lado por lado
		return (int) (lado * lado);
	}


	@Override
	public String toString() {
	    return "Triángulo tipo " + tipo + " de lado " + lado;
	}


}
