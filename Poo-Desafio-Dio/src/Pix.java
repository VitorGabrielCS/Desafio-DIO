public class Pix implements Pagamento {
    private String chave;
    private String nome;

    public Pix () {}

    public Pix(String chave, String nome) {
        this.chave = chave;
        this.nome = nome;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public double pagar(double valor) {
        return valor;
    }
}
