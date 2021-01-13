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
public class User {

    private String nom;
    private String prenom;
    private String poste;
    /*(directeur,leader manager , Collaborateur , visiteur)*/
    private long id;
    private boolean epi;
    private Equipe equipeActuelle;

    public boolean isEpi() {
        return epi;
    }

    public void setEpi(boolean epi) {
        this.epi = epi;
    }

    public Equipe getEquipeActuelle() {
        return equipeActuelle;
    }

    public void setEquipeActuelle(Equipe equipeActuelle) {
        this.equipeActuelle = equipeActuelle;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public User(String nom, String prenom, String poste) {
        this.nom = nom;
        this.prenom = prenom;
        this.poste = poste;
    }

    @Override
    public String toString() {
        return "User{" + "nom=" + nom + ", prenom=" + prenom + ", poste=" + poste + ", id=" + id + ", epi=" + epi + ", equipeActuelle=" + equipeActuelle + '}';
    }

}
