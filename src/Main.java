import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir) {
            System.out.println("MENU");
            System.out.println("1. Joc Daus");
            System.out.println("2. Parxis");
            System.out.println("3. Tic Tac Toe");
            System.out.println("4. Tetris");
            System.out.println("5. Salir");

            try {

                System.out.println("Escribe un número: ");
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        JocDaus jd1 = new JocDaus();
                        jd1.jocDaus();
                        break;
                    case 2, 3, 4:
                        System.out.println("Joc no disponible.");
                        System.out.println("");
                        break;
                    case 5:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 5");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                scanner.next();
            }
        }
    }
}