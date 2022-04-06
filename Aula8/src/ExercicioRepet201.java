import java.util.Scanner;

public class ExercicioRepet201 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira um número");
        int j = leitor.nextInt();

        for(int i = 0; i <= 10; i++){
            int resultado = j * i;
            System.out.println(j+" x "+i+" = "+resultado);
        }
    }
}