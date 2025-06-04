class Student {
    String Name = "Sajid";
    int Roll = 784690;
    float Mark = 85.5f;
    void Display() {
        System.out.println("Roll is: " + Roll);
        System.out.println("Mark is: " + Mark);
    }
}
class Exam extends Student {
    String Name = "Sajid Hossen";
    @Override
    void Display() {
        System.out.println("Name is: " + Name);
        super.Display();
    }
}
public class Main {
    public static void main(String[] args) {
        Exam Exam = new Exam();
        Exam.Display();
    }
}




