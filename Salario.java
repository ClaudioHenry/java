import java.text.DecimalFormat;
import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        DecimalFormat casas = new DecimalFormat("00");
        float sm = 1320; 
        System.out.println("Digite o valor do salário do funcionário: ");
        float sf = entrada.nextFloat();

        float conta = (sf / sm);
        System.out.println("Esse funcionário ganha " + casas.format(conta) + " salários mínimos" );
    }
}
