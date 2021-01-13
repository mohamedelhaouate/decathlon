/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.List;

/**
 *
 * @author Mohamed
 */
public class Equipe {
    private long id;
    private String nom;
    private User chef;
    private List <Equipe>userEquipes;
    private Decathlon decathlon;

    public Equipe(long id, String nom) {
        this.id = id;
        this.nom = nom;
    }

  

    public List getUserEquipes() {
        return userEquipes;
    }

    public Equipe(long id, String nom, User chef) {
        this.id = id;
        this.nom = nom;
        this.chef = chef;
    }

    public void setUserEquipes(List userEquipes) {
        this.userEquipes = userEquipes;
    }

    public Decathlon getDecathlon() {
        return decathlon;
    }

    public void setDecathlon(Decathlon decathlon) {
        this.decathlon = decathlon;
    }
    
    
            

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public User getChef() {
        return chef;
    }

    public void setChef(User chef) {
        this.chef = chef;
    }

    @Override
    public String toString() {
        return "Equipe{" + "id=" + id + ", nom=" + nom + ", chef=" + chef + '}';
    }

   

    
    
}
