public class Videojuego extends Alquilable {
    private String compañia;
    private int horas = 0;
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

    /**
     * Método usado para comparar las horas de juego en Videojuegos
     * @param a Videojuego
     * @param b Videojuego
     * @return Videojuego con más horas o un mensaje y el videojuego B
     */
    public Videojuego comparar(Videojuego a, Videojuego b) {
        if (a.horas == b.horas){
            System.out.println("Tiene la misma cantidad de horas");
        }else if(a.horas> b.horas){
            return a;
        }else
            return b;
        return b;
    }

    public int getHoras() {
        return horas;
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
                "\n Título: " + this.titulo +
                "\n Género: " + this.genero +
                "\n Compañía" + this.compañia+
                "\n Horas: " + this.horas+
                "\n Estado: " + alquiladoString +
                "\n ======================";


    }
}
