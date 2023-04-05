package nisan03;

public class Ogretmen extends Kisi{
    //Öğretmen: Ad-Soyad,  kimlik No, yaş, bölüm, ve sicil No bilgileri içermelidir.
    private String bolum;
    private int sicilNo;

    public Ogretmen(String ad, String sAd, String tcNo, int yas, String bolum, int sicilNo) {
        super(ad, sAd, tcNo, yas);
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }

    public Ogretmen() {

    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(int sicilNo) {
        this.sicilNo = sicilNo;
    }

    @Override
    public String toString() {
        return  "Öğretmenin: "+super.toString() +
                "bolum= " + bolum + " " +
                "sicilNo= " + sicilNo ;
    }
}
