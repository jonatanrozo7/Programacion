class Tiempo {
    String tipo;   // Rápido, Normal, Suave
    int minutosPorKm;

    // 3 "objetos" String que representan sensaciones del atleta a ese ritmo
    String sensacion1 = "Cómodo";
    String sensacion2 = "Exigente";
    String sensacion3 = "Muy duro";

    public Tiempo(String tipo, int minutosPorKm) {
        this.tipo = tipo;
        this.minutosPorKm = minutosPorKm;
    }
}