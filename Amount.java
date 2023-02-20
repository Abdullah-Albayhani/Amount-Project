package Amount;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Amount {

    public static class DateUser{       //Private values ​​defined within a class.
        private String username;
        private String password;
        private int amount;
        

   public void setUserName(String user){this.username = user;}   //used the set and get to deliver it.
   public void setPassword(String pass){this.password = pass;}
   public void setAmount(int am1){this.amount = am1;}

  public String getUserName(){return username;}
  public String getPassword(){return password;}
  public int getAmount(){return amount;}

  }
        public static void readData(){                 //Get the username and password from the user and welcomes it.
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your Name: ");
        String user = input.nextLine();
        System.out.println("Please Enter Your Password: ");
        String pass = input.nextLine(); 
        System.out.println("Welcome "+user); 
        
        DateUser u1 = new DateUser();                 //Object u1 stores the username and password.
        u1.setUserName(user);
        u1.setPassword(pass);
      
        
        try{
        File file = new File("fileData.txt");    // This method creates a file and passes the values ​​in the u1 object into the file.
        file.createNewFile();
        PrintWriter save = new PrintWriter(new FileWriter(file,true));
        save.println("Username: "+user+"\n"+"Password: "+pass+ "\n");
        save.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    
    }
    
public static void enterAmount(){
    Scanner input = new Scanner(System.in);
  
    System.out.print("Enter an amount greater than zero : ");
    int amount = input.nextInt();//Get the values ​​from the user.
    System.out.println(); //print new line.

    if(amount > 0){        //This condition checks if the user entered a value greater than zero.

    while (amount > 0) {  // If the user enters a value greater than zero, he will enter the loop.

        if (amount >= 500) {
            System.out.println("500 Riyal notes   =\t" + (amount / 500)+" SR");
            amount = amount % 500;

        }else if(amount>=200){
            
            System.out.println("200 Riyal notes   =\t" + (amount/200)+" SR");
            amount = amount % 200;

        }else if(amount>=100){
            
            System.out.println("100 Riyal notes   =\t" + (amount/100)+" SR");
            amount = amount % 100;

        }else if(amount>=50){
            
            System.out.println("50 Riyal notes    =\t" + (amount/50)+" SR");
            amount = amount % 50;

        }else if(amount>=20){
            System.out.println("20 Riyal notes    =\t" + (amount/20)+" SR");
            amount = amount % 20;

        }else if(amount>=10){
            System.out.println("10 Riyal notes    =\t" + (amount/10)+" SR");
            amount = amount % 10;

        }else if(amount>=5){
            System.out.println("5 Riyal notes\t  =\t" + (amount/5)+" SR");
            amount = amount % 5;

        }else if(amount>=2){
            System.out.println("2 Riyal notes\t  =\t" + (amount/2)+" SR");
            amount = amount % 2;

        }else if(amount>=1){
            System.out.println("1 Riyal notes\t  =\t" + (amount / 1)+" SR");
            amount = amount % 1;
        } 
}       
}else{
    System.out.println("You Enter a value less than one"); // If the user enters a value less than or equal to zero, this message will be printed.
}
    

}
}
