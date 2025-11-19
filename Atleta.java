class Atleta {
	String nombre;
	int edad;
	int energia;

	// 3 objetos de la clase Tenis dentro de Atleta
	Tenis tenis1 = new Tenis("Nike", "Pegasus", "Montaña");
	Tenis tenis2 = new Tenis("Adidas", "Ultraboost", "Asfalto");
	Tenis tenis3 = new Tenis("Puma", "Velocity Nitro", "Playa");

	public Atleta(String nombre, int edad, int energia) {
		this.nombre = nombre;
		this.edad = edad;
		this.energia = energia;
	}

	public void mostrarSoloTenis() {
	System.out.println("\nAtleta: " + nombre);
		System.out.println("Tenis del atleta:");
		System.out.println(tenis1.getDescripcion());
	}

	public int getEnergia() {
        return energia;
    	}
	
	public void correr(Tenis tenis, Terreno terreno) {
        if (!tenis.getTipo().equalsIgnoreCase(terreno.getTipo())) {
            energia -= 40;
        } else {
            energia -= 10;
        }
    }
}
