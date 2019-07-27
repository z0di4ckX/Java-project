import java.util.Scanner;

public class AsigArray {

    static Scanner input = new Scanner(System.in);

    static int EnterNumber() {
        int number;

        System.out.println("Enter a number: ");
        number = input.nextInt();

        return number;
    }

    static int cuantos(double listOfValues[], double targetValue) {

        int i, position = -1;

        for(i=0; i < listOfValues.length; i++) {
            if (listOfValues[i] == targetValue) {
                position = i;
            }
        }
        return position;
    }

    public static void main(String[] args) {

        double list[] = {1,6,3,8,5,8,3,4,8,3};
        int position, number = 0;

        number = EnterNumber();

        position = cuantos(list, number);

        if (position != -1) {
            System.out.println("Value found at position " + position + "\n\n");
        }
        else {
            System.out.println("Value not found \n\n");
        }
    }
}
