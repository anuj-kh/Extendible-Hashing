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
public class Initial {
    int LD;
    int bfr;
    Algorithm algo;
    int[] key;
    String[] hashValue;
    public Initial(int LD,int bfr,int[] key,String[] hashValue,Algorithm algo)
    {
        this.algo=algo;
        this.LD=LD;
        this.bfr=bfr;
        this.key=key;
        this.hashValue=hashValue;
        
        int k=0;
        for(int i=0;i<key.length;i++)
        {
            if(hashValue[i].length()<LD)
                hashValue[i]=String.format("%1$" + (LD-hashValue[i].length()+1) + "s", hashValue[i]).replace(' ', '0');       
//            System.out.println(hashValue[i]);   
            String lsb=hashValue[i].substring(hashValue[i].length()-LD);
//            System.out.println(lsb);
            Iterator itr=algo.buckets.iterator();  
            while(itr.hasNext()){  
                Bucket bt=(Bucket)itr.next();  
                if(bt.label.equals(lsb))
                {
                    if(bt.bucket.size()==bfr)
                    {
                        k=1;
                        break;
                    }
                    bt.bucket.add(key[i]);
                }
                System.out.println(bt.label+" "+bt.bucket);  
            }
            if(k==1)
                break;
        }
    }
    
}
//32 28 43 15 66 27 86 54 35 98 72
//10 2 1 3