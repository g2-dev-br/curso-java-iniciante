public class Operadores{
    public static void main(String[] args){
        // + - / * %
        int nr1 = 3 + 4 + 5;
        System.out.println(nr1);
        System.out.println(10 - 6);
        System.out.println(10 / 2);
        System.out.println(7 * 6);
        System.out.println(11 % 2);
        
        int nr2 = 5 + 4 * 2;
        System.out.println(nr2);
        
        int nr3 = (5 + 4) * 2;
        System.out.println(nr3);
        
        int nr4 = ((5 + 4) * 2) / 2;
        System.out.println(nr4);
        
        System.out.println(3 + 4 + 5);
        System.out.println("O resultado é: " + 3 + 4 + 5 + "texto");
        
        double saldo = 100.00;
        //saldo = saldo + 200.00;
        saldo += 200.0;
        System.out.println(saldo);
        
        saldo -= 50.0;
        System.out.println(saldo);
        
        saldo /= 5;
        System.out.println(saldo);
        
        saldo *= 10;
        System.out.println(saldo);
        
        saldo %= 10;
        System.out.println(saldo);
        
        
        System.out.println("-----------------------------");
        
        // ++ --
        
        int contador = 0;
        contador++;
        System.out.println(contador);
        contador--;
        System.out.println(contador);
        
        System.out.println("-----------------------------");
        //contador++
        //++contador
        int contador2 = 0;
        //System.out.println(contador2++);
        System.out.println(++contador2);
        
    }
}