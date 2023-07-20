public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun Maverick");

        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        // Média calculada com as notas da Jack, Paulo e Suelem
        double media = (9.8 + 6.3 + 8) / 3;
        String sinopse = """
                Filme Top Gun
                Filme de Aventura com galã dos anos 80
                Muito bom!
                Ano de Lançamento: %d
                """.formatted(anoDeLancamento);

        System.out.println(String.format("A média do filme é: %.2f", media));
        System.out.println(sinopse);

        int classificacao = (int) (media / 2);
        System.out.println(classificacao);
    }
}