public class CalculadoraIMC {
    public static double calcularIMC(Pessoa pessoa){
        return pessoa.getPeso() / (pessoa.getAltura() * pessoa.getAltura());
    }

    public static String VerificarObesidade(double imc) {
        if (imc < 18.50){
            return "Abaixo do peso";
        } else if (imc < 25.00) {
            return "Peso Normal";
        } else if (imc < 30.00) {
            return "Pré Obesidade";
        } else if (imc < 35.00) {
            return "Obesidade I";
        } else if (imc < 40.00) {
            return "Obesidade II";
        } else {
            return "Obesidade III";
        }
    }
}
