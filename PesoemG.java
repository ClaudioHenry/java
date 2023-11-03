import java.util.Scanner;

public class PesoemG {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu peso: ");
        float peso = entrada.nextFloat();

        float t = (peso * 1000);
        System.out.println("Seu peso em grama é: " + t);


    }
}
