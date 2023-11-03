import java.util.*;
public class Ano {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite o seu ano de nascimento: ");
        int anoN = entrada.nextInt();
        int anoA = 2023;

        int ia = anoA - anoN;
        int im = ia * 12;
        int id = ia * 365;
        int is = id / 7;

        System.out.println("Sua idade atual é: " + ia);
        System.out.println("Sua idade atual em meses é: " + im);
        System.out.println("Sua idade atual em dias é: " + id);
        System.out.println("Sua idade atual em semanas é: " + is);
    }
}
