public class Monitor extends Aluno {
    private String disciplinaResponsavel;

    public Monitor(String nome, double nota, String disciplinaResponsavel) {
        super(nome,nota);
        this.disciplinaResponsavel = disciplinaResponsavel;
    }

    @Override
    public String getTipo(){
        return "Monitor de " + disciplinaResponsavel;
    }
}
