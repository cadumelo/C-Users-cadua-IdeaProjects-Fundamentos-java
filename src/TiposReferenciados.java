import java.util.Scanner;

public class TiposReferenciados {

    public static void main(String[] args) {
        Scanner leTeclado = new Scanner(System.in);

        int a = leTeclado.nextInt();
        leTeclado.nextLine();
        String nome = leTeclado.nextLine();
        double nota = leTeclado.nextDouble();

        System.out.println(a);
        System.out.println(nome);
        System.out.println(nota);

    }
}
