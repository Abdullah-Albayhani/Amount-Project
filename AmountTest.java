package Amount;
import java.util.Scanner;
public class AmountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       System.out.println("----------New Amount----------");
       Amount.readData();
       Amount.enterAmount();
    
        System.out.println("Press Y if you want to continue and N if you don't want to");
        String answer = input.nextLine();
        if (answer.equalsIgnoreCase("Y")){
            do{
        Amount.enterAmount();
        System.out.println("Press Y if you want to continue and N if you don't want to");
        answer = input.nextLine();
            }
            while(answer.equalsIgnoreCase("Y"));
        }
        else{

        }
        input.close();
        
    }
    
}
