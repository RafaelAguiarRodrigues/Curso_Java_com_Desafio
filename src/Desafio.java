import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Franky";
        String contaTipo = "Corrente";
        double saldo = 2500.00;
        String conta = """
                *********************************
                
                Nome:             %s
                Tipo de Conta:    %s
                Saldo Inicial:    R$ %.2f
                
                *********************************
                """.formatted(nome, contaTipo, saldo);
        System.out.println(conta);

        Scanner leitor = new Scanner(System.in);
        int operacao = 0;

        while(operacao != 4){
            String operacoes = """
                    Operações:
                    
                    1 - Consultar saldo
                    2 - Receber Valor
                    3 - Transferir Valor
                    4 - Sair
                    
                    Digite a operação Desejada:
                    """;
            System.out.println(operacoes);
            operacao = leitor.nextInt();
            double valorRecebido = 0;

            if (operacao == 1) {
                System.out.println(String.format("Seu saldo atual é de: R$ %.2f", saldo));
            } else if (operacao == 2) {
                System.out.println("Informe o valor a receber:");
                valorRecebido = leitor.nextDouble();
                saldo += valorRecebido;
                System.out.println(String.format("Seu saldo atualizado é de: R$ %.2f", saldo));
            } else if (operacao == 3) {
                System.out.println("Informe o valor para a transferencia:");
                valorRecebido = leitor.nextDouble();
                if (valorRecebido > saldo || valorRecebido <= 0) {
                    System.out.println("Valor acima do saldo ou inválido");
                } else {
                    saldo -= valorRecebido;
                    System.out.println(String.format("Seu saldo atualizado é de: R$ %.2f", saldo));
                }
            } else if (operacao > 4 || operacao < 1) {
                System.out.println("Operação inválida!");
            }
        }
    }
}
