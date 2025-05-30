public class Circulo extends Figura {

    private double raio;

    private static final int RAIO_POR_OMISSAO = 1;

    public Circulo(double raio, String cor) {
        super(cor);
        this.raio = raio;
    }

    public Circulo(double raio) {
        super();
        this.raio = raio;
    }

    public Circulo(String cor) {
        super(cor);
        raio = RAIO_POR_OMISSAO;
    }

    public Circulo() {
        super();
        raio = RAIO_POR_OMISSAO;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return 2*Math.PI*raio;
    }

    @Override
    public String toString() {
        return String.format("Círculo: raio=%.1f Área = %.1f %s", raio, calcularArea(),super.toString());
    }


    //"Retângulo: comprimento=%.1f largura=%.1f Área = %.1f %s",
    //                comprimento, largura, calcularArea(), super.toString());
    //    }
}
