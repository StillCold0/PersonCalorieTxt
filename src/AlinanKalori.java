import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class YakilanKalori{// kişilerin idsi ve yaptıkları spor ile oluşturduğumuz nesneleri bir sınıfta tuttuk
    public int Pid;
    public int Sid;
    public YakilanKalori(int pid, int sid) {
        Pid = pid;
        Sid = sid;
    }

    private static final String FILE_PATH = "/Users/asrinhaktansahin/Downloads/IO/IO1/command.txt";
    public static List<YakilanKalori> olustur() throws FileNotFoundException {
        File f6 = new File(FILE_PATH);
        Scanner scan3 = new Scanner(f6);
        List<YakilanKalori> yDizi5 = new ArrayList<YakilanKalori>();

        while(scan3.hasNextLine()){
            YakilanKalori f7 = new YakilanKalori(1,1);

            for(int i = 0 ;i<2; i++){

                if(i == 0){
                    String dosyaDeger = scan3.next();
                    int deger =Integer.parseInt(dosyaDeger);
                    f7.Pid = deger;
                }else if(i == 1){
                    String dosyaDeger = scan3.next();
                    int deger = Integer.parseInt(dosyaDeger);
                    f7.Sid = deger;
                }
                }
                yDizi5.add(f7);
            }
        return yDizi5;
        }
    public String toString() {
        return "YakilanKalori{"+"Pid="+Pid+" Sid="+Sid+"}";
    }

    }


public class AlinanKalori {

    public int Pid;
    public int Fid;

    public int miktar;

    public AlinanKalori(){}
    public AlinanKalori(int pid, int fid, int miktar) {
        Pid = pid;
        Fid = fid;
        miktar = miktar;
    }


    private static final String FILE_PATH = "/Users/asrinhaktansahin/Downloads/IO/IO1/command.txt";
    public static List<AlinanKalori> olustur() throws FileNotFoundException {
        File f6 = new File(FILE_PATH);
        Scanner scan3 = new Scanner(f6);
        List<AlinanKalori> yDizi4 = new ArrayList<AlinanKalori>();

        while(scan3.hasNextLine()){
            AlinanKalori f7 = new AlinanKalori(1,1,1);

            for(int i = 0 ;i<3; i++){

                if(i == 0){
                    String dosyaDeger = scan3.next();
                    int deger =Integer.parseInt(dosyaDeger);
                    f7.Pid = deger;
                }else if(i == 1){
                    String dosyaDeger = scan3.next();
                    int deger = Integer.parseInt(dosyaDeger);
                    f7.Fid = deger;
                }else if(i == 2){
                    String dosyaDeger = scan3.next();
                    int deger = Integer.parseInt(dosyaDeger);
                    f7.miktar = deger;
                }

            }
            yDizi4.add(f7);
        }
        return yDizi4;
}

    @Override
    public String toString() {
        return "AlinanKalori{"+"Pid="+Pid+" Fid="+Fid+" Miktar="+miktar+"}";
    }
}
