public class Fornecedor extends Pessoa {
    private String cnpj;

    public Fornecedor() {
        super();
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void ImprimirFornecedor(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Endereco: " + this.getEndereco());
        System.out.println("CNPJ: " + this.getCnpj());
    }

}
