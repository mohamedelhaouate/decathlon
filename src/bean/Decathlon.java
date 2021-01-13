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
public class Decathlon {
    private String nomMagasin;
    private long id;
    private String adresse ;

    public Decathlon(String nomMagasin, long id, String adresse) {
        this.nomMagasin = nomMagasin;
        this.id = id;
        this.adresse = adresse;
        
    }

    public Decathlon() {
    }
    public String getNomMagasin() {
        return nomMagasin;
    }

    public void setNomMagasin(String nomMagasin) {
        this.nomMagasin = nomMagasin;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    
}
