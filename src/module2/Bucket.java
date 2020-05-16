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
    
    String label;   
    ArrayList<Integer> bucket;
    Bucket(String label,ArrayList<Integer> bucket)
    {  
        this.label=label;  
        this.bucket=bucket;
    }  
}
