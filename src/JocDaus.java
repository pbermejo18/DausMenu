import java.util.Scanner;

public class JocDaus {
    Dau d1,d2,d3;
    Scanner scanner = new Scanner(System.in);
    public void jocDaus(){
        int opcion=0;
        int victorias=0;
        int derrotas=0;

        for (int i = 0;opcion != 2; i++) {
            System.out.println("Joc Daus");
            System.out.println("1. Jugar");
            System.out.println("2. Salir");
            opcion = scanner.nextInt();

            if (opcion == 1 || opcion == 2) {
                d1 = new Dau((int) (Math.random()*6 + 1));
                d2 = new Dau((int) (Math.random()*6 + 1));
                d3 = new Dau((int) (Math.random()*6 + 1));

                System.out.print(d1);
                System.out.print(d2);
                System.out.print(d3);


                if (d1.getNumeroDado() == d2.getNumeroDado() && d2.getNumeroDado() == d3.getNumeroDado()) {
                    System.out.println("Has ganado!");
                    victorias++;
                } else {
                    System.out.println("Has perdido");
                    derrotas++;
                }
            } else {
                System.out.println("Número introducido no válido");
            }
        }
        System.out.printf("Has Ganado: %d veces \n",victorias);
        System.out.printf("Has perdido: %d veces \n",derrotas);
        System.out.println("");
        System.out.println("");

    }
}