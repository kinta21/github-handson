import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) {

        System.out.println("Tシャツ　在庫確認システム");

        Map<Integer, String> tshirtMap1 = new HashMap<>();
        tshirtMap1.put(1, "Sサイズ。在庫あり。");
        tshirtMap1.put(2, "Mサイズ。在庫なし。");
        tshirtMap1.put(3, "Lサイズ。在庫あり。");

        System.out.println(tshirtMap1.get(1));
        System.out.println(tshirtMap1.get(2));
        System.out.println(tshirtMap1.get(3));

        for (Entry<Integer, String> entry : tshirtMap1.entrySet()) {
            tshirtMap1.put(entry.getKey(), entry.getValue());

            System.out.println("管理番号:" + entry.getKey() + "　　在庫状況:" + entry.getValue());}
            Map<Integer, String> tshirtMap2 = null;

        try {
            System.out.println("管理番号を入力してください。");
            System.out.println(tshirtMap2.get(5));

        } catch (NullPointerException e) {
            System.out.println("管理番号が確認できません。");
        }
    }
}
