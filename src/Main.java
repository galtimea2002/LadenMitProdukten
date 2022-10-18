import laden.Produkt;
import laden.Produkten;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produkt> neueListe = new ArrayList<Produkt>(100);
        ArrayList<Produkt> neueListe2 = new ArrayList<Produkt>(100);

        Produkten produkten = new Produkten();

        produkten.setProduktList(produkten.getProduktList());
        produkten.setPreisNachRabatt(produkten.getProduktList());
        produkten.sortiertNachRabattpreis(neueListe);
        System.out.println("Liste sortiert nach Rabatt: ");
        System.out.println(neueListe);
        System.out.println("Guestingster Produkt: ");
        produkten.guestingste();
        System.out.println("Teuerster Produkt: ");
        produkten.teuerste();
        System.out.println("Produkten, dessen Preis hoeher als 100 ist: ");
        produkten.hoeherAls100(neueListe2);
    }
}