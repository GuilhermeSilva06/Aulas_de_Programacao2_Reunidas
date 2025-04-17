import java.util.Objects;

public class CartaoEstudante {
    private int codigo;
    private Data dataCartao;
    private Data dataValidade;

    public CartaoEstudante(int codigo, Data dataCartao, Data dataValidade) {
        this.codigo = codigo;
        this.dataCartao = new Data(dataCartao); // Composição
        this.dataValidade = new Data(dataValidade); //Composição
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public Data getDataCartao() {
        return new Data(dataCartao);
    }
    public void setDataCartao(Data dataCartao) {
        this.dataCartao = new Data(dataCartao);
    }
    public Data getDataValidade() {
        return new Data(dataValidade);
    }
    public void setDataValidade(Data dataValidade) {
        this.dataValidade = new Data(dataValidade);
    }
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("\n### Dados do Cartão de Estudante ###\n");
        s.append("\nCódigo do cartão: "); s.append(codigo);
        s.append("\nData do Cartão: "); s.append(dataCartao);
        s.append("\nData de Validade: "); s.append(dataValidade);
        return s.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CartaoEstudante c = (CartaoEstudante) o;
        return codigo == c.codigo && dataCartao.equals(c.dataCartao) &&
                dataValidade.equals(c.dataValidade);
    }

}
