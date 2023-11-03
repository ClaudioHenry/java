import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner (System.in)) {
            System.out.println("Digite o número referente a tabuada você quer: ");
            int tabuada = entrada.nextInt();
            int i ;
            for (i = 1; i <= 10; i++){
            int conta = tabuada * i; 

            System.out.println("Tabuada do: " + tabuada + " x " + i + " = " + conta );
        }
    }
}
}
