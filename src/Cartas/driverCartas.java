/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Cartas;

/**
 *
 * @author xuxo
 */
public class driverCartas {
    
    public static void main(String args[])
    {
        Baraja b = new Baraja();
        System.out.println("Baraja Ordenada: ");
        b.printBaraja();
        b.revolverBaraja();
        System.out.println("Baraja R1: ");
        b.printBaraja();
        b.revolverBaraja();
        System.out.println("Baraja R2: ");
        b.printBaraja();
        
    }
    
}
