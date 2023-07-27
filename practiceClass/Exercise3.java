package practice.practiceClass;

class Dog
{
    private String  Name;
    private int     Age;

    public void SetName( String nm )
    {
        Name = nm;
    }

    public void SetAge( int ag )
    {
        Age = ag;
    }

    public void ShowProfile()
    {
        System.out.println( "名前は、" + Name + "、" + Age + "歳です。" );
    }
}

public class Exercise3
{
    public static void main( String[] args )
    {
        Dog Dog1 = new Dog();
        Dog Dog2 = new Dog();

        Dog1.SetName( "ぽち" );
        Dog1.SetAge( 3 );
        Dog2.SetName( "ジョン" );
        Dog2.SetAge( 5 );
        Dog1.ShowProfile();
        Dog2.ShowProfile();
    }
}