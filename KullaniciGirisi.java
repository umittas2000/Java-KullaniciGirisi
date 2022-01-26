import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        String kullaniciAdi="patika",sifre="java123",yeniSifre;
        String deger1,deger2;
        int sifreIstegi=0;

        System.out.print("Kullanici adiniz?: ");
        deger1 = input.nextLine();

        System.out.print("Sifreniz?: ");
        deger2= input.nextLine();

        if(kullaniciAdi.equals(deger1) && sifre.equals(deger2)){
            System.out.print("Giris Yaptiniz!.");
        }else{
            System.out.print("Kullanici Adiniz ya da Sifreniz yanlis!.");

            System.out.print("Sifrenizi Sifirlamak icin 1 e basin:");
            sifreIstegi=input.nextInt();


            if(sifreIstegi==1){
                System.out.print("Yeni sifrenizi giriniz:");
                yeniSifre=input2.nextLine();

                while(sifre.equals(yeniSifre))
                {
                    System.out.print("Sifre olusturulamadi, Tekrar deneyin!, Yeni sifreniz?:");
                    yeniSifre=input2.nextLine();
                }
                    sifre=yeniSifre;
                    System.out.print("Sifreniz Degistirildi!.");
            }else{
                System.out.print("iyi gunler dileriz...");
            }
        }
    }
}
