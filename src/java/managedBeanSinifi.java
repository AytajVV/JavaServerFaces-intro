/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aytaj.veyisli
 */
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.ArrayList;
import java.util.List;


@ManagedBean
@RequestScoped

public class managedBeanSinifi {
    String adSoyad;
    String adress;
    String sheher;
    String parol;
    List<String>cinsiyyet = new ArrayList<String>();
    String ehliyyet;
    boolean qebuledildimi;
    String mesaj;

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getSheher() {
        return sheher;
    }

    public void setSheher(String sheher) {
        this.sheher = sheher;
    }

    public String getParol() {
        return parol;
    }

    public void setParol(String parol) {
        this.parol = parol;
    }

    public List<String> getCinsiyyet() {
        return cinsiyyet;
    }

    public void setCinsiyyet(List<String> cinsiyyet) {
        this.cinsiyyet = cinsiyyet;
    }

    public String getEhliyyet() {
        return ehliyyet;
    }

    public void setEhliyyet(String ehliyyet) {
        this.ehliyyet = ehliyyet;
    }

    public boolean isQebuledildimi() {
        return qebuledildimi;
    }

    public void setQebuledildimi(boolean qebuledildimi) {
        this.qebuledildimi = qebuledildimi;
    }

    public String getMesaj() {
        if (!qebuledildimi) {
            mesaj = "Shertleri qebul etmediniz!";
        }
        else{
            mesaj = "Shertleri qebul etdiniz!";
        }
        return mesaj;
    }

//    public void setMesaj(String mesaj) {
//        this.mesaj = mesaj;
//    }
    
}
