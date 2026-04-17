
public class Cartao implements Pagamento{
    private String numeroCartao;
    private int parcelas;

    public Cartao() {}

    public Cartao(String numeroCartao, int parcelas) {
        this.numeroCartao = numeroCartao;
        this.parcelas = parcelas;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }


    public double pagar(double valor) {
        if (valor <= 0) {
            System.out.println("O número das parcelas e invalido!");
        }
        double valorParcelado = valor / parcelas;
        return valorParcelado;

    }
}
