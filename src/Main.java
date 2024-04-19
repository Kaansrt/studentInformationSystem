public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Mahmut","555","TRH");
//        teacher.print();
        Teacher teacher2 = new Teacher("Graham Bell","000","FZK");
        Teacher teacher3 = new Teacher("Kül Yutmaz", "111", "BIO"); //3 öğretmen olusturduj, 3 ders olusturduk ve 3 öğretmei 3 derse atadık

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(teacher1);
        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(teacher2);
        Course biyo = new Course("Biyo","101","BIO");
        biyo.addTeacher(teacher3);
//        tarih.printTeacherInfo(); printTeacherInfo'yu addTeacher içinde çağırdıgımız için burdan kaldırdık.

        Student s1 = new Student("Şaban", "123", "4", tarih, fizik, biyo);
        s1.addBulkExamNote(69,18,73,25,80,50);
        s1.isPass();

        Student s2 = new Student("Necmi", "444", "4", tarih, fizik, biyo);
//        s2.addBulkExamNote(50, 30, 70);
//        s2.isPass();
    }
}