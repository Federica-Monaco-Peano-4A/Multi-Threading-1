/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpsayhihello;

/**
 *
 * @author Giacomo
 */
public class TPSayHiHello {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Hi Hello
        Hi h1 = new Hi();
        Hello h2 = new Hello();
        h1.start();
        h2.start();
        
        //Say
        Say s1 = new Say("Say")
        s1.start();
    }
}
