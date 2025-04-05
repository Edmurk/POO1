public class ProgramaPrincipal {
    public static void main(String[] args) {

        Pessoa p1 = new Estudante("Alice");
        Pessoa p2 = new Professor("André");

        p1.apresentar();
        System.out.println("Tipo: " + p1.getTipo());

        p2.apresentar();
        System.out.println("Tipo: " + p2.getTipo());

        Trabalho t1 = (Trabalho) p1;
        Trabalho t2 = (Trabalho) p2;

        t1.trabalhar();
        t2.trabalhar();
    }
}