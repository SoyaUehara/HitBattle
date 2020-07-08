package jp.ac.uryukyu.ie.e195752;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Rack_SkillsTest {
    @Test
    void raceTest(){//全てのキャラクターにデータの確認用　ラックスキルバージョン
        String[] attributeList = {"Fire", "Water", "Wood", "Light", "Darkness"};
        String character;
        for (String i : attributeList){
            Read elementList = new Read(i);
            for (int a=0; a<elementList.getList().size(); a++){
                character = elementList.getList().get(a);
                Rack_Skills rs = new Rack_Skills(character, i);
                assertEquals(1,rs.getRack_skillsList().size());
            }
        }
    }
}