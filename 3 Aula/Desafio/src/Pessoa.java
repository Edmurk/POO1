import java.util.Scanner;

public class Pessoa {
    private String nome;
    private String cpf;
    private double peso;
    private double altura;

    public Pessoa(String nome, String cpf, double peso, double altura) {
        this.nome = nome;
        this.cpf = cpf;
        this.peso = peso;
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }
}
