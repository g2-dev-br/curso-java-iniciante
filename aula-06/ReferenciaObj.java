public class ReferenciaObj{
    
    public static void main(String[] args){
        Object valor1 = "Olá dev";
        System.out.println(valor1);
        Object valor2 = 2023;
        System.out.println(valor2);
        
        Carro carro = new Carro();
        carro.placa = "XXX4564";
        carro.nome = "Xinfurinfula";
        System.out.println(carro);
        
        Carro carro2 = new Carro();
        carro2.placa = "XXX4564";
        carro2.nome = "Xinfurinfula";
        
        boolean saoIguais = carro.equals(carro2);
        System.out.println("São iguais: " + saoIguais);
        
        System.out.println(carro2.getClass().getName());
    }  
    
    private static void alteraPlaca(Carro carro, String novaPlaca){
        carro.placa = novaPlaca;
    }
    
}

public class Carro { 
    public String placa;
    public String nome;
    
    @Override
    public boolean equals(Object obj){
        return placa.equals(((Carro)obj).placa);
    }
    
    @Override
    public String toString(){
        return "Placa: " + placa + " - Nome: " + nome;
    }
}





