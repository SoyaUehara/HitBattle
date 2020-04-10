package jp.ac.uryukyu.ie.e195752;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Battle_TypeTest {
    @Test
    void battle_typeTest(){//全てのキャラクターにデータの確認用 撃種バージョン
        String[] attributeList = {"Fire", "Water", "Wood", "Light", "Darkness"};
        String attribute;
        String character;
        int count =0;
        for (String str : attributeList){
            Read elementList = new Read(str);
            System.out.println("---------------------------------");
            for (int a=0; a<elementList.getList().size(); a++){
                character = elementList.getList().get(a);
                Battle_Type battle = new Battle_Type(character, str);
                System.out.println(battle.getBattle_typeList());
                count++;
            }
        }
        System.out.println(count);
    }
}