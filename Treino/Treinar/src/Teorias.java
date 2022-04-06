import java.util.Scanner;

public class Teorias {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);  // Scaner p armazenar dados

        System.out.println("escreva frase");    // imprimir um dado na tela
        String frase = leitor.nextLine();       // usuário pode inserir dados
        System.out.println("escreva número");   // imprimir um dado na tela
        int numero = leitor.nextInt();          //     "    "      "   número

        // Estrutura de repetição FOR
        for(int i = 0; i < numero; i++){
            System.out.println(frase+numero);       // imprimir um dado na tela
        }
        
        // Estrutura de repetição WHILE
        int n = 0;
        while(n < numero){
            System.out.println(frase+numero);       // imprimir um dado na tela
            n++;
        }
        // Vetor para criar uma lista de dados
        int listaNumeros[] = new int[8];            // criar um vetor de números
        int i = 0;
        while( i < listaNumeros.length ){           // rodar todos os números da lista
            listaNumeros[i] = i;                   // inserir um valor na posição do vetor
            System.out.println(listaNumeros[0]);
            System.out.println("imprimir a lista: "+listaNumeros[i]);
            i++;
        }
    }
}
