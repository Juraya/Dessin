package toto;

import dessin.*;
import dessin.Rectangle;
import dessin.ObjetGraphique;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Julien on 18/11/2015.
 */
public class TotoJPanel extends javax.swing.JPanel {
    private ArrayList<ObjetGraphique> listeObjets;

    public TotoJPanel(ArrayList<ObjetGraphique> listeObjets) {
        this.listeObjets = listeObjets;
    }

    public TotoJPanel() {
        this.listeObjets.add(new Cercle(200,200,100));
        this.listeObjets.add(new Cercle(160,150,20));
        this.listeObjets.add(new Cercle(240,150,20));
        this.listeObjets.add(new Rectangle(150,220,100,40));
    }

    public ArrayList<ObjetGraphique> getListeObjets() {
        return listeObjets;
    }

    public void setListeObjets(ArrayList<ObjetGraphique> listeObjets) {
        this.listeObjets = listeObjets;
    }

    public void paintComponent(Graphics g) {
        for ( ObjetGraphique objetActuel : listeObjets ) {
            objetActuel.dessineToi(g);
        }
    }
}
