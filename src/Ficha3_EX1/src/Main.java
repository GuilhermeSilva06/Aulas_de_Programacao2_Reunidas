//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ConsultaPresencial CP1 = new ConsultaPresencial();
        ConsultaOnline CO1 = new ConsultaOnline();

        System.out.println(CP1);
        System.out.println(CO1);

        ConsultaPresencial CP2 = new ConsultaPresencial("2025/06/12", "11:30", "João", "Eduardo", 12, "Hospital S.João,Porto");
        ConsultaOnline CO2 = new ConsultaOnline("2025/02/27", "21:30", "Hugo", "Joana", "Zoom", "https://zoom.com/consultasonline");

        System.out.println(CP2);
        System.out.println(CO2);

        System.out.println("O valor da consulta Presencial2 é: " + CP2.calcularCustoConsulta());
        System.out.println("O valor da consulta Online2 é: " + CO2.calcularCustoConsulta());

        Consulta[] vec = new Consulta[4];
        vec[0] = CP1;
        vec[1] = CO1;
        vec[2] = CP2;
        vec[3] = CO2;


        System.out.println("\n ===== Dados de todas as consultas ====");
        MostrarConsulta(vec);

        System.out.println("\n ===== Dados das consultas online ====");
        MostrarConsultaOnline(vec);
    }

    public static void MostrarConsulta(Consulta[] vec) {
        for (int i = 0; i < vec.length; i++) {
            System.out.println(vec[i]);
        }
    }

    public static void MostrarConsultaOnline(Consulta[] vec) {
        for (int i = 0; i < vec.length; i++) {
            if (vec[i] instanceof ConsultaOnline) {
                System.out.println(vec[i]);
            }
        }

    }
}
// teste FP 1.3
