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
public class Alg {
    int LD;
    int GD;
    int bfr;
    Algorithm algo;
    int[] key;
    String[] hashValue;
    
    public Alg(int LD,int GD,int bfr,int[] key,String[] hashValue,Algorithm algo)
    {
        this.algo=algo;
        this.LD=LD;
        this.GD=GD;
        this.bfr=bfr;
        this.key=key;
        this.hashValue=hashValue;
        
        int k=0;
        for(int i=0;i<key.length;i++)
        {
            if(hashValue[i].length()<LD+k+1)
                hashValue[i]=String.format("%1$" + (LD+k+1) + "s", hashValue[i]).replace(' ', '0'); 
            String lsb;
            ListIterator itr=algo.buckets.listIterator();
            
            while(itr.hasNext()){  
                Bucket bt=(Bucket)itr.next(); 
                lsb=hashValue[i].substring(hashValue[i].length()-bt.label.length());
                if(bt.label.equals(lsb))
                {
                    if(bt.bucket.size()==bfr)
                    {
                            System.out.println("\nCannot add "+key[i]+" into bucket "+bt.label+". So we need to split now\n");
                            k++;
                            
                            System.out.println("Next Iteration:\n");
                            System.out.println("Directory:");
                            if(bt.LD+1>GD)
                                GD++;
                            for(int ii=0;ii<(int)(Math.pow(2,GD));ii++)
                            {
                                String label=Integer.toString(ii,2);
                                label=String.format("%1$" + (GD) + "s", label).replace(' ', '0');
                                System.out.print(label+"\t");
                            }
                            System.out.println("\n");
                            
                            Bucket b1=new Bucket("0"+bt.label,new ArrayList<Integer>(),new ArrayList<String>(),bt.LD+1);
                            Bucket b2=new Bucket("1"+bt.label,new ArrayList<Integer>(),new ArrayList<String>(),bt.LD+1);
                            for(int kk=0;kk<2;kk++)
                            {
                                Bucket aa=(kk==0)?b1:b2;
//                                System.out.println(bt.bucket.size());
//                                System.out.println("bahar");
                                for(int jj=0;jj<bt.bucket.size();jj++)
                                {
//                                    System.out.println("andar");
                                    String lsb2=bt.bucket2.get(jj).substring(bt.bucket2.get(jj).length()-aa.label.length());
                                    if(aa.label.equals(lsb2))
                                    {
                                        aa.bucket.add(bt.bucket.get(jj));
                                        aa.bucket2.add(bt.bucket2.get(jj));
                                    }
                                }
                                if(kk==0)
                                    b1=aa;
                                else
                                    b2=aa;   
                            }
                            
                            itr.remove();
                            itr.add(b1);
                            itr.add(b2);
                            i--;
                            algo.flag=i;
                            
                            break;
                    }
                    bt.bucket.add(key[i]);
                    bt.bucket2.add(hashValue[i]);
                    
                    System.out.println("Buckets after inserting "+key[i]+":");
                    ListIterator itr2=algo.buckets.listIterator();  
                    while(itr2.hasNext()){  
                        Bucket bt2=(Bucket)itr2.next();  
                        System.out.println("B"+bt2.label+" : "+bt2.bucket+" , LD="+bt2.LD);
                    }
                }
            }
            
//            if(k!=0)
//                break;
        }
        System.out.println("\nCOMPLETED!!");
    }
}
