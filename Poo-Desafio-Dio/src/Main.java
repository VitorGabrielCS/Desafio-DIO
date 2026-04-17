import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Pix pix = new Pix();
        pix.setNome("Luiz Henrique");
        pix.setChave("luizrick@gmail");
        System.out.println("Nome: " + pix.getNome());
        System.out.println("Chave pix: " + pix.getChave());
        System.out.println("===============================");

        Pix pix2 = new Pix();
        pix2.setNome("Nelson Mendes");
        pix2.setChave("4567898");
        System.out.println("Nome: " + pix.getNome());
        System.out.println("Chave pix: " + pix.getChave());
        System.out.println("===============================");

        Boleto boleto = new Boleto();
        boleto.setCodigoDeBarra("45678932");
        boleto.setDataDeVencimento(LocalDate.now());
        System.out.println("Código de barra: " + boleto.getCodigoDeBarra());
        System.out.println("Data do vencimento: " + boleto.getDataDeVencimento());
        System.out.println("===============================");

        Cartao cartao = new Cartao();
        cartao.setNumeroCartao("88995546");
        cartao.setParcelas( 4);
        double valorParcelado = cartao.pagar(1500);
        System.out.println("Número do Cartão: " + cartao.getNumeroCartao());
        System.out.println("Parcelas: " + cartao.getParcelas());
        System.out.println("Valor Parcelado: R$" + valorParcelado);

        pix.pagar(500);
        pix2.pagar(135);
        boleto.pagar(321);
        cartao.pagar(1500);




    }
}