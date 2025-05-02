/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simulation;

import FenetreGraphique.FenetreGraphique;
import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author guillaume.laurent
 */
public class TestSimulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FenetreGraphique fenetre = new FenetreGraphique("Simulation", correctionPartie1.Simulation.X_MAX, correctionPartie1.Simulation.Y_MAX);
        Graphics2D contexte = fenetre.getGraphics2D();
        
        double x = 10.0;
        double y = 200.0;
        
        while (x<800) {

            fenetre.effacer();
            contexte.setColor(Color.RED);
            contexte.fillOval((int) (x - Simulation.RAYON_MAX), (int) (y - Simulation.RAYON_MAX), (int) (2 * Simulation.RAYON_MAX), (int) (2 * Simulation.RAYON_MAX));
            fenetre.actualiser(0.04);
            
            x += Simulation.VITESSE_MAX;

        }
        
        fenetre.fermer();
        
    }
    
}
