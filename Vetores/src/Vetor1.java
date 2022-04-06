import java.util.Scanner;

/* Exercícios vetores 

1. Faça um programa que leia 5 valores inteiros, armazene-os em um vetor, calcule e apresente 
a soma destes valores */

public class Vetor1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int vetorNumeros[] = new int[5];        // criar o vetor

        for(int i = 0; i < vetorNumeros.length; i++){        // criar um loop
            System.out.println("Insira um número: ");
            vetorNumeros[i] = leitor.nextInt();             // pedir para inserir valores
        }

        int resultado = 0;
        for(int i = 0; i < vetorNumeros.length; i++){
            resultado = resultado + vetorNumeros[i];        // fazer fórmula para somar eles
        }
        System.out.println(resultado);                      // apresentar a soma

    }
}
