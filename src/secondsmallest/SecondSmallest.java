/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondsmallest;

/**
 *
 * @author neerajsah
 */
public class SecondSmallest {

    public static void main(String[] args) 
    {
        int[] arr={5,4,0,2,8,6,10};
        int first=arr[0],second=arr[0];
        for(int i=0;i<arr.length;i++)
        {
          if(first>arr[i])
          {
            second=first;
            first=arr[i];
            
          }
         else if(arr[i]<second && arr[i]>first)
          {
            second=arr[i];
          }
          
        }
        
        System.out.println(second);
    }
    
}
