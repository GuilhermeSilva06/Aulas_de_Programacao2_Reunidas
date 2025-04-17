public class Veiculo implements JavaCores {
    private String matricula;
    private int cilindrada;
    private String cor;
    private static int importomin = 15;
    private static int impostorest = 40;


    public Veiculo(String matricula, int cilindrada, String cor) {
        this.matricula = matricula;
        this.cilindrada = cilindrada;
        this.cor = cor;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public String getCor() {
        return cor;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double CalcularImposto(Veiculo veiculo) {
        double imposto;
        if (veiculo.getCilindrada() < 1500) {
            imposto = importomin;
        } else {
            imposto = impostorest;
        }
        return imposto;
    }

    @Override
    public String toString() {
        return String.format("Veículo com matrícula %s e cilindrada %d tem cor %s",
                matricula, cilindrada, cor);
    }
}
