public class Moradia implements JavaCores {

    private String morada;
    private float area;
    private String cor;

    public Moradia(String morada, float area, String cor) {
        this.morada = morada;
        this.area = area;
        this.cor = cor;
    }

    public String getMorada() {
        return morada;
    }

    public float getArea() {
        return area;
    }

    public String getCor() {
        return cor;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public static double CalcularImposto (Moradia moradia) {
        double imposto;
        imposto = moradia.getArea()*2;
        return imposto;
    }

    @Override
    public String toString() {
        return String.format("Moradia situada na %s com área de %.1f tem cor %s",
                morada, area, cor);
    }
}