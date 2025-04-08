public class Aluno extends Pessoa implements Avaliavel {
    private double nota;

    public Aluno(String nome, double nota) {
        super(nome);
        this.nota = nota;
    }

    @Override
    public double getNota() {
        return nota;
    }

    @Override
    public String getTipo() {
        return "Aluno";
    }
}
