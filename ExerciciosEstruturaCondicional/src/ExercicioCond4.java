import java.util.Scanner;

public class ExercicioCond4 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Vamos calcular a área de um retângulo.");
        
        System.out.println("Insira o tamanho da base do retângulo: ");
        float base = leitor.nextFloat();
        
        System.out.println("Insira o tamanho da altura do retângulo: ");
        float altura = leitor.nextFloat();

        float area = base*altura;

        System.out.println("A área do retângulo é: "+area);
    }
}

/* 
área = base x altura

*/