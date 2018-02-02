package com.company;

public class NumeroJava {
    int num1;
    public NumeroJava(int x){
        this.num1=x;
    }
    public boolean esPar(){
        return num1%2==0; //aqui devuelve el resultado de evaluar la expresion
    }

    public int esprimo(){
        int suma=0;
        for(int i=1; i<=num1-1;i++){
            if(num1%i==0) {
                suma = suma + 1;
            }
        }
        return suma;
    }
}
