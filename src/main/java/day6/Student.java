package day6;
import java.util.Scanner;

public class Student{
    String studName;
    final String rollNumber;
    int [] marks = new int[5];

    static final String schoolName="Shen international";
    public Student(String studName, String rollNumber){
        this.studName=studName;
        this.rollNumber=rollNumber;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            int s = sc.nextInt();
            if (s<=100 && s>=0) {
                marks[i] = s;
            }
        }
    }
    int calculateTotal(){
        int ren = marks.length;
        int sum = 0;
        for (int i = 0; i<ren; i++){
            sum+=marks[i];
        }
        return sum;
    }
    int calculatePercentage(){
        int re = marks.length;
        int per = 0;
        for ( int i =0; i <re; i++) {
            per += marks[i];
        }
        per=(per*100)/500;
        return per;
    }
    String getGrade(){
        int per = calculatePercentage();
            if(per>=90) return "A";
            else if(per>=80) return "B";
            else if(per>=70) return "C";
            else if(per>=60) return "D";
            else return "F";
    }
    void displayReport(){
        System.out.println("=================================");
        System.out.println(schoolName);
        System.out.println("==================================");
        System.out.println("Student Name :"+studName);
        System.out.println("==================================");
        System.out.println("Roll Number :"+rollNumber);
        System.out.println("Total Marks :"+calculateTotal());
        System.out.println("Percentage :"+ calculatePercentage());
        System.out.println("Grade:"+getGrade());
        System.out.println("==================================");
    }
    public static void main(String[] args){
        Student s1 = new Student("MAHESH","23");
        Student s2 = new Student("MANAV","45");
        s1.displayReport();
        s2.displayReport();
    }
}

