import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        String boasVindas = """
                    Bem-vindo ao jogo de adivinhação!
                Tente Adivinhar um número de 0 a 100, você tem 5 tentativas!
                """;
        int numeroAleatorio = new Random().nextInt(100);
        Scanner leitura = new Scanner(System.in);
        int tentativa = 0;

        System.out.println(boasVindas);
        // System.out.println(numeroAleatorio);
        while(tentativa < 5){
            System.out.println("Digite o seu chute:");
            int chute = leitura.nextInt();
            tentativa++;
            System.out.println(String.format("Chute %d de 5", tentativa));
            if(chute > numeroAleatorio){
                System.out.println("O chute é maior que o número gerado!");
            } else if (numeroAleatorio == chute){
                System.out.println(String.format("Você ganhou! O número era %d", numeroAleatorio));
                break;
            } else {
                System.out.println("O chute é menor que o número gerado!");
            }
            if(tentativa == 5){
                System.out.println(String.format("Você perdeu, o numero era %d", numeroAleatorio));
                break;
            }
        }
    }
}
