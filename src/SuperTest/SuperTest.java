package SuperTest;

//定义Person类，将Student和Worker共性抽取出来
class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        // super();
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
class Student extends Person {
    // Student类的构造方法
    Student(String name, int age) {
        // 使用super关键字调用父类构造方法，进行相应的初始化动作
        super(name, age);
    }
    public void study() {// Studnet中特有的方法
        System.out.println(this.getName() + "同学在学习");
    }
}
class Worker extends Person {
    Worker(String name, int age) {
        // 使用super关键字调用父类构造方法，进行相应的初始化动作
        super(name, age);
    }
    public void work() {// Worker 中特有的方法
        System.out.println(this.getName() + "工人在工作");
    }
}
public class SuperTest {
    public static void main(String[] args) {
        Student stu = new Student("小明",23);
        stu.study();

        Worker w = new Worker("小李",45);
        w.work();
    }
}
