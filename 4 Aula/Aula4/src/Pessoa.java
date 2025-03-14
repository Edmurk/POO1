//CRIAR DOIS ATRIBUTOS NA CLASSE PAI QUE SÃO EM COMUM PARA AS CLASSES FILHAS
//CRIAR SALARIO E IR PARA O CLIENTE
//CRIAR VALOR PRODUTO E IMPOSTO PARA FORNECEDOR
//FAZER UM METODO QUE CALCULE O VALOR DO SALARIO DESCONTANDO O IR
//FAZER UM METODO QUE CALCULE O VALOR DO SALARIO DESCONTANDO O IMPOSTO
//ADAPTAR TODOS OS ATRIBUTOS PARA SEREM INFORMADOS PELO USUARIO

public class Pessoa {
    private String nome, idade, endereco;

    public Pessoa() {
    }

    public Pessoa(String nome, String idade, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getIdade() {
        return idade;
    }
    public void setIdade(String idade) {
        this.idade = idade;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
