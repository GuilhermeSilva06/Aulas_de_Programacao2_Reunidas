import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Pessoa pessoa1 = new Pessoa();
        System.out.println("Insira o nome da pessoa: ");
        String Nomes = ler.next();
        pessoa1.setNome(Nomes);

        System.out.println("Insira a idade da pessoa: ");
        double Idades = ler.nextDouble();
        pessoa1.setIdade(Idades);

        System.out.println("Insira o peso da pessoa: ");
        double Pesos = ler.nextDouble();
        pessoa1.setPeso(Pesos);

        System.out.println("Insira a altura da pessoa: ");
        double Alturas = ler.nextDouble();
        pessoa1.setAltura(Alturas);

        System.out.println(pessoa1);
    }
}
//teste git