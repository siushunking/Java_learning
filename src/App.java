public class App {
    public static void main(String[] args) throws Exception {
        char lastName = 'R';
        System.out.println(lastName);

        String firstName = "IVAN";
        System.out.println(firstName);
        System.out.println("Where start? " + firstName.charAt(1));
        System.out.println(firstName.indexOf("AN"));

        String age = "25";
        System.out.println("convert string to number:" + Integer.parseInt(age));


        System.out.println("Hello, World!");
    }
}
