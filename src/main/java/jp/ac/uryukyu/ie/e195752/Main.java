package jp.ac.uryukyu.ie.e195752;
import java.util.ArrayList;
public class Main {
    static public void main(String[] args){
        int count = 0;
        String f = "Wood";
        Read fire = new Read(f);
        //System.out.println(fire.getList());
        for (int i=0; i<fire.getList().size(); i++){
            if (count==4){
                System.out.println(fire.getList().get(i));
                count = 0;
            }else {
                System.out.print(fire.getList().get(i));
                System.out.print(" ");
                count++;
            }
        }
    }
}
