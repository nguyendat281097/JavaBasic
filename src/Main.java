import lesson.classandobject.Student;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Student a = new Student("Nguyễn Văn A", 22, "DH20DT");
        Student b = new Student();
        b.setAge(33);
        Student c = new Student("Nguyễn Văn C", 25);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}