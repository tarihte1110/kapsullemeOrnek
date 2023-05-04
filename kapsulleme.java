import java.util.Scanner;

public class kapsulleme {
    public static void main(String[] args){

        ogrenciiKapsulu ogrenci=new ogrenciiKapsulu();
        Scanner input=new Scanner(System.in);

        System.out.println(" \n    *** FATİH ORTAOKULU ***  \n");

        System.out.print("Ad giriniz:");
        String ad=input.nextLine();
        System.out.print("Soyad giriniz:");
        String soyad= input.nextLine();
        System.out.print("Okul numarası giriniz:");
        int okulNo= input.nextInt();
        System.out.print("Doğum yılı giriniz:");
        int dogumYılı= input.nextInt();

        ogrenci.setAd(ad);
        ogrenci.setSoyad(soyad);
        ogrenci.setOkulNo(okulNo);
        ogrenci.setDogumYili(dogumYılı);

    }
}
