/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7_cubo;

/**
 *
 * @author flac3
 */
public class EVA3_7_CUBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][][]cubo = new int [2][5][3];
        //vamos a llenarlo con valores aleatorios
        System.err.println(cubo.length);
         System.err.println(cubo[0].length);
          System.err.println(cubo[0][0].length);
        for (int i = 0; i <cubo.length; i++) {
            for (int j = 0; j <cubo[i].length; j++) {
               for (int k = 0; k <cubo[i][j].length; k++) {
                   cubo[i][j][k]=(int)(Math.random()*100);
                   
             
             }
          }
        }
      //imprimir
        for (int i = 0; i <cubo.length; i++) {
             for (int j = 0; j <cubo[i].length; j++) {
                for (int k = 0; k <cubo[i][j].length; k++) {
                    System.out.print("["+cubo[i][j][k]+ "]");
                 }
                         System.out.println("");
              }
                             System.err.println("");
        }
      
      
      
    }
    
}
