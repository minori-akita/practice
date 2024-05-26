package practice.practicePerson;

public class Person {
    String name;
    int age;
    String gender;
    int height;

    public Person(String name, int age, String gender, int height) {
        this.name = name;
        this.age = 3;
        this.gender = gender;
        this.height = height;
        System.out.println(name + "を生成しました");
    }

    public void introduce() {
        System.out.println("Hello, my name is" + name + "and I'm" + age + "years old.");
    }

    public void run(int meter) {
        System.out.println(name + "は" + meter + "m走った。");

    }

    public void ageintroduce(int age) {
       this.age = this.age + age;
       System.out.println(age + "歳年を取った。");
    }
}

// ・Personクラスのフィールドを増やす、性別と身長　◯
// ・Personクラスのコンストラクタを増やす　◯
// ・メソッドを増やす、属性と行動
//     パラメータがあるメソッドを増やす
//         年齢を増やすメソッド
//             パラメータに新しい年齢を渡してフィールドに設定
//     戻り値のあるメソッドを増やす
//         年齢を取得するメソッド
//     public以外のメソッドを増やす
// ・MainとPersonを別ファイルで定義して動かす　◯
// ・増やしたものを使う