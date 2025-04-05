public class ProgramaOperacaoMatematica {

    public static void calculaOperacao(OperacaoMatematica operacao, double x, double y) {
        System.out.println(operacao.calcular(x, y));
    }

    public static void main(String[] args) {
        calculaOperacao(new Soma(), 10, 5);         // 15.0
        calculaOperacao(new Subtrai(), 10, 5);      // 5.0
        calculaOperacao(new Multiplica(), 10, 5);   // 50.0
        calculaOperacao(new Divide(), 10, 5);       // 2.0
    }
}
