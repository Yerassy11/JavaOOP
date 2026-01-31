package week2;

public class Student {
    private int id;
    private int year;
    private String name;


    public Student(String name,int id,int year){
        this.name=name;
        this.id=id;
        this.year=year;
    }

    public void Display(){
        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
        System.out.println("Year of Study : " + year);
    }

    public void ID_increment(){
        id+=1;
    }

    public static void main(String[] args){
        Student stud=new Student("Era",1,2);

        stud.Display();
        stud.ID_increment();
        stud.Display();
    }
}

