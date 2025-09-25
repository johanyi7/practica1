
public class EjerciciosIfVideojuegos {


    public static void main(String[] args) {


        // ==============================

        // EJERCICIO 1 – Vida del personaje (Minecraft)

        // ==============================
        int vidaJugador = 70;
        if (vidaJugador >= 70)
            System.out.println("el jugador es fuerte");
        if (vidaJugador >= 30 && vidaJugador < 70)
            System.out.println("el jugador está herido");
        if (vidaJugador < 30)
            System.out.println("el jugador está en peligro");


        // Declara una variable con la vida de un jugador (entero entre 0 y 100).

        // Usa if/else para imprimir:

        //   Vida > 70 → "Tu personaje está fuerte 💪"

        //   Vida entre 30 y 70 → "Tu personaje está herido 😢"

        //   Vida < 30 → "Tu personaje está en peligro ⚠️"


        // ==============================

        // EJERCICIO 2 – Elección de ataque (Pokémon)
        // ==============================

        String ataque = "fuego";

        if (ataque.equals("fuego"))
            System.out.println("Es super eficaz contra planta");
        else if (ataque.equals("agua"))
            System.out.println("Es super eficaz contra fuego");
        else if (ataque.equals("planta"))
            System.out.println("Es super eficaz contra agua");
        else
            System.out.println("ataque no reconocido");


        // Declara una variable con el tipo de ataque: "fuego", "agua" o "planta".

        // Con if/else if/else imprime:

        //   Si es fuego → "¡Es super eficaz contra planta!"

        //   Si es agua → "¡Es super eficaz contra fuego!"

        //   Si es planta → "¡Es super eficaz contra agua!"

        //   Otro caso → "Tipo de ataque no reconocido"


        // ==============================

        // EJERCICIO 3 – Tienda de objetos (Fortnite)

        // ==============================

        Integer pavos = 2500;
        if (pavos >= 2000)
            System.out.println("puedes comprar una skin legendaria");
        else if (pavos >= 1200)
            System.out.println("puedes comprar una skin épica");
        else if (pavos >= 800)
            System.out.println("puedes comprar una skin rara");
        else if (pavos < 800)
            System.out.println("no tienes suficientes Pavos");


        // Declara una variable con el número de V-Bucks.

        // Con if imprime qué puede comprar el jugador:

        //   Si tiene 2000 o más → "Puedes comprar una skin legendaria"

        //   Si tiene 1200 o más → "Puedes comprar una skin épica"

        //   Si tiene 800 o más → "Puedes comprar una skin rara"

        //   Si tiene menos de 800 → "No tienes suficientes V-Bucks"


        // ==============================

        // EJERCICIO 4 – Clasificación de rango (League of Legends)

        // ==============================


        Integer puntosDeRanking = 0;
        if (puntosDeRanking >= 0 && puntosDeRanking < 900)
            System.out.println("Rango Bronce");
        else if (puntosDeRanking >= 1000 && puntosDeRanking <= 1999)
            System.out.println("Rango Plata");
        else if (puntosDeRanking >= 2000 && puntosDeRanking <= 2999)
            System.out.println("Rango Oro");
        else if (puntosDeRanking >= 3000)
            System.out.println("Rango Platino");


        // Declara una variable con los puntos de ranking.

        // Con if imprime el rango:

        //   0–999   → "Bronce"

        //   1000–1999 → "Plata"

        //   2000–2999 → "Oro"

        //   3000 o más → "Platino"


        // ==============================

        // EJERCICIO 5 – Evento especial (Minecraft)

        // ==============================

        Integer hora = 23;
        if (hora >= 6 && hora <= 11)
            System.out.println("Es de mañana, los aldeanos están activos");
        else if (hora >= 12 && hora <= 18)
            System.out.println("Es de tarde, hora de explorar");
        else if (hora >= 19 && hora <= 23)
            System.out.println("Es de noche, cuidado con los mobs");
        else if (hora >= 0 && hora <= 5)
            System.out.println("Madrugada; mejor dormir");


        // Declara una variable "hora" (entero de 0 a 23).

        // Con if imprime:

        //   Entre 6 y 11 → "Es de mañana, los aldeanos están activos ☀️"

        //   Entre 12 y 18 → "Es de tarde, hora de explorar 🔍"

        //   Entre 19 y 23 → "Es de noche, cuidado con los mobs 🌙"

        //   Entre 0 y 5 → "Madrugada, mejor dormir 😴"


        // ==============================

        // EJERCICIO 6 – Reto final: Sistema de logros (multijuego)

        // ==============================


        Integer Kills = 20;
        Integer Muertes = 0;
        Integer Tiempo = 21;

        if (Kills >= 10)
            System.out.println("Logro: Cazador experto");
        if (Muertes == 0)
            System.out.println("Logro: Intocable");
        if (Tiempo > 60)
            System.out.println("Logro: Maratón gamer");
        if (Kills < Muertes)
            System.out.println("Necesita entrenar");
        else if (Kills >= 15 && Muertes == 0)
            System.out.println("Logro: Asesino imparable");
        if (Kills <=5 && Muertes >13 && Tiempo > 20)
            System.out.println("Antilogro: Abandona la partida");


        // Declara tres variables:

        //   - kills (número de enemigos derrotados)

        //   - muertes (veces que ha muerto el jugador)

        //   - tiempo (minutos jugados)

        //

        // Crea condiciones con if para asignar logros:

        //   - Si kills >= 10 → "Logro: Cazador experto 🏹"

        //   - Si muertes == 0 → "Logro: Intocable 👑"

        //   - Si tiempo > 60 → "Logro: Maratón gamer ⏱️"

        //   - Si kills < muertes → "Logro: Necesita entrenar 🐣"

        //

        // Extensión opcional:

        //   - Combina condiciones con && y || para logros más complejos.

        //   - Ejemplo: (kills > 20 && muertes < 5) → "Logro: PRO absoluto 🔥"


    }

}


