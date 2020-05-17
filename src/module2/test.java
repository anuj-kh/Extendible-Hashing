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
public class test {
    public static void main(String args[])
    {
    String a="1";
    a=String.format("%1$" + (2) + "s", a).replace(' ', '0');
    System.out.println(a);
    }
}
