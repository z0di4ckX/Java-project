import java.util.Scanner;

class Circle {
    Scanner input = new Scanner(System.in);

    double area, radio;

    Criculo () {
        System.out.print("Enter a number to calculate the radius of circle: ");
        radio = input.nextDouble();
        
        area = 3.1416 * Math.pow(radio, 5);
    }

    public String toString() {
        return ("Result = " + area);
    }
}

public class myCircle {
    public static void main(String [] args) {
        Circle circle = new Circle();
        System.out.println(circle);
    }
}
