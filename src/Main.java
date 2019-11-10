import java.util.Scanner;

public class Main
{
    //Metodos

    //Funcion principal del programa, ejecuta el menu principal e inicializa el espacio de juego.
    //Entrada: argumentos de tipo String por consola (no se ocupan en esta ocasion).
    //Salida: void.
    public static void main(String[] args)
    {
        GameScene espacio = new GameScene();

        System.out.println("###################################################");
        System.out.println("## Bienvenido al juego Asteroids ");

        boolean salir = false;
        while (!salir)
        {
            try {
                Scanner sc = new Scanner(System.in);
                int resp;
                menuPrincipal();
                resp = sc.nextInt();

                switch (resp)
                {
                    case 1:
                        gameLoop(espacio);
                        break;

                    case 2:
                        instrucciones();
                        break;

                    case 3:
                        salir = true;
                        break;

                    default:
                        System.out.println("#############################################################################");
                        System.out.print("## Ingrese un dato valido.\n");
                }
            }
            catch (Exception e)
            {
                System.out.println("#############################################################################");
                System.out.print("## Ingrese un dato valido.\n");
            }
        }
    }

    //Funcion que imprime las instrucciones del juego.
    //Entrada: void.
    //Salida: void.
    private static void instrucciones()
    {
        System.out.println("#########################################################################################################");
        System.out.println("## INSTRUCCIONES");
        System.out.println("#########################################################################################################");
        System.out.println("## ");
        System.out.println("## El juego Asteroids consta de que una nave (en un principio situada en el centro del espacio, \n" +
                "## con angulo y velocidad 0) que debe destruir los asteroides situados en el espacio mediante disparos.\n" +
                "## La nave consta con municion infinita y estos disparos tendrán un alcance fijo el cual se podra\n" +
                "## ingresar por teclado.\n" +
                "## El espacio que se generara tendra un Alto N y un ancho M los cuales se ingresaran por teclado.\n" +
                "## \n" +
                "#########################################################################################################\n" +
                "## Las condiciones para ganar o perder se detallaran a continuacion:\n" +
                "## \n" +
                "## \tVICTORY: El estado de \"Victoria\" se da cuando no existen asteroides en el tablero.\n" +
                "## \tDEFEAT: El estado de \"Derrota\" se da cuando la nave es alcanzada por un disparo o asteroide.\n" +
                "## \n" +
                "#########################################################################################################\n" +
                "## Las distintas dificultades se detallaran a continuacion: \n" +
                "## \n" +
                "## \t1) Facil: En esta dificultad los asteroides se mueven en velocidad 1 y las particiones son las\n" +
                "## \t          ingresadas por teclado.\n" +
                "## \t2) Medio: En esta dificultad los asteroides se mueven en velocidad 2 y las particiones son las\n" +
                "## \t          ingresadas por teclado.\n" +
                "## \t3) Dificil: En esta dificultad los asteroides se mueven en velocidad 3 y las particiones son el\n" +
                "## \t            doble de las ingresadas por teclado.\n" +
                "## \t4) Custom: En esta dificultad se podra ingresar por teclado la velocidad de los asteroides y el\n" +
                "## \t           multiplicador de particiones.\n" +
                "## ");
        direcciones();

    }

    //Funcion que imprime las direcciones posibles de la nave.
    //Entrada: void.
    //Salida: void.
    private static void direcciones()
    {
        System.out.println("#########################################################################################################\n" +
                "## Angulos de movimiento:\n" +
                "## La nave consta con 16 direcciones de movimiento.\n" +
                "## \n" +
                "##                         090\n" +
                "##                  120           060\n" +
                "##            135                       045\n" +
                "##       150                                 030\n" +
                "##   180                    .                    000\n" +
                "##       210                                 330\n" +
                "##            225                       315\n" +
                "##                  240           300\n" +
                "##                         270\n" +
                "## \n" +
                "#########################################################################################################");
    }

    //Funcion que imprime el menu principal.
    //Entrada: void.
    //Salida: void.
    private static void menuPrincipal()
    {
        System.out.println("###################################################");
        System.out.println("## Elija la opcion que desee:");
        System.out.println("## ");
        System.out.println("## 1) Jugar");
        System.out.println("## 2) Instrucciones");
        System.out.println("## 3) Salir");
        System.out.println("###################################################");

    }

    //Funcion principal del programa que ejecuta un loop en el menu principal para hacer uso del juego,
    //esta valida las entradas recibidas.
    //Entrada: espacio de tipo GameSpace.
    //Salida: void.

}


