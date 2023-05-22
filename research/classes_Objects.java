package research;

class Student {
    // Attributes
    String name;
    int age;
    String gender;
    String grade;

    // Constructor: For creating instances of a class (Creating Object from Class)
    // public Student (String name, int age, String gender, String grade) {
    //     this.gender = gender;
    //     this.age = age;
    //     this.grade = grade;
    //     this.name = name;
    // }

    // Methods
    public void study() {
        System.out.println("Studying!");
    }
    // Methods
    public void play() {
        System.out.println("Playing!");
    }
} 

public class classes_Objects {
    
    public static void main(String[] argvs) {
        // Student boyA = new Student("BoyA", 8, "male", "Primary2");
        // Student girlA = new Student("GirlA", 10, "female", "Primary4");
        Student boyA = new Student();
    }
}

