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
 
 // 7 Numeros divisibles
 public static void ejercicio7() {

     System.out.print("Ingrese n: ");
     int n = sc.nextInt();

     for (int i = 1; i <= n; i++) {

         if (i % 3 == 0 && i % 2 != 0) {
             System.out.println(i);
         }

     }
 }
 
 
 // 8 Determinar mañana tarde noche
 public static void ejercicio8() {

     System.out.print("Ingrese hora (0-23): ");
     int hora = sc.nextInt();

     if (hora >= 0 && hora <= 11) {
         System.out.println("Mañana");
     } else if (hora <= 18) {
         System.out.println("Tarde");
     } else {
         System.out.println("Noche");
     }
 }
 
 // 9 Numeros romanos con switch
 public static void ejercicio9() {

     System.out.print("Ingrese numero (1-5): ");
     int n = sc.nextInt();

     switch (n) {

         case 1:
             System.out.println("I");
             break;

         case 2:
             System.out.println("II");
             break;

         case 3:
             System.out.println("III");
             break;

         case 4:
             System.out.println("IV");
             break;

         case 5:
             System.out.println("V");
             break;

         default:
             System.out.println("Numero fuera de rango");
     }
 }
 
 // 10 Calculadora con switch
 public static void ejercicio10() {

     System.out.print("Opcion (1-3): ");
     int op = sc.nextInt();

     System.out.print("Numero 1: ");
     int a = sc.nextInt();

     System.out.print("Numero 2: ");
     int b = sc.nextInt();

     switch (op) {

         case 1:
             System.out.println("Resultado: " + (a + b));
             break;

         case 2:
             System.out.println("Resultado: " + (a - b));
             break;

         case 3:
             System.out.println("Resultado: " + (a * b));
             break;

         default:
             System.out.println("Opcion invalida");
     }
 }
 
 // 11 Mayor menor diferencia
 public static void ejercicio11() {

     System.out.print("Numero a: ");
     int a = sc.nextInt();

     System.out.print("Numero b: ");
     int b = sc.nextInt();

     int mayor = Math.max(a, b);
     int menor = Math.min(a, b);

     int diferencia = Math.abs(a - b);

     System.out.println("Mayor: " + mayor);
     System.out.println("Menor: " + menor);
     System.out.println("Diferencia: " + diferencia);
 }
 
 // 12 tabla de división
 public static void ejercicio12() {

     System.out.print("Ingrese numero: ");
     int n = sc.nextInt();

     for (int i = 1; i <= 10; i++) {

         System.out.println(n + " / " + i + " = " + (double) n / i);

     }
 }
 
 // 13 Cantidad de dígitos pares
 public static void ejercicio13() {

     System.out.print("Ingrese numero: ");
     int n = sc.nextInt();

     int contador = 0;

     while (n != 0) {

         int dig = n % 10;

         if (dig % 2 == 0) {
             contador++;
         }

         n = n / 10;
     }

     System.out.println("Digitos pares: " + contador);
 }
 
 // 14 Numero triangular
 public static void ejercicio14() {

     System.out.print("Ingrese numero: ");
     int n = sc.nextInt();

     int suma = 0;
     int k = 1;

     while (suma < n) {

         suma += k;
         k++;

     }

     if (suma == n) {
         System.out.println("Es triangular");
     } else {
         System.out.println("No es triangular");
     }
 }
 
 // 15 Promedio negativos
 public static void ejercicio15() {

     System.out.print("Cantidad de numeros: ");
     int n = sc.nextInt();

     int suma = 0;
     int contador = 0;

     for (int i = 1; i <= n; i++) {

         System.out.print("Numero: ");
         int num = sc.nextInt();

         if (num < 0) {

             suma += num;
             contador++;

         }

     }

     if (contador > 0) {
         double promedio = (double) suma / contador;
         System.out.println("Promedio negativos: " + promedio);
     } else {
         System.out.println("No hay negativos");
     }
 }
 
//16 Multiplos de 6
 public static void ejercicio16() {

     System.out.print("Ingrese n: ");
     int n = sc.nextInt();

     for (int i = 1; i <= n; i++) {

         System.out.println(i * 6);

     }
 }
 
 // 17  Potencia de 2
 public static void ejercicio17() {

     System.out.print("Ingrese numero: ");
     int n = sc.nextInt();

     boolean esPotencia = false;

     int valor = 1;

     while (valor <= n) {

         if (valor == n) {
             esPotencia = true;
             break;
         }

         valor *= 2;

     }

     if (esPotencia) {
         System.out.println("Es potencia de 2");
     } else {
         System.out.println("No es potencia de 2");
     }
 }

//18 Numero invertido
 public static void ejercicio18() {

     System.out.print("Ingrese numero: ");
     int n = sc.nextInt();

     int invertido = 0;

     while (n != 0) {

         int dig = n % 10;

         invertido = invertido * 10 + dig;

         n = n / 10;
     }

     System.out.println("Numero invertido: " + invertido);
 }
 
 // 19  Suma par o impar
 public static void ejercicio19() {

     System.out.print("Ingrese n: ");
     int n = sc.nextInt();

     int suma = n * (n + 1) / 2;

     if (suma % 2 == 0) {
         System.out.println("La suma es PAR");
     } else {
         System.out.println("La suma es IMPAR");
     }
 }

    }
