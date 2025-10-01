// Criar um algoritmo que leia a idade de uma pessoa e informe sua classe eleitoral: 
//• não-eleitor (abaixo de 16 anos)
//• eleitor obrigatório (entre 18 e 65 anos) 
//• eleitor facultativo (entre 16 e 18 anos e maior de 65 anos)
import java.util.Scanner;

public class Exerc5 {
    public static void main(String[] args) {
        Scanner verifica = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = verifica.nextInt();

        if (idade < 16) {
            System.out.println("Não-eleitor");
        } else if ((idade >= 18 && idade <= 65)) {
            System.out.println("Eleitor obrigatório");
        } else {
            System.out.println("Eleitor facultativo");
        }

        verifica.close();
    }
}