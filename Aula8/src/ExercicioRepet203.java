import java.util.Scanner;

public class ExercicioRepet203 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira um número");
        int j = leitor.nextInt();
        int i = 0;

        do{
            int resultado = j * i;
            System.out.println(j+" x "+i+" = "+resultado);
            i++;
        }   while(i <= 10);
    }
}