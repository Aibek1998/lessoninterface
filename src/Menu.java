public class Menu {
    String name;
    int age;

    public Menu(String name, int age) {
        this.name = name;
        this.age = age;
    }

   public Menu(){

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

    @Override
    public String toString() {
        return
                "name : " + name + "\n" +
                "age : " + age ;
    }
}
