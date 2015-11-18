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
     * Hauteur du rectangle
     */
    private int hauteurRect;
    /**
     * Largeur du rectangle
     */
    private int largeurRect;
    /**
     * Couleur du rectangle
     */
    private Color couleur;
    /**
     * Point de départ du rectangle
     */
    private Point pointRect;

    /**
     * Méthode de dessin du rectangle, prenant en paramètre une largeur, une hauteur, et un point de départ.
     * @param graphics
     */
    @Override
    public void dessineToi(Graphics graphics) {
        graphics.drawRect(pointRect.x, pointRect.y, this.getLargeurRect(), this.getHauteurRect());
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
        hauteurRect = hauteur;
        largeurRect = largeur;
    }

    /**
     * Constructeur de rectangle, avec le point, la largeur et la hauteur.
     * @param p
     * @param largeur
     * @param hauteur
     */
    public Rectangle(Point p, int largeur, int hauteur) {
        pointRect = p;
        largeurRect = largeur;
        hauteurRect = hauteur;
    }

    /**
     * Constructeur de rectangle, avec le point, la largeur, la hauteur, et la couleur.s
     * @param p
     * @param largeur
     * @param hauteur
     * @param c
     */
    public Rectangle(Point p, int largeur, int hauteur, Color c) {
        largeurRect = largeur;
        hauteurRect = hauteur;
        couleur = c;
        pointRect = p;
    }

    public java.awt.Rectangle getRectangle() {
        return rectangle;
    }

    public void setRectangle(java.awt.Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public int getHauteurRect() {
        return hauteurRect;
    }

    public void setHauteurRect(int hauteurRect) {
        this.hauteurRect = hauteurRect;
    }

    public int getLargeurRect() {
        return largeurRect;
    }

    public void setLargeurRect(int largeurRect) {
        this.largeurRect = largeurRect;
    }

    @Override
    public Color getCouleur() {
        return couleur;
    }

    @Override
    public void setCouleur(Color couleur) {
        this.couleur = couleur;
    }

    public Point getPointRect() {
        return pointRect;
    }

    public void setPointRect(Point pointRect) {
        this.pointRect = pointRect;
    }
}