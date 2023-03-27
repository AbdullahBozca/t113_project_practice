package mart27.ogrenciYonetim;

/*
1. BU PROGRAMDA ÖĞRENCİ KAYITLARI İLE İLGİLİ İŞLEMLER YAPILABİLMEKTEDİR. KAYITLARDA ŞU BİLGİLER OLMALIDIR:
	-AD SOYAD
	-KİMLİK NO
	-YAŞ
	-NUMARA
	-SINIF  BİLGİLERİNİ İÇERMELİDİR.
 */
public class Ogrenci {
    private String ad;
    private String sAd;
    private String tcNo;
    private int yas;
    private int numara;
    private int sinif;

    public Ogrenci() {
    }

    public Ogrenci(String ad, String sAd, String tcNo, int yas, int numara, int sinif) {
        this.ad = ad;
        this.sAd = sAd;
        this.tcNo = tcNo;
        this.yas = yas;
        this.numara = numara;
        this.sinif = sinif;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getsAd() {
        return sAd;
    }

    public void setsAd(String sAd) {
        this.sAd = sAd;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
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
        return "ad= " + ad + " " +
                "sAd= " + sAd + " " +
                "tcNo= " + tcNo + " " +
                "yas= " + yas + " " +
                "numara= " + numara +" " +
                "sinif= " + sinif ;
    }
}
