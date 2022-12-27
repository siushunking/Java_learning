public class People {
    protected String name;
    protected int age;
    protected String address;

    public People(String name, int age, String address){
        this.age = age;
        this.name = name;
        this.address = address;
    }

    public void walk(){
        System.out.println("walking.....");
    }

    public void sleep(){
        System.out.println("sleeping.....");
    }
}
