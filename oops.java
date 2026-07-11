public class oops {
    public static void main(String[] args) {
    Student s1 = new Student();
    Student s2 = new Student();
    s1.name="Neha";
    s1.branch="Computer Science";
    s1.age=19;
    s1.grade=7.7;
    s1.address="mumbai";
    s1.college="VESIT";
   
    s2.name="Sasa";
    s2.branch="Computer Science";
    s2.age=19;
    s2.grade=7.1;
    s2.address="mumbai";
    s2.college="VESIT";
    
    s1.Print();
    s1.markAttendance();
    
    s2.Print();
    s2.markAttendance();

    }
    static class Student{
        String name;
        int age;
        double grade;
        String college;
        String branch;
        String address;

        void markAttendance(){
            System.out.println("Present!");
        }
    
        
        void Print(){
         System.out.println("Name:"+name+" , " + "Age:"+age+" , "+"Grade: "+grade+" , "+"College:"+college+" , "+"Branch:"+branch+" , "+"Address:"+address);
        }
       
    }   
}