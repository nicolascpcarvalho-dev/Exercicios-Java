import java.util.Scanner;

public class exerci04 {
    public static void main(String[] args) {
        Scanner verifica = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        double a = verifica.nextDouble();

        System.out.print("Digite o valor de b: ");
        double b = verifica.nextDouble();

        System.out.print("Digite o valor de c: ");
        double c = verifica.nextDouble();

        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("As raízes da equação são: %.2f e %.2f%n", raiz1, raiz2);
        } else if (delta == 0) {
            double raiz = -b / (2 * a);
            System.out.printf("A equação possui uma raiz real dupla: %.2f%n", raiz);
        } else {
            System.out.println("Delta é negativo. Não serão calculadas as raízes reais.");
        }

        verifica.close();
    }
}
