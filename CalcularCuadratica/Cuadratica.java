import java.util.Scanner;

public class AsigCuadratica {
	static Scanner input = new Scanner(System.in);

	static double a, b, c;

	static int prueba = 2;

	static void entradaDeDatos() {
		for (int i = 0; i < prueba; ++i) {
			System.out.println("Este proceso se repetira dos veces.");
			System.out.println("Entre los valores para los coeficientes de la funcion cuadratica");
			System.out.print("a = ");
			a = input.nextDouble();
			System.out.print("b = ");
			b = input.nextDouble();
			System.out.print("c = ");
			c = input.nextDouble();
		}
	}

	static boolean esLineal(double coeficienteCuadratrico) {

		boolean result;
 
		if (coeficienteCuadratrico == 0) {
			result = true;
		}
		else {
			result = false;
		}
		return(result);
	}

	static double discriminante(double a, double b, double c) {
		return(Math.pow(b,2)-4*a*c);
	}

	static double raiz1(double a, double b, double c) {
		double raiz;

		raiz = (-b + Math.sqrt(discriminante(a,b,c)))/(2*a);

		return(raiz);
	}

	static double raiz2(double a, double b, double c) {
		double raiz;

		raiz = (-b + Math.sqrt(discriminante(a,b,c)))/(2*a);

		return(raiz);
	}

	static void muestraResultados(boolean lineal, boolean compleja, double r1, double r2) {
		System.out.println("La funcion " + a + "x^2 + " + b + "x + " + c);

		if (lineal == true) {
			System.out.println("es una funcion linea");
		}
		else if (compleja == true) {
			System.out.println("tiene raice compleja");
		}
		else {
			System.out.println("tiene raices reales cuyo valores son:");
			System.out.println("x = " + r1 + ", x = " + r2);
		}
	}

	public static void main(String[] args) {
		boolean esLineal = false, raicesComplejas = false;

		double raizMas = 0, raizMenos = 0;

		entradaDeDatos();

		if (esLineal(a)) {
			esLineal = true;
		}
		else if (discriminante(a,b,c) < 0) {
			raicesComplejas = true;
		}
		else {
			raizMas = raiz1(a,b,c);
			raizMenos = raiz2(a,b,c);
		}
		muestraResultados(esLineal, raicesComplejas, raizMas, raizMenos);
	}
	
}
