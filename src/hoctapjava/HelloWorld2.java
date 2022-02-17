/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoctapjava;

import java.awt.HeadlessException;
import javax.swing.JFrame;
/**
 *
 * @author lepha
 */
public class HelloWorld2 extends JFrame{
    
    public HelloWorld2() throws HeadlessException {
        setSize(400,400);
    }
    
    public static void main(String[] args) {
           new  HelloWorld2().setVisible(true);
    }
}
