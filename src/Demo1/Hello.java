package Demo1;

public class Hello {
    int x ;
    public static void main(String[] args)
    {

        Hello d = new Hello();
        d.x = 5;
        show(d);
        System.out.println("x="+d.x);
    }
    public static void show(Hello d)
    {
        d.x = 6;
    }

}
