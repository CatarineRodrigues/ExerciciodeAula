// Exercícios estruturas de repetição

import java.util.Scanner;

public class Repeticao4 {
    public static void main(String[] args) {

/* 4. Ler um valor N e imprimir todos os valores pares entre 1 (inclusive) e N (inclusive).
Considere que o N será sempre maior que ZERO */

        Scanner leitor = new Scanner(System.in);  // Scaner p armazenar dados

        System.out.println("Insira um número: ");    // pedir para inserir um valor N
        int valorN = leitor.nextInt();
        
        // i = 1    N = ?  limite é N i<=N
        // N maior que 0
        for(int i=1; i<=valorN; i++){       // loop para rodar todos os valores entre 1 e N
            if(i % 2 == 0){        // verificar se os valores são pares antes de imprimir
                System.out.println(i+" é um valor par");
            }
        }
    }
}
