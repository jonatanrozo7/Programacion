class Duracion {
    	String nombreDuracion;  // Corta, Media, Larga
    	int km;

    	// 3 objetos de la clase Tiempo dentro de Duracion
    	Hidratacion hidratacionMucha = new Hidratacion(4);
    	Hidratacion hidratacionNormal = new Hidratacion(2);
    	Hidratacion hidratacionNinguna = new Hidratacion(0);

    	public Duracion(String nombreDuracion, int km) {
        	this.nombreDuracion = nombreDuracion;
        	this.km = km;
    	}

	public void aplicarDuracion(Atleta atleta) {
        	int kmRecorridos = 0;

        	while (kmRecorridos < km && atleta.energia > 0) {
            		atleta.energia -= 5;   // baja 5 por km
            	kmRecorridos++;
        	}
    	}	

}