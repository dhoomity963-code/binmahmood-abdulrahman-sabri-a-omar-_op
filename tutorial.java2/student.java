// constructor
class Student{String Name;
    int Age;
    double Gpa;

Student(String StudentName, int studentAge, double studentGpa){
    Name= StudentName;
    Age=studentAge;
    Gpa=studentGpa;

}
//methods
public void displayInfo(){
System.out.println("name:" +Name);
System.out.println("Age:" + Age);
System.out.println("GPA:" +Gpa);
}

public void study() {
    System.out.println(Name + "is studying.");
}

public void takeExam() {
    System.out.println(Name +" is taking an exam.");
}
}