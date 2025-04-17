public class Pedido {

    private int codigo;
    private String data;
    private String hora;
    private double custoBase;

    protected static final String STRING_POR_OMISSAO ="-----";

    public Pedido() {
        this.codigo = 0;
        this.data = STRING_POR_OMISSAO;
        this.hora = STRING_POR_OMISSAO;
    }

    public Pedido(int codigo, String data, String hora, double custoBase) {
        this.codigo = codigo;
        this.data = data;
        this.hora = hora;
        this.custoBase = custoBase;
    }
}
