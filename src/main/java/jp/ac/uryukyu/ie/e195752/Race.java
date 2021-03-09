package jp.ac.uryukyu.ie.e195752;
//種族
import java.util.ArrayList;
public class Race {
    final private ArrayList<String> raceList = new ArrayList<>();
    public Race(String character, String attribute) {
        switch (attribute) {
            case "Fire":
                switch (character) {
                    case "ヒナタ":
                        raceList.add("ロボット族");
                        break;
                    case "アグナムートX":
                    case "アグナムート":
                    case "ブラフマー":
                    case "オオクニヌシ":
                    case "伏姫α":
                    case "ギルガメッシュ":
                    case "マルス":
                    case "プロメテウス":
                    case "ペルセウス":
                    case "オシリス":
                    case "打出の小槌":
                    case "フォルトゥナ":
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
                    case "珊瑚":
                    case "ブリュンヒルデ":
                    case "マナ":
                    case "マナ・アニマ":
                    case "ガウェイン":
                        raceList.add("聖騎士");
                        break;
                    case "真田幸村":
                    case "武田信玄":
                    case "張飛":
                    case "犬坂毛野":
                    case "足利義輝":
                    case "真田昌幸":
                    case "静御前":
                    case "岩融":
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
                    case "ニュートン":
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
                    case "アザトース":
                    case "ディヴィジョン":
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
                    case "アラウィン":
                    case "マチュ・ピチュ":
                        raceList.add("魔人");
                        break;
                    case "ナタ":
                    case "ワトソンα":
                        raceList.add("ロボット");
                        break;
                    case "アザゼル":
                    case "背徳ピストルズ":
                        raceList.add("魔王");
                        break;
                }
                break;
            case "Water":
                switch (character) {
                    case "ナナミ":
                    case "ミソラ":
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
                    case "ヤタガラス":
                    case "サラスヴァティ":
                    case "ポセイドン":
                    case "神農":
                    case "ウルズ":
                    case "メルクリウス":
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
                    case "ノア&パンドラ":
                    case "アンデルセン":
                    case "カメハメハα":
                    case "グィネヴィア":
                    case "イソップ":
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
                    case "鈴蘭":
                    case "ラベンダー":
                        raceList.add("妖精族");
                        break;
                    case "ウンディーネ":
                    case "ロミオ":
                    case "フリーズ":
                    case "モヘンジョダロ":
                        raceList.add("魔王");
                        break;
                    case "アクアマリン":
                        raceList.add("幻獣族");
                        break;
                    case "ムーα":
                    case "シリウス":
                    case "アトランティス":
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
                    case "タンザナイト":
                    case "瑠璃":
                        raceList.add("聖騎士");
                        break;
                    case "ノブナガX":
                    case "関羽":
                    case "桂小五郎":
                    case "周瑜":
                    case "佐々木小次郎":
                    case "上杉謙信":
                    case "十文字雷葉":
                        raceList.add("サムライ");
                        break;
                    case "カルナ":
                    case "パラドクス":
                    case "ノクターン":
                    case "ニャルラトホテプ":
                        raceList.add("幻妖");
                        break;
                    case "大和α":
                        raceList.add("アクシス");
                        break;
                }
                break;
            case "Wood":
                switch (character) {
                    case "コカゲ":
                        raceList.add("ロボット族");
                        break;
                    case "バルムンク":
                    case "エメラルド":
                        raceList.add("ドラゴン族");
                        break;
                    case "チンギスハン":
                    case "ナチョス":
                    case "ミョルニル":
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
                    case "トート":
                    case "楊セン":
                    case "ペルセポネ":
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
                    case "アルキメデス":
                    case "巴御前":
                    case "パスカル":
                    case "西施":
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
                    case "ユグドラシル":
                    case "ジャスミン":
                    case "トライデント":
                        raceList.add("妖精族");
                        break;
                    case "マーリン":
                    case "サタンα":
                    case "マモン":
                        raceList.add("魔王");
                        break;
                    case "アポロX":
                    case "マゼラン":
                        raceList.add("コスモ族");
                        break;
                    case "クーフーリン":
                    case "アラミス":
                    case "モンストクローバー":
                    case "オスカー":
                    case "ロビンフッド":
                    case "神威α":
                    case "ペリドット":
                        raceList.add("聖騎士");
                        break;
                    case "おりょう":
                    case "武蔵坊弁慶":
                    case "陸奥宗光":
                    case "鄧艾":
                    case "島津義弘":
                    case "豊臣秀吉":
                    case "諸葛亮":
                    case "梃子場亜流太":
                        raceList.add("サムライ");
                        break;
                    case "コルセア":
                        raceList.add("ユニオン");
                        break;
                    case "ヴィーラ":
                    case "コンプレックス":
                    case "ヨグソトース":
                    case "セレナーデ":
                        raceList.add("幻妖");
                        break;
                    case "ヤークトパンター":
                        raceList.add("アクシス");
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
                    case "ゲーテ":
                    case "モノノケ少女":
                        raceList.add("魔人");
                        break;
                    case "ゴットストライク":
                    case "ラー":
                    case "ゼウス":
                    case "ヘラ":
                    case "タケミカヅチ":
                    case "サルタヒコ":
                    case "ガネーシャ":
                    case "弁財天・進化":
                    case "弁財天・神化":
                    case "ヘイムダル":
                    case "イシュタル":
                    case "ユノー":
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
                    case "王昭君":
                    case "カメハメハ":
                    case "レンブラント":
                    case "リバティ":
                    case "物乃具姫":
                        raceList.add("亜人族");
                        break;
                    case "如意棒":
                    case "ベビーアーク":
                    case "ハーレーα":
                        raceList.add("魔族");
                        break;
                    case "天国ウリエル":
                    case "地獄ウリエル":
                    case "キスキルリラ":
                    case "ハイビスカス":
                    case "メタトロンα":
                    case "芙蓉":
                    case "ティターニア":
                    case "牡丹":
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
                    case "クエリー":
                    case "アユタヤ":
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
                    case "真珠":
                    case "ペリノア":
                    case "アーサー&ソロモン":
                    case "パーシヴァル":
                    case "ゾロ":
                    case "マルタ":
                    case "フォーミュラ・アクセルα":
                    case "ヴォーパルソード":
                        raceList.add("聖騎士");
                        break;
                    case "犬塚信乃":
                    case "劉備":
                    case "那須与一":
                    case "森蘭丸":
                        raceList.add("サムライ");
                        break;
                    case "ラウドラ":
                    case "アンチテーゼ":
                    case "アリア":
                        raceList.add("幻妖");
                        break;
                }
                break;
            case "Darkness":
                switch (character) {
                    case "月麗":
                    case "オペコ":
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
                    case "ケロンα":
                    case "TFA":
                    case "茶々":
                    case "パンドラ":
                    case "ダンテ":
                    case "猿飛佐助":
                    case "タイガーアイ":
                    case "アルセーヌ・アナーキー":
                    case "アルセーヌ・ファントム":
                    case "フランクリン":
                        raceList.add("亜人族");
                        break;
                    case "ハーレー":
                    case "ハーレーX":
                    case "孫悟空α":
                        raceList.add("魔族");
                        break;
                    case "ケットシー":
                    case "ルシファー":
                    case "ローザ":
                    case "アリス":
                    case "マッドハッター":
                    case "グングニルα":
                    case "ブリューナク":
                    case "ルシファー&カエサル":
                        raceList.add("妖精族");
                        break;
                    case "サタン":
                        raceList.add("魔王");
                        break;
                    case "エクリプス":
                    case "西郷隆盛":
                    case "徳川家康":
                    case "コロンブス":
                        raceList.add("コスモ族");
                        break;
                    case "ジークフリート":
                    case "ジャンヌダルク":
                    case "ポルトス":
                    case "アリババ":
                    case "イージス":
                    case "フィン":
                    case "フビライハン":
                    case "アロンズロッドα":
                        raceList.add("聖騎士");
                        break;
                    case "ノブナガ":
                    case "源義経":
                    case "孫尚香":
                    case "司馬昭":
                    case "大谷吉継":
                    case "源頼光":
                    case "柳生十兵衛":
                        raceList.add("サムライ");
                        break;
                    case "P-47":
                        raceList.add("ユニオン");
                        break;
                    case "アドゥブタ":
                    case "イデア":
                    case "マーチ":
                        raceList.add("幻妖");
                        break;
                    case "ねずみ小僧":
                        raceList.add("獣族");
                        break;
                }
                break;
        }
    }
    public ArrayList<String> getRaceList(){
        return this.raceList;
    }
}
