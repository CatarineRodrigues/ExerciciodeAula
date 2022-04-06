import java.util.Scanner;

public class Exerc3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
                
        int listaNumeros[] = new int[10];

        for(int i = 0; i < listaNumeros.length; i++){
            int numero =  leitor.nextInt();
            listaNumeros[i] = numero;
        }
    }
}

        /*
        int resultadosoma = 0;
        for(int i = 0; i < vetor.length; i++){
        System.out.println(vetor[i]);
        
        resultadosoma = resultadosoma + vetor[i];
        }
        System.out.println(resultadosoma);
    }
}
*/

// tarefa 4 e 5