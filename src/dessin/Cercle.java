package dessin;

import java.awt.*;

/**
 * Created by Julien on 05/11/2015.
 */
public class Cercle extends ObjetGraphique {

    private int rayonCer;
    private Point pointCer;
    private Color couleurCer;

    @Override
    public void dessineToi(Graphics graphics) {

    }

    @Override
    public boolean contient(int entier1, int entier2) {
        return false;
    }

    public Cercle(Point centre,int rayon) {
        rayonCer = rayon;
        pointCer = centre;
    }

    public Cercle(Point centre, int rayon, Color couleur) {
        pointCer = centre;
        rayonCer = rayon;
        couleurCer = couleur;
    }
}
