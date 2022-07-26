class Person{
    private String name;
    private int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void goHome(){
        System.out.println("Person go Home");
    }
    public void goOut(){
        System.out.println("Person go Out");
    }

    public void identity(){
        System.out.println("Name: " + this.name + "\nage: " + this.age);
    }

    public String toString(){
        return this.name + " " + this.age;
    }

    public static void main(String[] args) {
        Person persona = new Person("Nero", 25);
        persona.goHome();
        persona.goOut();
        persona.identity();
        System.out.println(persona.toString());
    }
}


