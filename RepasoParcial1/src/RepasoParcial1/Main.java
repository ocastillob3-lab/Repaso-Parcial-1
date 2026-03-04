package RepasoParcial1;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion;

        do {
            System.out.println("\n===== MENÚ PARCIAL 1 =====");
            System.out.println("1. Suma divisibles entre 4");
            System.out.println("2. Factorial");
            System.out.println("3. Contar positivos, negativos y ceros");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    ejercicio1();
                    break;
                case 2:
                    ejercicio2();
                    break;
                case 3:
                    ejercicio3();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 0);
    }

	private static void ejercicio3() {
		// TODO Auto-generated method stub
		
	}

	private static void ejercicio2() {
		// TODO Auto-generated method stub
		
	}

	private static void ejercicio1() {
		// TODO Auto-generated method stub
		
	}

    // MÉTODOS AQUÍ ABAJO
	
	// Nuemeros divisibles
	
	public static void ejercicio1() {

	    System.out.print("Ingrese n: ");
	    int n = sc.nextInt();
	    int suma = 0;

	    for (int i = 1; i <= n; i++) {
	        if (i % 4 == 0) {
	            suma += i;
	        }
	    }

	    System.out.println("La suma de números divisibles entre 4 es: " + suma);
	 }
	
	// 2 Factorial
	    
	    public static void ejercicio2() {

	        System.out.print("Ingrese n: ");
	        int n = sc.nextInt();
	        long factorial = 1;

	        for (int i = 1; i <= n; i++) {
	            factorial *= i;
	        }

	        System.out.println("El factorial es: " + factorial);
	    }
	}

}
	
}