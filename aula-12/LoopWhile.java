public class LoopWhile {
    
    public static void main(String[] args){
        
        System.out.println("Olá dev!\n");
        
        var x = 0;
        
        while (x < 10){
            x++;
            System.out.println(x + " - Incremento");
        }
        System.out.println("");
        
        var y = 10;
        while (true){
            System.out.println(y + " - Decremento");
            y--;
            if (y == 0){
                break;
            }
        }
        
    }
    
}