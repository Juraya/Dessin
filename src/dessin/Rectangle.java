package dessin;

import java.awt.*;

/**
 * Created by Julien on 04/11/2015.
 */

public class Rectangle extends ObjetGraphique {

    /**
     * Objet de type Java Rectangle passé en attribut
     */
    private java.awt.Rectangle rectangle;

    /**
     * Méthode de dessin du rectangle, prenant en paramètre une largeur, une hauteur, et un point de départ.
     * @param graphics
     */
    @Override
    public void dessineToi(Graphics graphics) {
        graphics.drawRect((int) rectangle.getX(), (int) rectangle.getY(), (int) rectangle.getWidth(), (int) rectangle.getHeight());
    }

    /**
     * Méthode pour savoir si le point spécifié est contenu.
     * @param entier1
     * @param entier2
     * @return
     */
    @Override
    public boolean contient(int entier1, int entier2) {
        return rectangle.contains(entier1, entier2);
    }

    /**
     * Constructeur de rectangle, avec les coordonnées du point de départ, la largeur et la hauteur.
     * @param x
     * @param y
     * @param largeur
     * @param hauteur
     */
    public Rectangle(int x, int y, int largeur, int hauteur) {
        this.rectangle = new java.awt.Rectangle(x, y, largeur, hauteur);
    }

    /**
     * Constructeur de rectangle, avec le point, la largeur et la hauteur.
     * @param p
     * @param largeur
     * @param hauteur
     */
    public Rectangle(Point p, int largeur, int hauteur) {
        this.rectangle = new java.awt.Rectangle((int) p.getX(), (int) p.getY(), largeur, hauteur);
    }

    /**
     * Constructeur de rectangle, avec le point, la largeur, la hauteur, et la couleur.s
     * @param p
     * @param largeur
     * @param hauteur
     * @param c
     */
    public Rectangle(Point p, int largeur, int hauteur, Color c) {
        this.rectangle = new java.awt.Rectangle((int) p.getX(), (int) p.getY(), largeur, hauteur);
        couleur = c;
    }

    public java.awt.Rectangle getRectangle() {
        return rectangle;
    }

    public void setRectangle(java.awt.Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    @Override
    public Color getCouleur() {
        return this.couleur;
    }

    @Override
    public void setCouleur(Color couleur) {
        this.couleur = couleur;
    }
}