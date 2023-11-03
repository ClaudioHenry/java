import java.util.Scanner;

public class Multa {
    public static void main (String []args){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite qual o salário de João: ");
        int sal = entrada.nextInt();
    int muta = sal * 2/100;
    int mut= sal - muta; 
    int muta1 = mut * 2/100;
    int mu = mut - muta1;
    System.out.println("O salário depois das multas é: " + mu);
    }
}
