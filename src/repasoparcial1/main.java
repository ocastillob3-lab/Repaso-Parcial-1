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
 
//4 Promedio Numeros Pares 
 public static void ejercicio4() {

     System.out.print("Ingrese n: ");
     int n = sc.nextInt();

     int suma = 0;
     int contador = 0;

     for (int i = 1; i <= n; i++) {

         if (i % 2 == 0) {
             suma += i;
             contador++;
         }

     }

     if (contador > 0) {
         double promedio = (double) suma / contador;
         System.out.println("Promedio pares: " + promedio);
     }
 }

//5 Suma de Dijitos 
 public static void ejercicio5() {

     System.out.print("Ingrese numero: ");
     int n = sc.nextInt();

     int suma = 0;

     while (n != 0) {

         suma += n % 10;
         n = n / 10;

     }

     System.out.println("Suma de digitos: " + suma);
 }
 
//6 Multiplo de 7 o 11
 public static void ejercicio6() {

     System.out.print("Ingrese numero: ");
     int n = sc.nextInt();

     if (n % 7 == 0 || n % 11 == 0) {
         System.out.println("Es multiplo de 7 o 11");
     } else {
         System.out.println("No es multiplo de 7 ni 11");
     }
 }
    }
