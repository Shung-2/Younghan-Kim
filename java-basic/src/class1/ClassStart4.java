package class1;

public class ClassStart4 {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.name = "김자일";
        student1.age = 15;
        student1.grade = 30;

        Student student2 = new Student();
        student2.name = "이거치";
        student2.age = 33;
        student2.grade = 45;

        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;

        System.out.println(students[0].name + students[0].age + students[0].grade);
        System.out.println(students[1].name + students[1].age + students[0].grade);
    }
}
