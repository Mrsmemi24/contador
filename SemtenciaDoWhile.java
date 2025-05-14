import java.util.Scanner;

public class SemtenciaDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 1;
        String respuesta;

        do {
            System.out.println(contador);
            contador++;

            System.out.println("Quieres continuar?");
            System.out.println("(s: sí, n: no)");
            respuesta = scanner.nextLine();

        } while (respuesta.equals("s"));
        System.out.println("Finalizando");
    }
}
