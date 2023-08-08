import java.util.Scanner;

public class Condicional02 {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        int valor = scanner.nextInt();
        scanner.close();
        
        if(valor <= 50){
            System.out.println("Baixo");
        } else if (valor <= 400) {
            System.out.println("Médio");
        } else if (valor <= 700){
            System.out.println("Alto");
        } else {
            System.out.println("Muito Alto");
        }
        
        
    }
}