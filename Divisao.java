import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite o primeiro número para divisao: ");
        int num1 = entrada.nextInt();
        System.out.println("Digite o segundo número para divisao: ");
        int num2 = entrada.nextInt();

        int div = num1 / num2;
        System.out.println("O resultado da divisao é: " + div);
        
    }
}
