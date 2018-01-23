
package greatestcommondivisorfornumbers;


import java.util.Scanner;

/**
 *
 * @author NORHAN
 */
public class GreatestCommonDivisorForNumbers {

   
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
      
        int key1=0;
        int key2=0;
        
       
       key1= Integer.parseInt(s1.next());
       key2= Integer.parseInt(s1.next());
       
        int max=-1;
        
        if(key2>key1)
        {
            while(key1!=0)
            {max=key2%key1;
            key2=key1;
            key1=max;
            
            }
            System.out.println(key2); 
        }
        else{
             while(key2!=0)
            {max=key1%key2;
            key1=key2;
            key2=max;
            
            }
            System.out.println(key1); 
            
        }
    }
    
}
