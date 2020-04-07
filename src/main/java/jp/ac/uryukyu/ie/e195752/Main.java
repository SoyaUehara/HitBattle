package jp.ac.uryukyu.ie.e195752;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Main {
    static public void main(String[] args){
        while (true) {
            String[] attributeList = {"Fire", "Water", "Wood", "Light", "Darkness"};
            String attribute;
            String character;
            Scanner scan = new Scanner(System.in);
            Random random = new Random();
            attribute = attributeList[random.nextInt(attributeList.length)];//ファイルをとってくる
            Read elementList = new Read(attribute);//ファイルを読み込む。※ArrayListで保存
            character = elementList.getList().get(random.nextInt(elementList.getList().size())).toString();//キャラを選ぶ
            //ここからゲームシステム構築部分
            System.out.println("選ばれた属性は"+attribute+"です。");
            Question(character);



            while (true) {
                System.out.println("答えを入力してください=>");
                String str = scan.next();
                if (str.equals(character)) {
                    System.out.println("正解！！");
                    System.out.println("正解は" + character + "でした");
                    break;
                } else if (str.equals("list")) {
                    Display(elementList.getList());
                } else if (str.equals("答え")) {
                    System.out.println(character);
                } else {
                    System.out.println("残念！");
                    System.out.println("不正解");
                }
            }
            System.out.println("もう一度、行いますか？");
            System.out.println("Yes. or No.");
            String str = scan.next();
            if (str.equals("Yes.")){
                continue;
            }else{
                break;
            }
        }
        Rack_Skills a = new Rack_Skills();
        System.out.println("ヒットバトルを終了します");

    }
    static void Display(ArrayList list){
        int count = 0;
        for (int i=0; i<list.size(); i++){
            if (count==4){
                System.out.println(list.get(i));
                count = 0;
            }else if (i==list.size()-1){
                System.out.println(list.get(i));
            }
            else {
                System.out.print(list.get(i));
                System.out.print(" ");
                count++;
            }
        }
    }
    static void Question(String character){
        String QuestionList[] = {"種族","戦型","撃種","アビリティ","友情コンボ","SS","ラックスキル"};
        Scanner QuestionScan = new Scanner(System.in);
        while (true){
            System.out.println("質問してください");
            String question = QuestionScan.next();
            switch (question){
                case "種族":
                    Race race = new Race(character);
                    break;
                case "戦型":
                    War_Type war_type = new War_Type();
            }
            break;
        }
    }
}
