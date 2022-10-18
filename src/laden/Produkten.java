package laden;
import java.util.*;

import java.util.ArrayList;

public class Produkten {
    Produkt p1 = new Produkt(1234,100.0,11);
    Produkt p2 = new Produkt(1235, 22.9, 25);
    Produkt p3 = new Produkt(1236, 300.9, 19);
    Produkt p4 = new Produkt(1237, 30.5, 5);
    Produkt p5 = new Produkt(1238, 439.9, 100);
    List<Produkt> produktList = new ArrayList<>();

    public List<Produkt> getProduktList() {
        return this.produktList;
    }

    public void setProduktList(List<Produkt> produktList) {
        this.produktList = produktList;
        produktList.add(p1);
        produktList.add(p2);
        produktList.add(p3);
        produktList.add(p4);
        produktList.add(p5);
    }

    public void setPreisNachRabatt(List<Produkt> produktList) {
        for (int i = 0; i < this.produktList.size(); i++) {
            if (this.produktList.get(i).getAnzahlTage() >= 10 && this.produktList.get(i).getAnzahlTage() <= 20) {
                this.produktList.get(i).setBasisPreis(this.produktList.get(i).getBasisPreis() - (this.produktList.get(i).getBasisPreis() * 10) / 100);
            } else if (this.produktList.get(i).getAnzahlTage() > 20) {
                this.produktList.get(i).setBasisPreis(this.produktList.get(i).getBasisPreis() - (this.produktList.get(i).getBasisPreis() * 20) / 100);
            }
        }
    }

    public List<Produkt> hoeherAls100(List<Produkt> neueListe) {
        for (int i = 0; i < this.produktList.size(); i++) {
            if (this.produktList.get(i).getBasisPreis() > 100) {
                neueListe.add(this.produktList.get(i));
            }
        }
        return neueListe;
    }


   public void sortiertNachRabattpreis(List<Produkt> neueListe) {
        for (int i = 0; i < this.produktList.size(); i++) {
                neueListe.add(this.produktList.get(i).compareTo(this.produktList.get(i + 1)));
        }
    }
    public Produkt teuerste(){
        double maxPreis = 0;
        Produkt maxProdukt = null;
        for (int i = 0; i < this.produktList.size(); i++){
            if(this.produktList.get(i).getBasisPreis()>maxPreis){
                maxPreis = this.produktList.get(i).getBasisPreis();
            }
        }
        for(int i = 0; i < this.produktList.size(); i++){
            if(this.produktList.get(i).getBasisPreis() == maxPreis){
                maxProdukt =  this.produktList.get(i);
            }
        }
        return maxProdukt;
    }
    public Produkt guestingste(){
        double minPreis = 10000;
        Produkt minProdukt = null;
        for (int i = 0; i < this.produktList.size(); i++){
            if(this.produktList.get(i).getBasisPreis()<minPreis){
                minPreis = this.produktList.get(i).getBasisPreis();
            }
        }
        for(int i = 0; i < this.produktList.size(); i++){
            if(this.produktList.get(i).getBasisPreis() == minPreis){
                minProdukt =  this.produktList.get(i);
            }
        }
        return minProdukt;
    }
}
