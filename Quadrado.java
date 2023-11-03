import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite o tamanho do lado do quadrado");
        float lado = entrada.nextFloat();

        float lado1 = (lado * lado);
        System.out.println("A área do quadrado é: " + lado1);
    }
}
