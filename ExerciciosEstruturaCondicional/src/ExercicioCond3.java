import java.util.Scanner;

public class ExercicioCond3 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número inteiro");
        int valor = leitor.nextInt();
        
        if(valor > 10){
            System.out.println("É MAIOR QUE 10!");
        } else{
            System.out.println("NÃO É MAIOR QUE 10!");
        }
    }
}