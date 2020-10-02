public abstract class Alquilable {
    String id;
    String titulo;
    String genero;
    Boolean alquilado = false;

    /*Constructores*/

    public Alquilable(String id, String titulo, String genero, Boolean alquilado) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.alquilado = alquilado;
    }
    public Alquilable(String titulo) {
        this.titulo = titulo;
    }
    public Alquilable(String id, String titulo, String genero) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
    }

    /*Fin de constructores*/

    public void entregar(){
        if (!alquilado){
            alquilado = true;
        }else {
            System.out.println(this.titulo + "ya ha sido entregado.");
        }
    }
    public void devolver(){
        if(alquilado){
            alquilado=false;
        }else{
            System.out.println(this.titulo + "ya ha sido alquilado");
        }
    }
    public boolean esEntregado(){
        return(alquilado);
    }
    public Videojuego comparar (Videojuego a, Videojuego b){
        return null;
    }
    public Serie comparar (Serie a, Serie b){
        return null;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Boolean getAlquilado() {
        return alquilado;
    }

    public void setAlquilado(Boolean alquilado) {
        this.alquilado = alquilado;
    }
}
