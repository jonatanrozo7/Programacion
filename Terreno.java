class Terreno {
    	String tipo;

    	// 3 objetos de la clase Duracion dentro de Terreno
    	Duracion duracionCorta = new Duracion("Corta", 5);
    	Duracion duracionMedia = new Duracion("Media", 10);
    	Duracion duracionLarga = new Duracion("Larga", 21);

    	public Terreno(String tipo) {
        	this.tipo = tipo;
    	}
	public String getTipo() {
        return tipo;
	}
}