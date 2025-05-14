import java.util.Scanner;

public class SemtenciaDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 1;
        char respuesta;

        do {
            System.out.println("contador:"+contador);
            contador++;

            System.out.println("Quieres continuar?");
            System.out.println("(s: sí, n: no)");
            respuesta = scanner.next().charAt(0);

        } while (respuesta != 'n');
        System.out.println("Finalizando");
    }
}
