package Day1;

import java.util.Scanner;

public class Students {


    public static void studentid() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the student id");
        int studentid= scanner.nextInt();
        System.out.println("Student Id is "+ studentid );
    }



    public static void Mark1(){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the mark ");
        int Mark1=scanner.nextInt();
        System.out.println(" Student Mark1 is" +Mark1 );

    }

    public static void main(String[] args) {


        studentid();
        Mark1();
    }






    }