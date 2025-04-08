import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();

        System.out.print("Insira a quantidade de alunos:");
        int qtd = scanner.nextInt();

    }
}

    /*
     * Utilizando a linguagem java e os conceitos que foram trabalhados na aula, desenvolva um programa
     *  que leia o nome e a nota de uma quantidade X de alunos (informada pelo usuário), da disciplina POO,
     *  do curso de sistemas de informação, e ao final imprima:
     * o nome e a nota de cada aluno
     * a maior nota
     * a menor nota
     * a média das notas
     */