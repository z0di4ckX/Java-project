class Animal {
	String especie = "";
	int totalDePatas = 0;
	boolean tienePico = false, tieneEscamas = false, tienePelo = false, tienePluma = false, tieneSangreCaliente = false;
	String sonido;

	Animal (int totalPatas, boolean pico, boolean escamas, 
		boolean pelo, boolean pluma, boolean sangreCalinte) {

		this.totalDePatas = totalPatas;
		this.tienePico = pico;
		this.tieneEscamas = escamas;
		this.tienePelo = pelo;
		this.tienePluma = pluma;
		this.tieneSangreCaliente = sangreCalinte;
	}

	void setEspecie (String especie) {
		this.especie = especie;
	}

	String getEspecie () {

		return especie;
	}

	void hacerSonido () {
		// not arrgument
	}

	String getSonido () {
		return (sonido);
	}

	public String toString () {

		String str;

		str = "Especie = " + especie + "\n" +
			  "Patas = " + totalDePatas + "\n" +
			  "Escamas = " + tieneEscamas + "\n" +
			  "Pelo = " + tienePelo + "\n" +
			  "Plumas = " + tienePluma + "\n" +
			  "Sangre Caliente = " + tieneSangreCaliente;

		return (str);
	}
}

class Mamifero extends Animal {
	Mamifero () {
		super(4, false, false, true, false, true);
	}
}

class Ave extends Animal {
	Ave () {
		super(2, true, false, false, true, true);
	}
}

class Reptil extends Animal {
	Reptil () {
		super (0, false, true, false, false, false);
	}
}

class Perro extends Mamifero {
	Perro () {
		especie = "Perro";
	}

	void hacerSonido () {
		System.out.println("Guau guau");
	}
}

class Gato extends Mamifero {
	Gato () {
		especie = "Gato";
	}

	void hacerSonido () {
		System.out.println("Miau miau");
	}
}

class Ornitorrinco extends Mamifero {
	Ornitorrinco () {
		especie = "Ornitorrinco";
	}

	void hacerSonido () {
		System.out.println("urggggggggg");
	}
}

class Gallo extends Ave {
	Gallo () {
		especie = "Gallo";
	}

	void hacerSonido () {
		sonido = "cucurucucucucu";
	}

	void escarbar () {
		// not arrgument
	}
}

class Serpiente extends Reptil {
	Serpiente () {
		especie = "Serpiente";
	}

	void hacerSonido () {
		System.out.println("Ssssssssss");
	}
}

class Cocodrilo extends Reptil {
	Cocodrilo () {
		especie = "Cocodrilo";
		totalDePatas = 4;
	}

	void hacerSonido () {
		System.out.println("Raaaa");
	}
}

class PolimorfismoEjercico1 {
	public static void main(String[] args) {
		
		Animal[] listaDeAnimales = new Animal[7];
		listaDeAnimales[0] = new Perro();
		listaDeAnimales[1] = new Gato();
		listaDeAnimales[2] = new Ornitorrinco();
		listaDeAnimales[3] = new Gallo();
		listaDeAnimales[4] = new Serpiente();
		listaDeAnimales[5] = new Cocodrilo();

		System.out.println(listaDeAnimales[0] + "\n");
		System.out.println(listaDeAnimales[1] + "\n");
		System.out.println(listaDeAnimales[2] + "\n");
		System.out.println(listaDeAnimales[3] + "\n");
		System.out.println(listaDeAnimales[4] + "\n");
		System.out.println(listaDeAnimales[5] + "\n");

		listaDeAnimales[0].hacerSonido();
		listaDeAnimales[1].hacerSonido();
		listaDeAnimales[2].hacerSonido();
		listaDeAnimales[3].hacerSonido();
		listaDeAnimales[4].hacerSonido();
		listaDeAnimales[5].hacerSonido();
		System.out.println("Sonido del gallo: " + listaDeAnimales[3].getSonido());
	}
}