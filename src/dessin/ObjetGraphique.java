package dessin;

import java.awt.Color;

/**
 * Created by Julien on 04/11/2015.
 */
public abstract class ObjetGraphique {
    /**
     * Attribut couleur de l'objet graphique
     */
    protected java.awt.Color couleur;

    public Color getCouleur() {
        return couleur;
    }

    public void setCouleur(Color couleur) {
        this.couleur = couleur;
    }

    public ObjetGraphique(Color couleur) {
        this.couleur = couleur;
    }

    /**
     * Constructeur par défaut de l'objet graphique, lui attribuant la couleur noire.
     */
    public ObjetGraphique() {
        this.couleur = Color.BLACK;
    }

    /**
     * Méthode abstraite de dessin pour les classes filles.
     * @param graphics Variable de type Graphics.
     */
    public abstract void dessineToi(java.awt.Graphics graphics);

    public abstract boolean contient(int entier1, int entier2);


}
