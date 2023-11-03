import java.util.Scanner;

public class Produto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.print("Digite o preço do produto e você ganhará 10 por cento de desconto: ");
        int pr = entrada.nextInt();
        int desc = pr * 10/100;
        int cont = pr - desc;
        System.out.println("O resultado do produto com o desconto é: " + cont);

    }
}
