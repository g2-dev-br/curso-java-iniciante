public class Operadores{
    public static void main(String[] args){
        
        // < > <= >= == !=
        // true - false
        int a = 10;
        int b = 15;
        
        System.out.println(a < b);
        System.out.println(a > b);
        System.out.println(5 <= 5); //true
        System.out.println(5 >= 5); // true
        System.out.println(10 == a); // true
        System.out.println(b != 15); // false
        
        System.out.println("---------------------");
        System.out.println("Giovani" == "Giovani");
        System.out.println("Giovani" != "Giovani");
        System.out.println("Giovani" == "giovani");
        
        
        System.out.println("Operadores Lógicos");
        // && || !
        
        // && -> true && true
        System.out.println(a == 10 && b == 15); // true
        System.out.println(a == 11 && b == 15);// false
        System.out.println(a == 10 && b == 14); // false
        System.out.println(a == 11 && b == 11); // false
        
        // || -> true || false
        System.out.println("----------------------");
        System.out.println(a == 10 || b == 15); // true
        System.out.println(a == 11 || b == 15); // true
        System.out.println(a == 10 || b == 14); // true
        System.out.println(a == 11 && b == 11); // false
        
        //!
        System.out.println("----------------------");
        System.out.println(!(a == 10) && b == 15); // false
        System.out.println(!(a == 10 && b == 15)); // false
        
        System.out.println(!(a == 11 && b == 11)); //true
        
        
        
        
    }
}