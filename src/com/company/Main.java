package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int n=0;
        //leer datos del teclado para que el usuario introduzca
        Scanner scanner=new Scanner(System.in);
            do {
                System.out.println("Introduzca un numero y cero para salir");
                //Almacenamos en una variable de tipo cadena.
                String valor = scanner.nextLine();

                //ahora convertimos una cadena a entero
                n = Integer.parseInt(valor);

                NumeroJava num = new NumeroJava(n);
                System.out.println(num.esPar());

                if (num.esPar()) {
                    System.out.println("El numero ingresado es par!");
                } else System.out.println("El numero ingresado es impar!!");

                if (num.esprimo() == 1) {
                    System.out.println("El numero es primo");
                } else System.out.println("El numero no es Primo");
            }while(n!=0);
    }
}
