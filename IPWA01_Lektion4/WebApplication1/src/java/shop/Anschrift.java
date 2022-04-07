/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package shop;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author H_Jacob
 */
@ManagedBean
@RequestScoped
public class Anschrift {
    
    private String name = "Max Müller";
    private String strasse = "Fette-Straße";
    private int hausnummer = 5;
    private String plz = "12345";
    private String ort = "Berlin";
    
    public Anschrift() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public int getHausnummer() {
        return hausnummer;
    }

    public void setHausnummer(int hausnummer) {
        this.hausnummer = hausnummer;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }
    
    
}
