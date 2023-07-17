package day05.practice;

class Department {
    String deptName;
    int deptId;

    public Department(String deptName, int deptId) {
        this.deptName = deptName;
        this.deptId = deptId;
    }

    @Override
    public String toString() {
        return "Department [deptName=" + deptName + ", deptId=" + deptId + "]";
    }
}

class Student {
    String name;
    int id;
    Department department;

    public Student(String name, int id, Department department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", id=" + id + ", department=" + department + "]";
    }
}
public class Main {
    public static void main(String[] args) {
        Department department = new Department("Physics", 983);
        Student student = new Student("Kishor", 786, department);
        System.out.println(student);
    }
}
