public class Student {
    private String name;
    private int grade;
    private int classNum;
    private boolean canGraduate;

    public Student(String name, int grade, int classNum, boolean canGraduate) {
        this.name = name;
        this.grade = grade;
        this.classNum = classNum;
        this.canGraduate = canGraduate;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getClassNum() {
        return classNum;
    }

    public boolean getCanGraduate() {
        return canGraduate;
    }

    public void printStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Class: " + classNum);
        System.out.println("Can Graduate: " + canGraduate);
    }

    public class APStudent extends Student {
            private int numAPClasses;

            public APStudent(String name, int grade, int classNum, boolean canGraduate, int numAPClasses) {
                super(name, grade, classNum, canGraduate);
                this.numAPClasses = numAPClasses;
            }
            public void printAPStudentInfo() {
                System.out.println("Name: " + getName());
                System.out.println("Grade: " + getGrade());
                System.out.println("Class: " + getClassNum());
                System.out.println("Can Graduate: " + getCanGraduate());
                System.out.println("Number of AP Classes: " + numAPClasses);
            }
        }
    public static void main(String[] args) {
            Student student1 = new Student("Jake", 12, 1, true);
            student1.printStudentInfo();
    
            APStudent student2 = student1.new APStudent("Timmeh", 12, 3, true, 3);
            student2.printAPStudentInfo();
        }
    
    
}