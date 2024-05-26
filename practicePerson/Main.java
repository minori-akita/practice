package practice.practicePerson;

public class Main {
    public static void main(String[] args) {
        int ttt = 34;
        Person person1 = new Person("Alice", 25, "女", 153);
        Person person2 = new Person("Bob", 30, "男", 173);

        person1.introduce();
        person2.introduce();

        person1.run(50);
        person2.run(100);

        person1.ageintroduce(2);
        person1.introduce();

        person1.ageintroduce(5);
        person1.introduce();

    }
}

// ・Personクラスのフィールドを増やす、性別と身長　◯
// ・Personクラスのコンストラクタを増やす　◯
// ・メソッドを増やす、属性と行動　◯
//     パラメータがあるメソッドを増やす　◯
//         年齢を増やすメソッド　◯
//             パラメータに新しい年齢を渡してフィールドに設定　◯
//     戻り値のあるメソッドを増やす
//         年齢を取得するメソッド
//     public以外のメソッドを増やす
// ・MainとPersonを別ファイルで定義して動かす　◯
// ・増やしたものを使う
