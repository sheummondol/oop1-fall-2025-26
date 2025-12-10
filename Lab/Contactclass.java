
Contact class {
    String phone;
    String email;
    Contact (String phone,String email)
    {
        this.phone=phone;
        this.email=email;

    }
    Void showinfo()
    {
        System.out.println("Phone:" +phone);
        System.out.println("Email:"+email);
    }
    
Class School {
    String schoolName;
    Student[]students;
    int count ;

    School(String SchoolName, int size )
    {
        this.schoolName=schoolName;
        students = new 
        student[size];
        count = 0;

    }

    void addStudent(Student s){
        if (count < students.length){
            students[count] = s;
            count ++;

        }
        else {
            System.out.println("School is full!");
        }
    }
        public class Task1 {
    public static void main(String[] args) {
 
        School s = new School("AIUB", 3);
 
        Contact c1 = new Contact("01871726244/01840702392", "std1@gmail.com");
        Student st1 = new Student("siam", c1);
 
        Contact c2 = new Contact("01805624266/01714853934", "std2@gmail.com");
        Student st2 = new Student("saif ", c2);
 
        s.addStudent(st1);
        s.addStudent(st2);
 
        s.showAllStudents();
    }
}