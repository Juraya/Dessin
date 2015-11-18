package dessin;

import java.awt.Color;

/**
 * Created by Julien on 04/11/2015.
 */
public abstract class ObjetGraphique {
    protected Color couleur;

    public Color getCouleur() {
        return couleur;
    }

    public void setCouleur(Color couleur) {
        this.couleur = couleur;
    }

    public ObjetGraphique(Color couleur) {
        this.couleur = couleur;
    }

    public ObjetGraphique() {
        this.couleur = Color.black;
    }

    public abstract void dessineToi(java.awt.Graphics graphics);

    public abstract boolean contient(int entier1, int entier2);


}
