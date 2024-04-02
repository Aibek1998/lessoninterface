public class Shark extends Menu implements Swimable,Eatable{
    public Shark() {
        super();
    }

    public Shark(String name, int age) {
        super(name, age);
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
