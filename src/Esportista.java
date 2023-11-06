public class Esportista extends Pessoa{

    private int idFederacao;

    //Contrutor


    public Esportista(int idFederacao) {
        this.idFederacao = idFederacao;
    }

    //Getters and setters

    public int getIdFederacao() {
        return idFederacao;
    }

    public void setIdFederacao(int idFederacao) {
        this.idFederacao = idFederacao;
    }

    public Esportista() {

    }
}
