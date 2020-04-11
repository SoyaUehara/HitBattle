package jp.ac.uryukyu.ie.e195752;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class War_TypeTest {
    @Test
    void war_typeTest(){//全てのキャラクターにデータの確認用　戦型バージョン
        String[] attributeList = {"Fire", "Water", "Wood", "Light", "Darkness"};
        String character;
        int count =0;
        for (String i : attributeList){
            Read elementList = new Read(i);
            System.out.println("---------------------------------");
            for (int a=0; a<elementList.getList().size(); a++){
                character = elementList.getList().get(a);
                War_Type war = new War_Type(character, i);
                System.out.println(war.getWar_typeList());
                count++;
            }
        }
        System.out.println(count);
    }
}