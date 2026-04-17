import java.time.LocalDate;

public class Boleto implements Pagamento{
    private String codigoDeBarra;
    private LocalDate dataDeVencimento;

    public Boleto() {}

    public Boleto(String codigoDeBarra, LocalDate dataDeVencimento) {
        this.codigoDeBarra = codigoDeBarra;
        this.dataDeVencimento = dataDeVencimento;
    }

    public String getCodigoDeBarra() {
        return codigoDeBarra;
    }

    public void setCodigoDeBarra(String codigoDeBarra) {
        this.codigoDeBarra = codigoDeBarra;
    }

    public LocalDate getDataDeVencimento() {
        return dataDeVencimento;
    }

    public void setDataDeVencimento(LocalDate dataDeVencimento) {
        this.dataDeVencimento = dataDeVencimento;
    }

    public double pagar(double valor) {
        return valor;
    }
}
