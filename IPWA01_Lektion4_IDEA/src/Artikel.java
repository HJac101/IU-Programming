/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */

import java.util.Date;

/**
 *
 * @author H_Jacob
 */
public class Artikel {
    private int nr;
    private String name;
    private String text;
    private String bild;
    private Date verfügbarAb;

    public Artikel(){};

    public Artikel(int nr, String name, String text, String bild){
        this(nr, name, text, bild, new Date(0));
    }

    public Artikel(int nr, String name, String text, String bild, Date verfügbarAb){
        this.nr=nr;
        this.name=name;
        this.text=text;
        this.bild=bild;
        this.verfügbarAb=verfügbarAb;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getBild() {
        return bild;
    }

    public void setBild(String bild) {
        this.bild = bild;
    }

    public Date getVerfügbarAb() {
        return verfügbarAb;
    }

    public void setVerfügbarAb(Date verfügbarAb) {
        this.verfügbarAb = verfügbarAb;
    }
}
