public class Estudante extends Pessoa implements Trabalho {

    public Estudante(String nome) {
        super(nome);
    }

    @Override
    public String getTipo() {
        return "Estudante";
    }

    @Override
    public void trabalhar() {
        System.out.println(nome + " está estudando para as provas.");
    }
}
