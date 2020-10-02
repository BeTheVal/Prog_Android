import java.util.Objects;

public class Serie extends Alquilable {
    int temporadas = 3;

    /*Constructores*/
    public Serie(String id, String titulo, String genero, int temporadas, Boolean alquilado) {
        super(id, titulo, genero, alquilado);
        this.temporadas = temporadas;
    }

    public Serie(String titulo, int temporadas) {
        super(titulo);
        this.temporadas = temporadas;

    }

    public Serie(String id, String titulo, String genero, int temporadas) {
        super(id, titulo, genero);
        this.temporadas = temporadas;

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
    public Serie comparar(Serie a, Serie b) {
        return super.comparar(a, b);
    }

    @Override
    public String toString() {
        String alquiladoString;
        if (alquilado) {
            alquiladoString = "Alquilado";
        } else {
            alquiladoString = "En almacén";

        }
        return "======================\n" +
                "ID: " + this.id +
                "Título: " + this.titulo +
                "Género: " + this.genero +
                "Estado: " + alquiladoString +
                "======================";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return temporadas == serie.temporadas;
    }

    @Override
    public int hashCode() {
        return Objects.hash(temporadas);
    }
}
