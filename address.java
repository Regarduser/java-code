import java.util.Scanner;
public class address {
    public static void main(String[] args){
        Scanner take = new Scanner(System.in);
    String name = take.nextLine();

    switch(name){
        case "ram"  -> 
        System.out.println("mansarovar, city park, jaipur 302020");
        case "piyus"  -> 
        System.out.println("Nokha, sanganer road, bikaner 334802");
        case "bhupendra"  -> 
        System.out.println("majari khola, mundawar, alwar 301427");
        default ->
        System.out.println("name is not in the list");
    }
    }
}