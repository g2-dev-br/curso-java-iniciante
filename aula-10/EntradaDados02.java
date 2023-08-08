import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class EntradaDados02{
    
    public static void main(String[] args){
        
        Locale localeBr = new Locale("pt", "BR");
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor:");
        double valor = scanner.nextDouble();
        
        String valorBr = NumberFormat.getInstance(localeBr).format(valor);
        
        scanner.close();
        System.out.println(valor);
        System.out.println("valor BR: " + valorBr);
        
        String br = NumberFormat.getCurrencyInstance(localeBr).format(valor);
        System.out.println(br);
        
        String franca = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(valor);
        System.out.println(franca);
    }
}