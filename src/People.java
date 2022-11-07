import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
diğer sınıflarda yaptığımız gibi bu sınıfta da people nesneleri oluşturduk ve listede tuttuk bu sayede listede istediğimiz
gibi gezinip birçok işlemi yapabileceğiz
 */
public class People {
    public int Id;
    public String name;
    public String gender;
    public int height;
    public int weight;
    public int age;

    public People(int Id,String name,String gender,int height,int weight,int age) throws FileNotFoundException {
        this.Id=Id;
        this.name=name;
        this.gender = gender;
        this.height=height;
        this.weight=weight;
        this.age=age;
    }

    private static String FILE_PATH1 = "/Users/asrinhaktansahin/Downloads/files/people.txt";// açılacak olan dosyanın yolu
    public static List<People> olustur() throws FileNotFoundException {
        File f2 = new File(FILE_PATH1); // dosyayı kullanabilmek için file sınıfından f2 nesnesi oluşturduk
        Scanner scan2 = new Scanner(f2); // scanner sınıfı  dosyadaki verileri daha esnek olarak okuyup kullanmamızı sağladı
        List<People> yDizi1 = new ArrayList<People>(); // kişilerin tututduğu liste

        while(scan2.hasNextLine()){ // satır satır okuyoruz ve people nesnelerini döngü içerisinde oluşturuyoruz
            People f3 = new People(1,"as","sdf", 180,70,30);

            for(int i = 0 ;i<6; i++){

                if(i == 0){
                    String dosyaDeger = scan2.next();// okunan satırı kelime kelime almak için kullandık
                    int deger =Integer.parseInt(dosyaDeger);
                    f3.Id = deger;
                }else if(i == 1){
                    String dosyaDeger = scan2.next();
                    String deger = dosyaDeger;
                    f3.name = deger;
                }else if(i == 2){
                    String dosyaDeger = scan2.next();
                    String deger = dosyaDeger;
                    f3.gender = deger;
                }else if(i == 3){
                    String dosyaDeger = scan2.next();
                    int deger = Integer.parseInt(dosyaDeger);
                    f3.height = deger;
                }else if (i == 4){
                    String dosyaDeger = scan2.next();
                    int deger = Integer.parseInt(dosyaDeger);
                    f3.weight = deger;
                }else if(i==5){
                    String dosyaDeger = scan2.next();
                    int deger = Integer.parseInt(dosyaDeger);
                    f3.age = 2022-deger;
                }
            }
            yDizi1.add(f3);
        }
        return yDizi1;
    }


    public String toString(){// to string metodu bizim nesnelerimizin konsola istediğimiz şekilde çıktı vermesini sağlar
        // çünkü derleyici bizim nesnelerimizi nasıl yazdıracagını bilemez
        return "People{"+"Id="+Id+"  name="+name+"  gender="+gender+"  height="+height+"  weight="+weight+"  age="+age+"}\n";
    }
}