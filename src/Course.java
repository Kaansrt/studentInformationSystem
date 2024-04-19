public class Course {
    // teacher ı Teacher classından alabilriz. Mantıken nesneler de bir veri tipi oluyor. (public oldugu için) Teacher classından bir referans üretiriz.
    // Sınıflar birbirlerinin niteliği olabilir. Jargon olarak niteliklerde bir sınıf var ise genelde en üste yazılır.
    Teacher teacher;
    String name;
    String code; //101
    String prefix; //TRH
    double note;
    double otherNote;

    Course(String name, String code, String prefix) {//Teacher a da değer atamak isteddiğim için parametre olarak kullanıyoruz.
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.otherNote=0;
    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {//öğretmenin branch i "TRH" ve Course un prefix i "TRH" olmalı.
            this.teacher = teacher;//main de verdiğimiz teacher1 parametrelerini bu classtaki teacher a aktardı ve alttaki metod ile de yazdırdı
//            printTeacher();
        } else {
            System.out.println("Öğretmen ve ders bölümleri uyusmuyor.");
        }

    }

    void printTeacher() { //yukarıda Teacher a eriştiğim için teacher ın özelliklerine ve niteliklerine de erişebilirim.
        this.teacher.print();
    }

}
