/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module2;
import java.util.*;
import javafx.util.*;
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
        Pair<int[], String[]> ans=h.hashFunction(keys,mod);
        int[] key=ans.getKey();
        String[] hashValue=ans.getValue();
        int max=0;
        for(int i=0;i<hashValue.length;i++)
        {
            
            if(hashValue[i].length()>max)
                max=hashValue[i].length();
        }
        for(int i=0;i<hashValue.length;i++)
        {
                hashValue[i]=String.format("%1$" + (max) + "s", hashValue[i]).replace(' ', '0');
        }
        System.out.println("\nkeys and corresponding hash Values:");
        for(int i = 0 ; i < hashValue.length ; i++) 
        {
            System.out.println(key[i]+" "+hashValue[i]);
        }
        System.out.println();
        
        Initialization algo=new Initialization(LD);
        
        System.out.println("Initial Directory:");
        for(int i=0;i<(int)(Math.pow(2,GD));i++)
        {
            String label=Integer.toString(i,2);
            label=String.format("%1$" + (GD) + "s", label).replace(' ', '0');
            System.out.print(label+"\t");
        }
        System.out.println("\nGD="+GD);
        System.out.println("\nInitial Buckets:");
        Iterator itr=algo.buckets.iterator();  
        while(itr.hasNext()){  
            Bucket bt=(Bucket)itr.next();  
            System.out.println("B"+bt.label+" : "+bt.bucket+" , LD="+bt.LD);
        }
        System.out.println();
        
        new Algorithm(LD,GD,bfr,key,hashValue,algo);
        
    }
    
    
}
