import java.util.Scanner;

public class Peso {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu peso: ");
        float peso = entrada.nextFloat();
        //para o peso se a passoa engorda em 15%
        float novo_peso = (peso * 15/100);
        float novo_peso1 = (novo_peso + peso);
        System.out.println("Seu peso se você engordar mais 15%: " + novo_peso1);
        //para o peso se a pessoa emagrecer 
        float peso1 = (peso * 20/100);
        float peso2 = (peso - peso1);
        System.out.println("Seu peso se você emagrecer 20%: " + peso2);


    }
}
