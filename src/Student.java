public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stdNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String stdNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stdNo = stdNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int trhNote1, int trhSozluNote, int fzkNote2, int fzkSozluNote, int bioNote3, int bioSozluNote) {
        if (trhSozluNote >= 0 && trhSozluNote <= 100) {
            this.c1.otherNote = trhSozluNote ;
        }
        if (trhNote1 >= 0 && trhNote1 <= 100) {
            this.c1.note = trhNote1 ; //girilen değer course classındaki note a eşitlenicek.
        }
        if (fzkSozluNote >= 0 && fzkSozluNote <= 100) {
            this.c2.otherNote = fzkSozluNote ;
        }
        if (fzkNote2 >= 0 && fzkNote2 <= 100) {
            this.c2.note = fzkNote2;
        }
        if (bioSozluNote >= 0 && bioSozluNote <= 100) {
            this.c3.otherNote = bioSozluNote;
        }
        if (bioNote3 >= 0 && bioNote3 <= 100) {
            this.c3.note = bioNote3;
        }
    }

    void isPass() {
        System.out.println("==========");
        this.avarage = (((this.c1.note*0.80) + (this.c1.otherNote*0.20)) + ((this.c2.note * 0.80) + (this.c2.otherNote * 0.20)) + ((this.c3.note * 0.80) + (this.c3.otherNote * 0.20))) / 3.0;
        if (this.avarage > 55) {
            System.out.println("Sınıfı başarılı bir şekilde geçtiniz!!");
            this.isPass = true;
        } else {
            System.out.println("Sınıfta kaldınız...");
            this.isPass = false;
        }
        printNote();
    }

    void printNote() {
        System.out.println(c1.name + " Notu : " + c1.note);
        System.out.println(c1.name + " Sözlü Notu : " + c1.otherNote);
        System.out.println(c2.name + " Notu : " + c2.note);
        System.out.println(c2.name + " Sözlü Notu : " + c2.otherNote);
        System.out.println(c3.name + " Notu : " + c3.note);
        System.out.println(c3.name + " Sözlü Notu : " + c3.otherNote);
        System.out.println("Ortalamanız : " + this.avarage);
    }
}
