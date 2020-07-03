package jp.ac.uryukyu.ie.e195752;

import java.util.ArrayList;

//ラックスキル
public class Rack_Skills {
    private ArrayList<String> rack_skillsList = new ArrayList<>();
    public Rack_Skills(String character, String attribute){
        System.out.println(character);
        System.out.println(attribute);
        /*switch (attribute){
            case "Fire":
                switch (character){
                    case "":
                        rack_skillsList.add("");
                        break;
                    case "":
                        rack_skillsList.add("");
                        break;
                    case "":
                        rack_skillsList.add("");
                        break;
                    case "":
                        rack_skillsList.add("");
                        break;
                }
            case "Water":
                switch (character){
                    case "":
                        rack_skillsList.add("");
                        break;
                    case "":
                        rack_skillsList.add("");
                        break;
                    case "":
                        rack_skillsList.add("");
                        break;
                    case "":
                        rack_skillsList.add("");
                        break;
                }
            case "Wood":
                switch (character){
                    case "":
                        rack_skillsList.add("");
                        break;
                    case "":
                        rack_skillsList.add("");
                        break;
                    case "":
                        rack_skillsList.add("");
                        break;
                    case "":
                        rack_skillsList.add("");
                        break;
                }
            case "Light":
                switch (character){
                    case "":
                        rack_skillsList.add("");
                        break;
                    case "":
                        rack_skillsList.add("");
                        break;
                    case "":
                        rack_skillsList.add("");
                        break;
                    case "":
                        rack_skillsList.add("");
                        break;
                }
            case "Darkness":
                switch (character){
                    case "":
                        rack_skillsList.add("");
                        break;
                    case "":
                        rack_skillsList.add("");
                        break;
                    case "":
                        rack_skillsList.add("");
                        break;
                    case "":
                        rack_skillsList.add("");
                        break;
                }
        }*/
    }
    public ArrayList<String> getRack_skillsList(){
        return this.rack_skillsList;
    }
}
