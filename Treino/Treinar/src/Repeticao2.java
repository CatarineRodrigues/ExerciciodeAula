// Exercícios estruturas de repetição

import java.util.Scanner;

public class Repeticao2 {
    public static void main(String[] args) {

// 2. Faça um programa que mostre a tabuada a partir da escolha do usuário

        Scanner leitor = new Scanner(System.in);  // Scaner p armazenar dados

        System.out.println("Insira um número que deseja ver a tabuada: ");    // pedir um número para o usuário
        int numero = leitor.nextInt();      // fazer a fórmula
        for(int i=0; i<=10; i++ ){          // rodar o número em loop na fórmula
            int resultado = numero*i;
            System.out.println(numero+" x "+i+" = "+resultado);     // apresentar a tabuada

        }
    }
}
