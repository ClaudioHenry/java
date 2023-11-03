import java.util.Scanner;

public class MediaP {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite o valor do nota 1: ");
        int n1 = entrada.nextInt();
        System.out.println("Digite o valor do nota 2: ");
        int n2 = entrada.nextInt();

        int peso1 = 2;
        int peso2 = 3;

        int media = (n1 * peso1 + n2 * peso2)/(peso1 + peso2);
        System.out.println("O valor da media é: " + media);
        
    }
}
