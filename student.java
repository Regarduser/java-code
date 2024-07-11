import java.util.Scanner;
public class student {
    public static void main(String[] args){
        System.out.println("enter your name  : ");
        Scanner take = new Scanner(System.in);
        String name = take.nextLine();

        System.out.println("enter maths marks : ");
        Scanner take1 = new Scanner(System.in);
        int maths = take1.nextInt();

        System.out.println("enter physics marks : ");
        Scanner take2 = new Scanner(System.in);
        int physics = take2.nextInt();

        System.out.println("enter Chemistry marks : ");
        Scanner take3 = new Scanner(System.in);
        int chemistry = take3.nextInt();

        System.out.println("enter hindi marks : ");
        Scanner take4 = new Scanner(System.in);
        int hindi = take4.nextInt();

        System.out.println("enter English marks : ");
        Scanner take5 = new Scanner(System.in);
        int English = take5.nextInt();

        int percentage = (maths + physics + chemistry + English + hindi)/5;
        float cgpa = percentage/9.5f;
        System.out.println(cgpa);
        
     if (cgpa >= 9.5f) {
            System.out.println("A+");
        } else if (cgpa >= 9.0f) {
            System.out.println("A");
        } else if (cgpa >= 8.5f) {
            System.out.println("B+");
        } else if (cgpa >= 8.0f) {
            System.out.println("B");
        } else if (cgpa >= 7.5f) {
            System.out.println("C+");
        } else if (cgpa >= 7.0f) {
            System.out.println("C");
        } else if (cgpa >= 6.5f) {
            System.out.println("D");
        } else {
            System.out.println("Invalid grade");
        }
    }
}