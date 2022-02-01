import java.util.Scanner;

public class ModuleTwo {
    public static void main(String[] args) {
        int applesOnHand;
        int stockApples;
        int orangesOnHand;
        int stockOranges;
        Scanner scnr = new Scanner(System.in);
        
        /*Asks user for the number of apples on hand and number of apples that 
        should be in stock. Sets input to the given variable.*/
        System.out.println("How many apples are on hand?");
        applesOnHand = scnr.nextInt();
        System.out.println("How many apples should be in stock?");
        stockApples = scnr.nextInt();
        
        /*Asks user for the number of oranges on hand and number of oranges
        that should be in stock. Sets input to the given variable.*/
        System.out.println("How many oranges are on hand?");
        orangesOnHand = scnr.nextInt();
        System.out.println("How many oranges should be in stock?");
        stockOranges = scnr.nextInt();
        
        /*Calculates number of apples and oranges to order by subtracting what
        was on hand for each fruit from what should be in stock.*/
        int applesToOrder = (stockApples - applesOnHand);
        int orangesToOrder = (stockOranges - orangesOnHand);
        
        //Outputs the number or apples and oranges to order that was caluclated
        System.out.println("Number of apples to order: " + applesToOrder);
        System.out.println("Number of oranges to order: " + orangesToOrder);
        
        return;
    }    
}
