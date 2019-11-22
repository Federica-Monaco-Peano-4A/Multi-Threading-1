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
public class Say extends Thread {

    String outPut;

    public Say(String outPut) {
        this.outPut = outPut;
    }

    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(outPut);
        }
    }
    
}
