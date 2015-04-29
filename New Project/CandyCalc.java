import java.util.Scanner;

public class CandyCalc{

    public static void main(String[] args){
        int dollars;
        boolean valid = false;
        do{
            try{
                System.out.print("Please enter dollar amount: ");
                Scanner sc = new Scanner(System.in);
                dollars = sc.nextInt();
            }catch(Exception e){
                System.out.println("Invalid input. Please enter and integer.");
                valid = false;
                continue;
            }
            if(dollars < 0){
                 System.out.println("Invalid input. Please enter a positive dolalr amount.");
                 valid = false;
            }
        }while(!valid);
        
    }
}