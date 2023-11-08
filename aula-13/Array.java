public class Array{
    
    public static void main(String[] args){
        
        String[] carros = {"Fusca", "Kombi", "Gol"};
        
        for(int i = 0; i <=2; i++){
            System.out.println(carros[i]);
        }
        
        System.out.println("-------------");
//        System.out.println(carros[7]);
        
        String[] nomes = new String[3];
        
        for(int i = 0; i <=2; i++){
            System.out.println(nomes[i]);
        }
        System.out.println("-------------");
        nomes[0] = "Giovani";
        nomes[2] = "Pedro";
        
        for(String nome : nomes){
            System.out.println(nome);
        }
        System.out.println("-------------");
        
        int[] numeros = {44, 66, 5, 8, 9, 0, 20, 45, 67, 68};
        
        System.out.println(numeros.length);
        
        int total = 0;
        
        for(int i=0; i < numeros.length; i++){
            total += numeros[i];   
        }
        System.out.println("-------------");
        System.out.println(total);
        
    }
}