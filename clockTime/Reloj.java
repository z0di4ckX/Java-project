import java.util.*;

class Contador {
	int minimo, maximo, valorActual;
	boolean completoCiclo;

	Contador (int min, int max) {
		minimo = min;
		maximo = max;
		valorActual = minimo;
		completoCiclo = false;
	}

	void reset () {
		valorActual = minimo;
	}

	void increment () {
		valorActual++;
		if (valorActual > maximo) {
			valorActual = minimo;
			completoCiclo = true;
		}
	}

	int getvalorActual () {
		return valorActual;
	}

	void setvalorAcutual (int valor) {
		valorActual = valor;
	}

	boolean getcompletoCiclo () {
		return completoCiclo;
	}

	void resetcompletoCiclo () {
		completoCiclo = false;
	}

	public String toString () {
		String resultado = " ";
		if (valorActual < 10) {
			resultado = "0" + valorActual;
		}
		else {
			resultado = " " + valorActual;
		}

		return (resultado);
	}
}

class ContadorAmPm extends Contador {
	ContadorAmPm () {
		super(0, 1);
	}

	public String toString () {
		String amOpm;
		if (valorActual == 0) {
			amOpm = "am";
		}
		else {
			amOpm = "pm";
		}

		return (amOpm);
	}
}

class ContadorHora extends Contador {
	int valorAnterior;

	ContadorHora () {
		super(1, 12);
	}

	void incremento () {
		valorActual++;
		if (valorActual == 12) {
			completoCiclo = true;
		}
		else if (valorActual == 13) {
			valorActual = 1;
		}
	}
}

class Relojito {
	Contador segundos = new Contador(0, 59);
	Contador minutos = new Contador(0, 59);
	Contador horas = new ContadorHora();
	ContadorAmPm ampm = new ContadorAmPm();

	void increment () {
		segundos.increment();
		if (segundos.getcompletoCiclo()) {
			segundos.resetcompletoCiclo();
			minutos.increment();
			if(minutos.getcompletoCiclo()) {
				minutos.resetcompletoCiclo();
				horas.increment();
				if(horas.getcompletoCiclo()) {
					horas.resetcompletoCiclo();
					ampm.increment();
				}
			}
		}
	}

	void delayMiliSec (int delay) {
		try {
			Thread.sleep(delay);
		}
		catch(InterruptedException error){
			// not arrgument
		}
	}

	public String toString () {
		return (horas + ":" + minutos + ":" + segundos + ampm);
	}
}

public 	class Reloj {
	public static void main(String[] args) {
		long i;
		Relojito miReloj = new Relojito();

		for(i= 0; i < 1000000; i++) {
			miReloj.delayMiliSec(1000);

			System.out.println(" " + miReloj);
			miReloj.increment();
		}
	}
}
