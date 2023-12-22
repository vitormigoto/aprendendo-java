
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Este é o Screen Match");
        System.out.println("Filme: Top Gun Maverick");

        int anoDeLancamento = 2020;
        double notaDoFilme = 6.5;
        // Calculo da media a partir de 2 notas
        double mediaNota = (9.8 + notaDoFilme) / 2;
        boolean incluidoNoPlano = true;
        String sinopse;
        sinopse = """                
                Nome do Filme: Top Gun Maverick
                Filme de aventura com ator dos anos 80
                """;

        System.out.println("Ano de Lancamento:" + anoDeLancamento);
        System.out.println("Está Incluido? " + incluidoNoPlano);
        System.out.println("Nota do Filme? " + mediaNota);
        System.out.println("Sinopse: "+ sinopse);

    }
}