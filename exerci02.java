import java.util.Scanner;

public class exerci02 {
    public static void main(String[] args) {
        Scanner verifica = new Scanner(System.in);

        System.out.print("Digite o turno de trabalho (M - Matutino, V - Vespertino, N - Noturno): ");
        char turno = verifica.next().toUpperCase().charAt(0);

        System.out.print("Digite a quantidade de horas trabalhadas: ");
        int horasTrabalhadas = verifica.nextInt();

        double valorHora;

        switch (turno) {
            case 'M':
            case 'V':
                valorHora = 37.50;
                break;
            case 'N':
                valorHora = 45.00;
                break;
            default:
                System.out.println("Turno inválido.");
                verifica.close();
                return;
        }

        double salario = horasTrabalhadas * valorHora;
        System.out.printf("O valor do salário é: R$ %.2f%n", salario);

        verifica.close();
    }
}
