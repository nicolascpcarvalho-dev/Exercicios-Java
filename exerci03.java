import java.util.Scanner;

public class exerci03 {
    public static void main(String[] args) {
    Scanner verifica = new Scanner(System.in);

    System.out.print("Digite o valor da bolsa: ");
    double bolsa = verifica.nextDouble();

    System.out.print("Digite o tempo de estágio (em anos): ");
    int tempoEstagio = verifica.nextInt();

    if (bolsa >= 750 && bolsa <= 950 && tempoEstagio >= 2) {
        System.out.println("Participará do treinamento");
    } else {
        System.out.println("Não participará");
    }

    verifica.close();
}
}
