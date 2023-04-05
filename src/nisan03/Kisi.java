package nisan03;

public class Kisi {
    /*
    Öğretmen: Ad-Soyad,  kimlik No, yaş, bölüm, ve sicil No bilgileri içermelidir.
	Öğrenci:  Ad-Soyad,  kimlik No, yaş, numara, sınıf bilgileri içermelidir
     */
    private String ad;
    private String sAd;
    private String tcNo;
    private int yas;

    public Kisi(String ad, String sAd, String tcNo, int yas) {
        this.ad = ad;
        this.sAd = sAd;
        this.tcNo = tcNo;
        this.yas = yas;
    }

    public Kisi() {
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

    @Override
    public String toString() {
        return
                "ad= " + ad + " " +
                "sAd= " + sAd + " "  +
                "tcNo= " + tcNo + " "  +
                "yas= " + yas ;
    }
}
