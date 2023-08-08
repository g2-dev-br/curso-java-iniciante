import java.util.Scanner;

public class EntradaDados01{
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Olá dev!!! Qual é o seu nome?");
        String nome = scanner.nextLine();
        System.out.println("Meu nome é " + nome);
        
        System.out.println("Qual a sua idade?");
        int idade = scanner.nextInt();
        System.out.println("Minha idade é " + idade + "anos!");
        
        System.out.println("Qual é o seu salário?");
        double salario = scanner.nextDouble();
        System.out.println("Meu salário é " +  salario);
        
        System.out.println("Situação");
        boolean situacao = scanner.nextBoolean();
        System.out.println("Situação " + situacao);
        
    }
    
}