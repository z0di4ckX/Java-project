// Nombre: Wesly J. Hernandez
// Data: 03-05-2019
// Programa: Este programa va a carcular los senos y cosenos

// Primera clase llamada SinCon
public class SinCon {
	// Declaracion del metodo pricepal main
	public static void main(String[] args) {

		// Declaro la variable grados para utlizarlo como un contador
		int grados = 0;

		// Declaro la variables radians, sin y cos 
		double radians, sin, cos;

		// Declaro con un while un ciclo para que se vaya ingramentado la variable grados
		while (grados <= 360) {			
			radians = Math.toRadians(grados);
			sin = Math.sin(radians);
			cos = Math.cos(radians);

			// aqui se declara el forma para que se imprimra los senos y cosenos
			System.out.format("sin(%3d) = %.3f and cos(%3d) = %.3f%n", grados, sin, grados, cos);

			// condador que va ingramentado  de 5 en 5
			grados += 5;
		}
	}
}
