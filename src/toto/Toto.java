package toto;

import javax.swing.*;


/**
 * Created by Julien on 18/11/2015.
 */
public class Toto extends javax.swing.JFrame {

    /**
     * Création de la JFrame, avec en paramètre une largeur, une hauteur, et un titre pour la fenetre.
     * @param largeur Largeur de la frame
     * @param hauteur Hauteur de la frame
     * @param title Titre de la frame
     */
    public Toto(int largeur, int hauteur, String title) {
        super(title);
        this.setSize(largeur, hauteur);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * Méthode principale, avec création du JPanel, création du JFrame, position au centre, visibilité, et lien entre Frame et Panel.
     * @param args Méthode principale
     */
    public static void main(String[] args) {
        TotoJPanel testJP = new TotoJPanel();

        JButton bouton1 = new JButton("Dessin 1 On/Off");
        testJP.add(bouton1);
        bouton1.addActionListener(new MonEcouteur1());

        JButton bouton2 = new JButton("Dessin 2 On/Off");
        testJP.add(bouton2);
        bouton2.addActionListener(new MonEcouteur2());

        JButton bouton3 = new JButton("Dessin 3 On/Off");
        testJP.add(bouton3);
        bouton3.addActionListener(new MonEcouteur3());

        JButton bouton4 = new JButton("Dessin 4 On/Off");
        testJP.add(bouton4);
        bouton4.addActionListener(new MonEcouteur4());

        JFrame testJF = new Toto(600, 600, "Fenetre Java");
        testJF.setLocationRelativeTo(null);
        testJF.setVisible(true);
        testJF.add(testJP);
    }
}
