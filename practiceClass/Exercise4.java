package practice.practiceClass;

class Dog
{
    private String  Name;
    private int     Age;
    private String  Kind;

    public Dog( String kd )
    {
        Kind = kd;
    }

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
        System.out.println(
            Kind + "で名前は、" + Name + "、" + Age + "歳です。" );
    }
}

public class Exercise4
{
    public static void main( String[] args )
    {
        Dog MyDog = new Dog( "秋田犬" );

        MyDog.SetName( "ぽち" );
        MyDog.SetAge( 3 );
        MyDog.ShowProfile();
    }
}