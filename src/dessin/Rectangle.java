package dessin;

import java.awt.*;

/**
 * Created by Julien on 04/11/2015.
 */

public class Rectangle extends ObjetGraphique {

    private java.awt.Rectangle rectangle;
    private int hauteurRect;
    private int largeurRect;
    private Color couleur;
    private Point pointRect;

    @Override
    public void dessineToi(Graphics graphics) {

    }

    @Override
    public boolean contient(int entier1, int entier2) {
        return false;
    }

    public Rectangle(int x, int y, int largeur, int hauteur) {
        hauteurRect = hauteur;
        largeurRect = largeur;
    }

    public Rectangle(Point p, int largeur, int hauteur) {
        pointRect = p;
        largeurRect = largeur;
        hauteurRect = hauteur;
    }

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