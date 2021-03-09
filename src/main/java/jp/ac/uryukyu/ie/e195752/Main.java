package jp.ac.uryukyu.ie.e195752;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Main {
    static public void main(String[] args){
        ArrayList<String> selectList = new ArrayList<>();
        while (true) {
            Scanner scan = new Scanner(System.in);
            String[] attributeList = {"Fire", "Water", "Wood", "Light", "Darkness"};
            String attribute;
            String character;
            Random random = new Random();
            attribute = attributeList[random.nextInt(attributeList.length)];//ファイルをとってくる
            Read elementList = new Read(attribute);//ファイルを読み込む。※ArrayListで保存
            character = elementList.getList().get(random.nextInt(elementList.getList().size()));//キャラを選ぶ

            //ここからゲームシステム構築部分
            switch (attribute){
                case "Fire":
                    System.out.println("選ばれた属性は火です。");
                    break;
                case "Water":
                    System.out.println("選ばれた属性は水です。");
                    break;
                case "Wood":
                    System.out.println("選ばれた属性は木です。");
                    break;
                case "Light":
                    System.out.println("選ばれた属性は光です。");
                    break;
                case "Darkness":
                    System.out.println("選ばれた属性は闇です。");
                    break;
            }
            Question(character, attribute, selectList);
            boolean bo = true;
            while (bo) {
                while (true){
                    System.out.println("Question or Answer");
                    String q_a = scan.next();
                    if (q_a.equals("Answer")){
                        break;
                    }
                    else if (q_a.equals("Question")){
                        Question(character, attribute, selectList);
                    }else {
                        System.out.println("正しく入力してください");
                    }
                }
                while (true){
                    System.out.println("答えを入力してください=>");
                    String str = scan.next();
                    if (str.equals(character)) {
                        System.out.println("正解！！");
                        System.out.println("正解は" + character + "でした");
                        bo = false;
                        break;
                    } else if (str.equals("list")) {
                        Display(elementList.getList());
                    } else if (str.equals("gZ+tKkcmMxV68"))/*パスワードを入力すれば答えが出る*/ {
                        System.out.println(character);
                    } else {
                        System.out.println("残念！");
                        System.out.println("不正解");
                        break;
                    }
                }
            }
            System.out.println("もう一度、行いますか？");
            System.out.println("Yes or No");
            String str = scan.next();
            if (str.equals("Yes")){
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
    static void Question(String character, String attribute, ArrayList<String> list){
        String[] QuestionList = {"種族","戦型","撃種","アビリティ","友情コンボ","ラックスキル"};
        System.out.println("質問してください");
        for (int i=0; QuestionList.length>i; i++){
            if (i == QuestionList.length-1){
                System.out.println(QuestionList[i]);
            }else {
                System.out.print(QuestionList[i]+" ");
            }
        }
        Scanner QuestionScan = new Scanner(System.in);
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
                    String adding = ability.selectAbility(ability.getAbilityList(),list).toString();
                    System.out.println(adding);
                    list.add(adding);
                    break;
                case "友情コンボ":
                    Friendship_Combo friendship_combo = new Friendship_Combo(character, attribute);
                    System.out.println(friendship_combo.getFriendship_comboList());
                    break;
                case "ラックスキル":
                    Rack_Skills rack_skills = new Rack_Skills(character, attribute);
                    System.out.println(rack_skills.getRack_skillsList());
                    break;
                //SSはあまりにも難しいため後日実装予定
                /*case "SS":
                    Strike_Shot strike_shot = new Strike_Shot(character, attribute);
                    System.out.println(strike_shot.getStrike_shotList());*/
            }

    }
}
