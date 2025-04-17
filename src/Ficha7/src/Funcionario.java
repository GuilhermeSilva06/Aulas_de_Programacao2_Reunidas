public class Funcionario implements Comparable<Funcionario> {
    private int codigo;
    private String nome;
    private double vencimento;

    public Funcionario(int codigo, String nome, double vencimento) {
        this.codigo = codigo;
        this.nome = nome;
        this.vencimento = vencimento;
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

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVencimento(double vencimento) {
        this.vencimento = vencimento;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("\nCódigo: ");
        s.append(codigo);
        s.append("\nNome: ");
        s.append(nome);
        s.append("\nVencimento: ");
        s.append(vencimento);
        return s.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Funcionario f = (Funcionario) o;
        return codigo == f.codigo &&
                Double.compare(vencimento, f.vencimento) == 0 &&
                nome.equals(f.nome);
    }

    @Override
    public int compareTo(Funcionario F) {
        return this.codigo - F.codigo;
    }
}
