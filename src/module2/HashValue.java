package module2;

import javafx.util.*;

//hash function implementation - currently using Kmod M
//K - data item
//M - user input

public class HashValue {
    
    public int[] splittingKeys(String keys,int mod)
    {
        keys = keys.replaceAll("[^-?0-9]+", " ");
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
