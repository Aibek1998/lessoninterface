public class Turtle extends Menu implements Swimable,Eatable{
    public Turtle(String name, int age) {
        super(name, age);
    }

    public Turtle() {
    }

    @Override
    public void eat() {

    }

    @Override
    public void speed() {

    }

    @Override
    public String toString() {
        return "name : " + name + "\n" +
                "age : " + age ;
    }
}
