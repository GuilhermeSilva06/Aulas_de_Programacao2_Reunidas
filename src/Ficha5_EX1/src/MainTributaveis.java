//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainTributaveis {
    public static void main(String[] args) {

        Veiculo v1 = new Veiculo("22-33-CC", 1000, "verde");
        System.out.println(v1);

        Veiculo v2 = new Veiculo("44-55-DD", 2500, JavaCores.AZUL);
        System.out.println(v2);

        Veiculo v3 = new Veiculo("11-22-BB", 1400, Veiculo.VERMELHO);
        System.out.println(v3);

        Moradia m1 = new Moradia("Rua do Dr. Plácido da Costa Bocage", 90, Moradia.CINZENTO);
        System.out.println(m1);


        JavaCores objeto;
        objeto = v1;
        System.out.println(objeto);
        objeto = m1;
        System.out.println(objeto);

        JavaCores[] tributaveis = new JavaCores[4];
        tributaveis[0]=v1;
        tributaveis[1]=v2;
        tributaveis[2]=v3;
        tributaveis[3]=m1;
        float soma = 0;

        for (int i = 0; i < tributaveis.length; i++){
            soma += soma;
        }

    }
}

//Mais um teste para perceber se esta tudo funcional com o Git
