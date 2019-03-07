/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package astar;

/**
 *
 * @author Saurabh
 */
public class Astar {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        String s=new String();
        Astars a1=new Astars();
        a1.getState();
        a1.display();
        s=a1.TreeSearch();
        System.out.println(s);
    }
    
}
