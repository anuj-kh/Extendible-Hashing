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
