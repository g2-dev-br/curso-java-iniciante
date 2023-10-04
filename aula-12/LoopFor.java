public class LoopFor{
    
    public static void main(String[] args){
        
        System.out.println("Olá dev.\n");
        
        var y = 10;
        
        for (var x = 1; x <= y; x++){
            System.out.println(x + " - Incrementar");
        }
        System.out.println("\n");
        
        for (var x = y; x > 0; x--){
            System.out.println(x + " - Decrementar");
        }
        
    }
    
}