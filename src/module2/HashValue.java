/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module2;
import javafx.util.*;
/**
 *
 * @author Anuj Kharbanda
 */
public class HashValue {
    
    public int[] splittingKeys(String keys,int mod)
    {
        String s[] = keys.split(" "); 
        int out[] = new int[s.length]; 
        for(int i = 0 ; i < s.length ; i++) 
             out[i] = Integer.parseInt(s[i]);
        return out;
    }
    
    public Pair<int[], String[]> hashFunction(String keys,int mod)
    {
        int[] key=splittingKeys(keys,mod);
        
        String[] hash_value = new String[key.length];
        for(int i=0;i<key.length;i++)
        {
            int k_mod=key[i]%mod;
            hash_value[i]=Integer.toString(k_mod,2);
        }    
        return new Pair<int[], String[]>(key,hash_value); 
    }
}
