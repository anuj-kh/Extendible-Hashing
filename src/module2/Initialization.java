package module2;

import java.util.*;

//initialising all the buckets according to user input LD and GD

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