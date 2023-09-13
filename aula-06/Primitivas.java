public class Primitivas{
    
    public static void main(String[] args){
        
        char tipoChar = 'G';
        byte tipoByteNegativo = -5;
        byte tipoByte = 0;
        short tipoShort = 0;
        int tipoInt = 2023;
        long tipoLong = 9876546;
        float tipoFloat = 11.5f;
        double tipoDouble = 1984.33;
        boolean tipoBoolean = false;
        
        System.out.println("char: " + tipoChar);
        System.out.println("byte negativo: " + tipoByteNegativo);
        System.out.println("byte: " + tipoByte);
        System.out.println("short: " + tipoShort);
        System.out.println("int: " + tipoInt);
        System.out.println("long: " + tipoLong);
        System.out.println("float: " + tipoFloat);
        System.out.println("double: " + tipoDouble);
        System.out.println("boolean: " + tipoBoolean);
        
        int novoInt = (int) tipoLong;
        System.out.println("novoInt: " + novoInt);
        int varInt = (int) tipoDouble;
        System.out.println("varInt: " + varInt);
        
    }
    
}