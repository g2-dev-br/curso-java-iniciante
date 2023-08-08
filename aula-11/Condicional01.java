import java.util.Scanner;

public class Condicional01 {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        int valor = scanner.nextInt();
        scanner.close();
        
        int resultado = valor % 2;
        
        //if
        if(resultado == 0){
            System.out.println("É par!!!");
        } else {
            System.out.println("É ímpar");
        }
        
    }
}