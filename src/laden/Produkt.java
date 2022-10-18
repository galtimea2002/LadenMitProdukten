package laden;

public class Produkt {
    private int produktID;
    private double basisPreis;
    private int anzahlTage;

    public Produkt(int produktID, double basisPreis, int anzahlTage) {
        this.basisPreis = basisPreis;
        this.anzahlTage = anzahlTage;
        this.produktID = produktID;
    }

    public int getProduktID() {
        return produktID;
    }

    public double getBasisPreis() {
        return basisPreis;
    }

    public int getAnzahlTage() {
        return anzahlTage;
    }

    public void setProduktID(int produktID) {
        this.produktID = produktID;
    }

    public void setBasisPreis(double basisPreis) {
        this.basisPreis = basisPreis;
    }

    public void setAnzahlTage(int anzahlTage) {
        this.anzahlTage = anzahlTage;
    }
    public Produkt compareTo(Produkt p){
        if(this.getBasisPreis()<p.getBasisPreis()){
            return this;
        }
        else return p;
    }

}
