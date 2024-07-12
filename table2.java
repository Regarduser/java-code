import java.util.Scanner;
public class table {
    public static void main(String[] args){
       Scanner take = new Scanner(System.in);
       System.out.println("enter n1 : ");
       int n1 = take.nextInt();
    //    Scanner take = new Scanner(System.in);
       System.out.println("enter n2 : ");
       int n2 = take.nextInt();

       if(n1 == 1){
        for(n1 = 1; n1<=n2; n1++){
            System.out.println(n1);
        }
       }
       else if(n1 == 10){
        System.out.println("\n");
        for(n1 = 10; n1>0; n1--){
            System.out.println(n1);
        }
       }
       else{
            System.out.println("invalid input");
       }
    }
}