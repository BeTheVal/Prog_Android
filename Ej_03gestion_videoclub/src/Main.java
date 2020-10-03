import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        System.out.println(
                "                       ---                                     \n" +
                        "                    -        --                             \n" +
                        "                --( /     \\ )XXXXXXXXXXXXX                   \n" +
                        "            --XXX(   O   O  )XXXXXXXXXXXXXXX-              \n" +
                        "           /XXX(       U     )        XXXXXXX\\               \n" +
                        "         /XXXXX(              )--   XXXXXXXXXXX\\             \n" +
                        "        /XXXXX/ (      O     )   XXXXXX   \\XXXXX\\\n" +
                        "        XXXXX/   /            XXXXXX   \\   \\XXXXX----        \n" +
                        "        XXXXXX  /          XXXXXX         \\  ----  -         \n" +
                        "---     XXX  /          XXXXXX      \\           ---        \n" +
                        "  --  --  /      /\\  XXXXXX            /     ---=         \n" +
                        "    -        /    XXXXXX              '--- XXXXXX         \n" +
                        "      --\\/XXX\\ XXXXXX                      /XXXXX         \n" +
                        "        \\XXXXXXXXX                        /XXXXX/\n" +
                        "         \\XXXXXX                         /XXXXX/         \n" +
                        "           \\XXXXX--  /                -- XXXX/       \n" +
                        "            --XXXXXXX---------------  XXXXX--         \n" +
                        "               \\XXXXXXXXXXXXXXXXXXXXXXXX-            \n" +
                        "                 --XXXXXXXXXXXXXXXXXX-  \n" +


                        "$$\\    $$\\ $$\\       $$\\                     $$\\                             $$\\                                   $$\\ \n" +
                        "$$ |   $$ |\\__|      $$ |                    $$ |                            $$ |                                  $$ |\n" +
                        "$$ |   $$ |$$\\  $$$$$$$ | $$$$$$\\   $$$$$$\\  $$$$$$$\\  $$\\   $$\\  $$$$$$$\\ $$$$$$\\    $$$$$$\\   $$$$$$\\   $$$$$$$\\ $$ |\n" +
                        "\\$$\\  $$  |$$ |$$  __$$ |$$  __$$\\ $$  __$$\\ $$  __$$\\ $$ |  $$ |$$  _____|\\_$$  _|  $$  __$$\\ $$  __$$\\ $$  _____|$$ |\n" +
                        " \\$$\\$$  / $$ |$$ /  $$ |$$$$$$$$ |$$ /  $$ |$$ |  $$ |$$ |  $$ |\\$$$$$$\\    $$ |    $$$$$$$$ |$$ |  \\__|\\$$$$$$\\  \\__|\n" +
                        "  \\$$$  /  $$ |$$ |  $$ |$$   ____|$$ |  $$ |$$ |  $$ |$$ |  $$ | \\____$$\\   $$ |$$\\ $$   ____|$$ |       \\____$$\\     \n" +
                        "   \\$  /   $$ |\\$$$$$$$ |\\$$$$$$$\\ \\$$$$$$  |$$$$$$$  |\\$$$$$$  |$$$$$$$  |  \\$$$$  |\\$$$$$$$\\ $$ |      $$$$$$$  |$$\\ \n" +
                        "    \\_/    \\__| \\_______| \\_______| \\______/ \\_______/  \\______/ \\_______/    \\____/  \\_______|\\__|      \\_______/ \\__|\n" +
                        "                                                                                                                       ");
        Scanner sc = new Scanner(System.in);
        ArrayList<Serie> almacenSeries = new ArrayList<>();
        ArrayList<Videojuego> almacenVideojuegos = new ArrayList<>();

        /*almacenSeries.add(new Serie("Serie1",3));
        almacenSeries.add(new Serie("Serie2",7));
        Videojuego v1 = new Videojuego("video1",300);
        almacenVideojuegos.add(v1);
        Videojuego v2 = new Videojuego("video2",500);
        almacenVideojuegos.add(v2);*/


        int eleccion;
        do {
            System.out.print("Bienvenido a nuestro videoclub\n" +
                    "0. Terminar\n" +
                    "1. Crear Serie/Videojuego \n" +
                    "2. Alquilar\n" +
                    "3. Devolver\n" +
                    "4. Estadistica\n" +
                    "5. Listar series/videojuegos\n " +
                    "Elija que deseas hacer: ");
            eleccion = sc.nextInt();
            switch (eleccion) {
                case 1:
                    System.out.print("¿Serie o Videojuego?\nS/V: ");
                    String nuevoCateg = sc.next();

                    if (nuevoCateg.toLowerCase().equals("s")) {
                        System.out.println("Introduzca el título:");
                        String nuevoTitulo = sc.next();
                        System.out.println("Introduzca el genero:");
                        String nuevogenero = sc.next();
                        System.out.println("Introduzca las temporadas:");
                        int nuevoTemporadas = sc.nextInt();
                        System.out.println("¿Está alquilado?\nS/N: ");
                        String nuevoAlq = sc.next();
                        boolean nuevoAlqbol;
                        if (nuevoAlq.toLowerCase().equals("s")) {
                            nuevoAlqbol = true;
                        } else {
                            nuevoAlqbol = false;
                        }
                        int genId = (int) (Math.random() * 10000000 + 10000000);
                        try {
                            almacenSeries.add(new Serie("" + genId, nuevoTitulo, nuevogenero, nuevoTemporadas, nuevoAlqbol));
                            System.out.println("Su serie se ha almacenado correctamente");

                        } catch (Exception e) {
                            System.out.println("Ha ocurrido un error al crear la serie.");
                            e.printStackTrace();
                        }
                    } else {
                        System.out.println("Introduzca el título:");
                        String nuevoTitulo = sc.next();
                        System.out.println("Introduzca el genero:");
                        String nuevogenero = sc.next();
                        System.out.println("Introduzca la compañía:");
                        String nuevoCompañia = sc.next();
                        System.out.println("Introduzca número de horas:");
                        int nuevoHoras = sc.nextInt();
                        System.out.println("¿Está alquilado?\nS/N: ");
                        String nuevoAlq = sc.next();
                        boolean nuevoAlqbol;
                        if (nuevoAlq.toLowerCase().equals("s")) {
                            nuevoAlqbol = true;
                        } else {
                            nuevoAlqbol = false;
                        }
                        int genId = (int) (Math.random() * 10 + 10000000);
                        try {
                            almacenVideojuegos.add(new Videojuego("" + genId, nuevoTitulo, nuevogenero, nuevoCompañia, nuevoHoras, nuevoAlqbol));
                            System.out.println("Su videojuego se ha almacenado correctamente");

                        } catch (Exception e) {
                            System.out.println("Ha ocurrido un error al crear el videojuego.");
                            e.printStackTrace();
                        }

                    }
                    break;
                case 2:
                    System.out.print("¿Serie o Videojuego?\nS/V: ");
                    String alqCat = sc.next();
                    if (alqCat.toLowerCase().equals("s")) {
                        System.out.print("Introduce el ID de la serie: ");
                        String alqId = sc.next();
                        almacenSeries.forEach((serie -> {
                            if (serie.id.equals(alqId)) {
                                serie.entregar();
                            }
                        }));

                    } else {
                        System.out.print("Introduce el ID del videojuego: ");
                        String alqId = sc.next();
                        almacenVideojuegos.forEach((videojuego -> {
                            if (videojuego.id.equals(alqId)) {
                                videojuego.entregar();
                            }
                        }));
                    }
                    break;
                case 3:
                    System.out.print("¿Serie o Videojuego?\nS/V: ");
                    String devolCat = sc.next();
                    if (devolCat.toLowerCase().equals("s")) {
                        System.out.print("Introduce el ID de la serie: ");
                        String devolId = sc.next();
                        almacenSeries.forEach((serie -> {
                            if (serie.id.equals(devolId)) {
                                serie.devolver();
                            }
                        }));

                    } else {
                        System.out.print("Introduce el ID del videojuego: ");
                        String devolId = sc.next();
                        almacenVideojuegos.forEach((videojuego -> {
                            if (videojuego.id.equals(devolId)) {
                                videojuego.devolver();
                            }
                        }));
                    }
                    break;

                case 4:
                    System.out.println("Estadisticas:");
                    AtomicInteger seriesAlquiladas = new AtomicInteger();
                    AtomicInteger videojuegosAlquilados = new AtomicInteger();

                    almacenSeries.forEach(serie -> {
                                if (serie.alquilado.equals(true)) {
                                    seriesAlquiladas.getAndIncrement();
                                }
                            });

                    almacenVideojuegos.forEach(videojuego -> {
                        if(videojuego.alquilado.equals(true)){
                            videojuegosAlquilados.getAndIncrement();
                        }
                    });
                    System.out.println("Series totales: "+ almacenSeries.size());
                    System.out.println("Series alquiladas: " +seriesAlquiladas);
                    Serie serieMasTemp = Collections.max(almacenSeries, Comparator.comparing(c -> c.getTemporadas()));
                    System.out.println("Serie con más temporadas\n" + serieMasTemp);

                    Videojuego videojuegoMasHoras = Collections.max(almacenVideojuegos, Comparator.comparing(c -> c.getHoras()));
                    System.out.println("Videojuegos totales: " + almacenVideojuegos.size());
                    System.out.println("Videojuegos alquilados: " + videojuegosAlquilados);
                    System.out.println("Videojuego con más horas\n" + videojuegoMasHoras);


                    break;
                case 5:
                    almacenSeries.forEach((s) -> {
                        System.out.println(s);
                    });
                    almacenVideojuegos.forEach((v) -> {
                        System.out.println(v);
                    });
            }



        } while (eleccion != 0);
    }
}
