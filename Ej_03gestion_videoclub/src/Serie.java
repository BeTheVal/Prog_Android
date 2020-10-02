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
        if(alquilado){
            alquiladoString = "Sí";
        }else{
            alquiladoString ="No";

        }
        return "======================\n" +
                "ID:'" + id + '\'' +
                "Título:'" + titulo + '\'' +
                "\nGénero:'" + genero + '\'' +
                "\nalquilado:" + alquiladoString +
                '}'+"\n" +
                "======================";
    }

}
