import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite a medida do ângulo 1 do triângulo: ");
        double l1 = entrada.nextDouble();
        System.out.println("Digite a medida do ângulo 2 do mesmo triângulo:");
        double l2 = entrada.nextDouble();

        double l = (l1 + l2) - 180;
        System.out.println("O valor do terceiro ângulo é: " + l);
    }
}
