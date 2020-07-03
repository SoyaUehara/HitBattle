package jp.ac.uryukyu.ie.e195752;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RaceTest {
    @Test
    void raceTest(){//全てのキャラクターにデータの確認用　種族バージョン
        String[] attributeList = {"Fire", "Water", "Wood", "Light", "Darkness"};
        String character;
        for (String i : attributeList){
            Read elementList = new Read(i);
            for (int a=0; a<elementList.getList().size(); a++){
                character = elementList.getList().get(a);
                Race race = new Race(character, i);
                assertEquals(1,race.getRaceList().size());
            }
        }
    }
}