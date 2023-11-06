public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Pessoa qualquer = new Pessoa();
        qualquer.setNome("Alcides");

        System.out.println(qualquer.getNome());

        Esportista jogadora = new Esportista();
        Esportista surfista = new Esportista(222);


        jogadora.setNome("Taíssa");
        surfista.setNome("Maíra");

        //Polimorfismo (um elemento muda de forma)

        qualquer = new Esportista();
        jogadora = (Esportista) new Pessoa();
        ((Esportista) qualquer).setIdFederacao(777);
    }
}