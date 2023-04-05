package nisan03;

public class Ogrenci extends Kisi{
    //Öğrenci:  Ad-Soyad,  kimlik No, yaş, numara, sınıf bilgileri içermelidir
    private int numara;
    private int sinif;

    public Ogrenci(String ad, String sAd, String tcNo, int yas, int numara, int sinif) {
        super(ad, sAd, tcNo, yas);
        this.numara = numara;
        this.sinif = sinif;
    }
    public Ogrenci(){

    }

    public int getNumara() {
        return numara;
    }

    public void setNumara(int numara) {
        this.numara = numara;
    }

    public int getSinif() {
        return sinif;
    }

    public void setSinif(int sinif) {
        this.sinif = sinif;
    }

    @Override
    public String toString() {
        return "Ogrencinin: "+super.toString() +" "+
                "numara= " + numara +" "+
                "sinif= " + sinif ;
    }
}
