public class Videojuego extends Alquilable {
    String compañia;
    int horas = 0;
    /*Constructores*/
    public Videojuego(String id, String titulo, String genero, String compañia, int horas, Boolean alquilado) {
        super(id, titulo, genero, alquilado);
        this.compañia = compañia;
        this.horas = horas;
    }

    public Videojuego(String titulo, int horas) {
        super(titulo);
        this.horas = horas;
    }

    public Videojuego(String id, String titulo, String genero, String compañia, int horas) {
        super(id, titulo, genero);
        this.compañia = compañia;
        this.horas = horas;
    }
    /*Fin de constructores*/
    @Override
    public void entregar() {
        super.entregar();
    }

    @Override
    public void devolver() {
        super.devolver();
    }

    @Override
    public boolean esEntregado() {
        return super.esEntregado();
    }

    @Override
    public Videojuego comparar(Videojuego a, Videojuego b) {
        return super.comparar(a, b);
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "compañia='" + compañia + '\'' +
                ", horas=" + horas +
                ", id='" + id + '\'' +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", alquilado=" + alquilado +
                '}';
    }
}
