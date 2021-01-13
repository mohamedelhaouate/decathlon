/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Decathlon;
import bean.User;
import java.util.List;

/**
 *
 * @author Mohamed
 */
public class DecathlonService {

    public int findByIndex(long id, List<Decathlon> deca) {
        for (int i = 0; i < deca.size(); i++) {
            Decathlon d = deca.get(i);
            if (d.getId() == id) {
                return i;
            }
        }
        return -1;
    }
    public int ajouterUnMagasin(String nom , long id ,List<Decathlon> deca,String adresse){
        if(id<=0){
            return -1;
        }
        int res = findByIndex(id, deca);
        if(res!=-1){
            return -2;
        }else{
            Decathlon d = new Decathlon(nom, id, adresse);
            deca.add(d);
            return 1;
        }
    }
    
}
