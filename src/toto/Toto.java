package toto;

import javax.swing.*;


/**
 * Created by Julien on 18/11/2015.
 */
public class Toto extends javax.swing.JFrame {

    /**
     * Cr�ation de la JFrame, avec en param�tre une largeur, une hauteur, et un titre pour la fenetre.
     * @param largeur
     * @param hauteur
     * @param title
     */
    public Toto(int largeur, int hauteur, String title) {
        super(title);
        this.setSize(largeur, hauteur);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * M�thode principale, avec cr�ation du JPanel, cr�ation du JFrame, position au centre, visibilit�, et lien entre Frame et Panel.
     * @param args
     */
    public static void main(String[] args) {
        TotoJPanel testJP = new TotoJPanel();
        JFrame testJF = new Toto(400, 400, "Fenetre Java");
        testJF.setLocationRelativeTo(null);
        testJF.setVisible(true);
        testJF.add(testJP);
    }
}
