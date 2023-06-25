public class Variaveis{
    
    double valor;
    
    public static void main(String[] args){
        System.out.println("Bem vindo!\n");
        
        // Caractere
        char char1 = 'G';
        System.out.println("char: " + char1);
        
        // Tipos primitivos inteiros
        byte byte1 = 127;
        System.out.println("byte: " + byte1);
        int int1 = 500;
        System.out.println("int: " + int1);
        short short1 = 500;
        System.out.println("short: " + short1);
        long long1 = 500;
        System.out.println("long: " + long1);
        
        // Variáves de pontos flutuante
        float flout1 = 10.5f;
        System.out.println("flout: " + flout1);
        double double1 = 10.5;
        System.out.println("double: " + double1);
        System.out.println("");
        
        // Variáveis por referência
        String nome = "Gilvan André";
        System.out.println("Nome: " + nome);
        String nomeCompleto = "Gilvan André Gobbato";
        System.out.println("Nome completo: " + nomeCompleto);
        
        
        double prim1 = 100.0;
        double prim2 = prim1;
        System.out.println("prim1: " + prim1);
        System.out.println("prim2: " + prim2);
        prim2 = 50.0;
        System.out.println("prim1: " + prim1);
        System.out.println("prim2: " + prim2);
        
        
        System.out.println("");
        
        Variaveis objeto1 = new Variaveis();
        objeto1.valor = 32.50;
        Variaveis objeto2 = objeto1;
        System.out.println("objeto1: " + objeto1.valor);
        System.out.println("objeto2: " + objeto2.valor);
        objeto2.valor = 750.0;
        System.out.println("objeto1: " + objeto1.valor);
        System.out.println("objeto2: " + objeto2.valor);
        
        System.out.println("");
        
        int valorInt = 10;
        long valorLong = 750;
        
        valorInt = (int) valorLong;
        System.out.println("valorInt: " + valorInt);
        System.out.println("valorLong: " + valorLong);
        
        
        System.out.println("");
        
        String valorString = "50";
        int valorConvertido = Integer.parseInt(valorString);
        
        System.out.println("valorConvertido: " + valorConvertido);
    }
    
    
    
    
    
    
}











