// Nombre: Wesly J. Hernandez
// Date: 03 - 20 - 2019

import javax.swing.JOptionPane;

class Criculo {

    private double area, radio, perimetro;
    
    double area2, perimetro2;
    double radio2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el radio: ")); 
    
    Criculo () {
        radio = 5;
        perimetro = 2 * radio * Math.PI;
        area = Math.PI * Math.pow(radio, 2);

        perimetro2 = 2 * radio2 * Math.PI;
        area2 = Math.PI * Math.pow(radio2, 2);
    }

    Criculo (double r, double a, double p) {
        radio = r;
        perimetro = p;
        area = a;
    }

    void setArea (double a) {
        area = a;
    }

    double getArea () {
        return area;
    }

    void setRadio (double r) {
        radio = r;
    }

    double getRadio () {
        return radio;
    }

    void setPerimetro (double p) {
        perimetro = p;
    }

    double getPerimetro () {
        return perimetro;
    }

    public String toString() {
        return ("\n El radio del primer circulo es = " + radio + "\n El Perimetro del primer ciculo es = " + perimetro + "\n El Area del primer circulo es = " + area + "\n\n" +
         "El radio del segundo circulo es = " + radio2 +"\n Perimetro del segundo criculo es = " + perimetro2 + "\n El Area del segundo criculo es = " + area2);
    }
}
