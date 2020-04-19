package jp.ac.uryukyu.ie.e195752;
import java.util.ArrayList;
//撃種
public class Battle_Type {
    private ArrayList<String> battle_typeList = new ArrayList<>();
    public Battle_Type(String character, String attribute){
        switch (attribute){
            case "Fire":
                switch (character){
                    case "アグナムートX":
                    case "真田幸村":
                    case "ミカエル":
                    case "HANZO":
                    case "ランスロットX":
                    case "ブラフマー":
                    case "ノンノ":
                    case "ベートーヴェン":
                    case "アトス":
                    case "武田信玄":
                    case "ダリア":
                    case "卑弥呼":
                    case "ガリレオ":
                    case "ナスカ":
                    case "張飛":
                    case "サラマンダー":
                    case "グングニル":
                    case "スキッティ":
                    case "犬坂毛野":
                    case "モラル":
                    case "孫悟空":
                    case "テキーラα":
                    case "大和":
                    case "マルス":
                    case "足利義輝":
                    case "ゼフォン":
                        battle_typeList.add("反射");
                        break;
                    case "アグナムート":
                    case "リンツー":
                    case "坂本龍馬":
                    case "シンデレラ":
                    case "アポロ":
                    case "モンストローズ":
                    case "シュリンガーラ":
                    case "ラザニー":
                    case "ワルプルギス":
                    case "ルイス・キャロル":
                    case "シャイニーウィンガー":
                    case "オオクニヌシ":
                    case "メイ":
                    case "サンダルフォンα":
                    case "トパーズ":
                    case "伏姫α":
                    case "ギルガメッシュ":
                    case "ウォッカ":
                    case "フォーミュラ・アクセル":
                    case "楊貴妃":
                    case "ルビー":
                    case "レクイエム":
                        battle_typeList.add("貫通");
                        break;
                }
                break;
            case "Water":
                switch (character){
                    case "スサノオ":
                    case "ラファエル":
                    case "オーディン":
                    case "ナナミ":
                    case "ランスロット":
                    case "アテナ":
                    case "カーリー":
                    case "テキーラ":
                    case "ノブナガX":
                    case "ウンディーネ":
                    case "ロミオ":
                    case "天草四郎":
                    case "出雲":
                    case "アイリス":
                    case "関羽":
                    case "ヴェルダンディ":
                    case "ラプンツェル":
                    case "シンドバッド":
                    case "プルメリア":
                    case "パラドクス":
                    case "ベイカーズ":
                    case "媽祖":
                    case "アリババα":
                    case "ブレイブアーマー":
                    case "周瑜":
                    case "シャトル・アクセル":
                    case "ミロク":
                    case "フリーズ":
                        battle_typeList.add("反射");
                        break;
                    case "霧隠才蔵":
                    case "ダルタニャン":
                    case "ナポレオン":
                    case "カルナ":
                    case "太公望":
                    case "アヌビス":
                    case "ノンノα":
                    case "ムーα":
                    case "ノア":
                    case "ディルムッド":
                    case "アクアマリン":
                    case "ノストラダムス":
                    case "茨木童子α":
                    case "桂小五郎":
                    case "ローレライ":
                    case "グリム兄弟α":
                    case "レビィ":
                        battle_typeList.add("貫通");
                        break;
                }
                break;
            case "Wood":
                switch (character){
                    case "ハンターキング":
                    case "ヴァルキリー":
                    case "チンギスハン":
                    case "ヘラクレス":
                    case "マーリン":
                    case "ケロン":
                    case "バッハ":
                    case "デッドラビッツ":
                    case "猪八戒":
                    case "アラミス":
                    case "アポロX":
                    case "モンストクローバー":
                    case "茨木童子":
                    case "おりょう":
                    case "ベルフェゴール":
                    case "ヴィーラ":
                    case "デネブ":
                    case "武蔵坊弁慶":
                    case "グリム兄弟":
                    case "アメノウズメ":
                    case "コルセア":
                    case "アンスリウム":
                    case "天使ガブリエル":
                    case "サタンα":
                    case "シェイクスピア":
                    case "オスカー":
                    case "マモン":
                    case "ロビンフッド":
                    case "ユピテル":
                    case "太公望α":
                    case "バルムンク":
                    case "宝蔵院胤栄":
                    case "エメラルド":
                    case "鄧艾":
                    case "ビリー・ザ・キッド":
                    case "天叢雲":
                        battle_typeList.add("反射");
                        break;
                    case "ギムレット":
                    case "リボン":
                    case "蒲公英":
                    case "クーフーリン":
                    case "ナチョス":
                    case "ニーベルンゲン":
                    case "シェヘラザード":
                    case "ナイチンゲール":
                    case "伏姫":
                    case "守護ガブリエル":
                    case "コンプレックス":
                    case "西王母":
                    case "ルイス・キャロルα":
                    case "陸奥宗光":
                    case "パールヴァティ":
                    case "水仙":
                    case "スルガト":
                    case "神威α":
                        battle_typeList.add("貫通");
                        break;
                }
                break;
            case "Light":
                switch (character){
                    case "ゴットストライク":
                    case "ロイゼ":
                    case "アラジン":
                    case "ラー":
                    case "ヒカリ":
                    case "キスキルリラ":
                    case "モーツァルト":
                    case "ベルゼブブ":
                    case "モンストブライト":
                    case "安倍晴明":
                    case "ムー":
                    case "ドンキホーテ":
                    case "アーサー":
                    case "リコル":
                    case "サキュバス":
                    case "ビッグイノベーター":
                    case "清少納言":
                    case "ケラノウス":
                    case "タケミカヅチ":
                    case "ダイヤモンド":
                    case "サルタヒコ":
                    case "劉備":
                    case "ハイビスカス":
                    case "シトリン":
                    case "グラバー":
                    case "テンペスト":
                    case "芙蓉":
                    case "ドローン・アクセル":
                    case "スピカ":
                    case "カラミティ・ジェーン":
                    case "ティターニア":
                        battle_typeList.add("反射");
                        break;
                    case "ゼウス":
                    case "天国ウリエル":
                    case "地獄ウリエル":
                    case "クレオパトラ":
                    case "神威":
                    case "ジュリエット":
                    case "ヘラ":
                    case "ラウドラ":
                    case "犬塚信乃":
                    case "如意棒":
                    case "ワトソン":
                    case "メタトロンα":
                    case "ベビーアーク":
                    case "ゲイボルグ":
                    case "リボンα":
                    case "三蔵法師":
                    case "アンチテーゼ":
                    case "アロンズロッド":
                    case "那須与一":
                    case "王元姫":
                    case "ハーレーα":
                    case "クエリー":
                        battle_typeList.add("貫通");
                        break;
                }
                break;
            case "Darkness":
                switch (character){
                    case "ハーメルン":
                    case "ロキ":
                    case "エクリプス":
                    case "ジークフリート":
                    case "ハーレー":
                    case "ハーレーX":
                    case "ジャンヌダルク":
                    case "ケットシー":
                    case "ノブナガ":
                    case "ジキル&ハイド":
                    case "ポルトス":
                    case "オセロー":
                    case "源義経":
                    case "ティアラ":
                    case "ルシファー":
                    case "ローザ":
                    case "ショコラ":
                    case "アリババ":
                    case "ファントム":
                    case "アドゥブタ":
                    case "西郷隆盛":
                    case "ギャランホルン":
                    case "アレス":
                    case "レストレード":
                    case "イージス":
                    case "フィン":
                    case "クロノス":
                    case "月麗":
                    case "ベートーヴェンα":
                    case "ミネルヴァ":
                    case "イデア":
                    case "ベルスター":
                    case "司馬昭":
                    case "トール":
                    case "ケロンα":
                        battle_typeList.add("反射");
                        break;
                    case "ワールド":
                    case "サタン":
                    case "ハデス":
                    case "妲己":
                    case "アリス":
                    case "マッドハッター":
                    case "大喬小喬":
                    case "フツヌシ":
                    case "徳川家康":
                    case "孫尚香":
                    case "グングニルα":
                    case "ゴッホ":
                    case "ブリューナク":
                    case "アトゥム":
                        battle_typeList.add("貫通");
                        break;
                }
                break;
        }
    }
    public ArrayList<String> getBattle_typeList(){
        return this.battle_typeList;
    }
}
