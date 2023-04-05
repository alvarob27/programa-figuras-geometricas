package tareaud13;

import java.util.ArrayList;
import java.util.Scanner;

public class DibujaPantalla {
	// Se crea un ArrayList para almacenar las figuras
    static ArrayList<Figura> figuras = new ArrayList<Figura>();
    // Se crea un objeto Scanner para leer la entrada del usuario
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        char opcion = ' ';
        do {
            // Se muestra un menú con las opciones disponibles
            System.out.println("Seleccione una opción: [a-f]");
            System.out.println("a - Añadir una figura");
            System.out.println("b - Modificar una figura");
            System.out.println("c - Mostrar la pantalla");
            System.out.println("d - Área de la pantalla");
            System.out.println("e - Listar Figuras");
            System.out.println("f - Salir");
            // Se lee la opción seleccionada por el usuario
            opcion = scanner.nextLine().charAt(0);
            
            switch (opcion) {
                case 'a':
                    // Se pregunta al usuario si desea agregar un rectángulo o un triángulo
                    System.out.println("¿Rectángulo (r) o Triángulo (t)?");
                    char tipoFigura = scanner.nextLine().charAt(0);
                    // Se verifica si la opción es válida
                    while (tipoFigura != 'r' && tipoFigura != 't') {
                        System.out.println("Opción no válida. ¿Rectángulo (r) o Triángulo (t)?");
                        tipoFigura = scanner.nextLine().charAt(0);
                    }
                    // Si el usuario selecciona un rectángulo
                    if (tipoFigura == 'r') {
                        // Se pide la base del rectángulo
                        System.out.println("Indica la base:");
                        int base = scanner.nextInt();
                        // Se pide la altura del rectángulo
                        System.out.println("Indica la altura:");
                        int altura = scanner.nextInt();
                        // Se pide el carácter para dibujar el rectángulo
                        System.out.println("Indica el carácter:");
                        char caracter = scanner.next().charAt(0);
                        // Se agrega el rectángulo al ArrayList de figuras
                        figuras.add(new Rectangulo(base, altura, caracter));
                    } 
                    // Si el usuario selecciona un triángulo
                    else if (tipoFigura == 't') {
                        // Se pide el lado del triángulo
                        System.out.println("Indica el lado:");
                        int lado = scanner.nextInt();
                        // Se pide el tipo de triángulo (a, b, c, d)
                        System.out.println("Indica el tipo (a,b,c,d):");
                        char tipo = scanner.next().charAt(0);
                        String tipoString = String.valueOf(tipo);
                        // Se pide el carácter para dibujar el triángulo
                        System.out.println("Indica el carácter:");
                        char character = scanner.next().charAt(0);
                        // Se agrega el triángulo al ArrayList de figuras
                        figuras.add(new Triangulo(lado, tipoString, character));
                    }
                    scanner.nextLine();
                    break;
                case 'b':
                	//Se pide al usuario un nuevo caracter
                    System.out.println("Indique el nuevo carácter para las figuras:");
                    char nuevoCaracter = scanner.nextLine().charAt(0);
                    //Se recorre el ArrayList de figuras y se cambia el caracter de todas
                    for (Figura figura : figuras) {
                        figura.setCharacter(nuevoCaracter);
                    }
                    break;
                case 'c':
                	//Se llama al metodo para mostrar las figuras de la pantalla
                    mostrarPantalla();
                    break;
                case 'd':
                	//Se suma el area de todas las figuras
                    double areaTotal = 0;
                    for (Figura figura : figuras) {
                        areaTotal += figura.area();
                    }
                    System.out.println("El área total de la pantalla es: " + areaTotal);
                    break;
                case 'e':
                	//Se llama al metodo para listar las figuras
                    listarFiguras();
                    break;
                case 'f':
                    System.out.println("Gracias por utilizar el programa");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (opcion != 'f');
    }
    
    public static void mostrarPantalla() {
    	System.out.println("La pantalla está así:");
    	System.out.println();
    	//Se recorre el ArrayList de figuras y se llama a la funcion para dibujarla
        for (Figura figura : figuras) {
            figura.dibujar();
            System.out.println();
        }
    }
    
    public static void listarFiguras() {
        System.out.println("El listado de las figuras añadidas son:");
        System.out.println();
        //Se recorre el ArrayList de figuras y se muestran con su toString
        for (Figura figura : figuras) {
            System.out.println(figura.toString());
        }
        System.out.println();
    }
}