public class Cliente extends Pessoa {

    private String cpf;

    public Cliente() {
    }

    public Cliente(String nome, String idade, String endereco, String cpf) {
        super(nome, idade, endereco);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void ImprimirCliente(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("CPF: " + getCpf());
        System.out.println("Endereco: " + getEndereco());
    }
}
