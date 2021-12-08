
public class SOP extends Menu {

    //The text for the menu
    String mm = "\nTo add a Department, press 1"
            + "\nTo create a Teacher, press 2."
            + "\nTo create a Student, press 3."
            + "\nTo create a Staff, press 4."
            + "\nTo set a Dean, press 5."
            + "\nTo exit the program and view the Departments, Teachers, Students, and Deans, press any other number."
            + "\n "
            + "\nEnter your number here: ";

    //The text for creating a Department
    String d1 = "What is the Department ID?";
    String d2 = "What is the Department description?";

    //The text for creating a Student
    String s1 = "What is the Student's ID?";
    String s2 = "What is the Student's name?";
    String s3 = "What is the Student's age?";
    String s4 = "What is the Student's gender?";
    String s5 = "What is the Student's course?";
    String s6 = "What is the Student's semester?";
    String s7 = "Enter the Department ID that you would like to add this Student to.";
    //Error Message
    String s8 = "To create a Student, please create a Department first.";

    //The text for creating a Teacher
    String t1 = "What is the Teacher's ID?";
    String t2 = "What is the Teacher's name?";
    String t3 = "What is the Teacher's age?";
    String t4 = "What is the Teacher's gender?";
    String t5 = "What is the Teacher's degree?"
            +"\n "
            +"\nIf the teacher has a Bachelor's degree, press 1."
            +"\nIf the teacher has a Master's degree, press 2."
            +"\nIf the teacher has a PhD, press 3.";
    String t6 = "What is the Teacher's specialty?";
    String t7 = "Enter the Department ID that you would like to add this Teacher to.";
    //Error Message
    String t8 = "To create a Teacher, please create a Department first.";

    //Text for creating a Staff
    String st1 = "What is the Staff's ID?";
    String st2 = "What is the Staff's name?";
    String st3 = "What is the Staff's age?";
    String st4 = "What is the Staff's gender?";
    String st5 = "What is the Staff's duty?";
    String st6 = "What is the Staff's workload?";
    String st7 = "Enter the Department ID that you would like to add this Staff to.";
    //Error Message
    String st8 = "To create a Staff, please create a Department first.";
    
    //The text for setting a Dean
    String sd1 = "Select a Department to add a Dean to: ";
    String sd2 = "What is the ID of the Teacher you would like to make Dean?";
    //Error Message
    String sd3 = "To set a Dean, please create a Department first.";
    String sd4 = "To set a Dean, please create a Teacher first.";
}
