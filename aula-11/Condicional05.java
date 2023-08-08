import java.util.Scanner;

public class Condicional05 {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite seu salário:");
        double salario = scanner.nextDouble();
        scanner.close();
        
        double resultado = salario * (salario <= 5000 ? 0.2 : 0.1);
        System.out.println(resultado);
        
    }
}