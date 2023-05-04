public class ogrenciiKapsulu {
    private String ad;
    private String soyad;
    private int okulNo;
    private int dogumYili;

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        if(ad.isEmpty()){
            System.out.println("Ad boş olamaz!");
        }
        else {
            this.ad = ad;
        }
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        if(soyad.isEmpty()){
            System.out.println("Soyad boş olamaz!");
        }
        else {
            this.soyad = soyad;
        }
    }

    public int getOkulNo() {
        return okulNo;
    }

    public void setOkulNo(int okulNo) {
        if(okulNo>1000){
            System.out.println("Okul numarası hatalı!");
        }
        else {
            this.okulNo = okulNo;
        }
    }
    public int getDogumYili(){
        return dogumYili;
    }
    public void setDogumYili(int dogumYili){
        if(dogumYili>2006 || dogumYili<2002){
            System.out.println("Doğum yılı hatalı!");
        }
        else {
            this.dogumYili = dogumYili;
        }
    }
}
