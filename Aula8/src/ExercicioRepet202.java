import java.util.Scanner;

public class ExercicioRepet202 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira um número");
        int j = leitor.nextInt();
        int i = 0;

        while(i <= 10){
            int resultado = j * i;
            System.out.println(j+" x "+i+" = "+resultado);
            i++;
        }
    }
}

/*           Scanner leitor = new Scanner(System.in);

        System.out.println("Insira um número inteiro");
        int n = leitor.nextInt();
        int i = 0;

        while(i <= 10){
            int resultado = n * i;
            System.out.println(n+" x "+i+" = "+resultado);
            i++;
        }
    }
}
*/