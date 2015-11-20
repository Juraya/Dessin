package dessin;

import java.awt.*;

/**
 * Created by Julien on 04/11/2015.
 */

public class Rectangle extends ObjetGraphique {

    /**
     * Objet de type Java Rectangle pass� en attribut
     */
    private java.awt.Rectangle rectangle;

    /**
     * M�thode de dessin du rectangle, prenant en param�tre une largeur, une hauteur, et un point de d�part.
     * @param graphics Variable de type Graphics.
     */
    @Override
    public void dessineToi(Graphics graphics) {
        graphics.drawRect(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
    }

    /**
     * M�thode pour savoir si le point sp�cifi� est contenu.
     * @param entier1 Abcisse du point � v�rifier
     * @param entier2 Ordonn�e du point � v�rifier
     * @return Retourne un bool�en.
     */
    @Override
    public boolean contient(int entier1, int entier2) {
        return rectangle.contains(entier1, entier2);
    }

    /**
     * Constructeur de rectangle, avec les coordonn�es du point de d�part, la largeur et la hauteur.
     * @param x Abcisse de d�part
     * @param y Ordonn�e de d�part
     * @param largeur Largeur
     * @param hauteur Hauteur
     */
    public Rectangle(int x, int y, int largeur, int hauteur) {
        this.rectangle = new java.awt.Rectangle(x, y, largeur, hauteur);
    }

    /**
     * Constructeur de rectangle, avec le point, la largeur et la hauteur.
     * @param p Point de d�part
     * @param largeur Largeur
     * @param hauteur Hauteur
     */
    public Rectangle(Point p, int largeur, int hauteur) {
        this.rectangle = new java.awt.Rectangle((int) p.getX(), (int) p.getY(), largeur, hauteur);
    }

    /**
     * Constructeur de rectangle, avec le point, la largeur, la hauteur, et la couleur.s
     * @param p Point de d�part
     * @param largeur Largeur
     * @param hauteur Hauteur
     * @param c Couleur
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

    /**
     * M�thode qui retourne la couleur de l'objet.
     * @return Retourne la couleur.
     */
    @Override
    public Color getCouleur() {
        return this.couleur;
    }

    /**
     * M�thode qui red�finit la couleur de l'objet.
     * @param couleur Objet de type Color
     */
    @Override
    public void setCouleur(Color couleur) {
        this.couleur = couleur;
    }
}