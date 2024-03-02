package domain;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        try (Scanner scan = new Scanner(System.in)) {
            int a = scan.nextInt();
            int b = scan.nextInt();

            Calculadora c = new Calculadora(a, b);
            c.somar(a, b);
            c.subtrair(a, b);
            c.multiplicar(a, b);
            c.dividir(a, b);
        }
        
    }
}