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
public class HashValue {
    
    public String[] hashFunction(int[] key,int mod)
    {
        String[] hash_value = new String[key.length];
        for(int i=0;i<key.length;i++)
        {
            int k_mod=key[i]%mod;
            hash_value[i]=Integer.toString(k_mod,2);
        }    
        return hash_value;
    }
    public String[] splittingKeys(String keys,int mod)
    {
        String s[] = keys.split(" "); 
        int out[] = new int[s.length]; 
        for(int i = 0 ; i < s.length ; i++) 
             out[i] = Integer.parseInt(s[i]);
        String[] hashValue=hashFunction(out,mod);
        return hashValue;
    }
}
