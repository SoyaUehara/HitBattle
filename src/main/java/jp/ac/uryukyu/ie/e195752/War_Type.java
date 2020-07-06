package jp.ac.uryukyu.ie.e195752;
//戦型
import java.util.ArrayList;
public class War_Type {
    private ArrayList<String> war_typeList = new ArrayList<>();
    public War_Type(String character, String attribute){
        switch (attribute){
            case "Fire":
                switch (character){
                    case "坂本龍馬":
                    case "ミカエル":
                    case "ランスロットX":
                    case "ブラフマー":
                    case "ベートーヴェン":
                    case "アトス":
                    case "アポロ":
                    case "シュリンガーラ":
                    case "ダリア":
                    case "ワルプルギス":
                    case "サラマンダー":
                    case "ルイス・キャロル":
                    case "グングニル":
                    case "モラル":
                    case "シャイニーウィンガー":
                    case "オオクニヌシ":
                    case "孫悟空":
                    case "テキーラα":
                    case "メイ":
                    case "大和":
                    case "楊貴妃":
                    case "プロメテウス":
                    case "アラウィン":
                    case "珊瑚":
                    case "静御前":
                        war_typeList.add("バランス型");
                        break;
                    case "アグナムート":
                    case "リンツー":
                    case "ギルガメッシュ":
                        war_typeList.add("パワー型");
                        break;
                    case "アグナムートX":
                    case "真田幸村":
                    case "HANZO":
                    case "シンデレラ":
                    case "モンストローズ":
                    case "卑弥呼":
                    case "ラザニー":
                    case "ナスカ":
                    case "張飛":
                    case "トパーズ":
                    case "マルス":
                    case "フォーミュラ・アクセル":
                    case "ゼフォン":
                    case "アザトース":
                    case "ナタ":
                        war_typeList.add("スピード型");
                        break;
                    case "ノンノ":
                    case "武田信玄":
                    case "ガリレオ":
                    case "スキッティ":
                    case "犬坂毛野":
                    case "サンダルフォンα":
                    case "伏姫α":
                    case "ウォッカ":
                    case "足利義輝":
                    case "ルビー":
                    case "レクイエム":
                    case "真田昌幸":
                        war_typeList.add("砲撃型");
                        break;
                }
                break;
            case "Water":
                switch (character){
                    case "ラファエル":
                    case "ランスロット":
                    case "アテナ":
                    case "カーリー":
                    case "テキーラ":
                    case "ノブナガX":
                    case "ダルタニャン":
                    case "天草四郎":
                    case "出雲":
                    case "ナポレオン":
                    case "カルナ":
                    case "太公望":
                    case "関羽":
                    case "シンドバッド":
                    case "プルメリア":
                    case "パラドクス":
                    case "ノンノα":
                    case "ノア":
                    case "媽祖":
                    case "アクアマリン":
                    case "ノストラダムス":
                    case "アリババα":
                    case "ブレイブアーマー":
                    case "ミロク":
                    case "レビィ":
                    case "ヤタガラス":
                    case "ニャルラトホテプ":
                    case"ノア&パンドラ":
                        war_typeList.add("バランス型");
                        break;
                    case "オーディン":
                    case "ムーα":
                    case "茨木童子α":
                    case "ノクターン":
                        war_typeList.add("パワー型");
                        break;
                    case "スサノオ":
                    case "ナナミ":
                    case "アヌビス":
                    case "ベイカーズ":
                    case "ディルムッド":
                    case "桂小五郎":
                    case "シャトル・アクセル":
                        war_typeList.add("スピード型");
                        break;
                    case "霧隠才蔵":
                    case "ウンディーネ":
                    case "ロミオ":
                    case "アイリス":
                    case "ヴェルダンディ":
                    case "ラプンツェル":
                    case "ローレライ":
                    case "グリム兄弟α":
                    case "周瑜":
                    case "フリーズ":
                    case "サラスヴァティ":
                        war_typeList.add("砲撃型");
                        break;
                }
                break;
            case "Wood":
                switch (character){
                    case "ヴァルキリー":
                    case "リボン":
                    case "ケロン":
                    case "バッハ":
                    case "蒲公英":
                    case "デッドラビッツ":
                    case "クーフーリン":
                    case "猪八戒":
                    case "アポロX":
                    case "茨木童子":
                    case "おりょう":
                    case "ベルフェゴール":
                    case "ヴィーラ":
                    case "デネブ":
                    case "ニーベルンゲン":
                    case "武蔵坊弁慶":
                    case "ナイチンゲール":
                    case "アメノウズメ":
                    case "サタンα":
                    case "シェイクスピア":
                    case "西王母":
                    case "ロビンフッド":
                    case "ルイス・キャロルα":
                    case "パールヴァティ":
                    case "太公望α":
                    case "バルムンク":
                    case "水仙":
                    case "スルガト":
                    case "神威α":
                    case "ユグドラシル":
                    case "楊セン":
                        war_typeList.add("バランス型");
                        break;
                    case "ヘラクレス":
                    case "伏姫":
                    case "アンスリウム":
                    case "オスカー":
                    case "マモン":
                    case "鄧艾":
                    case "ビリー・ザ・キッド":
                    case "天叢雲":
                    case "ヨグソトース":
                    case "島津義弘":
                        war_typeList.add("パワー型");
                        break;
                    case "ギムレット":
                    case "チンギスハン":
                    case "アラミス":
                    case "ナチョス":
                    case "コルセア":
                    case "守護ガブリエル":
                    case "コンプレックス":
                    case "エメラルド":
                        war_typeList.add("スピード型");
                        break;
                    case "ハンターキング":
                    case "マーリン":
                    case "モンストクローバー":
                    case "シェヘラザード":
                    case "グリム兄弟":
                    case "天使ガブリエル":
                    case "陸奥宗光":
                    case "ユピテル":
                    case "宝蔵院胤栄":
                    case "トート":
                        war_typeList.add("砲撃型");
                        break;
                }
                break;
            case "Light":
                switch (character){
                    case "ゴットストライク":
                    case "ロイゼ":
                    case "アラジン":
                    case "ラー":
                    case "ゼウス":
                    case "天国ウリエル":
                    case "地獄ウリエル":
                    case "クレオパトラ":
                    case "神威":
                    case "安倍晴明":
                    case "ドンキホーテ":
                    case "アーサー":
                    case "ヘラ":
                    case "ケラノウス":
                    case "ダイヤモンド":
                    case "劉備":
                    case "ワトソン":
                    case "メタトロンα":
                    case "テンペスト":
                    case "芙蓉":
                    case "アロンズロッド":
                    case "スピカ":
                    case "那須与一":
                    case "カラミティ・ジェーン":
                    case "アーサー&ソロモン":
                        war_typeList.add("バランス型");
                        break;
                    case "ムー":
                    case "ラウドラ":
                    case "ビッグイノベーター":
                    case "タケミカヅチ":
                    case "如意棒":
                    case "グラバー":
                    case "アンチテーゼ":
                        war_typeList.add("パワー型");
                        break;
                    case "ヒカリ":
                    case "ベルゼブブ":
                    case "モンストブライト":
                    case "清少納言":
                    case "犬塚信乃":
                    case "サルタヒコ":
                    case "三蔵法師":
                    case "カメハメハ":
                        war_typeList.add("スピード型");
                        break;
                    case "キスキルリラ":
                    case "モーツァルト":
                    case "ジュリエット":
                    case "リコル":
                    case "サキュバス":
                    case "ハイビスカス":
                    case "ベビーアーク":
                    case "シトリン":
                    case "ゲイボルグ":
                    case "リボンα":
                    case "ドローン・アクセル":
                    case "王元姫":
                    case "ティターニア":
                    case "ハーレーα":
                    case "クエリー":
                    case "真珠":
                    case "王昭君":
                    case "ペリノア":
                        war_typeList.add("砲撃型");
                        break;
                }
                break;
            case "Darkness":
                switch (character){
                    case "ワールド":
                    case "ジークフリート":
                    case "ハデス":
                    case "ケットシー":
                    case "ノブナガ":
                    case "妲己":
                    case "ポルトス":
                    case "ティアラ":
                    case "ローザ":
                    case "ショコラ":
                    case "アリス":
                    case "ファントム":
                    case "マッドハッター":
                    case "アドゥブタ":
                    case "イージス":
                    case "フィン":
                    case "クロノス":
                    case "ベートーヴェンα":
                    case "ミネルヴァ":
                    case "グングニルα":
                    case "ゴッホ":
                    case "ブリューナク":
                    case "司馬昭":
                    case "トール":
                    case "ケロンα":
                    case "大谷吉継":
                        war_typeList.add("バランス型");
                        break;
                    case "エクリプス":
                    case "サタン":
                    case "ハーレー":
                    case "ハーレーX":
                    case "オセロー":
                    case "西郷隆盛":
                    case "ベルスター":
                        war_typeList.add("パワー型");
                        break;
                    case "ジキル&ハイド":
                    case "源義経":
                    case "大喬小喬":
                    case "ギャランホルン":
                    case "アレス":
                    case "徳川家康":
                    case "イデア":
                    case "アトゥム":
                    case "オペコ":
                        war_typeList.add("スピード型");
                        break;
                    case "ハーメルン":
                    case "ロキ":
                    case "ジャンヌダルク":
                    case "ルシファー":
                    case "アリババ":
                    case "フツヌシ":
                    case "レストレード":
                    case "月麗":
                    case "孫尚香":
                    case "TFA":
                    case "フビライハン":
                    case "茶々":
                    case "ルシファー&カエサル":
                        war_typeList.add("砲撃型");
                        break;
                }
                break;
        }
    }
    public ArrayList<String> getWar_typeList(){
        return this.war_typeList;
    }
}
