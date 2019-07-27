/*
Name: Wesly J. Hernandez Cortes
Date: 02-07-2019
Programa: Bola 
*/

class Bola {
    private float radio, peso;

    Bola() {
        radio = 1;
        peso = 2;
    }

    Bola (float r, float p) {
        radio = r;
        peso = p;
    }

    void setPeso (float p) {
        peso = p;
    }

    float getPeso () {
        return peso;

    }

    void setRadio (float r) {
        radio = r;
    }

    float getRadio () {
        return radio;

    }

    void ampliarRadio(float factor) {
        radio = radio * factor;
    }

    public String toString() {
        return ("radio = " + radio + "\npeso = " + peso);
    }
}

public class Ejemplo {
    public static void main(String[] args) {
        Bola bola1 = new Bola();
        Bola bola2 = new Bola(3,5);

        System.out.println("Bola 1 : \n" + bola1);
        System.out.println("Bola 2 : \n" + bola2);

        bola1.setRadio(9);
        bola2.ampliarRadio(5.2f);

        System.out.println("Bola 1: \n" + bola1);
        System.out.println("Bola 2: \n" + bola2);
    }
}