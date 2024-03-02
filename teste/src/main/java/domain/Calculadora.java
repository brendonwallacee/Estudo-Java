package domain;

import java.io.Serializable;

public class Calculadora implements Serializable {
    float a;
    float b;

    public Calculadora() {
    }

    public Calculadora(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public void somar(float a, float b) {
        System.out.println(a+b);
    }

    public void subtrair(float a, float b) {
        System.out.println(a-b);
    }

    public void multiplicar(float a, float b) {
        System.out.println(a*b);
    }

    public void dividir(float a, float b) {
        System.out.println(a/b);
    }
}
