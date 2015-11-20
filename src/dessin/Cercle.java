package dessin;

import java.awt.*;

/**
 * Created by Julien on 05/11/2015.
 */
public class Cercle extends ObjetGraphique {

    /**
     * Rayon du cercle
     */
    private int rayonCer;
    /**
     * Point de d�part du cercle
     */
    private Point pointCer;

    /**
     * M�thode qui permet de dessiner le cercle, en passant en param�tre des coordonn�es de d�but et un rayon.
     * @param graphics Variable de type Graphics
     */
    @Override
    public void dessineToi(Graphics graphics) {
        graphics.drawOval( (pointCer.x-rayonCer), (pointCer.y-rayonCer), (rayonCer*2), (rayonCer*2) );
    }

    /**
     * M�thode qui permet de savoir si le point est contenu dans la zone.
     * @param entier1 Abcisse du point � v�rifier
     * @param entier2 Ordonn�e du point � v�rifier
     * @return Retourne un bool�en.
     */
    @Override
    public boolean contient(int entier1, int entier2) {
        return (Math.pow((entier1 - pointCer.x), 2) + Math.pow((entier2 - pointCer.y), 2)) <= Math.pow(rayonCer, 2);
    }

    /**
     * Constructeur sans la couleur.
     * @param centre Point central du cercle
     * @param rayon Longueur du rayon du cercle
     */
    public Cercle(Point centre,int rayon) {
        rayonCer = rayon;
        pointCer = centre;
    }

    public Cercle(int x, int y, int rayon) {
        pointCer = new Point(x,y);
        this.rayonCer = rayon;
    }

    /**
     * Constructeur du cercle en permettant de mettre une couleur.
     * @param centre Point central du cercle
     * @param rayon Longueur du rayon du cercle
     * @param couleur Couleur du cercle
     */
    public Cercle(Point centre, int rayon, Color couleur) {
        pointCer = centre;
        rayonCer = rayon;
        this.couleur = couleur;
    }
}
