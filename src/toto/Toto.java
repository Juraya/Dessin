package toto;

import javax.swing.*;


/**
 * Created by Julien on 18/11/2015.
 */
public class Toto extends javax.swing.JFrame {

    /**
     * Création de la JFrame, avec en paramètre une largeur, une hauteur, et un titre pour la fenetre.
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
     * Méthode principale, avec création du JPanel, création du JFrame, position au centre, visibilité, et lien entre Frame et Panel.
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
