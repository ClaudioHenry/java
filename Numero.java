import java.util.*;
public class Numero{ 
public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    System.out.println("Digite o primeiro número: ");
    int num1 = entrada.nextInt();
    System.out.println("Digite o segundo número: ");
    int num2 = entrada.nextInt();

    int sub = num1 - num2;
    System.out.println("O resultado do número 1 com menos o número 2 é: " + sub);  

  }
}
