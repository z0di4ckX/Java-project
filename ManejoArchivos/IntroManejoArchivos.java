import java.io.*;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class IntroManejoArchivos {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		FileReader reader;
		Scanner fileInput;
		PrintWriter fileOutput;
		String strLine;
		int valor, suma = 0;
		String opciones = " ";

		System.out.println("\n1. Continuar. \n2. Terminar.");
		System.out.print("Opciones: ");
		opciones = keyboard.next();

		try {

			reader = new FileReader("input.txt");
			fileInput = new Scanner(reader);
			fileOutput = new PrintWriter("output.txt");

			fileOutput.println("Primera linea en el archivo");
			fileOutput.println("Segunda linea en el archivo");
			fileOutput.close();

			while (fileInput.hasNextLine()) {

				strLine = fileInput.next();
				valor = Integer.valueOf(strLine);
				suma = suma + valor;
			}

			fileInput.close();

			if (opciones.equals("1")) {
				System.out.println("suma = " + suma);
			}
			else if (opciones.equals("2")) {
				System.out.println("Proceso terminado");
				System.exit(0);
			}
		}
		catch (IOException e) {
			System.out.println("Error manejado los archivo");
		}
	}
}