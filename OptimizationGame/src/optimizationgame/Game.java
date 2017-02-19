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
public class Game {
    
    public static int game(int[] game){
        int[] result = new int[game.length+extendArray(game)];
        
        int addition = 0, sum= 0;
        
        for (int i = 0; i < game.length; i++){
            
            result[i] = game[i] + addition;
            addition = result[i]/2;
            result[i] = result[i]%2;
            sum += result[i];
        }
        result[result.length-1] = addition;
        sum += result[result.length-1];
        
        return sum;
    }
    
    private static int extendArray(int[] a){
        int result = Integer.MIN_VALUE;
        for(int i = 0; i < a.length-1; i++ ){
            if (a[i] > result) result = a[i];
        }
        return result/2;
    }
}
