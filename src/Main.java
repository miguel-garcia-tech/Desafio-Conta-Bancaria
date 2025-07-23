import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //inicializar dados do cliente
        String nome = "Jacqueline Oliveira";
        String tipoConta = "Corrente";
        double saldo = 2500;
        int opcaoEscolhida = 0;


        //visualização de dados do cliente
        System.out.println("****************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta:" + tipoConta);
        System.out.println("Saldo : " + saldo);
        System.out.println("\n****************************");
        //menu de opções
        String menu = """
                \nDigite a operação desejada
                
                1- Consultar saldo
                2 - Receber valor
                3 - Transferir valor
                4 - Sair

                """;
        Scanner leitura = new Scanner(System.in);
        while (opcaoEscolhida != 4){
            System.out.println(menu);

            opcaoEscolhida = leitura.nextInt();

            if (opcaoEscolhida == 1) {
                System.out.println("Seu saldo em conta é de " + saldo);

            } else if (opcaoEscolhida == 2) {
                System.out.println("Digite o valor a ser recebido:");
                double valorRecebido = leitura.nextDouble();
                saldo += valorRecebido;
                System.out.println("Seu novo saldo é: " + saldo);

            } else if (opcaoEscolhida == 3) {
                System.out.println("Digite o valor da transferencia");
                double valorTranseferencia = leitura.nextDouble();
                if (valorTranseferencia > saldo){
                    System.out.println("Você não tem saldo suficiente parea efetuar a transferencia");
                }else {
                    saldo -= valorTranseferencia;
                    System.out.println("Seu novo saldo é: " + saldo);
                }

            } else if (opcaoEscolhida == 4) System.out.println("Operação cancelada!");



        }


    }
}