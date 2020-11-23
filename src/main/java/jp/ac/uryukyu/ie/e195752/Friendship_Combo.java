package jp.ac.uryukyu.ie.e195752;

import java.util.ArrayList;

//友情コンボ
public class Friendship_Combo {
    final private ArrayList<String> friendship_comboList = new ArrayList<>();
    public Friendship_Combo(String character, String attribute){
        switch (attribute){
            case "Fire":
                switch (character){
                    case "アグナムート":
                        friendship_comboList.add("白爆発L");
                        friendship_comboList.add("超絶ホーミング6");
                        break;
                    case "アグナムートX":
                        friendship_comboList.add("白爆発EL");
                        friendship_comboList.add("超強貫通ホーミング12");
                        break;
                    case "リンツー":
                        friendship_comboList.add("超爆発");
                        friendship_comboList.add("エナジーサークルL");
                        break;
                    case "真田幸村":
                        friendship_comboList.add("超強反射拡散弾EL5");
                        friendship_comboList.add("中距離拡散弾9");
                        break;
                    case "坂本龍馬":
                        friendship_comboList.add("反射拡散弾EL3");
                        friendship_comboList.add("スパークバレット");
                        break;
                    case "ミカエル":
                        friendship_comboList.add("反射レーザーEL4");
                        friendship_comboList.add("超強メテオ");
                        break;
                    case "HANZO":
                        friendship_comboList.add("超強貫通ホーミング12");
                        friendship_comboList.add("超強斬撃");
                        break;
                    case "ランスロットX":
                        friendship_comboList.add("ワンウェイレーザーEL");
                        friendship_comboList.add("エナジーサークルL");
                        break;
                    case "ブラフマー":
                        friendship_comboList.add("超爆発");
                        friendship_comboList.add("超強貫通拡散弾EL3");
                        break;
                    case "ノンノ":
                        friendship_comboList.add("ツインワンウェイレーザーEL");
                        friendship_comboList.add("全敵メテオ");
                        break;
                    case "ベートーヴェン":
                        friendship_comboList.add("爆破拡散弾");
                        friendship_comboList.add("エナジーサークルM");
                        break;
                    case "シンデレラ":
                        friendship_comboList.add("超強貫通ホーミング8");
                        friendship_comboList.add("プラズマ");
                        break;
                    case "アトス":
                        friendship_comboList.add("ワンウェイレーザーEL");
                        friendship_comboList.add("スピードアップ");
                        break;
                    case "アポロ":
                        friendship_comboList.add("エナジーサークルL");
                        friendship_comboList.add("乱気弾");
                        break;
                    case "モンストローズ"://3315
                        friendship_comboList.add("ホライゾンレーザーEL");
                        friendship_comboList.add("エナジーハート");
                        break;
                    case "武田信玄":
                        friendship_comboList.add("超爆発");
                        friendship_comboList.add("貫通ホーミング18");
                        break;
                    case "シュリンガーラ":
                        friendship_comboList.add("超強ホーミング12");
                        friendship_comboList.add("ボムスロー");
                        break;
                    case "ダリア":
                        friendship_comboList.add("超強次元斬");
                        friendship_comboList.add("薙ぎ払い");
                        break;
                    case "卑弥呼":
                        friendship_comboList.add("十字レーザーEL");
                        friendship_comboList.add("反射クロスレーザーEL");
                        break;
                    case "ラザニー":
                        friendship_comboList.add("スクランブルレーザーM");
                        friendship_comboList.add("スターレーザーL");
                        break;
                    case "ガリレオ":
                        friendship_comboList.add("反射レーザーEL4");
                        friendship_comboList.add("反射レーザーL4");
                        break;
                    case "ナスカ":
                        friendship_comboList.add("スクランブルレーザーL");
                        friendship_comboList.add("８方向レーザーL");
                        break;
                    case "ワルプルギス":
                        friendship_comboList.add("超強毒拡散16");
                        friendship_comboList.add("全敵貫通ロックオン衝撃波3");
                        break;
                    case "張飛":
                        friendship_comboList.add("ツインバーティカルレーザーEL");
                        friendship_comboList.add("エナジーサークルL");
                        break;
                    case "サラマンダー":
                        friendship_comboList.add("フレイム");
                        friendship_comboList.add("超強ブレス");
                        break;
                    case "ルイス・キャロル":
                        friendship_comboList.add("超強貫通ホーミング12");
                        friendship_comboList.add("バラージショットガン");
                        break;
                    case "グングニル":
                        friendship_comboList.add("超絶ホーミング6");
                        friendship_comboList.add("乱気弾");
                        break;
                    case "スキッティ":
                        friendship_comboList.add("超強貫通拡散弾EL5");
                        friendship_comboList.add("ラウンドフラッシュ");
                        break;
                    case "犬坂毛野":
                        friendship_comboList.add("拡大爆破弾");
                        friendship_comboList.add("反射衝撃波6");
                        break;
                    case "モラル":
                        friendship_comboList.add("超強貫通ホーミング8");
                        friendship_comboList.add("十字炸裂弾");
                        break;
                    case "シャイニーウィンガー":
                        friendship_comboList.add("ツインダンクレーザーEL");
                        friendship_comboList.add("超強ホーミング18");
                        break;
                    case "オオクニヌシ":
                        friendship_comboList.add("扇形拡散弾10");
                        friendship_comboList.add("ヨーヨー弾");
                        break;
                    case "孫悟空"://4212
                        friendship_comboList.add("超強爆発");
                        friendship_comboList.add("スピードアップ");
                        break;
                    case "テキーラα":
                        friendship_comboList.add("トライデントレーザーEL");
                        friendship_comboList.add("中距離拡散弾9");
                        break;
                    case "メイ":
                        friendship_comboList.add("超強フレイム");
                        friendship_comboList.add("反射クロスレーザーEL");
                        break;
                    case "サンダルフォンα":
                        friendship_comboList.add("超絶ホーミング6");
                        friendship_comboList.add("追従型貫通弾");
                        break;
                    case "トパーズ":
                        friendship_comboList.add("シャイニングピラー");
                        friendship_comboList.add("回復弾");
                        break;
                    case "伏姫α":
                        friendship_comboList.add("貫通毒ロックオン衝撃波6");
                        friendship_comboList.add("衛星弾4");
                        break;
                    case "大和":
                        friendship_comboList.add("超強貫通ロックオン衝撃波6");
                        friendship_comboList.add("長薙ぎ払い");
                        break;
                    case "ギルガメッシュ":
                        friendship_comboList.add("超強爆発");
                        friendship_comboList.add("中距離拡散弾9");
                        break;
                    case "マルス":
                        friendship_comboList.add("破裂斬撃弾");
                        friendship_comboList.add("超強メテオ");
                        break;
                    case "ウォッカ":
                        friendship_comboList.add("超強貫通ホーミング12");
                        friendship_comboList.add("超強メテオ");
                        break;
                    case "フォーミュラ・アクセル":
                        friendship_comboList.add("８方向レーザーEL");
                        friendship_comboList.add("全敵ロックオン衝撃波3");
                        break;
                    case "楊貴妃"://4564
                        friendship_comboList.add("超強爆発");
                        friendship_comboList.add("超強スパークバレット");
                        break;
                    case "足利義輝":
                        friendship_comboList.add("次元斬");
                        friendship_comboList.add("電撃弾");
                        break;
                    case "ルビー":
                        friendship_comboList.add("ツインダンクレーザーEL");
                        friendship_comboList.add("超強貫通ホーミング12");
                        break;
                    case "レクイエム":
                        friendship_comboList.add("超強貫通拡散弾EL5");
                        friendship_comboList.add("SS短縮弾");
                        break;
                    case "ゼフォン"://4697
                        friendship_comboList.add("スピードアップ");
                        friendship_comboList.add("気弾");
                        break;
                    case "プロメテウス":
                        friendship_comboList.add("超強全方位ショットガン");
                        friendship_comboList.add("超強フレイム");
                        break;
                    case "アラウィン":
                        friendship_comboList.add("ウォールムービングバレット");
                        friendship_comboList.add("超強ショットガン");
                        break;
                    case "珊瑚":
                        friendship_comboList.add("反射衝撃波12");
                        friendship_comboList.add("超強貫通ロックオン衝撃波6");
                        break;
                    case "アザトース":
                        friendship_comboList.add("超強防御ダウンブラスト");
                        friendship_comboList.add("超強爆発");
                        break;
                    case "ナタ":
                        friendship_comboList.add("ウォールスルーバレット");
                        friendship_comboList.add("リバースウォールスルーバレット");
                        break;
                    case "真田昌幸":
                        friendship_comboList.add("超強電撃");
                        friendship_comboList.add("拡大爆破弾");
                        break;
                    case "静御前":
                        friendship_comboList.add("8方向レーザーEL");
                        friendship_comboList.add("中距離毒拡散弾9");
                        break;
                    case "マチュ・ピチュ":
                        friendship_comboList.add("貫通弱点ロックオン衝撃波5");
                        friendship_comboList.add("超強爆発");
                        break;
                    case "ワトソンα":
                        friendship_comboList.add("コピー");
                        friendship_comboList.add("放電");
                        break;
                    case "ブリュンヒルデ":
                        friendship_comboList.add("超落雷");
                        friendship_comboList.add("スピードアップ");
                        break;
                    case "マナ":
                        friendship_comboList.add("インボリュートスフィア・モア");
                        friendship_comboList.add("インボリュートスフィア・ナロー");
                        break;
                    case "マナ・アニマ":
                        friendship_comboList.add("超強オールレンジバレット");
                        friendship_comboList.add("超強爆破拡散弾");
                        break;
                    case "ヒナタ":
                        friendship_comboList.add("超強貫通ホーミング12");
                        friendship_comboList.add("チップソー");
                        break;
                    case "岩融":
                        friendship_comboList.add("超強中距離拡散弾9");
                        friendship_comboList.add("超絶爆発");
                        break;
                    case "ペルセウス":
                        friendship_comboList.add("白爆発EL");
                        friendship_comboList.add("友情アップ");
                        break;
                    case "オシリス":
                        friendship_comboList.add("超強貫通ホーミング18");
                        friendship_comboList.add("超強貫通毒ロックオン衝撃波6");
                        break;
                }
                break;
            case "Water":
                switch (character){
                    case "スサノオ":
                        friendship_comboList.add("ワンウェイレーザーEL");
                        friendship_comboList.add("超強次元斬");
                        break;
                    case "ラファエル":
                        friendship_comboList.add("十字レーザーEL");
                        friendship_comboList.add("ロックオン毒衝撃波6");
                        break;
                    case "オーディン":
                        friendship_comboList.add("超絶ホーミング6");
                        friendship_comboList.add("超絶ホーミング6");
                        break;
                    case "ナナミ":
                        friendship_comboList.add("超強ブレス");
                        friendship_comboList.add("中距離拡散弾9");
                        break;
                    case "ランスロット":
                        friendship_comboList.add("超強貫通ホーミング8");
                        friendship_comboList.add("スパークバレット");
                        break;
                    case "アテナ":
                        friendship_comboList.add("貫通ホーミング8");
                        friendship_comboList.add("エナジーサークルL");
                        break;
                    case "カーリー":
                        friendship_comboList.add("超強ホーミング8");
                        friendship_comboList.add("スピードアップ");
                        break;
                    case "霧隠才蔵":
                        friendship_comboList.add("リバースダンクレーザーEL");
                        friendship_comboList.add("ダンクレーザーEL");
                        break;
                    case "テキーラ":
                        friendship_comboList.add("バーティカルレーザーL");
                        friendship_comboList.add("ツインバーティカルレーザーEL");
                        break;
                    case "ノブナガX":
                        friendship_comboList.add("ダブルエナジーサークルL");
                        friendship_comboList.add("エナジーサークルL");
                        break;
                    case "ウンディーネ":
                        friendship_comboList.add("ワンウェイレーザーEL");
                        friendship_comboList.add("超強氷塊");
                        break;
                    case "ダルタニャン":
                        friendship_comboList.add("拡大爆破弾");
                        friendship_comboList.add("追従型貫通弾");
                        break;
                    case "ロミオ":
                        friendship_comboList.add("クロスレーザーEL");
                        friendship_comboList.add("反射クロスレーザーL");
                        break;
                    case "天草四郎":
                        friendship_comboList.add("リバース反射レーザーEL4");
                        friendship_comboList.add("反射レーザーEL4");
                        break;
                    case "出雲":
                        friendship_comboList.add("超強毒拡散16");
                        friendship_comboList.add("衛星弾4");
                        break;
                    case "ナポレオン":
                        friendship_comboList.add("超強爆発");
                        friendship_comboList.add("中距離拡散弾9");
                        break;
                    case "アイリス":
                        friendship_comboList.add("気弾");
                        friendship_comboList.add("四反射分裂弾");
                        break;
                    case "カルナ":
                        friendship_comboList.add("ツインダンクレーザーEL");
                        friendship_comboList.add("超強毒拡散16");
                        break;
                    case "太公望":
                        friendship_comboList.add("ランページレーザーEL");
                        friendship_comboList.add("貫通ロックオン衝撃波6");
                        break;
                    case "関羽":
                        friendship_comboList.add("超強爆発");
                        friendship_comboList.add("エナジーバースト6");
                        break;
                    case "ヴェルダンディ":
                        friendship_comboList.add("超強爆発");
                        friendship_comboList.add("反射クロスレーザーEL");
                        break;
                    case "アヌビス":
                        friendship_comboList.add("超強貫通ホーミング12");
                        friendship_comboList.add("超強防御ダウンブラスト");
                        break;
                    case "ラプンツェル":
                        friendship_comboList.add("8方向レーザーEL");
                        friendship_comboList.add("氷塊");
                        break;
                    case "シンドバッド":
                        friendship_comboList.add("スピードアップ");
                        friendship_comboList.add("追従型貫通弾");
                        break;
                    case "プルメリア":
                        friendship_comboList.add("防御アップ");
                        friendship_comboList.add("パワーフィールド");
                        break;
                    case "パラドクス":
                        friendship_comboList.add("超爆発");
                        friendship_comboList.add("ウォールスルーバレット");
                        break;
                    case "ノンノα":
                        friendship_comboList.add("全敵貫通ロックオン衝撃波3");
                        friendship_comboList.add("全敵氷塊");
                        break;
                    case "ベイカーズ":
                        friendship_comboList.add("8方向レーザーEL");
                        friendship_comboList.add("全敵毒メテオ");
                        break;
                    case "ムーα":
                        friendship_comboList.add("超強爆発");
                        friendship_comboList.add("貫通弱点ロックオン衝撃波5");
                        break;
                    case "ノア":
                        friendship_comboList.add("超強プラズマ");
                        friendship_comboList.add("スピードアップ");
                        break;
                    case "ディルムッド":
                        friendship_comboList.add("全敵ロックオンレーザーL");
                        friendship_comboList.add("トライデントレーザーL");
                        break;
                    case "媽祖":
                        friendship_comboList.add("超強貫通ホーミング18");
                        friendship_comboList.add("ソリッドバレット");
                        break;
                    case "アクアマリン":
                        friendship_comboList.add("超強スパークバレット");
                        friendship_comboList.add("防御アップ");
                        break;
                    case "ノストラダムス":
                        friendship_comboList.add("スピードアップ");
                        friendship_comboList.add("拡大爆破弾");
                        break;
                    case "アリババα":
                        friendship_comboList.add("8方向レーザーEL");
                        friendship_comboList.add("スナイプマシンガン");
                        break;
                    case "茨木童子α":
                        friendship_comboList.add("コピー");
                        friendship_comboList.add("超強全属性ホーミング25");
                        break;
                    case "桂小五郎":
                        friendship_comboList.add("全敵毒メテオ");
                        friendship_comboList.add("電撃弾");
                        break;
                    case "ローレライ":
                        friendship_comboList.add("超強貫通ホーミング18");
                        friendship_comboList.add("超氷塊");
                        break;
                    case "ブレイブアーマー":
                        friendship_comboList.add("超強爆発");
                        friendship_comboList.add("トライブパルス");
                        break;
                    case "グリム兄弟α":
                        friendship_comboList.add("超絶ホーミング6");
                        friendship_comboList.add("クロススティンガー");
                        break;
                    case "周瑜":
                        friendship_comboList.add("超強全方位ショットガン");
                        friendship_comboList.add("クロスウェーブ");
                        break;
                    case "シャトル・アクセル":
                        friendship_comboList.add("スピードアップ");
                        friendship_comboList.add("超強防御ダウンブラスト");
                        break;
                    case "ミロク":
                        friendship_comboList.add("超強電撃");
                        friendship_comboList.add("超強防御ダウンブラスト");
                        break;
                    case "フリーズ":
                        friendship_comboList.add("超氷塊");
                        friendship_comboList.add("ウォールムービングバレット");
                        break;
                    case "レビィ":
                        friendship_comboList.add("超氷塊");
                        friendship_comboList.add("追従型貫通弾");
                        break;
                    case "ヤタガラス"://4713
                        friendship_comboList.add("反射衝撃波12");
                        friendship_comboList.add("クロススティンガー");
                        break;
                    case "鈴蘭":
                        friendship_comboList.add("超強クロスウェーブ");
                        friendship_comboList.add("白爆発EL");
                        break;
                    case "ノクターン":
                        friendship_comboList.add("全敵ロックオンレーザーL");
                        friendship_comboList.add("マーキングボム");
                        break;
                    case "ニャルラトホテプ":
                        friendship_comboList.add("全敵超毒メテオ");
                        friendship_comboList.add("パワーフィールド");
                        break;
                    case "ノア&パンドラ":
                        friendship_comboList.add("エナジーバースト6");
                        friendship_comboList.add("スピードアップ");
                        break;
                    case "サラスヴァティ":
                        friendship_comboList.add("超強スパークバレット");
                        friendship_comboList.add("ラウンドフラッシュ");
                        break;
                    case "佐々木小次郎":
                        friendship_comboList.add("8方向レーザーEL");
                        friendship_comboList.add("超強貫通ロックオン衝撃波6");
                        break;
                    case "モヘンジョダロ":
                        friendship_comboList.add("ランページレーザーEL");
                        friendship_comboList.add("SS短縮弾");
                        break;
                    case "アンデルセン":
                        friendship_comboList.add("超強貫通ホーミング18");
                        friendship_comboList.add("超強爆発");
                        break;
                    case "大和α":
                        friendship_comboList.add("超強分裂貫通衝撃波3");
                        friendship_comboList.add("長薙ぎ払い");
                        break;
                    case "ポセイドン":
                        friendship_comboList.add("オールレンジバレット");
                        friendship_comboList.add("超強クロスウェーブ");
                        break;
                    case "ラベンダー":
                        friendship_comboList.add("超強リワインドブラスター");
                        friendship_comboList.add("回復弾");
                        break;
                    case "シリウス":
                        friendship_comboList.add("超強貫通ホーミング12");
                        friendship_comboList.add("超絶斬撃");
                        break;
                    case "アトランティス":
                        friendship_comboList.add("超強トライブパルス");
                        friendship_comboList.add("超氷塊");
                        break;
                    case "ミソラ":
                        friendship_comboList.add("8方向レーザーEL");
                        friendship_comboList.add("爆撃");
                        break;
                    case "上杉謙信":
                        friendship_comboList.add("トライデントダンクレーザーEL");
                        friendship_comboList.add("超強次元斬");
                        break;
                }
                break;
            case "Wood":
                switch (character){
                    case "ハンターキング":
                        friendship_comboList.add("ツインバーティカルレーザー");
                        friendship_comboList.add("超強毒拡散弾16");
                        break;
                    case "ヴァルキリー":
                        friendship_comboList.add("ツインダンクレーザーEL");
                        friendship_comboList.add("超強クロスウェーブ");
                        break;
                    case "ギムレット":
                        friendship_comboList.add("超強貫通ホーミング12");
                        friendship_comboList.add("超強貫通ホーミング8");
                        break;
                    case "リボン":
                        friendship_comboList.add("中距離拡散弾9");
                        friendship_comboList.add("スピードアップ");
                        break;
                    case "チンギスハン":
                        friendship_comboList.add("反射レーザーEL4");
                        friendship_comboList.add("プラズマ");
                        break;
                    case "ヘラクレス":
                        friendship_comboList.add("白爆発EL");
                        friendship_comboList.add("8方向レーザー");
                        break;
                    case "マーリン":
                        friendship_comboList.add("反射レーザーEL4");
                        friendship_comboList.add("メテオ");
                        break;
                    case "ケロン":
                        friendship_comboList.add("防御アップ");
                        friendship_comboList.add("気弾");
                        break;
                    case "バッハ":
                        friendship_comboList.add("超強貫通拡散弾EL5");
                        friendship_comboList.add("ショットガン");
                        break;
                    case "蒲公英":
                        friendship_comboList.add("貫通拡散弾EL3");
                        friendship_comboList.add("オールレンジバレット");
                        break;
                    case "デッドラビッツ":
                        friendship_comboList.add("超強爆発");
                        friendship_comboList.add("バラージショットガン");
                        break;
                    case "クーフーリン":
                        friendship_comboList.add("攻撃アップ");
                        friendship_comboList.add("超強貫通ホーミング12");
                        break;
                    case "猪八戒":
                        friendship_comboList.add("超強毒拡散弾16");
                        friendship_comboList.add("反射衝撃波6");
                        break;
                    case "アラミス":
                        friendship_comboList.add("超強貫通拡散弾EL5");
                        friendship_comboList.add("中距離拡散弾9");
                        break;
                    case "アポロX":
                        friendship_comboList.add("超強爆発");
                        friendship_comboList.add("ワンウェイレーザーEL");
                        break;
                    case "モンストクローバー":
                        friendship_comboList.add("フェローレーザーL");
                        friendship_comboList.add("防御ダウンブラスト");
                        break;
                    case "茨木童子":
                        friendship_comboList.add("超強爆発");
                        friendship_comboList.add("超強貫通ホーミング12");
                        break;
                    case "おりょう":
                        friendship_comboList.add("クロスレーザーEL");
                        friendship_comboList.add("スクランブルレーザーM");
                        break;
                    case "ベルフェゴール":
                        friendship_comboList.add("ワンウェイレーザーEL");
                        friendship_comboList.add("超強ホーミング12");
                        break;
                    case "ナチョス":
                        friendship_comboList.add("超強毒拡散弾16");
                        friendship_comboList.add("超強斬撃");
                        break;
                    case "ヴィーラ":
                        friendship_comboList.add("超強次元斬");
                        friendship_comboList.add("壁バウンド弾");
                        break;
                    case "デネブ":
                        friendship_comboList.add("超強爆発");
                        friendship_comboList.add("ツインダンクレーザーL4");
                        break;
                    case "ニーベルンゲン":
                        friendship_comboList.add("超強分裂貫通衝撃波3");
                        friendship_comboList.add("回復弾");
                        break;
                    case "シェヘラザード":
                        friendship_comboList.add("超強氷塊");
                        friendship_comboList.add("十字レーザーEL");
                        break;
                    case "武蔵坊弁慶":
                        friendship_comboList.add("クロスレーザーEL");
                        friendship_comboList.add("中距離拡散弾9");
                        break;
                    case "グリム兄弟":
                        friendship_comboList.add("プラズマ");
                        friendship_comboList.add("追従型貫通弾");
                        break;
                    case "ナイチンゲール":
                        friendship_comboList.add("反射クロスレーザーEL");
                        friendship_comboList.add("状態異常回復ブラスト");
                        break;
                    case "伏姫":
                        friendship_comboList.add("乱気弾");
                        friendship_comboList.add("衛星弾4");
                        break;
                    case "アメノウズメ":
                        friendship_comboList.add("超強どんぐり");
                        friendship_comboList.add("超強フレア");
                        break;
                    case "コルセア":
                        friendship_comboList.add("スピードアップ");
                        friendship_comboList.add("超強貫通ホーミング18");
                        break;
                    case "アンスリウム":
                        friendship_comboList.add("回復弾");
                        friendship_comboList.add("クロススティンガー");
                        break;
                    case "天使ガブリエル":
                        friendship_comboList.add("超強攻撃アップ");
                        friendship_comboList.add("超強電撃");
                        break;
                    case "守護ガブリエル":
                        friendship_comboList.add("十字レーザーEL");
                        friendship_comboList.add("サイドダブルエナジーサークルL");
                        break;
                    case "サタンα":
                        friendship_comboList.add("超絶ホーミング6");
                        friendship_comboList.add("超強ホーミング18");
                        break;
                    case "シェイクスピア":
                        friendship_comboList.add("超強貫通拡散弾EL5");
                        friendship_comboList.add("ヨーヨー弾");
                        break;
                    case "オスカー":
                        friendship_comboList.add("爆破拡散弾");
                        friendship_comboList.add("ダブルエナジーサークルL");
                        break;
                    case "マモン":
                        friendship_comboList.add("超強フレア");
                        friendship_comboList.add("超強防御ダウンブラスト");
                        break;
                    case "コンプレックス":
                        friendship_comboList.add("攻撃アップ");
                        friendship_comboList.add("ウォールボム");
                        break;
                    case "西王母":
                        friendship_comboList.add("エナジーサークルL");
                        friendship_comboList.add("超強貫通ホーミング12");
                        break;
                    case "ロビンフッド":
                        friendship_comboList.add("全敵貫通ロックオン衝撃波3");
                        friendship_comboList.add("超強次元斬");
                        break;
                    case "ルイス・キャロルα":
                        friendship_comboList.add("全敵毒メテオ");
                        friendship_comboList.add("反射増殖弾");
                        break;
                    case "陸奥宗光":
                        friendship_comboList.add("分裂貫通衝撃波3");
                        friendship_comboList.add("乱気弾");
                        break;
                    case "パールヴァティ":
                        friendship_comboList.add("エナジーバースト5");
                        friendship_comboList.add("超強貫通ホーミング18");
                        break;
                    case "ユピテル":
                        friendship_comboList.add("反射クロスレーザーEL");
                        friendship_comboList.add("バウンドボム");
                        break;
                    case "太公望α":
                        friendship_comboList.add("ランページレーザーEL");
                        friendship_comboList.add("ラウンドフラッシュ");
                        break;
                    case "バルムンク":
                        friendship_comboList.add("パワーフィールド");
                        friendship_comboList.add("状態異常回復ブラスト");
                        break;
                    case "水仙":
                        friendship_comboList.add("防御アップ");
                        friendship_comboList.add("ボムスロー");
                        break;
                    case "宝蔵院胤栄":
                        friendship_comboList.add("十字レーザーEL");
                        friendship_comboList.add("長薙ぎ払い");
                        break;
                    case "エメラルド":
                        friendship_comboList.add("調教貫通ロックオン衝撃波6");
                        friendship_comboList.add("十字炸裂弾");
                        break;
                    case "鄧艾":
                        friendship_comboList.add("超強爆発");
                        friendship_comboList.add("スクランブルレーザーL");
                        break;
                    case "ビリー・ザ・キッド":
                        friendship_comboList.add("跳弾");
                        friendship_comboList.add("超強貫通ホーミング12");
                        break;
                    case "スルガト"://4701
                        friendship_comboList.add("超強貫通拡散弾EL5");
                        friendship_comboList.add("超強プラズマ");
                        break;
                    case "天叢雲":
                        friendship_comboList.add("ツインバーティカルレーザーEL");
                        friendship_comboList.add("超落雷");
                        break;
                    case "神威α"://4721
                        friendship_comboList.add("超落雷");
                        friendship_comboList.add("拡大爆破弾");
                        break;
                    case "ユグドラシル":
                        friendship_comboList.add("超強トライブパルス");
                        friendship_comboList.add("超絶爆発");
                        break;
                    case "トート":
                        friendship_comboList.add("ツインダンクレーザーEL");
                        friendship_comboList.add("中距離毒拡散弾9");
                        break;
                    case "ヨグソトース":
                        friendship_comboList.add("超強スパークバレット");
                        friendship_comboList.add("チップソー");
                        break;
                    case "楊セン":
                        friendship_comboList.add("反射クロスレーザーEL");
                        friendship_comboList.add("超強次元斬");
                        break;
                    case "島津義弘":
                        friendship_comboList.add("スナイプマシンガン");
                        friendship_comboList.add("超絶爆発");
                        break;
                    case "セレナーデ":
                        friendship_comboList.add("コピー");
                        friendship_comboList.add("超強毒フレア");
                        break;
                    case "アルキメデス":
                        friendship_comboList.add("チップソー");
                        friendship_comboList.add("超強爆発");
                        break;
                    case "ミョルニル":
                        friendship_comboList.add("超強気弾");
                        friendship_comboList.add("超落雷");
                        break;
                    case "ジャスミン":
                        friendship_comboList.add("貫通弱点ロックオン衝撃波5");
                        friendship_comboList.add("超強トライブパルス");
                        break;
                    case "巴御前":
                        friendship_comboList.add("超強反射拡散弾EL5");
                        friendship_comboList.add("超強貫通ホーミング12");
                        break;
                    case "コカゲ":
                        friendship_comboList.add("トライデントレーザーEL");
                        friendship_comboList.add("超強防御ダウンブラスト");
                        break;
                    case "ペルセポネ":
                        friendship_comboList.add("サイドダブルエナジーサークルL");
                        friendship_comboList.add("スピードアップ");
                        break;
                    case "豊臣秀吉":
                        friendship_comboList.add("超強ウェーブ");
                        friendship_comboList.add("超強クロスウェーブ");
                        break;
                }
                break;
            case "Light":
                switch (character){
                    case "ゴットストライク":
                        friendship_comboList.add("8方向レーザーEL");
                        friendship_comboList.add("エナジーサークルM");
                        break;
                    case "ロイゼ":
                        friendship_comboList.add("反射レーザーL4");
                        friendship_comboList.add("三反射分裂弾");
                        break;
                    case "アラジン":
                        friendship_comboList.add("エナジーサークルM");
                        friendship_comboList.add("拡大爆破弾");
                        break;
                    case "ラー":
                        friendship_comboList.add("超強爆発");
                        friendship_comboList.add("超強貫通ホーミング12");
                        break;
                    case "ゼウス":
                        friendship_comboList.add("超強爆発");
                        friendship_comboList.add("クロスレーザーEL");
                        break;
                    case "天国ウリエル":
                        friendship_comboList.add("十字レーザーEL");
                        friendship_comboList.add("エナジーサークルM");
                        break;
                    case "地獄ウリエル":
                        friendship_comboList.add("攻撃アップ");
                        friendship_comboList.add("スピードアップ");
                        break;
                    case "クレオパトラ":
                        friendship_comboList.add("超強爆発");
                        friendship_comboList.add("超強毒拡散16");
                        break;
                    case "ヒカリ":
                        friendship_comboList.add("超強全属性ホーミング25");
                        friendship_comboList.add("全属性エナジーサークル");
                        break;
                    case "キスキルリラ":
                        friendship_comboList.add("プラズマ");
                        friendship_comboList.add("全敵メテオ");
                        break;
                    case "モーツァルト":
                        friendship_comboList.add("貫通ホーミング18");
                        friendship_comboList.add("ホーミング28");
                        break;
                    case "神威":
                        friendship_comboList.add("落雷");
                        friendship_comboList.add("拡大爆破弾");
                        break;
                    case "ベルゼブブ":
                        friendship_comboList.add("超強貫通拡散弾EL5");
                        friendship_comboList.add("超強メテオ");
                        break;
                    case "ジュリエット":
                        friendship_comboList.add("ソリッドバレット");
                        friendship_comboList.add("超強メテオ");
                        break;
                    case "モンストブライト":
                        friendship_comboList.add("超強爆発");
                        friendship_comboList.add("電撃");
                        break;
                    case "安倍晴明":
                        friendship_comboList.add("スターレーザーL");
                        friendship_comboList.add("エナジーバースト5");
                        break;
                    case "ムー":
                        friendship_comboList.add("超絶ホーミング6");
                        friendship_comboList.add("全敵毒メテオ");
                        break;
                    case "ドンキホーテ":
                        friendship_comboList.add("超強反射拡散弾EL5");
                        friendship_comboList.add("超強メテオ");
                        break;
                    case "アーサー":
                        friendship_comboList.add("ワンウェイレーザーEL");
                        friendship_comboList.add("全敵ロックオンレーザーL");
                        break;
                    case "リコル":
                        friendship_comboList.add("超強ホーミング8");
                        friendship_comboList.add("超強フレア");
                        break;
                    case "ヘラ":
                        friendship_comboList.add("白爆発EL");
                        friendship_comboList.add("クロスレーザーEL");
                        break;
                    case "ラウドラ":
                        friendship_comboList.add("拡大爆破弾");
                        friendship_comboList.add("ウォールムービングバレット");
                        break;
                    case "サキュバス":
                        friendship_comboList.add("爆破拡散弾");
                        friendship_comboList.add("中距離拡散弾9");
                        break;
                    case "ビッグイノベーター":
                        friendship_comboList.add("超強貫通ホーミング8");
                        friendship_comboList.add("ダブルエナジーサークルL");
                        break;
                    case "清少納言":
                        friendship_comboList.add("超強爆発");
                        friendship_comboList.add("クロススティンガー");
                        break;
                    case "ケラノウス":
                        friendship_comboList.add("反射クロスレーザーEL");
                        friendship_comboList.add("スターレーザーL");
                        break;
                    case "タケミカヅチ":
                        friendship_comboList.add("超強落雷");
                        friendship_comboList.add("電撃");
                        break;
                    case "ダイヤモンド":
                        friendship_comboList.add("スクランブルレーザーL");
                        friendship_comboList.add("防御アップ");
                        break;
                    case "犬塚信乃":
                        friendship_comboList.add("破裂斬撃弾");
                        friendship_comboList.add("超強防御ダウンブラスト");
                        break;
                    case "サルタヒコ":
                        friendship_comboList.add("超強貫通拡散弾EL5");
                        friendship_comboList.add("オールレンジバレット");
                        break;
                    case "劉備":
                        friendship_comboList.add("超強ホーミング18");
                        friendship_comboList.add("中距離拡散弾9");
                        break;
                    case "ハイビスカス":
                        friendship_comboList.add("気弾");
                        friendship_comboList.add("トライブパルス");
                        break;
                    case "如意棒":
                        friendship_comboList.add("超強爆発");
                        friendship_comboList.add("超強ウェーブ");
                        break;
                    case "ワトソン":
                        friendship_comboList.add("コピー");
                        friendship_comboList.add("電撃");
                        break;
                    case "メタトロンα":
                        friendship_comboList.add("スピードアップ");
                        friendship_comboList.add("バウンドボム");
                        break;
                    case "ベビーアーク"://4289
                        friendship_comboList.add("超爆発");
                        friendship_comboList.add("超強リワインドブラスター");
                        break;
                    case "シトリン":
                        friendship_comboList.add("跳弾");
                        friendship_comboList.add("壁バウンド弾");
                        break;
                    case "ゲイボルグ":
                        friendship_comboList.add("超強次元斬");
                        friendship_comboList.add("超強斬撃");
                        break;
                    case "リボンα":
                        friendship_comboList.add("オールレンジバレット");
                        friendship_comboList.add("超強ウェーブ");
                        break;
                    case "グラバー":
                        friendship_comboList.add("ツインホライゾンレーザーEL");
                        friendship_comboList.add("ツインバーティカルレーザーEL");
                        break;
                    case "テンペスト":
                        friendship_comboList.add("スピードアップ");
                        friendship_comboList.add("超落雷");
                        break;
                    case "三蔵法師":
                        friendship_comboList.add("ツイン反射レーザーL4");
                        friendship_comboList.add("シャイニングピラー");
                        break;
                    case "アンチテーゼ":
                        friendship_comboList.add("クロスウェーブ");
                        friendship_comboList.add("爆撃");
                        break;
                    case "芙蓉":
                        friendship_comboList.add("超強スパークバレット");
                        friendship_comboList.add("超強攻撃アップ");
                        break;
                    case "アロンズロッド":
                        friendship_comboList.add("超強次元斬");
                        friendship_comboList.add("超強電撃");
                        break;
                    case "ドローン・アクセル":
                        friendship_comboList.add("超強全属性ホーミング25");
                        friendship_comboList.add("超強プラズマ");
                        break;
                    case "スピカ":
                        friendship_comboList.add("オールレンジバレット");
                        friendship_comboList.add("拡大爆破弾");
                        break;
                    case "那須与一":
                        friendship_comboList.add("追従型貫通弾");
                        friendship_comboList.add("ボムスロー");
                        break;
                    case "カラミティ・ジェーン":
                        friendship_comboList.add("超強爆発");
                        friendship_comboList.add("超強ショットガン");
                        break;
                    case "王元姫":
                        friendship_comboList.add("反射クロスレーザーL");
                        friendship_comboList.add("衛星弾4");
                        break;
                    case "ティターニア":
                        friendship_comboList.add("超強ブレス");
                        friendship_comboList.add("防御アップ");
                        break;
                    case "ハーレーα":
                        friendship_comboList.add("フェローレーザーEL");
                        friendship_comboList.add("トライブパルス");
                        break;
                    case "クエリー"://4737
                        friendship_comboList.add("超強爆発");
                        friendship_comboList.add("ツイン反射レーザーEL4");
                        break;
                    case "真珠":
                        friendship_comboList.add("グリッターボール");
                        friendship_comboList.add("防御アップ");
                        break;
                    case "王昭君":
                        friendship_comboList.add("追従型貫通弾");
                        friendship_comboList.add("スピードアップ");
                        break;
                    case "ペリノア":
                        friendship_comboList.add("サイドダブルエナジーサークルL");
                        friendship_comboList.add("全敵ロックオンレーザーL");
                        break;
                    case "アーサー&ソロモン":
                        friendship_comboList.add("全敵ロックオンレーザーL");
                        friendship_comboList.add("ボムスロー");
                        break;
                    case "カメハメハ":
                        friendship_comboList.add("爆破拡散弾");
                        friendship_comboList.add("超強貫通毒ロックオン衝撃波6");
                        break;
                    case "パーシヴァル":
                        friendship_comboList.add("超強気弾");
                        friendship_comboList.add("超強拡大貫通ロックオン衝撃波");
                        break;
                    case "アユタヤ":
                        friendship_comboList.add("クロススティンガー");
                        friendship_comboList.add("スナイプマシンガン");
                        break;
                    case "レンブラント":
                        friendship_comboList.add("超絶斬撃");
                        friendship_comboList.add("スピードアップ");
                        break;
                    case "ガネーシャ":
                        friendship_comboList.add("トライデントレーザーEL");
                        friendship_comboList.add("超強爆発");
                        break;
                    case "アリア":
                        friendship_comboList.add("超絶ホーミング12");
                        friendship_comboList.add("リレーションカッター");
                        break;
                    case "牡丹":
                        friendship_comboList.add("超強気弾");
                        friendship_comboList.add("超強クロスウェーブ");
                        break;
                    case "弁財天・進化":
                        friendship_comboList.add("スピードアップ");
                        friendship_comboList.add("超強氷塊");
                        break;
                    case "弁財天・神化":
                        friendship_comboList.add("超絶ホーミング12");
                        friendship_comboList.add("超強貫通拡散弾EL5");
                        break;
                    case "ゾロ":
                        friendship_comboList.add("超強ソリッドバレット");
                        friendship_comboList.add("超強爆発");
                        break;
                    case "マルタ":
                        friendship_comboList.add("超絶貫通拡散弾EL3");
                        friendship_comboList.add("全敵超落雷");
                        break;
                    case "森蘭丸":
                        friendship_comboList.add("超強全方位ショットガン");
                        friendship_comboList.add("超絶爆発");
                        break;
                }
                break;
            case "Darkness":
                switch (character){
                    case "ワールド":
                        friendship_comboList.add("超強ホーミング18");
                        friendship_comboList.add("扇型拡散弾10");
                        break;
                    case "ハーメルン":
                        friendship_comboList.add("超強爆発");
                        friendship_comboList.add("8方向レーザーL");
                        break;
                    case "ロキ":
                        friendship_comboList.add("超爆発");
                        friendship_comboList.add("ワンウェイレーザーEL");
                        break;
                    case "エクリプス":
                        friendship_comboList.add("全敵ロックオン衝撃波3");
                        friendship_comboList.add("スピードアップ");
                        break;
                    case "サタン":
                        friendship_comboList.add("超強毒拡散16");
                        friendship_comboList.add("防御アップ");
                        break;
                    case "ジークフリート":
                        friendship_comboList.add("ツインバーティカルレーザーEL");
                        friendship_comboList.add("超絶ホーミング6");
                        break;
                    case "ハーレー":
                        friendship_comboList.add("超爆発");
                        friendship_comboList.add("弱点ロックオン衝撃波5");
                        break;
                    case "ハーレーX":
                        friendship_comboList.add("8方向レーザーL");
                        friendship_comboList.add("フレア");
                        break;
                    case "ハデス":
                        friendship_comboList.add("超強ホーミング8");
                        friendship_comboList.add("ホーミング28");
                        break;
                    case "ジャンヌダルク":
                        friendship_comboList.add("エナジーサークルL");
                        friendship_comboList.add("攻撃アップ");
                        break;
                    case "ケットシー":
                        friendship_comboList.add("超強ホーミング12");
                        friendship_comboList.add("超強ホーミング8");
                        break;
                    case "ノブナガ":
                        friendship_comboList.add("超強次元斬");
                        friendship_comboList.add("超強斬撃");
                        break;
                    case "妲己":
                        friendship_comboList.add("ランページレーザーEL");
                        friendship_comboList.add("全敵氷塊");
                        break;
                    case "ジキル&ハイド":
                        friendship_comboList.add("短距離拡散弾9");
                        friendship_comboList.add("四反射分裂弾");
                        break;
                    case "ポルトス":
                        friendship_comboList.add("超強ホーミング12");
                        friendship_comboList.add("超強ホーミング8");
                        break;
                    case "オセロー":
                        friendship_comboList.add("白爆発EL");
                        friendship_comboList.add("ラウンドフラッシュ");
                        break;
                    case "源義経":
                        friendship_comboList.add("超強爆発");
                        friendship_comboList.add("長薙ぎ払い");
                        break;
                    case "ティアラ":
                        friendship_comboList.add("防御アップ");
                        friendship_comboList.add("超強斬撃");
                        break;
                    case "ルシファー":
                        friendship_comboList.add("ダブルエナジーサークルL");
                        friendship_comboList.add("防御ダウンブラスト");
                        break;
                    case "ローザ":
                        friendship_comboList.add("超強貫通拡散弾EL5");
                        friendship_comboList.add("クロスウェーブ");
                        break;
                    case "ショコラ":
                        friendship_comboList.add("拡大貫通ロックオン衝撃波");
                        friendship_comboList.add("全敵落雷");
                        break;
                    case "アリス":
                        friendship_comboList.add("超強貫通ホーミング18");
                        friendship_comboList.add("バラージショットガン");
                        break;
                    case "アリババ":
                        friendship_comboList.add("バラージショットガン");
                        friendship_comboList.add("エナジーサークルL");
                        break;
                    case "ファントム":
                        friendship_comboList.add("ツインホライゾンレーザーEL");
                        friendship_comboList.add("ツインバーティカルレーザーEL");
                        break;
                    case "マッドハッター":
                        friendship_comboList.add("拡大爆破弾");
                        friendship_comboList.add("ボムスロー");
                        break;
                    case "アドゥブタ":
                        friendship_comboList.add("三反射分裂弾");
                        friendship_comboList.add("チップソー");
                        break;
                    case "西郷隆盛":
                        friendship_comboList.add("超強メテオ");
                        friendship_comboList.add("インボリュートスフィア");
                        break;
                    case "大喬小喬":
                        friendship_comboList.add("超強貫通ホーミング8");
                        friendship_comboList.add("調教貫通拡散弾EL5");
                        break;
                    case "ギャランホルン":
                        friendship_comboList.add("超強メテオ");
                        friendship_comboList.add("回復弾");
                        break;
                    case "フツヌシ":
                        friendship_comboList.add("超強ブレス");
                        friendship_comboList.add("超強斬撃");
                        break;
                    case "アレス":
                        friendship_comboList.add("貫通毒ロックオン衝撃波6");
                        friendship_comboList.add("8方向レーザーEL");
                        break;
                    case "徳川家康":
                        friendship_comboList.add("超強貫通ホーミング12");
                        friendship_comboList.add("超強貫通ホーミング8");
                        break;
                    case "レストレード":
                        friendship_comboList.add("拡大爆破弾");
                        friendship_comboList.add("反射増殖弾");
                        break;
                    case "イージス":
                        friendship_comboList.add("中距離毒拡散弾9");
                        friendship_comboList.add("超強貫通ホーミング12");
                        break;
                    case "フィン":
                        friendship_comboList.add("ランページレーザーEL");
                        friendship_comboList.add("超強次元斬");
                        break;
                    case "クロノス":
                        friendship_comboList.add("ツインバーティカルレーザーEL");
                        friendship_comboList.add("クロスレーザーEL");
                        break;
                    case "月麗":
                        friendship_comboList.add("調教貫通拡散弾EL5");
                        friendship_comboList.add("超強ショットガン");
                        break;
                    case "孫尚香":
                        friendship_comboList.add("トライデントレーザーL");
                        friendship_comboList.add("爆破拡散弾");
                        break;
                    case "ベートーヴェンα":
                        friendship_comboList.add("超強メテオ");
                        friendship_comboList.add("超メテオ");
                        break;
                    case "ミネルヴァ":
                        friendship_comboList.add("中距離拡散弾9");
                        friendship_comboList.add("気弾");
                        break;
                    case "グングニルα":
                        friendship_comboList.add("スピードアップ");
                        friendship_comboList.add("追撃貫通弾");
                        break;
                    case "ゴッホ":
                        friendship_comboList.add("跳弾");
                        friendship_comboList.add("気弾");
                        break;
                    case "イデア":
                        friendship_comboList.add("気弾");
                        friendship_comboList.add("グリッターボール");
                        break;
                    case "ブリューナク":
                        friendship_comboList.add("超強貫通ホーミング18");
                        friendship_comboList.add("超強ショットガン");
                        break;
                    case "アトゥム":
                        friendship_comboList.add("超強爆発");
                        friendship_comboList.add("スピードアップ");
                        break;
                    case "ベルスター":
                        friendship_comboList.add("超強リワインドブラスター");
                        friendship_comboList.add("中距離拡散弾9");
                        break;
                    case "司馬昭":
                        friendship_comboList.add("超強反射拡散弾EL5");
                        friendship_comboList.add("バウンドボム");
                        break;
                    case "トール":
                        friendship_comboList.add("ワンウェイレーザーEL");
                        friendship_comboList.add("超落雷");
                        break;
                    case "ケロンα"://4725
                        friendship_comboList.add("防御アップ");
                        friendship_comboList.add("スピードアップ");
                        break;
                    case "TFA":
                        friendship_comboList.add("スクランブルレーザーL");
                        friendship_comboList.add("超強爆発");
                        break;
                    case "フビライハン":
                        friendship_comboList.add("トライデントレーザーL");
                        friendship_comboList.add("超強貫通ロックオン衝撃波6");
                        break;
                    case "オペコ":
                        friendship_comboList.add("超強プラズマ");
                        friendship_comboList.add("超強爆発");
                        break;
                    case "茶々":
                        friendship_comboList.add("中距離拡散弾9");
                        friendship_comboList.add("反射衝撃波12");
                        break;
                    case "ルシファー&カエサル":
                        friendship_comboList.add("クロス炸裂弾");
                        friendship_comboList.add("超強防御ダウンブラスト");
                        break;
                    case "大谷吉継":
                        friendship_comboList.add("超強スパークバレット");
                        friendship_comboList.add("超強爆発");
                        break;
                    case "パンドラ":
                        friendship_comboList.add("3方向追従型貫通弾");
                        friendship_comboList.add("エナジーバースト6");
                        break;
                    case "コロンブス":
                        friendship_comboList.add("超強ブレス");
                        friendship_comboList.add("超強全方位ショットガン");
                        break;
                    case "孫悟空α":
                        friendship_comboList.add("スピードアップ");
                        friendship_comboList.add("拡大爆破弾");
                        break;
                    case "P-47":
                        friendship_comboList.add("超強バラージショットガン");
                        friendship_comboList.add("超強フレア");
                        break;
                    case "ダンテ":
                        friendship_comboList.add("超強フレア");
                        friendship_comboList.add("超強電撃");
                        break;
                    case "猿飛佐助":
                        friendship_comboList.add("全敵貫通ロックオン衝撃波3");
                        friendship_comboList.add("ブーメラン");
                        break;
                    case "源頼光":
                        friendship_comboList.add("超絶ホーミング12");
                        friendship_comboList.add("シャイニングピラー");
                        break;
                }
                break;
        }
    }
    public ArrayList<String> getFriendship_comboList(){
        return this.friendship_comboList;
    }
}
