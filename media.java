import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        Double nota1, nota2, media;

        Scanner leia = new Scanner(System.in);
        System.out.println("Digite sua primeira nota;");
        nota1 = leia.nextDouble();
        System.out.println("Digite sua segunda nota;");
        nota2 = leia.nextDouble();

        System.out.println("Digite (A) se quiser a média aritmética. \n Digite (P) se quiser a média Ponderada.");
        char tipomedia = leia.next().toUpperCase().charAt(0);

        switch (tipomedia) {
            case 'A':
                media = (nota1 + nota2) / 2;
                System.out.printf("A média aritmética é: %.2f%n", media);
                break;
            case 'P':
                media = (nota1 * 3 + nota2 * 7) / (3 + 7);
                System.out.printf("A média aritmética é: %.2f", media);
                break;

            default:
                System.out.println("Tipo de Média invalido!");
        }

    }
}
