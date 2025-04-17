import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainFuncionario {
    public static void main(String[] args) {

        Funcionario F1 = new Funcionario(22234,"João",1200);
        Funcionario F2 = new Funcionario(35123,"Ana",1000);
        Funcionario F3 = new Funcionario(12345,"Pedro",1800);

        List<Funcionario> Vec = new ArrayList<Funcionario>();
        Vec.add(F1); Vec.add(F2); Vec.add(F3);
        System.out.println(Vec);

        Collections.sort(Vec);
        ListarFuncionarios("Ordem crescente",Vec);

        System.out.println("----------------------------");

        Collections.sort(Vec, Collections.reverseOrder());
        ListarFuncionarios("Ordem decrescnete",Vec);


    }

    public static void ListarFuncionarios(String msg,List<Funcionario> Vec) {
        System.out.println(msg);
        for (Funcionario F: Vec){
            System.out.println(F);
        }
    }


}

//Teste para FP.1.2