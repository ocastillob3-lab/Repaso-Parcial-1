package repasoparcial1;

import java.util.Scanner;

public class Main {

	    static Scanner sc = new Scanner(System.in);

	    public static void main(String[] args) {

	    }

	    // 1 suma divisible
	    public static void ejercicio1() {

	        System.out.print("Ingrese n: ");
	        int n = sc.nextInt();

	        int suma = 0;

	        for (int i = 1; i <= n; i++) {
	            if (i % 4 == 0) {
	                suma += i;
	            }
	        }

	        System.out.println("Suma divisibles entre 4: " + suma);

	    }
	

//2 Factorial
public static void ejercicio2() {
    System.out.print("Ingrese n: ");
    int n = sc.nextInt();

    long factorial = 1;

    for (int i = 1; i <= n; i++) {
        factorial *= i;
    }

    System.out.println("Factorial: " + factorial);
        }


 // 3 conteo positivos negativos
 public static void ejercicio3() {

    System.out.print("Cuantos numeros ingresara: ");
    int n = sc.nextInt();

    int positivos = 0;
    int negativos = 0;
    int ceros = 0;

    for (int i = 1; i <= n; i++) {

        System.out.print("Numero: ");
        int num = sc.nextInt();

        if (num > 0) {
            positivos++;
        } else if (num < 0) {
            negativos++;
        } else {
            ceros++;
        }
    }

    System.out.println("Positivos: " + positivos);
    System.out.println("Negativos: " + negativos);
    System.out.println("Ceros: " + ceros);
}
    }
