public class Operadores{
    public static void main(String[] args){
        
        // < > <= >= == !=
        
        int a = 10;
        int b = 15;
        
        boolean res = a < b;
        System.out.println(res);
        
        System.out.println(a > 5); //true
        System.out.println(a <= 10); // true
        System.out.println(5 >= 6); //false
        System.out.println(5 >= 5); //true
        System.out.println(b == 15); // true
        System.out.println(b != 15); //false
        
        
        System.out.println("-----------------");
        System.out.println("Operadores Lógicos");
        
        // &&
        // 10 == 10 && 15 == 15
        //  true    &&  true -> true
        System.out.println(a == 10 && b == 15); //true
        System.out.println(a == 11 && b == 15); //false
        System.out.println(a == 10 && b == 14); //false
        System.out.println(a == 11 && b == 14); //false
        
        System.out.println(a == 10 && b == 15 && 60 == 60); // true
        
         System.out.println("-----------------");
        System.out.println("Operadores Lógicos");
        System.out.println(" OU ");
        
        // ||
        // 10 == 10 && 15 == 18
        //  true    &&  false -> true
        System.out.println(a == 10 || b == 15); //true
        System.out.println(a == 11 || b == 15); //true
        System.out.println(a == 10 || b == 14); //true
        System.out.println(a == 11 || b == 14); //false
        
        System.out.println(a == 11 || b == 20 || 60 == 60); // true
        System.out.println(a == 11 || b == 20 || 60 == 61); // false
        
        System.out.println("-----------------");
        System.out.println("Operadores Lógicos");
        System.out.println(" ! ");
        
        System.out.println(!(a == 10) && b == 15); //false
        System.out.println(!(a == 10 && b == 15)); //false
        System.out.println(!(a == 11 && b == 16)); //true
        
        //Predência ! && ||
        
        System.out.println("-----------------");
        boolean c1 = 2 > 3 || 4 != 5; // true
        boolean c2 = !(2 > 3) && 4 != 5; // true
        boolean c3 = 10 < 5; // false
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        
        System.out.println("-----------------");
        boolean c4 = c1 || c2 && c3; // true 
            // c2 && c3 -> true && false = false
            //c1 || false
        System.out.println(c4);
        
        boolean c5 = c1 && c2 && !(c3);
        System.out.println(c5);
        
    }
}