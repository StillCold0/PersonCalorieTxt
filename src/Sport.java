import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
tablodaki verileri sport adlı sınıfın nesneleri yapmak ve bunları sport nesneleri alan bi liste içerisinde tutmak için
oluşturduğumuz sınıf
 */
public class Sport {
    public  int Id;
    public  String Sport;
    public  int Calorie;

    public Sport(int Id,String Sport,int Calorie)throws FileNotFoundException {
        this.Id=Id;
        this.Sport=Sport;
        this.Calorie=Calorie;
    }

    private static final String FILE_PATH2 = "/Users/asrinhaktansahin/Downloads/files/sport.txt";

    public static List<Sport> olustur() throws FileNotFoundException {
        File f3 = new File(FILE_PATH2);
        Scanner scan3 = new Scanner(f3);
        List<Sport> yDizi2 = new ArrayList<Sport>();

        while(scan3.hasNextLine()){ // satır satır oku
            Sport f4 = new Sport(1,"asd ",1);

            for(int i = 0 ;i<3; i++){

                if(i == 0){
                    String dosyaDeger = scan3.next(); // satırdaki kelimeleri okumak için
                    int deger =Integer.parseInt(dosyaDeger);
                    f4.Id = deger;
                }else if(i == 1){
                    String dosyaDeger = scan3.next();
                    String deger = dosyaDeger;
                    f4.Sport = deger;
                }else if(i == 2){
                    String dosyaDeger = scan3.next();
                    int deger = Integer.parseInt(dosyaDeger);
                    f4.Calorie = deger;
            }
        }
            yDizi2.add(f4);
    }
        return yDizi2;

    }

    @Override
    public String toString() {
        return "Sport{" + "id=" + Id + " isim='" + Sport + " kalori=" + Calorie + "}\n";
    }
}