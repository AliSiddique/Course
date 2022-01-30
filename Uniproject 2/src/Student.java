public class Student {
    private String name;
    private int studentNumber;
    private boolean passJava;

    public Student(String name, int studentNumber) {
        this.name = name;
        this.studentNumber = studentNumber;
        passJava = false;
    }
    //getter for name
    public String getName() {
        return name;
    }
    //setter for name
    public void setName(String name) {
        this.name = name;
    }
    //getter for studentNumber
    public int getStudentNumber() {
        return studentNumber;
    }
    //setter for studentNumber
    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }
    //getter for passJava naming convention replaces 'get' with 'is'
    public boolean isPassJava() {
        return passJava;
    }
    //setter for passJava
    public void setPassJava(boolean passJava) {
        this.passJava = passJava;
    }
}

