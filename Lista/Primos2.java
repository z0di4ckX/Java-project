import java.util.*;

public class Primos2 {
	static  void print(String s) {
		System.out.print(s);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		boolean primo;
		String confirmar = " ";
		int totalPrimos = 0;
		int[] listaPrimos = new int[100000];

		System.out.print("SI. Para continuar \n NO. Para terminar.");
		confirmar = input.next();

		totalPrimos++;
		listaPrimos[0] = 2;

		print(2 + " ");

		for(int i = 3; i < 1000; i++) {
			primo = true;

			for(int j = 0; j < totalPrimos; j++) {
				if((i % listaPrimos[j] == 0)) {
					primo = false;
				}
			}

			if (confirmar.equals("SI") || confirmar.equals(primo)){
				print(i + " ");
				listaPrimos[totalPrimos] = i;
				totalPrimos++;
			}

			else if (confirmar.equals("NO")) {
				System.out.println("Proceso terminado.");
				System.exit(0);
			}
		}
	}
}