public class TiposDeVariables {

    public static void main(String[] args) {

        // ==============================
        // Introducción
        // ==============================
        // Este fichero Java contiene VARIOS ejercicios básicos.
        // Para cada ejercicio, tenéis que hacer lo que indica.
        // Conforme vayáis haciendo ejercicios, cada vez que lo ejecutéis
        // ejecutará de nuevo todos los anteriores, pero está correcto (no borréis
        // los ejercicios ya hechos).

        // ==============================
        // EJERCICIO 1 – Ficha de personaje (Minecraft)
        // ==============================
        // Crea variables con el nombre del jugador, nivel, vida (double)
        // y si tiene armadura (boolean). Imprímelas como si fuese una ficha del jugador.

        String nombreJugador = "Steve";
        long nivel = 437483874;
        double vida = 10.0;
        boolean tieneArmadura = true;

        System.out.println("Su Nombre es: " + nombreJugador + " su nivel es: " + nivel + "su vida es: " + vida + "tiene armadura: " + tieneArmadura);



        // ==============================
        // EJERCICIO 2 – Batalla rápida (Pokémon)

        Integer rayo = 25;
        Integer descarga = 20;
        Integer ataquePikachu = rayo+descarga;

        Integer escudoFuego = 40;
        Integer barreraDeLlamas = 20;
        Integer defensaCharmander = escudoFuego+barreraDeLlamas;

        Integer dañoCausadoPorPikachu = defensaCharmander-ataquePikachu;
        Integer X = dañoCausadoPorPikachu;


        System.out.println("Daño hecho por Pikachu a charmander: " + X);


        // ==============================
        // Declara dos variables con el ataque de Pikachu y la defensa de Charmander.
        // Calcula el daño causado (ataque – defensa).
        // Imprime el resultado: "Pikachu hace X puntos de daño a Charmander" - X es el valor real del daño.


        // ==============================
        // EJERCICIO 3 – Monedas y compras (Fortnite)
        // ==============================


Integer numeroBucksPepe = 13500;
Integer precioSkin = 2000;
Integer PavosRestantes = numeroBucksPepe-precioSkin;

System.out.println("Despues de comprar la skin le quedan: " + PavosRestantes);


        // Declara una variable con el número de V-Bucks que tiene un jugador.
        // Resta el precio de una skin (ej: 1200).
        // Imprime el resultado: "Después de comprar la skin, te quedan X V-Bucks".


        // ==============================
        // EJERCICIO 4 – Velocidad de campeón (League of Legends)
        // ==============================

Integer velocidadBase = 10;
Integer buffVelocidad = 3;
Integer velocidadTotal = velocidadBase + buffVelocidad;

System.out.println("La velovidad final de Jinx es: " +  velocidadTotal);

        // Declara una variable con la velocidad base de un campeón
        // y otra con un buff de velocidad.
        // Calcula la velocidad final sumando ambos valores.
        // Imprime el resultado: "La velocidad final de Jinx es X".


        // ==============================
        // EJERCICIO 5 – Conversor de monedas de juego
        // ==============================


Integer monedasMinecraft = 300;
Integer Vbucks = 300*5;
Integer RPlol = 300*2;

System.out.println(" 300 monedas de minecraft son: " + monedasMinecraft + " 300 monedas de minecraft en Fortnite son: " + Vbucks + " 300 monedas de minecraft en lol son: " + RPlol);


        // Declara una cantidad de monedas de Minecraft.
        // Convierte a su equivalente en V-Bucks y en RP de LoL
        // usando tasas de cambio inventadas (ej: 1 moneda MC = 5 V-Bucks = 2 RP).
        // Imprime el resultado en formato claro.


        // ==============================
        // EJERCICIO 6 – Clasificación de jugador (Fortnite / LoL)
        // ==============================

        



        // ESTE EJERCICIO INCLUYE SENTENCIAS DE CONTROL. No pertenece a tipos de variables.
        // Si te aburres, investiga cómo se haría y entiéndelo.
        //
        // Declara variables con el número de kills, muertes y asistencias de una partida.
        // Calcula el KDA = (kills + asistencias) / muertes.
        // Según el resultado:
        //   KDA ≥ 5        → "Jugador PRO"
        //   KDA entre 3–5  → "Jugador BUENO"
        //   KDA entre 1–3  → "Jugador NORMAL"
        //   KDA < 1        → "Jugador NOOB"
        //
        // OPCIONAL: muestra también el tier en el que quedaría (Bronce, Plata, Oro, Platino…).

    }
}
