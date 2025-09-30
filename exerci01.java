import java.util.Scanner;

public class exerci01 {
    public static void main(String[] args) {
        Scanner verifica = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = verifica.nextInt();

        if (numero >= 0 && numero <= 9) {
            System.out.println("Valor correto");
        } else {
            System.out.println("Valor incorreto");
        }

        verifica.close();
    }
}
