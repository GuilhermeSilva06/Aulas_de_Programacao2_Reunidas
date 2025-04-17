public class Main {
    public static void main(String[] args) {
        // Objetos tipo Data
        Data d1 = new Data(2025,01,12);
        Data d2 = new Data(2026,01,12);

        System.out.println(d1.toString());
        System.out.println(d2.toString());

        int nrDias =  d1.calcularDiferenca(d2);
        System.out.println("\nNúmeros de dias entre duas datas: "+nrDias);
        if(d1.isMaior(d2))
            System.out.println("\nData d1 mais recente do que d2.");
        else
            System.out.println("\nData d2 mais recente do que d1.");
        // Objetos tipo CartaoEstudante
        CartaoEstudante c1 = new CartaoEstudante(122024,d1,d2);
        System.out.println(c1.toString());
        // Teste 1
        d2.setData(2027,01,12); // A data d2 foi alterada
        System.out.println("\n#1 -> "+d2.toString());
        // A data de validade do cartão c1 também foi alterada? Porquê?
        System.out.println(c1.toString());
        // Teste 2
        Data d3 = c1.getDataValidade();
        System.out.println("\n#2 -> "+d3.toString());
        d3.setData(2027,10,26);
        System.out.println("\n#3 -> "+d3.toString());
        // A data de validade do cartão c1 foi alterada? Porquê?
        System.out.println(c1.toString());
    }
}