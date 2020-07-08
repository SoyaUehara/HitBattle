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
            character = elementList.getList().get(random.nextInt(elementList.getList().size()));//キャラを選ぶ
            //ここからゲームシステム構築部分
            System.out.println("選ばれた属性は"+attribute+"です。");



            while (true) {
                Question(character, attribute);
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
                System.out.println("もう一度行います");
            }else{
                break;
            }
        }
        System.out.println("ヒットバトルを終了します");

    }
    static void Display(ArrayList<String> list){
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
    static void Question(String character, String attribute){
        String[] QuestionList = {"種族","戦型","撃種","アビリティ","友情コンボ","SS","ラックスキル"};
        Scanner QuestionScan = new Scanner(System.in);
        System.out.println("質問してください");
            String question = QuestionScan.next();
            switch (question) {
                case "種族":
                    Race race = new Race(character, attribute);
                    System.out.println(race.getRaceList());
                    break;
                case "戦型":
                    War_Type war_type = new War_Type(character, attribute);
                    System.out.println(war_type.getWar_typeList());
                    break;
                case "撃種":
                    Battle_Type battle_type = new Battle_Type(character, attribute);
                    System.out.println(battle_type.getBattle_typeList());
                    break;
                case "アビリティ":
                    Ability ability = new Ability(character, attribute);
                    System.out.println(ability.selectAbility(ability.getAbilityList()));
                    break;
                case "友情コンボ":
                    Friendship_Combo friendship_combo = new Friendship_Combo(character, attribute);
                    System.out.println(friendship_combo.getFriendship_comboList());
                case "SS":
                    Strike_Shot strike_shot = new Strike_Shot(character, attribute);
                    System.out.println(strike_shot.getStrike_shotList());
                case "ラックスキル":
                    Rack_Skills rack_skills = new Rack_Skills(character, attribute);
                    System.out.println(rack_skills.getRack_skillsList());
            }

    }
}
