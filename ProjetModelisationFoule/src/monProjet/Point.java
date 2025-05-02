package monProjet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author asicot
 */
public class Point {
 
    
//attribut de la classe Point
    private double x;
    private double y;
    private String nom;
    
    
//Constructeur de la classe Individu    
    private Point(String nom, double x, double y ){
        this.nom=nom;
        this.x=x;
        this.y=y;
    }    



//Geter
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String getNom() {
        return nom;
    }
    
//Setter

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    

    
    
    
    
    
    

}
