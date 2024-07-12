import java.util.Scanner;
public class table {
    public static void main(String[] args){
       Scanner take = new Scanner(System.in);
       System.out.println("enter any number : ");
       int number = take.nextInt();
       if(number % 2 == 0){
        System.out.println("number is even");
        for(int i = 1; i<=10; i++){
          int table = number * i;
        System.out.println(table);
    }
    }
    else{
        System.out.println("number is odd");
    }
    }
}