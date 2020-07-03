package jp.ac.uryukyu.ie.e195752;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class War_TypeTest {
    @Test
    void war_typeTest(){//全てのキャラクターにデータの確認用　戦型バージョン
        String[] attributeList = {"Fire", "Water", "Wood", "Light", "Darkness"};
        String character;
        for (String i : attributeList){
            Read elementList = new Read(i);
            for (int a=0; a<elementList.getList().size(); a++){
                character = elementList.getList().get(a);
                War_Type war = new War_Type(character, i);
                assertEquals(1,war.getWar_typeList().size());
            }
        }
    }
}