import java.util.Scanner;

public class Condicional01 {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();
        scanner.close();
        
        if(nome.equals("Giovani")){
            System.out.println("Nome Correto!");
        } else {
            System.out.println("Nome Incorreto!");
        }
        
    }
}