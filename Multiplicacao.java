import java.util.*;
public class Multiplicacao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite o primeiro número para multiplicação: ");
        int num1 = entrada.nextInt();
        System.out.println("Digite o segundo número para multiplicação: ");
        int num2 = entrada.nextInt();
        System.out.println("Digite o terceiro número para multiplicação: ");
        int num3 = entrada.nextInt();

        int mul = num1 * num2 * num3;
        System.out.println("O resultado da multiplicação é: " + mul);
        
    }
}
