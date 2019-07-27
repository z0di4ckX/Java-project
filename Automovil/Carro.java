class Automovil {
	private int velocidad, pasajeros;

	boolean encedido, apagar;

	Automovil () {
		velocidad = 0;
		pasajeros = 4;
		encedido = false;
		apagar = true;

	}

	Automovil (int v, int p, boolean e, boolean a) {
		velocidad = v;
		pasajeros = p;
		encedido = e;
		apagar = a;
	}
	
	void setVelocidad (int v) {
		velocidad = v;
	}

	int getVelocidad () {
		return velocidad;
	}

	void setPasajeros (int p) {
		pasajeros = p;
	}

	int getPasajeros () {
		return pasajeros;
	}

	void acelerar () {
		velocidad += 5;
	}

	void acelerar (int incremento) {
		velocidad += incremento;
	}

	public String toString () {
		return ("Velocidad = " + velocidad + "\n pasajeros = " + pasajeros + "\n encedido = " + encedido + "\n apagar =" + apagar);
	}
}

public class Carrito {
	public static void main(String[] args) {
		Automovil miCarrito = new Automovil();
		System.out.println(miCarrito);
		Automovil tuCarro = new Automovil(0, 6, true, false);
		System.out.println(tuCarro);
		tuCarro.acelerar();
		System.out.println(tuCarro);
		miCarrito.acelerar(30);
		System.out.println(miCarrito);
	}
}
