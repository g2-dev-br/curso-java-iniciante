public class Operadores{
    public static void main(String[] args){
        
        // < > <= >= == !=
        
        int x = 10;
        int y = 15;
        
        System.out.println(x > y); // true | false
        System.out.println(x < y);
        System.out.println(9 <= y); // true
        System.out.println(x >= 3); // true
        System.out.println(x >= 30); //false
        System.out.println(x == 10); //true
        System.out.println(x != 10); // false
        
        System.out.println("========================");
        System.out.println("Operadores lógicos");
        
        // && || !
        
        double z = 15;
        double k = 31;
        
        boolean r = x < y && z < k;
        System.out.println(r); // true
        
        boolean r1 = x > y && z > k;
        System.out.println(r1); // false
        
        boolean r2 = 10 == 10 && 2 > 5;
        System.out.println(r2); // false
        
        boolean r3 = 10 != 10 && 2 < 5;
        System.out.println(r3); // false
        

        System.out.println("OU");
        
        boolean ou1 = x < y || z < k;
        System.out.println(ou1); // true
        
        boolean ou2 = x > y || z > k;
        System.out.println(ou2); // false
        
        boolean ou3 = 10 == 10 || 2 > 5;
        System.out.println(ou3); // true
        
        boolean ou4 = 10 != 10 || 2 < 5;
        System.out.println(ou4); // true
        
    
        System.out.println("!");
        
        boolean neg = !(10 == 10) && 2 == 2;
        System.out.println(neg); // false
        
        boolean neg1 = !(10 == 11) && 2 == 2;
        System.out.println(neg1); // true
        
    }
}