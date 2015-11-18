package toto;

import dessin.Cercle;
import dessin.Rectangle;
import dessin.ObjetGraphique;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Julien on 18/11/2015.
 */
public class TotoJPanel extends javax.swing.JPanel {
    private ArrayList<ObjetGraphique> listeObjets = new ArrayList<>();

    public TotoJPanel() {
        System.err.println("Entree des objets dans la liste !");
        listeObjets.add(new Cercle(200,200,100));
        listeObjets.add(new Cercle(160,150,20));
        listeObjets.add(new Cercle(240,150,20));
        listeObjets.add(new Rectangle(150,220,100,40));
        System.err.println("Entree terminee !");
        System.err.println(listeObjets.toString());
    }

    public ArrayList<ObjetGraphique> getListeObjets() {
        return listeObjets;
    }

    public void setListeObjets(ArrayList<ObjetGraphique> listeObjets) {
        this.listeObjets = listeObjets;
    }

    public void paintComponent(Graphics g) {
        System.err.println("Je vais rentrer dans la boucle de dessin !");
        for ( ObjetGraphique objetActuel : listeObjets ) {
            System.err.println("Je dessine " + objetActuel.toString() + " !");
            objetActuel.dessineToi(g);
        }
    }
}
