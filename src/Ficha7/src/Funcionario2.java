public class Funcionario2 {
    private int codigo;
    private String nome;
    private double vencimento;
    private Endereco endereco;

    public Funcionario2(int codigo, String nome, double vencimento, Endereco endereco) {
        this.codigo = codigo;
        this.nome = nome;
        this.vencimento = vencimento;
        this.endereco = endereco;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getVencimento() {
        return vencimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVencimento(double vencimento) {
        this.vencimento = vencimento;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("\nCódigo: "); s.append(codigo);
        s.append("\nNome: "); s.append(nome);
        s.append("\nVencimento: "); s.append(vencimento);
        s.append(endereco.toString());
        return s.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Funcionario2 f = (Funcionario2) o;
        return codigo == f.codigo &&
                Double.compare(vencimento, f.vencimento) == 0 &&
                nome.equals(f.nome);
    }

}
