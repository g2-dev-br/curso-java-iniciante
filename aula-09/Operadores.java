public class Operadores{
    public static void main(String[] args){
        // < > <= >= == !=
        
        int x = 10;
        int y = 20;
        
        System.out.println(x < y);
        System.out.println(x > y);
        System.out.println(5 <= 5);
        System.out.println(5 >= 5);
        System.out.println(3 == 3);
        System.out.println(4 != 4);
        System.out.println(5 != 5);

        System.out.println("--------------------");
        System.out.println("Giovani" == "Giovani");
        System.out.println("Giovani" == "giovani");
        
        
        System.out.println("--------------------");
        System.out.println("Operadores lógicos");
        // && || !
        
        double a = 10.0;
        double b = 10.0;
        double c = 15.0;
        double d = 15.0;

        System.out.println("&&");
        boolean r1 = a == b && c == d; //true
        boolean r2 = a > b && c == d; //false
        boolean r3 = a == b && c > d; //false
        boolean r4 = a != b && c != d; //false
        System.out.println(r1);  
        System.out.println(r2);  
        System.out.println(r3);  
        System.out.println(r4);  
        
        System.out.println("||");
        boolean ou1 = a == b || c == d; // true
        boolean ou2 = a > b || c == d; // true
        boolean ou3 = a == b || c > d; // true
        boolean ou4 = a != b || c != d; //true
        System.out.println(ou1);  
        System.out.println(ou2);  
        System.out.println(ou3);  
        System.out.println(ou4); 
        
        System.out.println("!");
        boolean n1 = !(a == b) && c == d; // false
        //              false     true
        boolean n2 = a == b && c == d; // true
        //           true       true
                        
        System.out.println(n1);
        System.out.println(n2);
        
    }
}