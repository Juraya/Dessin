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
     * @param graphics
     */
    @Override
    public void dessineToi(Graphics graphics) {
        graphics.drawOval(pointCer.x, pointCer.y, rayonCer, rayonCer);
    }

    /**
     * M�thode qui permet de savoir si le point est contenu dans la zone.
     * @param entier1
     * @param entier2
     * @return
     */
    @Override
    public boolean contient(int entier1, int entier2) {
        return (Math.pow((entier1 - pointCer.x), 2) + Math.pow((entier2 - pointCer.y), 2)) <= Math.pow(rayonCer, 2);
    }

    /**
     * Constructeur sans la couleur.
     * @param centre
     * @param rayon
     */
    public Cercle(Point centre,int rayon) {
        rayonCer = rayon;
        pointCer = centre;
    }

    /**
     * Constructeur du cercle en permettant de mettre une couleur.
     * @param centre
     * @param rayon
     * @param couleur
     */
    public Cercle(Point centre, int rayon, Color couleur) {
        pointCer = centre;
        rayonCer = rayon;
        this.couleur = couleur;
    }
}
