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
	}