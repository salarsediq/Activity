public class Teacher extends Person{

    private String name;
    private int age;
    private double baseSalary;
    private int classCount;

    Teacher(String name, int age, double baseSalary, int classCount){
        super(name, age);
        this.name = name;
        this.age = age;
        this.baseSalary = baseSalary;
        this.classCount = classCount;        
    }

    public void goHome(){
        System.out.println("Teacher take students paper before going home");
    }

    public void goOut(){
        System.out.println("Teacher take their laptop before Going out");
    }

    public double calculateSalary(){
        return baseSalary;
    }

    public String toString(){
        //return super.toString() + " " + classCount;
        return this.name + " " + this.age + " "+ this.classCount;
    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher("Dante", 30, 100000, 4);
        System.out.println(teacher.toString());
        teacher.calculateSalary();
    }
}
