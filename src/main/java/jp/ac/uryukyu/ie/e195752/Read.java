package jp.ac.uryukyu.ie.e195752;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
public class Read {
    private ArrayList<String> List = new ArrayList<>();
    public Read(String element){
        try {
            File file = new File(element+".txt");
            String pass = file.getAbsolutePath();
            File data = new File(pass);
            Scanner scan = new Scanner(data);
            while (scan.hasNext()) {
                String str = scan.next();
                this.List.add(str);
            }
        }catch(FileNotFoundException e){
            System.out.println("ファイル無し");
        }
    }
    public ArrayList<String> getList(){
        return this.List;
    }
}
