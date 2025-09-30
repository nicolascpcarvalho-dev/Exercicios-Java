import java.util.Scanner;

    public class valorDaparcela{
        public static void main(String[] args) {
            double valordacompra, valorParcelado, valorfinal;
            int qtd_parcelas, juros;

            Scanner leia = new Scanner(System.in);
            System.out.println("qual o valor da sua compra? ");
            valordacompra = leia.nextDouble();
            System.out.println("Digite quantidade de parcelas: ");
            qtd_parcelas = leia.nextInt();

            switch (qtd_parcelas) {
                case 2:
                    juros = 3;
                    break;
                case 4:
                    juros = 7;
                    break;
                case 6:
                    juros = 9;
                    break;
                case 8:
                    juros = 12;
                    break;

                default:
                    juros = -1;
            }
            
            if (juros == -1){
                System.out.println("Número de parcelas incorretos!!");
            }
            else{
                valorfinal = valordacompra+valordacompra*juros/100;
                valorParcelado = valorfinal/qtd_parcelas;
                System.out.printf("o valor de cada parcela é %.2fn", valorParcelado);
            }
            leia.close();
        }
    }