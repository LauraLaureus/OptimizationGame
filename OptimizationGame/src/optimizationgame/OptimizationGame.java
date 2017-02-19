/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package optimizationgame;

/**
 *
 * @author Laura
 */
public class OptimizationGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] round = {1,2,1};
        //int[] round = {2,1};
        System.out.println(Game.game(round));
    }
    
    private static String printArray(int[] a){
        String result = "";
        for(int i = 0; i < a.length; i++)
            result += Integer.toString(a[i]) + ",";
        return result;
    }
    
}
