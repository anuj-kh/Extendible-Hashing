package module2;

import java.util.ArrayList;

//basic bucket data structure to store elements

public class Bucket { 
    int LD;
    String label;   
    ArrayList<Integer> bucket;
    ArrayList<String> bucket2;
    Bucket(String label,ArrayList<Integer> bucket,ArrayList<String> bucket2,int LD)
    {  
        this.label=label;  
        this.bucket=bucket;
        this.bucket2=bucket2;
        this.LD=LD;
    }  
}