public class Student extends Person {

    private String name;
    private int age;
    private int[] marks;
    private int classCount;

    Student(String name, int age, int classCount, int[] marks){
        super(name, age);
        this.name = name;
        this.age = age;
        this.classCount = classCount;
        this.marks = new int[classCount];

        for (int i = 0; i < classCount; i++) 
            this.marks[i] = marks[i];
        
    }

    public void goHome(){
        System.out.println("Students take their bag before going home");
    }

    public void goOut(){
        System.out.println("Students take their Homework and bag before going out");
    }

    public void setMark(int classIndex, int mark){
        this.marks[classIndex] = mark;
    }

    public double studentAverageMark(){
        double average = 0;
        for (int i = 0; i < this.marks.length; i++) 
            average += this.marks[i];
        average /= this.marks.length;
        return average;
    }

    public String toString(){
        //Teacher name? you mean the student name?
        return this.name + " " + this.age + " " + studentAverageMark(); 
    }

    public static void main(String[] args) {
        //this doesn't make sense, how are you supposed to take marks from a constructor when you don't know what is for which?
        int[] marks = {10, 20, 30, 40};
        Student student = new Student("Rachel", 22, 4, marks);

        System.out.println(student.studentAverageMark());
        System.out.println(student.marks[0]);
        System.out.println(student.marks[1]);
        System.out.println(student.marks[2]);
        System.out.println(student.marks[3]);
        
        student.goHome();
        student.goOut();
        student.setMark(0, 50);
        System.out.println(student.marks[0]);
        
    }
}
