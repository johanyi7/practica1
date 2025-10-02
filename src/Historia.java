import java.util.Scanner;

public class Historia {
    public static void main(String[] args) {

        //Hacer una historia sobre la araña de clase en la que somos ella y tenemos que tomar
        //diferentes decisiones que nos lleven a tomar otras, la clave esta en que tenemos que
        //respoder a preguntas mientras se ejectua el programa que hara que siga su desarrollo
        // (arbol de decisiones)

        System.out.println("Esta es la historia de una araña peculiar");
        System.out.println("¿Cual es el nombre de la araña?");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        System.out.println("Precioso eh");
        System.out.println(nombre + " es una araña aventurera, tiene mucho que contar, pero hoy te toca a ti elegir el qué.");
        System.out.println("La araña lleva un tiempo echandole el ojo ha un nuevo lugar, una clase de instituto, tiene ganas de entrar, como lo hara? /ventana/ mochila/");
        Scanner sc2 = new Scanner(System.in);
        String acceso = sc2.nextLine();
        if (acceso.equals("ventana"))
            System.out.println("Ha subido por un arbol, unos 4 metros, se asoma a la clase y ve... /alumnos/ que está sola/");
        Scanner sc3 = new Scanner(System.in);
        String queVe = sc3.nextLine();

        if (acceso.equals("mochila"))
            System.out.println("Se ha colado en la mochila de un alumno, ha notado que está en movimiento hasta que todo se calma y de repente ve luz. ¿Que hace la araña? /escapa rápidamente/ mantiene la calma/");
        Scanner sc4 = new Scanner(System.in);
        String queHace = sc4.nextLine();
        if (queVe.equals("alumnos"))
            System.out.println("Ve muchos, no tiene miedo, sabe que es sigilosa, sabe que es ágil, ella tiene un objetivo, explorar nuevo mundo. Que hara? Bajar 1 metro o subir 2? /1/ 2/");
        Scanner sc5 = new Scanner(System.in);

        String queHará = sc5.nextLine();
        if (queVe.equals("que está sola"))
            System.out.println("Decide entrar luego de tanto tiempo, que hace? /salta a una mesa lejana/ se descuelga lentamente/");
        Scanner sc42 = new Scanner(System.in);
        String queHace2 = sc42.nextLine();

        if (queHace.equals("escapa rápidamente"))
            System.out.println("Ha salido corriendo a toda velocidad, ve muchos pies hasta que... ha sido aplastada, FIN.");
        else if (queHace.equals("mantiene la calma"))
            System.out.println("No se altera, mantiene la postura, espera un rato y cuando todos salen de clase decide salir, ve una columna y una mesa grande, a donde irá? /columna/ mesa/");
        Scanner sc43 = new Scanner(System.in);
        String dondeIrá = sc43.nextLine();

        if (queHará.equals("1"))
            System.out.println("Va por el suelo hasta que escucha un grito muy fuerte y de repente ve todo negro, aunque hay una luz a lo lejos... FIN.");
        else if (queHará.equals("2"))
            System.out.println("Ve todo al estar en altura y lo analiza, parece que nadie se da cuenta... pero pronto ve que no es así, todas las personas se alejan y ella solo ve a un humano con una barra de madera con pelos en un extremo de esta, luego, no ve nada. FIN.");

        if (queHace2.equals("salta a una mesa lejana"))
            System.out.println("Se ha ido de chula y ha caído, ya no puede moverse bien debido al impacto, se queda inconsciente pero no volverá a despertar luego de que entren los alumnos. FIN.");
        else if (queHace2.equals("se descuelga lentamente"))
            System.out.println("Cae con ayuda de su telaraña. Investiga la clase y al ver que no hay nada de interés decide marchar. FIN BUENO");

        if (dondeIrá.equals("columna"))
            System.out.println("Esta está recubierta de un material deslizante, entran los alumnos, la ven y la matan. FIN.");
        else if (dondeIrá.equals("mesa"))
            System.out.println("Llega a la mesa y justo entra un profesor para preparar la clase, deja su chaqueta apoyada en la mesa en la que "+nombre+ "está y decide meterse dentro, al finalizar la clase se va a otra y mientras el profesor deja las cosas "+nombre+ "cae, es descubierta y asesinada. FIN.");


    }
}
