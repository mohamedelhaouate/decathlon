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
public class UserEquipe {
    private User user;
    private Equipe equipe;
    private String dateIntegration;
    private String dateSortie;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public String getDateIntegration() {
        return dateIntegration;
    }

    public void setDateIntegration(String dateIntegration) {
        this.dateIntegration = dateIntegration;
    }

    public String getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(String dateSortie) {
        this.dateSortie = dateSortie;
    }
    
    
    
    
}
