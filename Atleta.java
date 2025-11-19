class Atleta {
	String nombre;
	int edad;
	int energia;
	Tenis tenis;

	public Atleta(String nombre, int edad, int energia, Tenis tenis) {
		this.nombre = nombre;
		this.edad = edad;
		this.energia = energia;
		this.tenis = tenis;
	}

	public void mostrarSoloTenis() {
	System.out.println("\nAtleta: " + nombre);
		System.out.println("Tenis del atleta:");
		System.out.println(tenis.getDescripcion());
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
