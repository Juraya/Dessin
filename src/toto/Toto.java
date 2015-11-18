package toto;

import javax.swing.*;


/**
 * Created by Julien on 18/11/2015.
 */
public class Toto extends javax.swing.JFrame {

    public Toto() {
        initJPanel();
    }

    public void initJPanel() {
        //setSize(350,400);
        TotoJPanel testJP = new TotoJPanel();
        add(testJP);
    }

    public static void main(String[] args) {
        JFrame testJF = new JFrame();
        testJF.setSize(400,400);
        testJF.setLocationRelativeTo(null);
        testJF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        testJF.setVisible(true);
    }
}
