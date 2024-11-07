import java.util.Scanner;

// - Desafio 2
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria(777777,7, "José Campelo", "777.777.777-77");
        int opcao;
        double valor;

        do {
            System.out.println();
            System.out.println("*** Java Bank ***");
            System.out.println("Digite uma das opções abaixo:");
            System.out.println("1 - Extrato / 2 - Deposito / 3 - Saque / 0 - Encerrar programa");

            opcao = entrada.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("*** Extrato ***");

                    System.out.println(conta.exibirDadosConta());

                    break;
                case 2:
                    System.out.println("*** Deposito ***");
                    System.out.print("Digite o valor do deposito: ");

                    valor = entrada.nextDouble();

                    System.out.println("R$ " + valor + " depositado com sucesso!");

                    conta.depositar(valor);

                    break;
                case 3:
                    System.out.println("*** Saque ***");
                    System.out.print("Digite o valor do saque: ");

                    valor = entrada.nextDouble();

                    if(conta.sacar(valor)){
                        System.out.println("Valor de R$ " + valor + " liberado para o saque!");
                        System.out.println("Saldo atual R$: " + conta.getSaldo());
                    }else{
                        System.out.println("Saque recusado, saldo insuficiente!");
                        System.out.println("Saldo atual R$: " + conta.getSaldo());
                    }

                    break;
                case 0:
                    System.out.println("*** Programa encerrado ***");
                    break;
                default:
                    System.out.println("*** Opção inválida ***");
            }

        }while(opcao > 0);

        entrada.close();
    }
}