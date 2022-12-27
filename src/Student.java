public class Student extends People{
    private String Subject;

    // public Student(String name, int age, String address, String subject){
    //     super(name, age, address);
    //     this.Subject = subject;
    // } 

      public Student(String subject){
        super.walk();
        this.Subject = subject;
    } 

    // @Override
    // public void walk(){
    //     System.out.println("123");
    // }

}
