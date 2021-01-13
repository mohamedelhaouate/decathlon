/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author Mohamed
 */
public class PassationChef {
    private long id;
    private User chefEntrant;
    private User chefSortant;
    private Equipe equipe;
    private String datePassation;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getChefEntrant() {
        return chefEntrant;
    }

    public void setChefEntrant(User chefEntrant) {
        this.chefEntrant = chefEntrant;
    }

    public User getChefSortant() {
        return chefSortant;
    }

    public void setChefSortant(User chefSortant) {
        this.chefSortant = chefSortant;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public String getDatePassation() {
        return datePassation;
    }

    public void setDatePassation(String datePassation) {
        this.datePassation = datePassation;
    }

    
    
}
