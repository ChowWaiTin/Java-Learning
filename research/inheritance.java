package research;

class Student {
    // Attributes
    String name;
    int age;
    String gender;
    String grade;

    // Constructor: For creating instances of a class (Creating Object from Class)
    public Student (String name, int age, String gender, String grade) {
        this.gender = gender;
        this.age = age;
        this.grade = grade;
        this.name = name;
    }

    // Methods
    public void study() {
        System.out.println("Studying!");
    }
    // Methods
    public void play() {
        System.out.println("Playing!");
    }
}

class Personality extends Student{
    // Attributes
    String attitude;

    // Constructor: For creating instances of a class (Creating Object from Class)
    public Personality (String name, int age, String gender, String grade, String attitude) {
        // super constructor to invoke Parent constructor
        super(name, age, gender, grade);
        this.attitude = attitude;
    }

} 

public class inheritance {
    
    public static void main(String[] argvs) {
        Personality BoyA = new Personality("BoyA", 8, "male", "Primary2", "Hardworking");
        Personality BoyB = new Personality("BoyB", 10, "male", "Primary4", "Hardworking");
    }
}

