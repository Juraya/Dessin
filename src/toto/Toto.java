package toto;

import javax.swing.*;

/**
 * Created by Julien on 18/11/2015.
 */
public class Toto extends javax.swing.JFrame {

    public Toto(int largeur, int hauteur) {
        this.setSize(largeur, hauteur);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Toto test = new Toto(400, 400);

    }
}
