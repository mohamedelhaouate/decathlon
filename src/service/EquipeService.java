/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Decathlon;
import bean.Equipe;
import bean.User;
import java.util.List;

/**
 *
 * @author Mohamed
 */
public class EquipeService {

    public int ajouterUneEquipe(User chef ,String nom, long id, List<Equipe> Equipes) {
        Equipe e = rechercherUneEquipe(id, Equipes);
        if (e != null) {
            return -1;
        } else {
            e = new Equipe(id, nom , chef);
            Equipes.add(e);
        }
        return 1;
    }

    public int rechercherByIndex(long id, List<Equipe> Equipes) {
        for (int i = 0; i < Equipes.size(); i++) {
            Equipe e = Equipes.get(i);
            if (e.getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public Equipe rechercherUneEquipe(long id, List<Equipe> Equipes) {
        for (int i = 0; i < Equipes.size(); i++) {
            Equipe e = Equipes.get(i);
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }
}
