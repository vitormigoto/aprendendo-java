public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 1996;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 6.5;
        String tipoPlano = "plus";

        if(anoDeLancamento >= 2022){
            System.out.println("Lançamento que os clientes estão curtindo");
        }else{
            System.out.println("Filme retro que vale a pena assistir");
        }

        if (incluidoNoPlano == true && tipoPlano.equals("plus")) {
            System.out.println("Filme liberado");
        }else{
            System.out.println("Deve pagar a locação");
        }

    }
}
