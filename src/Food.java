import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Food {// yemeklerin bilgilerinin tutulduğu nesneler oluşturduk ve bunları bir liste içerisine attık
    public int ID;
    public String isim;
    public int kalori;

    public Food(int ID, String isim, int kalori) {
        this.ID = ID;
        this.isim = isim;
        this.kalori = kalori;
    }

    private static final String FILE_PATH = "/Users/asrinhaktansahin/Downloads/files/food.txt";

    public static List<Food> olustur() throws FileNotFoundException {
        File f = new File(FILE_PATH);
        Scanner scan = new Scanner(f);
        List<Food> yDizi = new ArrayList<Food>();

        while (scan.hasNextLine()) {
            Food f1 = new Food(1, " ", 1);

            for (int i = 0; i < 3; i++) {

                if (i == 0) {
                    String dosyaDeger = scan.next();
                    int deger = Integer.parseInt(dosyaDeger);
                    f1.ID = deger;
                } else if (i == 1) {
                    String dosyaDeger = scan.next();
                    String deger = dosyaDeger;
                    f1.isim = deger;
                } else {
                    String dosyaDeger = scan.next();
                    int deger = Integer.parseInt(dosyaDeger);
                    f1.kalori = deger;
                }
            }
            yDizi.add(f1);
        }

    return yDizi;
    }
    @Override
    public String toString() {
        return "Food{" + "id=" + ID + " isim=" + isim + " kalori=" + kalori + "}\n";
    }
}