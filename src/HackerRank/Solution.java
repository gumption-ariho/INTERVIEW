package HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * Create the Student and Priorities classes here.
 */
import java.util.*;

class Student implements Comparator<Student>{
    private int id;
    private String name;
    private double cgpa;
    public Student( String name, double cgpa,int id){
        this.id=id;
        this.name=name;
        this.cgpa=cgpa;
    }

    public int getID(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public double getCGPA(){
        return this.cgpa;
    }
    public int compare(Student a, Student b){
        if(a.getCGPA()!=b.getCGPA()){
            return (int)(b.getCGPA()-a.getCGPA());
        }else{
            if(!a.getName().equals(b.getName())){
                return a.getName().compareTo(b.getName());
            }else{
                return a.getID()-b.getID();
            }
        }
    }

}

class Priorities{
    List<Student> getStudents(List<String>events){

        List<Student>listy= new ArrayList<>();
        PriorityQueue<Student>pq = new PriorityQueue<>();

        for(String s:events ){
            if(s.startsWith("ENTER")){
                String[]arr= s.split(" ");
                pq.add(new Student(arr[1],Double.parseDouble(arr[2]),Integer.parseInt(arr[3])));
            }else if(s.startsWith("SERVED")){
                pq.remove();
            }

        }
        while(!pq.isEmpty()){
            listy.add(pq.remove());
        }
        return listy;
    }
}



public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}