import java.util.Scanner;

public class Poligono {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite o número de lados de um polígono convexo:");
        int l = entrada.nextInt();

        int nd = l * (l-3)/2;
        System.out.println("O número de diagonais é " + nd);
    }
}
