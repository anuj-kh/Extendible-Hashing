/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module2;

/**
 *
 * @author Anuj Kharbanda
 */
public class Splitting {
    
    int LD;
    int bfr;
    Algorithm algo;
    int[] key;
    String[] hashValue;
        
    public Splitting(int LD,int bfr,int[] key,String[] hashValue,Algorithm algo)
    {
        this.algo=algo;
        this.LD=LD;
        this.bfr=bfr;
        this.key=key;
        this.hashValue=hashValue;
        for(int i=algo.flag;i<key.length;i++)
        {
            if(hashValue[i].length()<LD)
                hashValue[i]=String.format("%1$" + (LD-hashValue[i].length()+1) + "s", hashValue[i]).replace(' ', '0');       
            String lsb=hashValue[i].substring(hashValue[i].length()-LD);
        }
    }
    
    public static void main(String args[])
    {
    }
}
