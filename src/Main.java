    import java.io.File;
    import java.io.FileNotFoundException;
    import java.util.ArrayList;
    import java.util.List;
    import java.util.Scanner;
    import java.io.*;


    class Main {

        public static void main(String[] args) throws IOException {

            System.out.println(People.olustur());   //people.txt'nin ekrana basıldığı kısım
            System.out.println(Sport.olustur());    //sport.txt'nin ekrana basıldığı kısım
            System.out.println(Food.olustur());     //food.txt'nin ekrana basıldığı kısım


            Calorie k1 = new Calorie();     //kalori class'ından k1 objesini oluşturuyoruz
            k1.GunlukHesapla();             //kalori class'ından oluşturduğumuz nesne üzerinden fonksiyona erişiyoruz ve kişinin günlük kalori ihtiyacını hesaplıyoruz.


            System.out.println(AlinanKalori.olustur());     //idlere göre alınan kaloriler
            System.out.println(YakilanKalori.olustur());    //idlere göre yakılan kaloriler

            
            //dosya yazdırma işlemleri
            String monitoring = People.olustur().toString() +"\n\n"+ Sport.olustur().toString() +"\n\n"+ Food.olustur().toString()+"\n\n"+ Calorie.ismiIdVeKaloriler;

            File file = new File("monitoring1.txt");
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fileWriter = new FileWriter(file, false);
            BufferedWriter bWriter = new BufferedWriter(fileWriter);
            bWriter.write(monitoring);
            bWriter.close();
        }

    }