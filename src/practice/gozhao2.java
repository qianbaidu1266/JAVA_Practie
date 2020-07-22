package practice;



public class gozhao2{

    public static void main(String[] args) {
        //有参构造
        people p1 = new people("果果",20);
        //p1 = new Person("花花",23);	修改属性值，但同时也将原对象变成了垃圾。
        System.out.println(p1.getName() + ":" +p1.getAge());

        //空参构造
        people p2 = new people();
        p1.setName("夏天");
        //p1.setName("秋天");  修改了属性值，重新赋值。
        p1.setAge(26);
        System.out.println(p1.getName() + ":" +p1.getAge());

    }

}

class people{
    private String name;
    private int age;

    //空参构造
    public people() {

    }

    //有参构造
    public people(String name,int age) {
        this.name = name;
        this.age = age;
    }

    //setXxx()方法设置name
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    //setXxx()方法设置age
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}
