import javax.swing.*;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Calorie {

    //txt dosyalarındaki idleri degiskene atadık ve günlük kaloriyi hesaplamak için değişken de oluşturduk.
    public int isimIdsi;
    public int gunlukCalori;

    //constructorlar
    public Calorie(int isimIdsi, int gunlukCalori) {
        this.isimIdsi = isimIdsi;
        this.gunlukCalori = gunlukCalori;
    }
    public  Calorie(){}

   //Günlük kalori ihtiyacını listeye atmak için array list oluşturduk
    public static List<Calorie> ismiIdVeKaloriler  = new ArrayList<Calorie>();

    //Kalori ihtiyacını hesaplamak için fonksiyon oluşturup listeye attık.
    public  void GunlukHesapla() throws FileNotFoundException{
        for(int i =0;i<People.olustur().size();i++){
            double erkek_ihtiyac = 66+(13.75*People.olustur().get(i).weight)+(5*People.olustur().get(i).height)-(6.8*(People.olustur().get(i).age));
            double kadin_ihtiyac = 665+(9.6*People.olustur().get(i).weight)+(1.7*People.olustur().get(i).height)-(4.7*(People.olustur().get(i).age));
            int value1 = (int)erkek_ihtiyac;
            int value2 = (int)kadin_ihtiyac;
            if(People.olustur().get(i).gender.equals("male")){
                System.out.println(People.olustur().get(i).name+" isimli kişinin günlük ihtiyacı="+value1);
                Calorie c1 = new Calorie(People.olustur().get(i).Id,value2 );
                ismiIdVeKaloriler.add(c1);
            }
            if(People.olustur().get(i).gender.equals("female")){
                System.out.println(People.olustur().get(i).name+" isimli kişinin günlük ihtiyacı="+value2);
                Calorie c1 = new Calorie(People.olustur().get(i).Id,value2 );
                ismiIdVeKaloriler.add(c1);
            }
        }
    }

    @Override
    public String toString() {
        return "id=" + isimIdsi + " gunluk kalori ihtiyacı="+ gunlukCalori+"\n";
    }

    // kalori sınıfında oluşturduğumuz nesneler kişilerin id sini ve günlük ne kadar kalori almaları gerektiğinı tutuytor.
    // bu fonksiyon ise geriye kalori nesnelerini bulunduran bir liste döndürüyor
    public List<Calorie> idVeKalorilerinListesi() throws FileNotFoundException {
        GunlukHesapla();
        return ismiIdVeKaloriler;
    }
}

