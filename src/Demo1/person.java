package Demo1;

class PersonDemo {
    private int age;
    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
public class person {
    public static void main(String[] args) {
        PersonDemo p = new PersonDemo();
        p.setAge(30);
        System.out.println("大家好，今年我" + p.getAge() + "岁");
    }
}

