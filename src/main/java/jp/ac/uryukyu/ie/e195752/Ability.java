package jp.ac.uryukyu.ie.e195752;
import java.util.ArrayList;
import java.util.Random;

//アビリティ
public class Ability {
    private ArrayList<String> abilityList = new ArrayList<>();
    public Ability(String character, String attribute){
        switch (attribute){
            case "Fire":
                switch (character){
                    case "アグナムートX":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("マインスイーパーEL");
                        abilityList.add("木属性耐性");
                        break;
                    case "アグナムート":
                        abilityList.add("超アンチダメージウォール");
                        abilityList.add("ロボットキラーM");
                        abilityList.add("魔封じM");
                        abilityList.add("ダッシュ");
                        break;
                    case "リンツー":
                        abilityList.add("超アンチワープ");
                        abilityList.add("アンチ減速壁");
                        abilityList.add("幻獣キラーL");
                        abilityList.add("ダッシュ");
                        break;
                    case "真田幸村":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("カウンターキラーM");
                        abilityList.add("レーザーストップ");
                        break;
                    case "坂本龍馬":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("アンチウィンド");
                        abilityList.add("木属性キラー");
                        break;
                    case "ミカエル":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("超アンチダメージウォール");
                        abilityList.add("木属性耐性");
                        abilityList.add("状態異常回復");
                        break;
                    case "HANZO":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("アンチワープ");
                        abilityList.add("SSターン短縮");
                        break;
                    case "ランスロットX":
                        abilityList.add("超アンチ重力バリア");
                        abilityList.add("魔法陣ブースト");
                        abilityList.add("闇属性キラー");
                        abilityList.add("回復M");
                        break;
                    case "ブラフマー":
                        abilityList.add("アンチワープ");
                        abilityList.add("木属性キラー");
                        abilityList.add("木属性耐性");
                        break;
                    case "ノンノ":
                        abilityList.add("マインスイーパーEL");
                        abilityList.add("アンチウィンド");
                        break;
                    case "ベートーヴェン":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("アンチブロック");
                        break;
                    case "シンデレラ":
                        abilityList.add("アンチダメージウォール");
                        abilityList.add("マインスイーパーL");
                        break;
                    case "アトス":
                        abilityList.add("アンチダメージウォール");
                        abilityList.add("アンチワープ");
                        abilityList.add("弱点キラーM");
                        break;
                    case "アポロ":
                        abilityList.add("超アンチ重力バリア");
                        abilityList.add("マインスイーパーL");
                        break;
                    case "モンストローズ":
                        abilityList.add("超アンチ重力バリア");
                        abilityList.add("飛行");
                        abilityList.add("重力バリアキラー");
                        break;
                    case "武田信玄":
                        abilityList.add("超アンチ重力バリア");
                        abilityList.add("アンチウィンド");
                        break;
                    case "シュリンガーラ":
                        abilityList.add("アンチワープ");
                        abilityList.add("アンチブロック");
                        abilityList.add("アンチウィンド");
                        break;
                    case "ダリア":
                        abilityList.add("アンチダメージウォール");
                        abilityList.add("飛行");
                        abilityList.add("SSターン短縮");
                        abilityList.add("ダッシュ");
                        break;
                    case "卑弥呼":
                        abilityList.add("超アンチダメージウォール");
                        abilityList.add("木属性キラー");
                        break;
                    case "ラザニー":
                        abilityList.add("アンチワープ");
                        abilityList.add("サムライキラーM");
                        abilityList.add("SSターン短縮");
                        abilityList.add("回復");
                        break;
                    case "ガリレオ":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("マインスイーパーM");
                        break;
                    case "ナスカ":
                        abilityList.add("アンチワープ");
                        abilityList.add("神キラーM");
                        abilityList.add("ユニバキラーM");
                        abilityList.add("底力");
                        break;
                    case "ワルプルギス":
                        abilityList.add("アンチダメージウォール");
                        abilityList.add("マインスイーパーL");
                        abilityList.add("レーザーストップ");
                        break;
                    case "張飛":
                        abilityList.add("アンチワープ");
                        abilityList.add("マインスイーパーM");
                        abilityList.add("ダッシュ");
                        break;
                    case "サラマンダー":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("飛行");
                        abilityList.add("アンチウィンド");
                        abilityList.add("魔王キラーM");
                        break;
                    case "ルイス・キャロル":
                        abilityList.add("アンチブロック");
                        abilityList.add("弱点キラー");
                        abilityList.add("回復");
                        abilityList.add("リジェネ");
                        break;
                    case "グングニル":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("アンチダメージウォール");
                        break;
                    case "スキッティ":
                        abilityList.add("アンチダメージウォール");
                        abilityList.add("アンチウィンド");
                        abilityList.add("アンチ魔法陣");
                        abilityList.add("木属性耐性");
                        break;
                    case "犬坂毛野":
                        abilityList.add("アンチワープ");
                        abilityList.add("アンチブロック");
                        abilityList.add("ダッシュM");
                        abilityList.add("SSターンチャージ");
                        break;
                    case "モラル":
                        abilityList.add("超アンチダメージウォール");
                        abilityList.add("アンチブロック");
                        break;
                    case "シャイニーウィンガー":
                        abilityList.add("アンチダメージウォール");
                        abilityList.add("飛行");
                        abilityList.add("アンチブロック");
                        break;
                    case "オオクニヌシ":
                        abilityList.add("マインスイーパーM");
                        abilityList.add("アンチ魔法陣");
                        abilityList.add("回復");
                        break;
                    case "孫悟空":
                        abilityList.add("超アンチダメージウォール");
                        abilityList.add("バイタルキラー");
                        abilityList.add("全属性耐性");
                        break;
                    case "テキーラα":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("超アンチワープ");
                        break;
                    case "メイ":
                        abilityList.add("アンチワープ");
                        abilityList.add("アンチブロック");
                        abilityList.add("幻妖キラーM");
                        abilityList.add("レーザーストップ");
                        break;
                    case "サンダルフォンα":
                        abilityList.add("超アンチ重力バリア");
                        abilityList.add("アンチ減速壁");
                        abilityList.add("回復M");
                        abilityList.add("リジェネ");
                        break;
                    case "トパーズ":
                        abilityList.add("飛行");
                        abilityList.add("アンチブロック");
                        abilityList.add("魔人キラーM");
                        abilityList.add("神キラーM");
                        break;
                    case "伏姫α":
                        abilityList.add("超アンチダメージウォール");
                        abilityList.add("アンチワープ");
                        abilityList.add("回復");
                        break;
                    case "大和":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("アンチ魔法陣");
                        break;
                    case "ギルガメッシュ":
                        abilityList.add("超アンチワープ");
                        abilityList.add("アンチブロック");
                        abilityList.add("亜人キラーL");
                        abilityList.add("木属性耐性");
                        break;
                    case "マルス":
                        abilityList.add("マインスイーパーM");
                        abilityList.add("アンチブロック");
                        abilityList.add("木属性耐性");
                        abilityList.add("SSターン短縮");
                        break;
                    case "ウォッカ":
                        abilityList.add("アンチワープ");
                        abilityList.add("マインスイーパーM");
                        abilityList.add("カウンターキラー");
                        break;
                    case "フォーミュラ・アクセル":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("マインスイーパー");
                        abilityList.add("アンチブロック");
                        abilityList.add("ダッシュ");
                        break;
                    case "楊貴妃":
                        abilityList.add("超アンチダメージウォール");
                        abilityList.add("アンチブロック");
                        abilityList.add("アンチ魔法陣");
                        abilityList.add("鳥獣封じM");
                        break;
                    case "足利義輝":
                        abilityList.add("アンチダメージウォール");
                        abilityList.add("マインスイーパー");
                        break;
                    case "ルビー":
                        abilityList.add("アンチワープ");
                        abilityList.add("SSターン短縮");
                        abilityList.add("友情ブースト");
                        break;
                    case "レクイエム":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("超アンチダメージウォール");
                        abilityList.add("回復");
                        break;
                    case "ゼフォン":
                        abilityList.add("超アンチウィンド");
                        abilityList.add("アンチ減速壁");
                        abilityList.add("弱点キラー");
                        abilityList.add("ダッシュ");
                        break;
                    case "プロメテウス":
                        abilityList.add("アンチダメージウォール");
                        abilityList.add("鳥獣封じM");
                        abilityList.add("幻竜封じM");
                        abilityList.add("アンチ魔法陣");
                        break;
                    case "アラウィン":
                        abilityList.add("マインスイーパーM");
                        abilityList.add("毒キラー");
                        abilityList.add("アンチブロック");
                        abilityList.add("獣キラー");
                        break;
                    case "珊瑚":
                        abilityList.add("超マインスイーパー");
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("鳥獣封じM");
                        abilityList.add("ダッシュ");
                        break;
                    case "アザトース":
                        abilityList.add("超アンチウィンド");
                        abilityList.add("アンチ減速壁");
                        abilityList.add("状態異常回復");
                        abilityList.add("アンチブロック");
                        abilityList.add("底力EL");
                        break;
                    case "ナタ":
                        abilityList.add("飛行");
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("超アンチウィンド");
                        abilityList.add("アンチブロック");
                        abilityList.add("SSターン短縮");
                        break;
                    case "真田昌幸"://4868
                        abilityList.add("マインスイーパーM");
                        abilityList.add("アンチウィンド");
                        abilityList.add("友情コンボ×2");
                        abilityList.add("亜人キラー");
                        break;
                }
                break;
            case "Water":
                switch (character){
                    case "スサノオ":
                        abilityList.add("超アンチダメージウォール");
                        break;
                    case "ラファエル":
                        abilityList.add("アンチダメージウォール");
                        abilityList.add("マインスイーパーM");
                        abilityList.add("回復");
                        break;
                    case "オーディン":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("ダッシュ");
                        break;
                    case "ナナミ":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("光属性キラー");
                        abilityList.add("SSターンアクセル");
                        break;
                    case "ランスロット":
                        abilityList.add("超アンチダメージウォール");
                        abilityList.add("アンチワープ");
                        break;
                    case "アテナ":
                        abilityList.add("アンチダメージウォール");
                        abilityList.add("アンチブロック");
                        abilityList.add("火属性耐性");
                        break;
                    case "カーリー":
                        abilityList.add("アンチワープ");
                        abilityList.add("マインスイーパーL");
                        abilityList.add("アンチ減速壁");
                        break;
                    case "霧隠才蔵":
                        abilityList.add("アンチダメージウォール");
                        abilityList.add("アンチウィンド");
                        abilityList.add("魔封じ");
                        break;
                    case "テキーラ":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("アンチブロック");
                        abilityList.add("アンチウィンド");
                        break;
                    case "ノブナガX":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("マインスイーパーL");
                        break;
                    case "ウンディーネ":
                        abilityList.add("アンチワープ");
                        abilityList.add("アンチウィンド");
                        abilityList.add("魔法陣ブースト");
                        break;
                    case "ダルタニャン":
                    case "カルナ":
                        abilityList.add("アンチダメージウォール");
                        abilityList.add("マインスイーパーL");
                        break;
                    case "ロミオ":
                        abilityList.add("超アンチ重力バリア");
                        abilityList.add("飛行");
                        break;
                    case "天草四郎":
                        abilityList.add("超アンチワープ");
                        abilityList.add("火属性キラー");
                        abilityList.add("レーザーストップ");
                        break;
                    case "出雲":
                        abilityList.add("アンチワープ");
                        abilityList.add("魔封じ");
                        abilityList.add("火属性耐性");
                        break;
                    case "ナポレオン":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("マインスイーパーM");
                        abilityList.add("神キラー");
                        break;
                    case "アイリス"://3568
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("マインスイーパー");
                        abilityList.add("アンチウィンド");
                        break;
                    case "太公望":
                        abilityList.add("アンチワープ");
                        abilityList.add("アンチブロック");
                        abilityList.add("亜人キラー");
                        abilityList.add("状態異常回復");
                        break;
                    case "関羽"://3765
                        abilityList.add("アンチダメージウォール");
                        abilityList.add("カウンターキラー");
                        abilityList.add("底力");
                        break;
                    case "ヴェルダンディ":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("アンチダメージウォール");
                        abilityList.add("アンチウィンド");
                        break;
                    case "アヌビス":
                        abilityList.add("超アンチダメージウォール");
                        abilityList.add("回復");
                        break;
                    case "ラプンツェル":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("アンチ魔法陣");
                        abilityList.add("ロボットキラー");
                        abilityList.add("魔封じ");
                        break;
                    case "シンドバッド":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("アンチダメージウォール");
                        break;
                    case "プルメリア":
                        abilityList.add("アンチダメージウォール");
                        abilityList.add("アンチワープ");
                        abilityList.add("飛行");
                        abilityList.add("ダッシュ");
                        break;
                    case "パラドクス":
                        abilityList.add("マインスイーパーM");
                        abilityList.add("アンチブロック");
                        abilityList.add("アンチ魔法陣");
                        break;
                    case "ノンノα"://4214
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("アンチダメージウォール");
                        abilityList.add("アンチブロック");
                        break;
                    case "ベイカーズ":
                        abilityList.add("アンチダメージウォール");
                        abilityList.add("アンチブロック");
                        abilityList.add("魔王キラー");
                        break;
                    case "ムーα":
                        abilityList.add("マインスイーパーEL");
                        abilityList.add("アンチウィンド");
                        abilityList.add("毒キラー");
                        break;
                    case "ノア":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("アンチワープ");
                        abilityList.add("飛行");
                        break;
                    case "ディルムッド":
                        abilityList.add("アンチワープ");
                        abilityList.add("ロボットキラーL");
                        abilityList.add("聖騎士キラー");
                        break;
                    case "媽祖":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("マインスイーパーEL");
                        break;
                    case "アクアマリン":
                        abilityList.add("アンチワープ");
                        abilityList.add("マインスイーパーM");
                        abilityList.add("火属性耐性");
                        abilityList.add("レーザーストップ");
                        break;
                    case "ノストラダムス":
                        abilityList.add("超マインスイーパーM");
                        abilityList.add("アンチブロック");
                        abilityList.add("光属性キラー");
                        abilityList.add("闇属性キラー");
                        break;
                    case "アリババα":
                        abilityList.add("マインスイーパーM");
                        abilityList.add("アンチブロック");
                        break;
                    case "茨木童子α":
                        abilityList.add("超アンチダメージウォール");
                        abilityList.add("アンチブロック");
                        abilityList.add("友情ブースト");
                        break;
                    case "桂小五郎"://4395
                        abilityList.add("アンチダメージウォール");
                        abilityList.add("飛行");
                        abilityList.add("超アンチウィンド");
                        break;
                    case "ローレライ":
                        abilityList.add("アンチワープ");
                        abilityList.add("マインスイーパー");
                        break;
                    case "ブレイブアーマー":
                        abilityList.add("超アンチ重力バリア");
                        abilityList.add("火属性キラー");
                        break;
                    case "グリム兄弟α":
                        abilityList.add("マインスイーパーL");
                        abilityList.add("アンチ減速壁");
                        abilityList.add("回復M");
                        abilityList.add("飛行付与");
                        break;
                    case "周瑜":
                        abilityList.add("超アンチワープ");
                        abilityList.add("鉱物キラー");
                        abilityList.add("幻竜封じ");
                        abilityList.add("回復M");
                        break;
                    case "シャトル・アクセル":
                        abilityList.add("マインスイーパーM");
                        abilityList.add("アンチブロック");
                        abilityList.add("アンチ魔法陣");
                        abilityList.add("SSターンアクセル");
                        break;
                    case "ミロク":
                        abilityList.add("飛行");
                        abilityList.add("アンチブロック");
                        abilityList.add("火属性キラー");
                        abilityList.add("火属性耐性");
                        abilityList.add("回復");
                        abilityList.add("友情コンボ×2");
                        break;
                    case "フリーズ":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("アンチブロック");
                        abilityList.add("ユニバキラー");
                        abilityList.add("状態異常回復");
                        break;
                    case "レビィ":
                        abilityList.add("超アンチ重力バリア");
                        abilityList.add("アンチブロック");
                        abilityList.add("バイタルキラー");
                        abilityList.add("レーザーストップ");
                        break;
                    case "ヤタガラス":
                        abilityList.add("アンチワープ");
                        abilityList.add("飛行");
                        abilityList.add("超アンチウィンド");
                        abilityList.add("SSターン短縮");
                        break;
                    case "鈴蘭":
                        abilityList.add("飛行");
                        abilityList.add("火属性耐性");
                        abilityList.add("弱点キラー");
                        abilityList.add("超アンチワープ");
                        abilityList.add("アンチブロック");
                        break;
                    case "ノクターン":
                        abilityList.add("マインスイーパー");
                        abilityList.add("超アンチウィンド");
                        abilityList.add("状態異常回復");
                        abilityList.add("アンチ減速壁");
                        break;
                    case "ニャルラトホテプ":
                        abilityList.add("マインスイーパーL");
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("アンチ魔法陣");
                        break;
                    case "ノア&パンドラ":
                        abilityList.add("超アンチワープ");
                        abilityList.add("レーザーストップ");
                        abilityList.add("アンチブロック");
                        abilityList.add("ドレイン");
                        break;
                    case "サラスヴァティ"://4863
                        abilityList.add("マインスイーパーL");
                        abilityList.add("超アンチウィンド");
                        abilityList.add("火属性耐性");
                        abilityList.add("アンチブロック");
                        break;
                }
                break;
            case "Wood":
                switch (character){
                    case "ハンターキング":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("アンチウィンド");
                        abilityList.add("水属性耐性");
                        break;
                    case "ヴァルキリー":
                        abilityList.add("超アンチダメージウォール");
                        abilityList.add("アンチワープ");
                        break;
                    case "ギムレット":
                        abilityList.add("超アンチダメージウォール");
                        abilityList.add("飛行");
                        abilityList.add("全属性耐性");
                        break;
                    case "リボン":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("水属性耐性");
                        break;
                    case "チンギスハン":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("超アンチダメージウォール");
                        abilityList.add("聖騎士キラーM");
                        break;
                    case "ヘラクレス":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("ドラゴンキラーM");
                        abilityList.add("獣キラーM");
                        abilityList.add("幻獣キラーM");
                        break;
                    case "マーリン":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("回復");
                        break;
                    case "ケロン":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("水属性耐性");
                        abilityList.add("状態異常回復");
                        abilityList.add("レーザーストップ");
                        break;
                    case "バッハ":
                        abilityList.add("アンチワープ");
                        abilityList.add("光属性キラー");
                        abilityList.add("ユニバキラー");
                        abilityList.add("魔封じ");
                        break;
                    case "蒲公英":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("飛行");
                        abilityList.add("アンチウィンド");
                        abilityList.add("魔族キラーM");
                        break;
                    case "デッドラビッツ":
                        abilityList.add("超アンチワープ");
                        abilityList.add("アンチブロック");
                        abilityList.add("幻獣キラーM");
                        abilityList.add("SSターン短縮");
                        break;
                    case "クーフーリン":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("マインスイーパーEL");
                        break;
                    case "猪八戒":
                        abilityList.add("アンチワープ");
                        abilityList.add("飛行");
                        abilityList.add("アンチブロック");
                        abilityList.add("魔人キラーM");
                        break;
                    case "アラミス":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("アンチワープ");
                        abilityList.add("リジェネ");
                        break;
                    case "アポロX":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("飛行");
                        abilityList.add("アンチ魔法陣");
                        abilityList.add("カウンターキラー");
                        break;
                    case "モンストクローバー":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("魔王キラーL");
                        abilityList.add("魔王耐性");
                        break;
                    case "茨木童子":
                        abilityList.add("超アンチダメージウォール");
                        abilityList.add("アンチ減速壁");
                        abilityList.add("ドレイン");
                        break;
                    case "おりょう"://3486
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("アンチダメージウォール");
                        abilityList.add("アンチブロック");
                        break;
                    case "ベルフェゴール":
                        abilityList.add("アンチワープ");
                        abilityList.add("水属性キラー");
                        abilityList.add("水属性耐性");
                        break;
                    case "ナチョス":
                        abilityList.add("アンチダメージウォール");
                        abilityList.add("アンチワープ");
                        break;
                    case "ヴィーラ"://3714
                        abilityList.add("アンチワープ");
                        abilityList.add("超アンチウィンド");
                        abilityList.add("状態異常回復");
                        break;
                    case "デネブ":
                        abilityList.add("アンチダメージウォール");
                        abilityList.add("アンチブロック");
                        abilityList.add("魔王キラー");
                        break;
                    case "ニーベルンゲン":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("アンチダメージウォール");
                        abilityList.add("レーザーストップ");
                        break;
                    case "シェヘラザード":
                        abilityList.add("アンチダメージウォール");
                        abilityList.add("SSターン短縮");
                        abilityList.add("回復");
                        abilityList.add("SSターンチャージ");
                        break;
                    case "武蔵坊弁慶":
                        abilityList.add("アンチワープ");
                        abilityList.add("マインスイーパーM");
                        abilityList.add("レーザーストップ");
                        abilityList.add("底力");
                        break;
                    case "グリム兄弟"://3993
                        abilityList.add("超アンチワープ");
                        abilityList.add("魔法陣ブースト");
                        break;
                    case "ナイチンゲール":
                        abilityList.add("超アンチ重力バリア");
                        abilityList.add("水属性キラー");
                        break;
                    case "伏姫":
                        abilityList.add("飛行");
                        abilityList.add("アンチブロック");
                        abilityList.add("幻獣キラーL");
                        abilityList.add("幻獣耐性");
                        break;
                    case "アメノウズメ":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("アンチウィンド");
                        abilityList.add("アンチ魔法陣");
                        abilityList.add("アクシスキラーL");
                        break;
                    case "コルセア"://4093
                        abilityList.add("超アンチ重力バリア");
                        abilityList.add("飛行");
                        break;
                    case "アンスリウム":
                        abilityList.add("超アンチダメージウォール");
                        abilityList.add("飛行");
                        abilityList.add("魔封じM");
                        break;
                    case "天使ガブリエル":
                        abilityList.add("超アンチダメージウォール");
                        abilityList.add("アンチワープ");
                        abilityList.add("光属性キラー");
                        abilityList.add("闇属性キラー");
                        break;
                    case "守護ガブリエル":
                        abilityList.add("アンチワープ");
                        abilityList.add("マインスイーパーM");
                        abilityList.add("アンチウィンド");
                        abilityList.add("水属性耐性");
                        abilityList.add("SSターン短縮");
                        abilityList.add("ダッシュ");
                        break;
                    case "サタンα":
                        abilityList.add("水属性キラー");
                        abilityList.add("弱点キラー");
                        abilityList.add("魔族キラー");
                        abilityList.add("幻妖キラー");
                        break;
                    case "シェイクスピア":
                        abilityList.add("アンチワープ");
                        abilityList.add("マインスイーパーM");
                        abilityList.add("魔族キラーM");
                        abilityList.add("状態異常回復");
                        break;
                    case "オスカー":
                        abilityList.add("超アンチ重力バリア");
                        abilityList.add("アンチブロック");
                        break;
                    case "マモン":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("飛行");
                        abilityList.add("アンチ減速壁");
                        abilityList.add("ソウルスティール");
                        break;
                    case "コンプレックス":
                        abilityList.add("飛行");
                        abilityList.add("アンチブロック");
                        abilityList.add("アンチ減速壁");
                        abilityList.add("水属性耐性");
                        break;
                    case "西王母":
                        abilityList.add("超アンチ重力バリア");
                        abilityList.add("アンチダメージウォール");
                        abilityList.add("回復");
                        break;
                    case "ロビンフッド"://4345
                        abilityList.add("超アンチ重力バリア");
                        abilityList.add("マインスイーパーM");
                        break;
                    case "ルイス・キャロルα":
                        abilityList.add("マインスイーパーM");
                        abilityList.add("アンチウィンド");
                        abilityList.add("弱点キラー");
                        abilityList.add("リジェネ");
                        break;
                    case "陸奥宗光":
                        abilityList.add("アンチワープ");
                        abilityList.add("魔法陣ブースト");
                        abilityList.add("友情ブースト");
                        abilityList.add("ダッシュ");
                        break;
                    case "パールヴァティ":
                        abilityList.add("マインスイーパーL");
                        abilityList.add("アンチブロック");
                        abilityList.add("SSターン短縮");
                        abilityList.add("回復");
                        break;
                    case "ユピテル":
                        abilityList.add("マインスイーパーL");
                        abilityList.add("アンチ減速壁");
                        abilityList.add("底力");
                        abilityList.add("ダッシュ");
                        break;
                    case "太公望α":
                        abilityList.add("アンチブロック");
                        abilityList.add("カウンターキラーL");
                        abilityList.add("全属性耐性");
                        abilityList.add("無属性耐性");
                        break;
                    case "バルムンク":
                        abilityList.add("アンチダメージウォール");
                        abilityList.add("アンチワープ");
                        abilityList.add("アンチウィンド");
                        abilityList.add("底力");
                        break;
                    case "水仙":
                        abilityList.add("アンチダメージウォール");
                        abilityList.add("飛行");
                        abilityList.add("アンチウィンド");
                        abilityList.add("亜人キラーL");
                        abilityList.add("水属性耐性");
                        break;
                    case "宝蔵院胤栄":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("アンチダメージウォール");
                        abilityList.add("アンチウィンド");
                        break;
                    case "エメラルド":
                        abilityList.add("アンチワープ");
                        abilityList.add("マインスイーパーM");
                        abilityList.add("アンチブロック");
                        abilityList.add("魔王キラーM");
                        break;
                    case "鄧艾":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("超アンチワープ");
                        abilityList.add("友情ブースト");
                        break;
                    case "ビリー・ザ・キッド":
                        abilityList.add("アンチダメージウォール");
                        abilityList.add("アンチワープ");
                        abilityList.add("アンチウィンド");
                        abilityList.add("アンチ魔法陣");
                        abilityList.add("友情ブーストM");
                        break;
                    case "スルガト":
                        abilityList.add("マインスイーパーL");
                        abilityList.add("アンチブロック");
                        abilityList.add("アンチ魔法陣");
                        break;
                    case "天叢雲":
                        abilityList.add("マインスイーパーM");
                        abilityList.add("ドラゴンキラーEL");
                        abilityList.add("聖騎士キラーEL");
                        break;
                    case "神威α":
                        abilityList.add("超アンチ重力バリア");
                        abilityList.add("マインスイーパーM");
                        abilityList.add("アンチブロック");
                        abilityList.add("友情コンボ×2");
                        break;
                    case "ユグドラシル":
                        abilityList.add("マインスイーパーL");
                        abilityList.add("アンチダメージウォール");
                        abilityList.add("超アンチウィンド");
                        break;
                    case "トート":
                        abilityList.add("飛行");
                        abilityList.add("水属性耐性");
                        abilityList.add("カウンターキラー");
                        abilityList.add("アンチ魔法陣");
                        abilityList.add("SSターン短縮");
                        break;
                    case "ヨグソトース":
                        abilityList.add("マインスイーパー");
                        abilityList.add("妖精キラーL");
                        abilityList.add("幻竜封じL");
                        abilityList.add("超アンチワープ");
                        break;
                    case "楊セン":
                        abilityList.add("超マインスイーパー");
                        abilityList.add("アンチダメージウォール");
                        abilityList.add("サムライキラーM");
                        break;
                    case "島津義弘"://4870
                        abilityList.add("超アンチウィンド");
                        abilityList.add("カウンターキラーL");
                        abilityList.add("アンチ減速壁");
                        abilityList.add("状態異常回復");
                        break;
                }
                break;
            case "Light":
                switch (character){
                    case "ゴットストライク":
                        abilityList.add("アンチダメージウォール");
                        abilityList.add("飛行");
                        abilityList.add("カウンターキラー");
                        break;
                    case "ロイゼ":
                        abilityList.add("アンチワープ");
                        abilityList.add("飛行");
                        abilityList.add("幻獣キラーM");
                        break;
                    case "アラジン":
                        abilityList.add("超アンチダメージウォール");
                        abilityList.add("アンチワープ");
                        abilityList.add("闇属性耐性");
                        break;
                    case "ラー":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("水属性キラー");
                        abilityList.add("魔王キラーM");
                        break;
                    case "ゼウス":
                        abilityList.add("アンチダメージウォール");
                        abilityList.add("飛行");
                        abilityList.add("アンチ減速壁");
                        abilityList.add("全属性耐性M");
                        break;
                    case "天国ウリエル":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("アンチダメージウォール");
                        break;
                    case "地獄ウリエル":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("カウンターキラー");
                        break;
                    case "クレオパトラ"://2528
                        abilityList.add("超アンチ重力バリア");
                        abilityList.add("アンチ魔法陣");
                        abilityList.add("毒キラー");
                        abilityList.add("回復M");
                        abilityList.add("レーザーストップ");
                        break;
                    case "ヒカリ":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("飛行");
                        abilityList.add("ダッシュ");
                        abilityList.add("SSターンチャージ");
                        break;
                    case "キスキルリラ":
                        abilityList.add("アンチダメージウォール");
                        abilityList.add("超アンチワープ");
                        abilityList.add("アンチ魔法陣");
                        abilityList.add("治癒の祈り");
                        break;
                    case "モーツァルト":
                        abilityList.add("マインスイーパーL");
                        abilityList.add("アンチウィンド");
                        break;
                    case "神威":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("超アンチワープ");
                        abilityList.add("ロボットキラー");
                        abilityList.add("友情コンボ×2");
                        break;
                    case "ベルゼブブ":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("アンチダメージウォール");
                        abilityList.add("魔封じ");
                        break;
                    case "ジュリエット":
                        abilityList.add("超アンチダメージウォール");
                        abilityList.add("アンチウィンド");
                        break;
                    case "モンストブライト":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("マインスイーパーM");
                        abilityList.add("底力");
                        abilityList.add("SSターンアクセル");
                        break;
                    case "安倍晴明":
                        abilityList.add("アンチワープ");
                        abilityList.add("マインスイーパーM");
                        abilityList.add("光属性キラー");
                        abilityList.add("闇属性耐性");
                        break;
                    case "ムー":
                        abilityList.add("超アンチ重力バリア");
                        break;
                    case "ドンキホーテ":
                        abilityList.add("アンチダメージウォール");
                        abilityList.add("飛行");
                        abilityList.add("状態異常回復");
                        break;
                    case "アーサー":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("アンチダメージウォール");
                        abilityList.add("アンチワープ");
                        abilityList.add("SSターン短縮");
                        break;
                    case "リコル":
                        abilityList.add("アンチブロック");
                        abilityList.add("アンチウィンド");
                        abilityList.add("魔王キラーL");
                        abilityList.add("レーザーストップ");
                        break;
                    case "ヘラ"://3801
                        abilityList.add("超アンチ重力バリア");
                        abilityList.add("飛行");
                        abilityList.add("バリア付与");
                        abilityList.add("飛行付与");
                        break;
                    case "ラウドラ":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("マインスイーパー");
                        abilityList.add("カウンターキラー");
                        break;
                    case "サキュバス":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("飛行");
                        abilityList.add("亜人キラー");
                        break;
                    case "ビッグイノベーター":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("闇属性キラー");
                        abilityList.add("闇属性耐性");
                        break;
                    case "清少納言":
                        abilityList.add("アンチダメージウォール");
                        abilityList.add("アンチブロック");
                        abilityList.add("ダッシュ");
                        abilityList.add("SSターンアクセル");
                        break;
                    case "ケラノウス":
                        abilityList.add("アンチダメージウォール");
                        abilityList.add("闇属性キラー");
                        abilityList.add("全属性耐性");
                        break;
                    case "タケミカヅチ":
                        abilityList.add("アンチダメージウォール");
                        abilityList.add("アンチブロック");
                        abilityList.add("弱点キラーM");
                        break;
                    case "ダイヤモンド":
                        abilityList.add("アンチダメージウォール");
                        abilityList.add("アンチワープ");
                        abilityList.add("全属性耐性");
                        abilityList.add("友情ブースト");
                        break;
                    case "犬塚信乃":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("アンチダメージウォール");
                        abilityList.add("闇属性耐性");
                        abilityList.add("SSターン短縮");
                        break;
                    case "サルタヒコ"://4125
                        abilityList.add("超アンチ重力バリア");
                        abilityList.add("アンチ魔法陣");
                        abilityList.add("聖騎士キラー");
                        abilityList.add("無属性耐性M");
                        break;
                    case "劉備":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("アンチワープ");
                        abilityList.add("無属性耐性");
                        abilityList.add("状態異常回復");
                        break;
                    case "ハイビスカス":
                        abilityList.add("飛行");
                        abilityList.add("アンチブロック");
                        abilityList.add("闇属性キラー");
                        abilityList.add("バリア付与");
                        break;
                    case "如意棒":
                        abilityList.add("飛行");
                        abilityList.add("アンチブロック");
                        abilityList.add("弱点キラー");
                        abilityList.add("状態異常回復");
                        break;
                    case "ワトソン":
                        abilityList.add("アンチダメージウォール");
                        abilityList.add("マインスイーパーL");
                        abilityList.add("魔人キラー");
                        abilityList.add("幻獣キラーM");
                        break;
                    case "メタトロンα":
                        abilityList.add("アンチワープ");
                        abilityList.add("アンチブロック");
                        abilityList.add("弱点キラー");
                        abilityList.add("SSターンチャージ");
                        break;
                    case "ベビーアーク":
                        abilityList.add("アンチダメージウォール");
                        abilityList.add("アンチワープ");
                        abilityList.add("弱点キラー");
                        abilityList.add("レーザーストップ");
                        break;
                    case "シトリン":
                        abilityList.add("マインスイーパーM");
                        abilityList.add("魔法陣ブースト");
                        break;
                    case "ゲイボルグ":
                        abilityList.add("超アンチワープ");
                        abilityList.add("アンチブロック");
                        abilityList.add("アンチウィンド");
                        break;
                    case "リボンα":
                        abilityList.add("超アンチワープ");
                        abilityList.add("アンチ減速壁");
                        abilityList.add("全属性耐性M");
                        abilityList.add("無属性耐性M");
                        break;
                    case "グラバー":
                        abilityList.add("超アンチ重力バリア");
                        abilityList.add("アンチダメージウォール");
                        break;
                    case "テンペスト"://4424
                        abilityList.add("超アンチ重力バリア");
                        abilityList.add("飛行");
                        abilityList.add("重力バリアキラー");
                        break;
                    case "三蔵法師":
                        abilityList.add("アンチワープ");
                        abilityList.add("闇属性キラー");
                        abilityList.add("闇属性耐性M");
                        break;
                    case "アンチテーゼ":
                        abilityList.add("超アンチダメージウォール");
                        abilityList.add("アンチ魔法陣");
                        abilityList.add("弱点キラー");
                        abilityList.add("SSターン短縮");
                        break;
                    case "芙蓉":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("飛行");
                        abilityList.add("レーザーバリアキラー");
                        abilityList.add("状態異常回復");
                        break;
                    case "アロンズロッド":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("アンチブロック");
                        abilityList.add("ダッシュ");
                        abilityList.add("バリア付与");
                        break;
                    case "ドローン・アクセル":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("飛行");
                        abilityList.add("アンチ減速壁");
                        abilityList.add("SSターン短縮");
                        break;
                    case "スピカ"://4559
                        abilityList.add("超アンチ重力バリア");
                        abilityList.add("獣キラーEL");
                        abilityList.add("魔族キラーEL");
                        abilityList.add("魔族耐性M");
                        break;
                    case "那須与一":
                        abilityList.add("アンチワープ");
                        abilityList.add("マインスイーパー");
                        abilityList.add("弱点キラー");
                        abilityList.add("聖騎士キラー");
                        abilityList.add("闇属性耐性");
                        break;
                    case "カラミティ・ジェーン":
                        abilityList.add("アンチ魔法陣");
                        abilityList.add("ロボットキラーEL");
                        abilityList.add("亜人キラーEL");
                        break;
                    case "王元姫":
                        abilityList.add("アンチワープ");
                        abilityList.add("アンチ魔法陣");
                        abilityList.add("状態異常回復");
                        break;
                    case "ティターニア"://4682
                        abilityList.add("アンチワープ");
                        abilityList.add("アンチブロック");
                        abilityList.add("アンチウィンド");
                        abilityList.add("カウンターキラー");
                        break;
                    case "ハーレーα":
                        abilityList.add("アンチウィンド");
                        abilityList.add("アンチ魔法陣");
                        abilityList.add("アンチ減速壁");
                        abilityList.add("レーザーストップ");
                        abilityList.add("友情底力");
                        break;
                    case "クエリー":
                        abilityList.add("飛行");
                        abilityList.add("アンチブロック");
                        abilityList.add("超アンチウィンド");
                        abilityList.add("アンチ減速壁");
                        break;
                    case "真珠":
                        abilityList.add("レーザーストップ");
                        abilityList.add("全属性耐性M");
                        abilityList.add("無属性耐性M");
                        abilityList.add("超アンチ重力バリア");
                        abilityList.add("SSターン短縮");
                        break;
                    case "王昭君":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("アンチダメージウォール");
                        abilityList.add("友情ブースト");
                        abilityList.add("アンチ魔法陣");
                        break;
                    case "ペリノア":
                        abilityList.add("超アンチワープ");
                        abilityList.add("アンチ魔法陣");
                        abilityList.add("アンチ減速壁");
                        break;
                    case "アーサー&ソロモン":
                        abilityList.add("マインスイーパーM");
                        abilityList.add("アンチ魔法陣");
                        abilityList.add("SSターン短縮");
                        abilityList.add("ソウルスティール");
                        break;
                    case "カメハメハ"://4857
                        abilityList.add("超アンチダメージウォール");
                        abilityList.add("アンチウィンド");
                        abilityList.add("レーザーストップ");
                        abilityList.add("アンチブロック");
                        break;
                }
                break;
            case "Darkness":
                switch (character){
                    case "ワールド":
                        abilityList.add("超アンチ重力バリア");
                        abilityList.add("飛行");
                        break;
                    case "ハーメルン":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("状態異常回復");
                        break;
                    case "ロキ":
                        abilityList.add("マインスイーパー");
                        abilityList.add("魔王キラー");
                        break;
                    case "エクリプス":
                        abilityList.add("アンチダメージウォール");
                        abilityList.add("アンチワープ");
                        abilityList.add("光属性耐性");
                        break;
                    case "サタン":
                        abilityList.add("神キラーM");
                        abilityList.add("魔族キラーM");
                        abilityList.add("妖精キラーM");
                        abilityList.add("魔王キラーM");
                        break;
                    case "ジークフリート":
                        abilityList.add("アンチダメージウォール");
                        abilityList.add("アンチワープ");
                        abilityList.add("ドラゴンキラーM");
                        break;
                    case "ハーレー"://2350
                        abilityList.add("アンチダメージウォール");
                        abilityList.add("マインスイーパーM");
                        abilityList.add("弱点キラーM");
                        break;
                    case "ハーレーX":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("アンチブロック");
                        abilityList.add("SSターン短縮");
                        break;
                    case "ハデス":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("超アンチウィンド");
                        abilityList.add("サムライキラーM");
                        break;
                    case "ジャンヌダルク":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("超アンチワープ");
                        abilityList.add("重力バリアキラー");
                        abilityList.add("リジェネ");
                        break;
                    case "ケットシー":
                        abilityList.add("アンチダメージウォール");
                        abilityList.add("アンチブロック");
                        abilityList.add("亜人キラーM");
                        abilityList.add("底力");
                        break;
                    case "ノブナガ":
                        abilityList.add("アンチダメージウォール");
                        abilityList.add("魔法陣ブースト");
                        abilityList.add("カウンターキラー");
                        break;
                    case "妲己":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("アンチワープ");
                        abilityList.add("光属性耐性");
                        break;
                    case "ジキル&ハイド"://3077
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("アンチダメージウォール");
                        abilityList.add("アンチ魔法陣");
                        abilityList.add("SSターン短縮");
                        break;
                    case "ポルトス":
                        abilityList.add("アンチワープ");
                        abilityList.add("アンチ減速壁");
                        abilityList.add("魔封じM");
                        abilityList.add("回復M");
                        break;
                    case "オセロー":
                        abilityList.add("超アンチワープ");
                        abilityList.add("弱点キラー");
                        abilityList.add("レーザーバリアキラー");
                        abilityList.add("レーザーストップ");
                        break;
                    case "源義経":
                        abilityList.add("超アンチダメージウォール");
                        abilityList.add("光属性キラー");
                        abilityList.add("光属性耐性");
                        abilityList.add("ダッシュ");
                        break;
                    case "ティアラ":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("アンチダメージウォール");
                        abilityList.add("全属性耐性M");
                        break;
                    case "ルシファー":
                        abilityList.add("超アンチダメージウォール");
                        abilityList.add("バリア");
                        break;
                    case "ローザ":
                        abilityList.add("アンチワープ");
                        abilityList.add("飛行");
                        abilityList.add("弱点キラー");
                        abilityList.add("回復");
                        break;
                    case "ショコラ":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("マインスイーパーM");
                        abilityList.add("友情コンボ×2");
                        break;
                    case "アリス":
                        abilityList.add("超アンチダメージウォール");
                        abilityList.add("回復M");
                        abilityList.add("状態異常回復");
                        break;
                    case "アリババ"://3745
                        abilityList.add("マインスイーパーL");
                        abilityList.add("アンチブロック");
                        abilityList.add("魔封じ");
                        break;
                    case "ファントム":
                        abilityList.add("超アンチワープ");
                        abilityList.add("アンチウィンド");
                        abilityList.add("光属性耐性");
                        break;
                    case "マッドハッター":
                        abilityList.add("アンチワープ");
                        abilityList.add("アンチウィンド");
                        abilityList.add("光属性耐性");
                        abilityList.add("状態異常回復");
                        break;
                    case "アドゥブタ":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("マインスイーパーM");
                        break;
                    case "西郷隆盛":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("光属性キラー");
                        abilityList.add("光属性耐性");
                        break;
                    case "大喬小喬"://4020
                        abilityList.add("アンチダメージウォール");
                        abilityList.add("マインスイーパー");
                        abilityList.add("アンチブロック");
                        abilityList.add("獣キラーM");
                        break;
                    case "ギャランホルン":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("アンチワープ");
                        abilityList.add("友情コンボ×2");
                        abilityList.add("ダッシュ");
                        break;
                    case "フツヌシ":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("超アンチワープ");
                        break;
                    case "アレス":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("マインスイーパーM");
                        abilityList.add("神キラーM");
                        abilityList.add("光属性耐性");
                        break;
                    case "徳川家康":
                        abilityList.add("超アンチ重力バリア");
                        abilityList.add("マインスイーパーEL");
                        break;
                    case "レストレード":
                        abilityList.add("マインスイーパーM");
                        abilityList.add("アンチウィンド");
                        abilityList.add("アンチ減速壁");
                        break;
                    case "イージス":
                        abilityList.add("アンチワープ");
                        abilityList.add("光属性キラー");
                        abilityList.add("光属性耐性");
                        break;
                    case "フィン":
                        abilityList.add("アンチブロック");
                        abilityList.add("アンチウィンド");
                        abilityList.add("光属性キラー");
                        abilityList.add("光属性耐性");
                        break;
                    case "クロノス"://4314
                        abilityList.add("アンチダメージウォール");
                        abilityList.add("マインスイーパー");
                        abilityList.add("アンチ減速壁");
                        abilityList.add("妖精キラーL");
                        break;
                    case "月麗":
                        abilityList.add("超アンチワープ");
                        abilityList.add("マインスイーパーL");
                        break;
                    case "孫尚香":
                        abilityList.add("超アンチダメージウォール");
                        abilityList.add("アンチ魔法陣");
                        abilityList.add("サムライキラー");
                        abilityList.add("レーザーストップ");
                        break;
                    case "ベートーヴェンα":
                        abilityList.add("超アンチ重力バリア");
                        abilityList.add("鳥獣キラーM");
                        abilityList.add("幻竜キラーM");
                        break;
                    case "ミネルヴァ":
                        abilityList.add("超アンチワープ");
                        abilityList.add("アンチブロック");
                        abilityList.add("鳥獣キラーM");
                        break;
                    case "グングニルα":
                        abilityList.add("超アンチダメージウォール");
                        abilityList.add("アンチブロック");
                        abilityList.add("弱点キラー");
                        break;
                    case "ゴッホ":
                        abilityList.add("超アンチワープ");
                        abilityList.add("光属性耐性");
                        abilityList.add("友情コンボ×2");
                        abilityList.add("ダッシュ");
                        break;
                    case "イデア":
                        abilityList.add("飛行");
                        abilityList.add("アンチブロック");
                        abilityList.add("アンチウィンド");
                        abilityList.add("光属性キラー");
                        break;
                    case "ブリューナク":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("アンチ魔法陣");
                        abilityList.add("アンチ減速壁");
                        abilityList.add("魔王キラー");
                        break;
                    case "アトゥム":
                        abilityList.add("超アンチダメージウォール");
                        abilityList.add("飛行");
                        abilityList.add("アンチウィンド");
                        abilityList.add("幻獣キラーL");
                        break;
                    case "ベルスター":
                        abilityList.add("アンチ重力バリア");
                        abilityList.add("アンチワープ");
                        abilityList.add("神キラーL");
                        abilityList.add("光属性耐性");
                        break;
                    case "司馬昭":
                        abilityList.add("アンチダメージウォール");
                        abilityList.add("アンチブロック");
                        abilityList.add("アンチ減速壁");
                        abilityList.add("レーザーストップ");
                        break;
                    case "トール":
                        abilityList.add("超アンチ重力バリア");
                        abilityList.add("アンチダメージウォール");
                        abilityList.add("妖精キラーL");
                        break;
                    case "ケロンα":
                        abilityList.add("超アンチ重力バリア");
                        abilityList.add("アンチワープ");
                        abilityList.add("無属性耐性");
                        break;
                    case "TFA":
                        abilityList.add("マインスイーパーEL");
                        abilityList.add("光属性耐性");
                        abilityList.add("友情ブースト");
                        abilityList.add("アンチブロック");
                        abilityList.add("SSターン短縮");
                        break;
                    case "フビライハン":
                        abilityList.add("アンチダメージウォール");
                        abilityList.add("アンチワープ");
                        abilityList.add("弱点キラー");
                        abilityList.add("ドラゴンキラー");
                        abilityList.add("魔王キラー");
                        abilityList.add("SSターン短縮");
                        break;
                    case "オペコ":
                        abilityList.add("超アンチ重力バリア");
                        abilityList.add("アンチダメージウォール");
                        abilityList.add("SSターンチャージ");
                        break;
                    case "茶々":
                        abilityList.add("マインスイーパーM");
                        abilityList.add("アンチワープ");
                        abilityList.add("アンチブロック");
                        abilityList.add("SSターン短縮");
                        break;
                    case "ルシファー&カエサル":
                        abilityList.add("マインスイーパー");
                        abilityList.add("バリア");
                        abilityList.add("弱点キラー");
                        abilityList.add("アンチワープ");
                        abilityList.add("アンチ魔法陣");
                        abilityList.add("状態異常回復");
                        break;
                    case "大谷吉継"://4872
                        abilityList.add("マインスイーパーL");
                        abilityList.add("魔法陣ブースト");
                        abilityList.add("レーザーストップ");
                        break;
                }
                break;
        }
    }
    public ArrayList<String> getAbilityList(){
        return this.abilityList;
    }
    public ArrayList<String> selectAbility(ArrayList<String> List, ArrayList<String> sList){
        Random random = new Random();
        ArrayList<String> select = new ArrayList<>();
        for (String str : sList){
            List.remove(str);
        }
        if (List.size()!=0){
            select.add(List.get(random.nextInt(List.size())));
            sList.add(select.get(0));
        }else {
            select.add("これ以上、このモンスターにアビリティはありません");
        }
        return select;
    }
}
