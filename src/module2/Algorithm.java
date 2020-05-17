/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module2;
import java.util.*; 
/**
 *
 * @author Anuj Kharbanda
 */
public class Algorithm {
    
    ArrayList<Bucket> buckets = new ArrayList<Bucket>();
    int no_of_buckets;
    String label="";
    int LD;
    int flag=-1;
    public Algorithm(int LD)
    {
        this.LD=LD;
        no_of_buckets=(int)(Math.pow(2,LD));
        
        for(int i=0;i<no_of_buckets;i++)
        {
            label="";
            label=Integer.toString(i,2);
            int len=label.length();
            label=String.format("%1$" + (LD-len+1) + "s", label).replace(' ', '0');   
//            for(int j=0;j<LD-len;j++)
//            {
//                label="0"+label;
//            }
            Bucket b1=new Bucket(label,new ArrayList<Integer>(),new ArrayList<String>(),LD);
            buckets.add(b1);
        }
    }
    
    
}
