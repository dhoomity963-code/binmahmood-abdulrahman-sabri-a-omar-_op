public class Main {
    public static void main(String[] args){
        Person p1 = new Person("ali", "P001");
        Person p2 = new Lecturer("abdulrahman", "L001");
        Person p3 = new Student("Ahmed", "S001");

        p1.introduce();
        p2.introduce();
        p3.introduce();
    }
}