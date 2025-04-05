public class Professor extends Pessoa implements Trabalho {

    public Professor(String nome) {
        super(nome);
    }

    @Override
    public String getTipo() {
        return "Professor";
    }

    @Override
    public void trabalhar() {
        System.out.println(nome + " está dando uma aula de Java.");
    }
}
