package com.company;

public class Main {

    public static void main(String[] args) {
	   // write your code here
       Student mark = new Student();
       Student tontan = new Student();
       Student dream = new Student();


       //input data to Object
        mark.name ="x mark";
        mark.id =  "001";
        mark.major = "CIS";

        tontan.name ="ton tan";
        tontan.id =  "002";
        tontan.major = "CIS";

        dream.name = "dream";
        dream.id = "003";
        dream.major = "CS";


        //get data from Object
        System.out.println("1." + mark.name +" " + mark.major);
        System.out.println("2." +tontan.name + " " + tontan.major);
        System.out.println("3." +dream.name + "" + dream.major );

        //odd student to array
        Student[] oopStudents = {mark,tontan,dream};
        System.out.println("1." + oopStudents[0].name);
        System.out.println("2." + oopStudents[1].name);
        System.out.println("2." + oopStudents[2].name);


    }
    
}
