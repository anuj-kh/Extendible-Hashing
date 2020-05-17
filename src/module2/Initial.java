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
//            if(algo.flag!=-1 && i>=algo.flag)
//            {
//                hashValue[i]=String.format("%1$" + (k+1) + "s", hashValue[i]).replace(' ', '0');
//            }
//            System.out.println(hashValue[i]);   
//            String lsbb=hashValue[i].substring(hashValue[i].length()-LD);
            String lsb=hashValue[i].substring(hashValue[i].length()-LD);
//            System.out.println(lsb);
            ListIterator itr=algo.buckets.listIterator();  
            while(itr.hasNext()){  
                Bucket bt=(Bucket)itr.next();  
//                lsb=hashValue[i].substring(hashValue[i].length()-bt.label.length());
//                if(bt.label.length()>lsbb.length())
//                {
//                    lsb=hashValue[i].substring(hashValue[i].length()-bt.label.length());
//                }
//                else
//                {
//                    lsb=lsbb;
//                }
                if(bt.label.equals(lsb))
                {
//                    if(bt.bucket.size()==bfr)
//                    {
//                        System.out.println("\nCannot add "+key[i]+" into bucket "+bt.label+". So we need to split now\n");
//                        k++;
                        k=1;
                        
//                        Bucket b1=new Bucket("0"+bt.label,new ArrayList<Integer>(),new ArrayList<String>());
//                        Bucket b2=new Bucket("1"+bt.label,new ArrayList<Integer>(),new ArrayList<String>());
//                        for(int kk=0;kk<2;kk++)
//                        {
//                            Bucket aa=(kk==0)?b1:b2;
//                            System.out.println(bt.bucket.size());
//                            System.out.println("bahar");
//                            for(int jj=0;jj<bt.bucket.size();jj++)
//                            {
//                                System.out.println("andar");
//                                String lsb2=bt.bucket2.get(jj).substring(bt.bucket2.get(jj).length()-aa.label.length());
//                                if(aa.label.equals(lsb2))
//                                {
//                                    aa.bucket.add(bt.bucket.get(jj));
//                                    aa.bucket2.add(bt.bucket2.get(jj));
//                                }
//                            }
//                            if(kk==0)
//                                b1=aa;
//                            else
//                                b2=aa;
//                        }
                        
//                        itr.remove();
//                        itr.add(b1);
//                        itr.add(b2);
//                        i--;
                        
//                        algo.flag=i;
                        
//                        break;
//                    }
                    
                    bt.bucket.add(key[i]);
                    bt.bucket2.add(hashValue[i]);
                    
                    System.out.println("Buckets after inserting "+key[i]+":");
                    Iterator itr2=algo.buckets.iterator();  
                    while(itr2.hasNext()){  
                        Bucket bt2=(Bucket)itr2.next();  
                        System.out.println("B"+bt2.label+" : "+bt2.bucket);
                    }
                }
            }
//            if(k!=0)
//                break;
        }
    }
    
}
//32 28 43 15 66 27 86 54 35 98 72
//10 2 1 3