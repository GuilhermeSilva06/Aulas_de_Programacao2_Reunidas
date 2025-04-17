public class Pessoa {

    private String nome;
    private double idade;
    private double altura;
    private double peso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getIdade() {
        return idade;
    }

    public void setIdade(double idade) {
        if (idade > 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida!");
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("Altura inválida!");
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        } else {
            System.out.println("Peso inválida!");
        }
    }

    public double CalcularIMC() {
        return this.peso / Math.pow(this.altura, 2);
    }

    public String ClassificarImc() {
        double imc = this.CalcularIMC();
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 25) {
            return "Peso normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else if (imc < 35) {
            return "Obesidade grau 1";
        } else if (imc < 40) {
            return "Obesidade grau 2";
        } else {
            return "Obesidade grau 3";
        }
    }

    public String toString() {
        return "Nome: " + this.nome + "\n" +
                "Idade: " + this.idade + "\n" +
                "Peso: " + this.peso + "\n" +
                "Altura: " + this.altura + "\n" +
                "IMC: " + this.CalcularIMC() + "\n" +
                "Classificação: " + this.ClassificarImc();


    }
}

