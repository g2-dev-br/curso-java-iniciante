public class Multidimencional{
    public static void main(String[] args){
        
        System.out.println("---------------");
        
        String[][] matriz = {{"A","B","C"},{"D","E","F"}};
        
        System.out.println(matriz[1][1]);
    
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("-----------------");
        
        int[][] matriz2 = new int[3][4];
        
        matriz2[0][0] = 1;
        matriz2[0][1] = 2;
        matriz2[0][2] = 3;
        matriz2[0][3] = 4;
        
        matriz2[1][0] = 5;
        matriz2[1][1] = 6;
        matriz2[1][2] = 7;
        matriz2[1][3] = 8;
        
        matriz2[2][0] = 9;
        matriz2[2][1] = 10;
        matriz2[2][2] = 11;
        matriz2[2][3] = 12;
        
        for(int i = 0; i < matriz2.length; i++){
            for(int j = 0; j < matriz2[i].length; j++){
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }
       
        System.out.println("-----------------");
        
        matriz2[2][3] = 99;
        
        for(int i = 0; i < matriz2.length; i++){
            for(int j = 0; j < matriz2[i].length; j++){
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }
        
        
    }
}