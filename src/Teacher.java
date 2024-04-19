public class Teacher {
    String name;
    String mpno;
    String branch;

    Teacher(String name, String mpno, String branch) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }
    void print() {
        System.out.println("Öğretmen ismi : " + this.name);
        System.out.println("Öğretmen branch : " + this.branch);
        System.out.println("Öğretmen Telno : " + this.mpno);
    }
}
