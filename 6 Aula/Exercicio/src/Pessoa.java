// Classe abstrata, não pode ser instanciada
public abstract class Pessoa {
    protected String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome);
    }

    public abstract String getTipo();
}

/*utilizando as classes pessoa, estudante e professor. Crie uma implementação em java
e exemplifique polimorfismo, classes abstratas e interface. comente os locais de utilização*/