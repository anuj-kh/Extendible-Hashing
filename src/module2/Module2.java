/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module2;
import java.util.Scanner;
/**
 *
 * @author Anuj Kharbanda
 */

public class Module2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the keys:");
        String keys = myObj.nextLine();
        System.out.println("Enter mod value , GD , LD, bfr :");
        int mod = myObj.nextInt();
        int GD = myObj.nextInt();
        int LD = myObj.nextInt();
        int bfr = myObj.nextInt();
        
        HashValue h=new HashValue();
        String ans[]=h.hashFunction(keys,mod);
        System.out.println("hash Values:");
        for(int i = 0 ; i < ans.length ; i++) 
        {
            System.out.print(ans[i]+" ");
        }
        System.out.println("");  
    }
    
    
}
