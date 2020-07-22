package Demo1;

public class yinyong {
    int x ;
    public static void main(String[] args)
    {

        yinyong d = new yinyong();
        d.x = 5;
        show(d);
        System.out.println("x="+d.x);
    }
    public static void show(yinyong d)
    {
        d.x = 10;
    }



}
