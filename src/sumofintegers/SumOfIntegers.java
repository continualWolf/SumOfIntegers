/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumofintegers;

/**
 *
 * @author bmwat
 */
public class SumOfIntegers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(SumOfIntegersInDivisior(3, 9, 3));
    }
    public static int SumOfIntegers(int min, int max){
        int total = 0;
        int temp;
        
        if(min < -50000 || max < -50000 || min > 50000 || max > 50000){
            System.out.println("Illegal Input");
            return 0;
        } 
        if(min > max){
            temp = min;
            min = max;
            max = temp;
        }
        
        for(int i = min; i < max+1; i++){
            total = total + i;
        }
        
        return total;
    }
    public static int SumOfOddIntegers(int min, int max){
        int total = 0;
        int temp;
        
        if(min < -50000 || max < -50000 || min > 50000 || max > 50000){
            System.out.println("Illegal Input");
            return 0;
        } 
        if(min > max){
            temp = min;
            min = max;
            max = temp;
        }
        
        for(int i = min; i < max+1; i++){
            if(i%2 != 0){
            total = total + i;
            }
        }
        
        return total;
    }
    public static int SumOfIntegersInDivisior(int min, int max, int div){
        int total = 0;
        int temp;
        
        if(min < -50000 || max < -50000 || min > 50000 || max > 50000){
            System.out.println("Illegal Input");
            return 0;
        } 
        if(min > max){
            temp = min;
            min = max;
            max = temp;
        }
        
        for(int i = min; i < max+1; i++){
            if(i % div == 0){
            total = total + i;
            }
        }
        
        return total;
    }
    
    
}
