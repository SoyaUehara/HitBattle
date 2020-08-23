package jp.ac.uryukyu.ie.e195752;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AbilityTest {
    @Test
    void abilityTest(){//全てのキャラクターにデータの確認用 アビリティバージョン
        String[] attributeList = {"Fire", "Water", "Wood", "Light", "Darkness"};
        ArrayList<String> selectList = new ArrayList<>();
        String character;
        for (String str : attributeList){
            Read elementList = new Read(str);
            for (int a=0; a<elementList.getList().size(); a++){
                character = elementList.getList().get(a);
                Ability ability = new Ability(character, str);
                assertEquals(1,ability.selectAbility(ability.getAbilityList(),selectList).size());
            }
        }
    }
}