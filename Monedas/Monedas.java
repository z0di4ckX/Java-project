import java.util.Scanner;

public class Monedas {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        float dolares, quantity;
        char alternativaChar;
        String linea = "";

        do {

            System.out.println("================================");
            System.out.println("    MENU    ");
            System.out.println("a. Carcular cantidad");
            System.out.println("x. Salir del programa");
            System.out.println("================================");

            linea = input.next();
            alternativaChar = linea.charAt(0);

            switch (alternativaChar) {
                case 'a':
                System.out.print("Entre la cantidad que deseas del 0 al 9.99: ");
                dolares = input.nextFloat();
                System.out.println("");
                if (dolares > 9.99) {
                    System.out.println("ERROR, lo siento de has pasado del maximo permitido. Intendalo de nuevo.");
                }
                else if (dolares < 0) {
                    System.out.println("ERROR, lo siento la cantidad es menor de lo permitido. intendalo de nuevo.");
                }

                dolares *= 100;
        
                quantity = dolares / 100;
                System.out.print("Dolar: " + (int)quantity);
        
                dolares = dolares % 100;
                quantity = dolares / 50; 
                System.out.print(" Medio Dolar " + (int)quantity);
        
                dolares = dolares % 50;
                quantity = dolares / 25;
                System.out.print(" pesetas " + (int)quantity);
        
                dolares = dolares % 25;
                quantity = dolares / 10;
                System.out.print(" vellones " + (int)quantity);
        
                dolares = dolares % 10;
                quantity = dolares / 5;
                System.out.print(" niqueles " + (int)quantity);
        
                dolares = dolares % 5;
                quantity = dolares / 1;
                System.out.print(" centavos " + (int)quantity);
                System.out.println("");
                break;
                case 'x':
                System.out.println("");
                System.out.println("Gracais por utilizar nuestro sistema, nos vemos pronto.");
                break;
                default:
                System.out.println("Opps! Lo siento, la alternativa seleccionada no es la correcta." +
                " Intendalo de nuevo.");
            }
            
        }while (alternativaChar != 'x');
    }
}
