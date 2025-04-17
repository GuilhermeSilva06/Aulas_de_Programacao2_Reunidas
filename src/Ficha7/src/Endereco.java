public class Endereco {
    private String rua;
    private String codigoPostal;
    private String localidade;

    public Endereco(String rua, String codigoPostal, String localidade) {
        this.rua = rua;
        this.codigoPostal = codigoPostal;
        this.localidade = localidade;
    }

    public String getRua() {
        return rua;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("\nRua: "); s.append(rua);
        s.append("\nCódigo Postal: "); s.append(codigoPostal);
        s.append("\nLocalidade: "); s.append(localidade);
        return s.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Endereco e = (Endereco) o;
        return rua.equals(e.rua) &&
                codigoPostal.equals(e.codigoPostal) &&
                localidade.equals(e.localidade);
    }

}