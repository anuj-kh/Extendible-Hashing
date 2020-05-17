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
public class Initialization {
    
    ArrayList<Bucket> buckets = new ArrayList<Bucket>();
    int no_of_buckets;
    String label="";
    int LD;
    int flag=-1;
    public Initialization(int LD)
    {
        this.LD=LD;
        no_of_buckets=(int)(Math.pow(2,LD));
        
        for(int i=0;i<no_of_buckets;i++)
        {
            label="";
            label=Integer.toString(i,2);
            label=String.format("%1$" + (LD) + "s", label).replace(' ', '0');   
            Bucket b1=new Bucket(label,new ArrayList<Integer>(),new ArrayList<String>(),LD);
            buckets.add(b1);
        }
    }
    
    
}
