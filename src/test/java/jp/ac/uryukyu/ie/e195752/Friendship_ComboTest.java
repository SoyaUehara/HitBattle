package jp.ac.uryukyu.ie.e195752;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Friendship_ComboTest {
    @Test
    void raceTest(){//全てのキャラクターにデータの確認用　友情コンボバージョン
        String[] attributeList = {"Fire", "Water", "Wood", "Light", "Darkness"};
        String character;
        for (String i : attributeList){
            Read elementList = new Read(i);
            for (int a=0; a<elementList.getList().size(); a++){
                character = elementList.getList().get(a);
                Friendship_Combo fc = new Friendship_Combo(character, i);
                assertEquals(2,fc.getFriendship_comboList().size());
            }
        }
    }
}