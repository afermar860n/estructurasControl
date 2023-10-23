import java.util.Scanner;

public class CuantosAutobuses {
    public static void main(String[] args) {

        final int personasPorAutobus = 55;
        int total = 0;
        int personas = 0;

        Scanner s = new Scanner(System.in);

        while (true) {//mal (sin true) con do y personas !=0
            System.out.print("Ingrese el tamaño del grupo (0 para finalizar): ");
            int personas = s.nextInt();

            if (personas < 0) {
                System.out.println("No se admiten números negativos.");
                continue;
            }

            if (personas == 0) {
                break;
    }
}
