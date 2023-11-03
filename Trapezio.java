import java.util.Scanner;

public class Trapezio {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite a altura do trapézio: ");
    float altura = entrada.nextFloat(); 
    System.out.println("Digite o tamanho da base menor do trapézio: ");
    float basem = entrada.nextFloat();
    System.out.println("Digite o tamanho da base maior do trapézio: ");
    float basema = entrada.nextFloat();

    float a = ((basema + basem)* altura)/2;
    System.out.println("O tamanho da área é: " + a);

    }
}
