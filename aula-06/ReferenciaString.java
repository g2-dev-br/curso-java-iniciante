public class ReferenciaString{
    
    public static void main(String[] args){
        
        String ola = "Olá dev!";
        System.out.println(ola);
        
        ola = ola.substring(0, 3);
        System.out.println(ola);
        
        String nome = "Fulano";
        String apelido = "fulano";
        
        boolean iguais = nome.equals(apelido);
        System.out.println("São iguais: " + iguais);
        iguais = nome.equalsIgnoreCase(apelido);
        System.out.println("São iguais: " + iguais);
        
        boolean contains = "Olá dev!".contains("!");
        System.out.println("Contains: " + contains);
        
        contains = "Olá dev!".contains("Ola");
        System.out.println("Contains: " + contains);
        
        System.out.println("Tamanho da string: " + "Olá dev!".length());
        
        String vazia = null;
        System.out.println("Nula: " + vazia);
        vazia = "";
        System.out.println("Vazia: " + vazia.isEmpty());
        
        System.out.println("Maiúsculas: " + "Olá dev!".toUpperCase());
        System.out.println("Minúsculas: " + "Olá dev!".toLowerCase());
        
    }
    
}








