public class PessoaPrincipal {

    public static void main(String[] args) {
        System.out.println("#######CLIENTES#######");
        Cliente oCliente = new Cliente();
        oCliente.setNome("Edvaldo");
        oCliente.setIdade("19");
        oCliente.setCpf("083.745.991-54");
        oCliente.setEndereco("Av Brasil, Qd-Z 53, Lt 02");

        oCliente.ImprimirCliente();

        System.out.println("\n#######FORNECEDORES#######");
        Fornecedor oFornecedor = new Fornecedor();
        oFornecedor.setCnpj("99.999.999./9999-99");
        oFornecedor.setNome("Iasmyn");
        oFornecedor.setIdade("25");
        oFornecedor.setEndereco("Rua do Silva");

        oFornecedor.ImprimirFornecedor();
    }
}
