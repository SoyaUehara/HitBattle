package jp.ac.uryukyu.ie.e195752;

import java.util.ArrayList;

//ラックスキル
public class Rack_Skills {
    final private ArrayList<String> rack_skillsList = new ArrayList<>();
    public Rack_Skills(String character, String attribute){
        switch (attribute){
            case "Fire":
                switch (character){
                    case "シンデレラ":
                    case "アポロ":
                    case "ナスカ":
                    case "張飛":
                    case "犬坂毛野":
                    case "ギルガメッシュ":
                    case "マルス":
                    case "真田昌幸":
                    case "ニュートン":
                    case "背徳ピストルズ":
                        rack_skillsList.add("友情コンボクリティカル");
                        break;
                    case "坂本龍馬":
                    case "ノンノ":
                    case "シュリンガーラ":
                    case "モラル":
                    case "シャイニーウィンガー":
                    case "オオクニヌシ":
                    case "トパーズ":
                    case "足利義輝":
                    case "岩融":
                    case "ペルセウス":
                    case "ガウェイン":
                        rack_skillsList.add("ガイド");
                        break;
                    case "リンツー":
                    case "ミカエル":
                    case "ブラフマー":
                    case "アトス":
                    case "卑弥呼":
                    case "ラザニー":
                    case "サラマンダー":
                    case "スキッティ":
                    case "サンダルフォンα":
                    case "ルビー":
                    case "レクイエム":
                    case "静御前":
                    case "マナ":
                    case "ヒナタ":
                    case "オシリス":
                    case "ディヴィジョン":
                    case "打出の小槌":
                    case "アザゼル":
                        rack_skillsList.add("シールド");
                        break;
                    case "アグナムート":
                    case "アグナムートX":
                    case "真田幸村":
                    case "HANZO":
                    case "ランスロットX":
                    case "ベートーヴェン":
                    case "モンストローズ":
                    case "武田信玄":
                    case "ダリア":
                    case "ガリレオ":
                    case "ワルプルギス":
                    case "ルイス・キャロル":
                    case "グングニル":
                    case "孫悟空":
                    case "テキーラα":
                    case "メイ":
                    case "伏姫α":
                    case "大和":
                    case "ウォッカ":
                    case "フォーミュラ・アクセル":
                    case "楊貴妃":
                    case "ゼフォン":
                    case "プロメテウス":
                    case "アラウィン":
                    case "珊瑚":
                    case "アザトース":
                    case "ナタ":
                    case "マチュ・ピチュ":
                    case "ワトソンα":
                    case "ブリュンヒルデ":
                    case "マナ・アニマ":
                    case "フォルトゥナ":
                        rack_skillsList.add("クリティカル");
                        break;
                }
            case "Water":
                switch (character){
                    case "ラファエル":
                    case "ノブナガX":
                    case "カルナ":
                    case "太公望":
                    case "ノア":
                    case "ディルムッド":
                    case "媽祖":
                    case "アリババα":
                    case "レビィ":
                    case "鈴蘭":
                    case "大和α":
                    case "ラベンダー":
                    case "アトランティス":
                    case "瑠璃":
                    case "神農":
                    case "十文字雷葉":
                        rack_skillsList.add("友情コンボクリティカル");
                        break;
                    case "ロミオ":
                    case "ラプンツェル":
                    case "ベイカーズ":
                    case "シャトル・アクセル":
                    case "ミロク":
                    case "ノクターン":
                    case "タンザナイト":
                    case "グィネヴィア":
                    case "イソップ":
                    case "メルクリウス":
                        rack_skillsList.add("ガイド");
                        break;
                    case "ランスロット":
                    case "アテナ":
                    case "霧隠才蔵":
                    case "ウンディーネ":
                    case "ダルタニャン":
                    case "天草四郎":
                    case "出雲":
                    case "ナポレオン":
                    case "アイリス":
                    case "関羽":
                    case "ヴェルダンディ":
                    case "シンドバッド":
                    case "パラドクス":
                    case "アクアマリン":
                    case "桂小五郎":
                    case "ローレライ":
                    case "グリム兄弟α":
                    case "周瑜":
                    case "ニャルラトホテプ":
                    case "ノア&パンドラ":
                    case "サラスヴァティ":
                    case "佐々木小次郎":
                    case "モヘンジョダロ":
                    case "ポセイドン":
                    case "シリウス":
                    case "上杉謙信":
                    case "カメハメハα":
                        rack_skillsList.add("シールド");
                        break;
                    case "スサノオ":
                    case "オーディン":
                    case "ナナミ":
                    case "カーリー":
                    case "テキーラ":
                    case "アヌビス":
                    case "プルメリア":
                    case "ノンノα":
                    case "ムーα":
                    case "ノストラダムス":
                    case "茨木童子α":
                    case "ブレイブアーマー":
                    case "フリーズ":
                    case "ヤタガラス":
                    case "アンデルセン":
                    case "ミソラ":
                    case "ウルズ":
                        rack_skillsList.add("クリティカル");
                        break;
                }
            case "Wood":
                switch (character){
                    case "アポロX":
                    case "ナイチンゲール":
                    case "アメノウズメ":
                    case "アンスリウム":
                    case "陸奥宗光":
                    case "ヨグソトース":
                    case "ミョルニル":
                    case "コカゲ":
                    case "豊臣秀吉":
                        rack_skillsList.add("友情コンボクリティカル");
                        break;
                    case "武蔵坊弁慶":
                    case "伏姫":
                    case "サタンα":
                    case "コンプレックス":
                    case "西王母":
                    case "ユピテル":
                    case "水仙":
                    case "スルガト":
                    case "天叢雲":
                    case "セレナーデ":
                    case "パスカル":
                        rack_skillsList.add("ガイド");
                        break;
                    case "ハンターキング":
                    case "ギムレット":
                    case "マーリン":
                    case "ケロン":
                    case "バッハ":
                    case "蒲公英":
                    case "猪八戒":
                    case "モンストクローバー":
                    case "ベルフェゴール":
                    case "ニーベルンゲン":
                    case "シェヘラザード":
                    case "グリム兄弟":
                    case "コルセア":
                    case "天使ガブリエル":
                    case "シェイクスピア":
                    case "オスカー":
                    case "ロビンフッド":
                    case "太公望α":
                    case "鄧艾":
                    case "ユグドラシル":
                    case "トート":
                    case "楊セン":
                    case "アルキメデス":
                    case "ジャスミン":
                    case "ペルセポネ":
                    case "マゼラン":
                    case "諸葛亮":
                    case "ヤークトパンター":
                    case "西施":
                        rack_skillsList.add("シールド");
                        break;
                    case "ヴァルキリー":
                    case "リボン":
                    case "チンギスハン":
                    case "ヘラクレス":
                    case "デッドラビッツ":
                    case "クーフーリン":
                    case "アラミス":
                    case "茨木童子":
                    case "おりょう":
                    case "ナチョス":
                    case "ヴィーラ":
                    case "デネブ":
                    case "守護ガブリエル":
                    case "マモン":
                    case "ルイス・キャロルα":
                    case "パールヴァティ":
                    case "バルムンク":
                    case "宝蔵院胤栄":
                    case "エメラルド":
                    case "ビリー・ザ・キッド":
                    case "神威α":
                    case "島津義弘":
                    case "巴御前":
                    case "ペリドット":
                    case "トライデント":
                    case "梃子場亜流太":
                        rack_skillsList.add("クリティカル");
                        break;
                }
            case "Light":
                switch (character){
                    case "クレオパトラ":
                    case "モンストブライト":
                    case "安倍晴明":
                    case "ダイヤモンド":
                    case "サルタヒコ":
                    case "劉備":
                    case "如意棒":
                    case "アンチテーゼ":
                    case "ドローン・アクセル":
                    case "王昭君":
                    case "ガネーシャ":
                    case "ヘイムダル":
                    case "ユノー":
                        rack_skillsList.add("友情コンボクリティカル");
                        break;
                    case "ロイゼ":
                    case "清少納言":
                    case "ハイビスカス":
                    case "アロンズロッド":
                    case "王元姫":
                    case "弁財天・神化":
                    case "マルタ":
                    case "森蘭丸":
                    case "ヴォーパルソード":
                    case "物乃具姫":
                    case "モノノケ少女":
                        rack_skillsList.add("ガイド");
                        break;
                    case "ラー":
                    case "天国ウリエル":
                    case "キスキルリラ":
                    case "モーツァルト":
                    case "ベルゼブブ":
                    case "リコル":
                    case "ヘラ":
                    case "ラウドラ":
                    case "サキュバス":
                    case "ビッグイノベーター":
                    case "ケラノウス":
                    case "ワトソン":
                    case "シトリン":
                    case "リボンα":
                    case "芙蓉":
                    case "スピカ":
                    case "カラミティ・ジェーン":
                    case "ティターニア":
                    case "ハーレーα":
                    case "クエリー":
                    case "真珠":
                    case "ペリノア":
                    case "アユタヤ":
                    case "アリア":
                    case "ゾロ":
                    case "リバティ":
                    case "イシュタル":
                        rack_skillsList.add("シールド");
                        break;
                    case "ゴットストライク":
                    case "アラジン":
                    case "ゼウス":
                    case "地獄ウリエル":
                    case "ヒカリ":
                    case "神威":
                    case "ジュリエット":
                    case "ムー":
                    case "ドンキホーテ":
                    case "アーサー":
                    case "タケミカヅチ":
                    case "犬塚信乃":
                    case "メタトロンα":
                    case "ベビーアーク":
                    case "ゲイボルグ":
                    case "グラバー":
                    case "テンペスト":
                    case "三蔵法師":
                    case "那須与一":
                    case "アーサー&ソロモン":
                    case "カメハメハ":
                    case "パーシヴァル":
                    case "レンブラント":
                    case "牡丹":
                    case "弁財天・進化":
                    case "ゲーテ":
                    case "フォーミュラ・アクセルα":
                        rack_skillsList.add("クリティカル");
                        break;
                }
            case "Darkness":
                switch (character){
                    case "ジャンヌダルク":
                    case "ケットシー":
                    case "アレス":
                    case "TFA":
                    case "茶々":
                    case "ルシファー&カエサル":
                    case "パンドラ":
                    case "源頼光":
                    case "ねずみ小僧":
                    case "タイガーアイ":
                        rack_skillsList.add("友情コンボクリティカル");
                        break;
                    case "ジークフリート":
                    case "ハーレー":
                    case "ノブナガ":
                    case "アドゥブタ":
                    case "ギャランホルン":
                    case "フィン":
                    case "グングニルα":
                    case "イデア":
                    case "アトゥム":
                    case "ケロンα":
                    case "オペコ":
                    case "大谷吉継":
                    case "アロンズロッドα":
                        rack_skillsList.add("ガイド");
                        break;
                    case "ワールド":
                    case "サタン":
                    case "妲己":
                    case "ポルトス":
                    case "オセロー":
                    case "ティアラ":
                    case "ルシファー":
                    case "アリババ":
                    case "ファントム":
                    case "西郷隆盛":
                    case "イージス":
                    case "クロノス":
                    case "月麗":
                    case "孫尚香":
                    case "ブリューナク":
                    case "トール":
                    case "コロンブス":
                    case "P-47":
                    case "ダンテ":
                    case "猿飛佐助":
                    case "マーチ":
                    case "アルセーヌ・ファントム":
                    case "柳生十兵衛":
                        rack_skillsList.add("シールド");
                        break;
                    case "ハーメルン":
                    case "ロキ":
                    case "エクリプス":
                    case "ハーレーX":
                    case "ハデス":
                    case "ジキル&ハイド":
                    case "源義経":
                    case "ローザ":
                    case "ショコラ":
                    case "アリス":
                    case "マッドハッター":
                    case "大喬小喬":
                    case "フツヌシ":
                    case "徳川家康":
                    case "レストレード":
                    case "ベートーヴェンα":
                    case "ミネルヴァ":
                    case "ゴッホ":
                    case "ベルスター":
                    case "司馬昭":
                    case "フビライハン":
                    case "孫悟空α":
                    case "アルセーヌ・アナーキー":
                    case "フランクリン":
                        rack_skillsList.add("クリティカル");
                        break;
                }
        }
    }
    public ArrayList<String> getRack_skillsList(){
        return this.rack_skillsList;
    }
}
