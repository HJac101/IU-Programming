/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author H_Jacob
 */
@ManagedBean
@RequestScoped
public class Shop {
    private List<Artikel> sortiment = new ArrayList<>();
    private static Shop instance = new Shop();

    public Shop() {

        sortiment.add(new Artikel(1,"Pantoffeln", "Wunderschönes Zeug",
                    "filzschuhe.jpg",
                    (new GregorianCalendar(2022, 11,23).getTime())));
    }

    public List<Artikel> getSortiment(){
        return sortiment;
    }
    public static Shop getInstance(){
        return instance;
    }
}
