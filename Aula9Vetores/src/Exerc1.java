import java.util.Scanner;

public class Exerc1 {
    public static void main(String[] args) {
                
        int vetor[] = new int[5];
        vetor[0] = 5;
        vetor[1] = 5;
        vetor[2] = 5;
        vetor[3] = 5;
        vetor[4] = 5;
        
        int resultadosoma = 0;
        for(int i = 0; i < vetor.length; i++){
        System.out.println(vetor[i]);
        
        resultadosoma = resultadosoma + vetor[i];
        }
        System.out.println(resultadosoma);
    }
}
