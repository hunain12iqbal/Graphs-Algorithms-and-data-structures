/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class SelecSorted {
    
    public static void main(String[] args) {
        
        
        int [] hun;
        hun = new int []  {38,52,18,9,6,62,13};
        
        int min;
         int temp = 0 ;
        
        for(int i=0; i<hun.length; i++){
            
            min = i;
            for(int j=i+1; j<hun.length; j++){
 
                if(hun[j]<hun[min])
                {
                
                
                
               min = j;    
                }
             }
                temp = hun[i];
                hun[i] = hun[min];
                hun[min] = temp;
                
            }
            
            
            for(int i=0; i<hun.length; i++){
             
                System.out.println(hun[i]);
                
                
            }
            
            
            
            int second [];
            second = new int[] {1,2,3,4,5,6};
          System.out.println("--------------------- ");
            System.out.println("secong array "+second[2]);
            
        }
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    

