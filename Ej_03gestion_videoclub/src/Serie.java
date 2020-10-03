import java.util.Comparator;
import java.util.Objects;

public class Serie extends Alquilable {
    private int temporadas = 3;

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

    /*Getter y Setters*/
    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    /*Fin de Getter y Setters*/

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

    /**
     *
     * @param a Serie
     * @param b Serie
     * @return Serie con mayor numero de temporadas o en caso de ser iguales un mensaje y la Serie B
     */
    public Serie comparar(Serie a, Serie b) {
        if (a.temporadas == b.temporadas) {
            System.out.println("Ambos tienen la misma cantidad de tempordas");
        } else if (a.temporadas > b.temporadas) {
            return a;
        }

            return b;

    }

        @Override
        public String toString () {
            String alquiladoString;
            if (alquilado) {
                alquiladoString = "Alquilado";
            } else {
                alquiladoString = "En almacén";

            }
            return "======================\n" +
                    "ID: " + this.id +
                    "\n Título: " + this.titulo +
                    "\n Género: " + this.genero +
                    "\n Temporadas: " + this.temporadas+
                    "\n Estado: " + alquiladoString +
                    "\n======================";
        }

}
