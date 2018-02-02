package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        //leer datos del teclado para que el usuario introduzca
        Scanner scanner=new Scanner(System.in);
        String valor=scanner.nextLine();

        //ahora convertimos una cadena a entero
        int n=Integer.parseInt(valor);

        NumeroJava num= new NumeroJava(n);
        System.out.println(num.esPar());

        if(num.esPar()){
            System.out.print("El numero ingresado es par!");
        }
        else System.out.print("El numero ingresado es impar!!");

    }
}
