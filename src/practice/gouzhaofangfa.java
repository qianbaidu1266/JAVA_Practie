package practice;

class Person {
    private int age;
    private String name;

    // 对外提供设置成员变量的方法
    public void setAge(int a) {
        // 由于是设置成员变量的值，这里可以加入数据的验证
        if (a < 0 || a > 130) {
            System.out.println(a + "不符合年龄的数据范围");
            return;
        }
        age = a;
    }

    // 对外提供访问成员变量的方法
    public int  getAge() {
        System.out.println(age);
        return age;
    }

    public void setName(String n)
    {
        name=n;
    }

    public String getName()
    {
        System.out.println(name);
        return name;
    }

    //public int age;
    //public String name;

    Person() {
    }
    Person(String nm) {
        name = nm;
    }
    Person(String nm, int a) {
        this(nm);
        age = a;
    }

}


public class gouzhaofangfa {
    public static void main(String[] args) {
        Person p = new Person("张三", 23);
        //System.out.println(p.name);
        //System.out.println(p.age);
        p.setAge(25);
        p.getAge();

        p.setName("小明");
        p.getName();

    }
}




