public class Duck extends Menu implements Swimable,Eatable{

    public Duck(String name, int age) {
        super(name, age);
    }

    public Duck() {
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
