import java.util.Scanner;

public class Graus {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite a temperatura em graus: ");
        float c = entrada.nextFloat();

        float f = (c * 9 / 5 )+32;
        System.out.println("A temperatura em Fahrenheit: " + f); 
    }
}
