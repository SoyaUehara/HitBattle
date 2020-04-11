package jp.ac.uryukyu.ie.e195752;
//種族
import java.util.ArrayList;
public class Race {
    private ArrayList<String> raceList = new ArrayList<>();
    public Race(String character, String attribute) {
        switch (attribute) {
            case "Fire":
                switch (character) {
                    case "アグナムート":
                    case "アグナムートX":
                    case "ブラフマー":
                    case "オオクニヌシ":
                    case "伏姫α":
                    case "ギルガメッシュ":
                    case "マルス":
                        raceList.add("神");
                        break;
                    case "リンツー":
                    case "坂本龍馬":
                    case "ランスロットX":
                    case "アトス":
                    case "モンストローズ":
                    case "卑弥呼":
                    case "シャイニーウィンガー":
                    case "トパーズ":
                    case "フォーミュラ・アクセル":
                    case "ルビー":
                        raceList.add("聖騎士");
                        break;
                    case "真田幸村":
                    case "武田信玄":
                    case "張飛":
                    case "犬坂毛野":
                    case "足利義輝":
                        raceList.add("サムライ");
                        break;
                    case "ミカエル":
                    case "ダリア":
                    case "グングニル":
                    case "スキッティ":
                    case "テキーラα":
                    case "サンダルフォンα":
                    case "ウォッカ":
                    case "ゼフォン":
                        raceList.add("妖精族");
                        break;
                    case "HANZO":
                    case "ノンノ":
                    case "ベートーヴェン":
                    case "シンデレラ":
                    case "ラザニー":
                    case "ルイス・キャロル":
                    case "メイ":
                    case "楊貴妃":
                        raceList.add("亜人族");
                        break;
                    case "アポロ":
                    case "ガリレオ":
                    case "ナスカ":
                        raceList.add("コスモ族");
                        break;
                    case "シュリンガーラ":
                    case "モラル":
                    case "レクイエム":
                        raceList.add("幻妖");
                        break;
                    case "ワルプルギス":
                    case "孫悟空":
                        raceList.add("魔族");
                        break;
                    case "サラマンダー":
                        raceList.add("ドラゴン族");
                        break;
                    case "大和":
                        raceList.add("アクシス");
                        break;
                }
                break;
            case "Water":
                switch (character) {
                    case "ナナミ":
                        raceList.add("ロボット族");
                        break;
                    case "スサノオ":
                    case "オーディン":
                    case "アテナ":
                    case "カーリー":
                    case "太公望":
                    case "ヴェルダンディ":
                    case "アヌビス":
                    case "媽祖":
                    case "ミロク":
                        raceList.add("神");
                        break;
                    case "ベイカーズ":
                        raceList.add("獣族");
                        break;
                    case "霧隠才蔵":
                    case "ダルタニャン":
                    case "ラプンツェル":
                    case "ノンノα":
                    case "ノア":
                    case "ノストラダムス":
                    case "ローレライ":
                    case "グリム兄弟α":
                        raceList.add("亜人族");
                        break;
                    case "出雲":
                    case "茨木童子α":
                        raceList.add("魔族");
                        break;
                    case "ラファエル":
                    case "テキーラ":
                    case "アイリス":
                    case "プルメリア":
                        raceList.add("妖精族");
                        break;
                    case "ウンディーネ":
                    case "ロミオ":
                    case "フリーズ":
                        raceList.add("魔王");
                        break;
                    case "アクアマリン":
                        raceList.add("幻獣族");
                        break;
                    case "ムーα":
                        raceList.add("コスモ族");
                        break;
                    case "ランスロット":
                    case "天草四郎":
                    case "ナポレオン":
                    case "シンドバッド":
                    case "ディルムッド":
                    case "アリババα":
                    case "ブレイブアーマー":
                    case "シャトル・アクセル":
                    case "レビィ":
                        raceList.add("聖騎士");
                        break;
                    case "ノブナガX":
                    case "関羽":
                    case "桂小五郎":
                    case "周瑜":
                        raceList.add("サムライ");
                        break;
                    case "カルナ":
                    case "パラドクス":
                        raceList.add("幻妖");
                        break;
                }
                break;
            case "Wood":
                switch (character) {
                    case "バルムンク":
                    case "エメラルド":
                        raceList.add("ドラゴン族");
                        break;
                    case "チンギスハン":
                    case "ナチョス":
                        raceList.add("魔人");
                        break;
                    case "ハンターキング":
                    case "ヴァルキリー":
                    case "ヘラクレス":
                    case "伏姫":
                    case "アメノウズメ":
                    case "西王母":
                    case "パールヴァティ":
                    case "ユピテル":
                    case "太公望α":
                    case "天叢雲":
                        raceList.add("神");
                        break;
                    case "リボン":
                    case "ケロン":
                    case "バッハ":
                    case "デネブ":
                    case "シェヘラザード":
                    case "グリム兄弟":
                    case "ナイチンゲール":
                    case "シェイクスピア":
                    case "ルイス・キャロルα":
                    case "宝蔵院胤栄":
                    case "ビリー・ザ・キッド":
                    case "スルガト":
                        raceList.add("亜人族");
                        break;
                    case "猪八戒":
                    case "茨木童子":
                    case "ベルフェゴール":
                        raceList.add("魔族");
                        break;
                    case "ギムレット":
                    case "蒲公英":
                    case "デッドラビッツ":
                    case "ニーベルンゲン":
                    case "アンスリウム":
                    case "天使ガブリエル":
                    case "守護ガブリエル":
                    case "水仙":
                        raceList.add("妖精族");
                        break;
                    case "マーリン":
                    case "サタンα":
                    case "マモン":
                        raceList.add("魔王");
                        break;
                    case "アポロX":
                        raceList.add("コスモ族");
                        break;
                    case "クーフーリン":
                    case "アラミス":
                    case "モンストクローバー":
                    case "オスカー":
                    case "ロビンフッド":
                        raceList.add("聖騎士");
                        break;
                    case "おりょう":
                    case "武蔵坊弁慶":
                    case "陸奥宗光":
                    case "鄧艾":
                        raceList.add("サムライ");
                        break;
                    case "コルセア":
                        raceList.add("ユニオン");
                        break;
                    case "ヴィーラ":
                    case "コンプレックス":
                        raceList.add("幻妖");
                        break;
                }
                break;
            case "Light":
                switch (character) {
                    case "ヒカリ":
                    case "ワトソン":
                    case "グラバー":
                        raceList.add("ロボット族");
                        break;
                    case "安倍晴明":
                    case "ケラノウス":
                        raceList.add("魔人");
                        break;
                    case "ゴットストライク":
                    case "ラー":
                    case "ゼウス":
                    case "ヘラ":
                    case "タケミカヅチ":
                    case "サルタヒコ":
                        raceList.add("神");
                        break;
                    case "クレオパトラ":
                    case "モーツァルト":
                    case "清少納言":
                    case "リボンα":
                    case "テンペスト":
                    case "スピカ":
                    case "カラミティ・ジェーン":
                    case "王元姫":
                        raceList.add("亜人族");
                        break;
                    case "如意棒":
                    case "ベビーアーク":
                        raceList.add("魔族");
                        break;
                    case "天国ウリエル":
                    case "地獄ウリエル":
                    case "キスキルリラ":
                    case "ハイビスカス":
                    case "メタトロンα":
                    case "芙蓉":
                    case "ティターニア":
                        raceList.add("妖精族");
                        break;
                    case "ゲイボルグ":
                        raceList.add("鉱物族");
                        break;
                    case "ベルゼブブ":
                    case "ジュリエット":
                    case "サキュバス":
                        raceList.add("魔王");
                        break;
                    case "ムー":
                    case "ビッグイノベーター":
                        raceList.add("コスモ族");
                        break;
                    case "ロイゼ":
                    case "アラジン":
                    case "神威":
                    case "モンストブライト":
                    case "ドンキホーテ":
                    case "アーサー":
                    case "リコル":
                    case "ダイヤモンド":
                    case "シトリン":
                    case "三蔵法師":
                    case "アロンズロッド":
                    case "ドローン・アクセル":
                        raceList.add("聖騎士");
                        break;
                    case "犬塚信乃":
                    case "劉備":
                    case "那須与一":
                        raceList.add("サムライ");
                        break;
                    case "ラウドラ":
                    case "アンチテーゼ":
                        raceList.add("幻妖");
                        break;
                }
                break;
            case "Darkness":
                switch (character) {
                    case "月麗":
                        raceList.add("ロボット族");
                        break;
                    case "妲己":
                    case "オセロー":
                    case "ファントム":
                    case "ベルスター":
                        raceList.add("魔人");
                        break;
                    case "ワールド":
                    case "ロキ":
                    case "ハデス":
                    case "フツヌシ":
                    case "アレス":
                    case "クロノス":
                    case "ミネルヴァ":
                    case "アトゥム":
                    case "トール":
                        raceList.add("神");
                        break;
                    case "ハーメルン":
                    case "ジキル&ハイド":
                    case "ティアラ":
                    case "ショコラ":
                    case "大喬小喬":
                    case "ギャランホルン":
                    case "レストレード":
                    case "ベートーヴェンα":
                    case "ゴッホ":
                        raceList.add("亜人族");
                        break;
                    case "ハーレー":
                    case "ハーレーX":
                        raceList.add("魔族");
                        break;
                    case "ケットシー":
                    case "ルシファー":
                    case "ローザ":
                    case "アリス":
                    case "マッドハッター":
                    case "グングニルα":
                    case "ブリューナク":
                        raceList.add("妖精族");
                        break;
                    case "サタン":
                        raceList.add("魔王");
                        break;
                    case "エクリプス":
                    case "西郷隆盛":
                    case "徳川家康":
                        raceList.add("コスモ族");
                        break;
                    case "ジークフリート":
                    case "ジャンヌダルク":
                    case "ポルトス":
                    case "アリババ":
                    case "イージス":
                    case "フィン":
                        raceList.add("聖騎士");
                        break;
                    case "ノブナガ":
                    case "源義経":
                    case "孫尚香":
                    case "司馬昭":
                        raceList.add("サムライ");
                        break;
                    case "アドゥブタ":
                    case "イデア":
                        raceList.add("幻妖");
                        break;
                }
                break;
        }
    }
    public ArrayList<String> getRaceList(){
        return this.raceList;
    }
}
