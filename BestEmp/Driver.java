//import that is used to take in input
import java.util.Scanner;
public class Driver {
    // creating the election object 
    static Election January = new Election("January");
    static Scanner input = new Scanner(System.in);

    //method to checkpassword; whether the password is correct or not
    //this is for the voting purpose
    public static boolean checkpassword(int n){
        System.out.printf("Enter password %s %s: ", January.getVisitorIndex(n).getFirstName(),
         January.getVisitorIndex(n).getLastName());//the index or n will be achieved by choosing from for loops
        int password = input.nextInt();//Taking password as interget input
        return password == January.getVisitorIndex(n).getPassword();
    }
    public static void BEM(){
        //This function is to decide the best employee of the month
                System.out.println("\nThe Winner of the month! \n");
                System.out.println("Details !\n");
                //for calculating the winner variables
                //assigning and initializing the variables
                
                int ID1=0;
                int ID2=0;
                int ID3=0;
                int thevote=0;//variables that is assined as ID number of the employees
                double total;//to calculate the percentage
                int Winner =0;//to know how many support the winner gets
 
                //for loop for calculating vote purposes
                for(int i = 0; i < January.getNumberOfVisitors(); i++){
                    // it will print the first name + votes for + numb of votes of that person.
                    System.out.printf("%d. %s votes for %s \n", i+1,  January.getVisitorIndex(i).getFirstName(),January.getVisitorIndex(i).getMyVote().getVote());
                    //i assigned thevote to get the vote number of i
                    thevote = January.getVisitorIndex(i).getMyVote().getVote();
                    //if statement
                    if(thevote==1){
                        ID1 ++;//if thevote == 1; ID1 will increase 1; starts from 0
                    }else if(thevote==2){
                        ID2 ++;//if thevote == 2; ID2 will increase 1; starts from 0
                    }else if(thevote==3){
                        ID3 ++;//if thevote == 3; ID3 will increase 1; starts from 0
                    }
                }
                
                //if function to determine which one is the greatest among 3
                if(ID1>ID2 && ID1>ID3){
                    Winner = ID1; //printing the total support he gets
                    thevote = 1;//thevote is to print the id of the winner
                }else if(ID2>ID1 && ID2>ID3){
                    Winner = ID2;
                    thevote = 2;
                }else if(ID3>ID1 && ID3>ID2){
                    Winner = ID3;
                    thevote = 3;
                } 
                //printing out the details of the winner
                System.out.println("\n\nThe winner is employee with ID : " + thevote);
                //thevote-1 because the linked list start from 0, meanwhile thevote is from 1
                //calling the method to get FULL NAME
                System.out.println("Name : "+ January.getEmployeeIndex(thevote-1).getFullName());
                System.out.printf("The total supports he/she gets: %d supports.\n",Winner);
                double Winner1 = Winner;
                //Math formula to calculate win rate
                total = (Winner1/(ID1+ID2+ID3))*100;
                System.out.printf("The win percentage: %.2f %s. \n",total,"%");
                System.out.println("[IF THE WIN PERCENTAGE AND SUPPORT IS 0, WE GOT A DRAW]");
                System.out.println("Press any key to continue...");
                String a = input.next();
                System.out.println("\n");
    }
//THE MAINPAGE FUNCTION THAT WILL BE CALLED IN FinalProject.java
    public static void MAINPAGE(){
        int NOV= 0;//for calculating the number of votes made
        //welcome sign
        System.out.println("Choose your Best Employee of the Month system!");
        System.out.println("Input the month!");
        //to declare what month is the voting occur
        String themonth = input.next();
        while(true){
            //while loop so that the page won't go missing after taking input
            System.out.println("Are you an admin or a visitor?");
            System.out.println("Admin = 1  Visitor = 2 \nExit = 3");
            System.out.println("[Don't forget to add the candidates first before voting]");
            int admin = input.nextInt();
            //if statement so u can choose between log in to admin, visitor or exit the program
            if(admin == 1 ){
                System.out.printf("======== MONTH : %s =======", themonth);
                System.out.println("\nPlease enter your password first!");
                String adminpass = input.next();
                while(true){
                //while loop so the admin page doesn't get redirected to the page before after taking input
                if((adminpass).equals("password")){
                    //the admin password is set to "password"
                    System.out.println("WELCOME BACK ADMIN!");
                    System.out.println("===========================");
                    System.out.println("What would you like to do?");
                    System.out.printf("\nThere are currently: %d employee candidates\n", January.getNumberOfEmployees());
                    System.out.println("1. View member account password");
                    System.out.println("2. Add the employee information");
                    System.out.println("3. Edit the employee information");
                    System.out.println("4. Display the employee information");
                    System.out.println("5. Logout");
                    int choose = input.nextInt();
                    //let the user choose by using if statement to choose between the 3 options
                    if(choose == 1){  
                        // To view the password of the member account made
                        if(January.getNumberOfVisitors()==0){
                            //to check whether an account has been made or not
                            System.out.println("There is no account yet!");
                            System.out.println("Press any key to continue...");
                            String a = input.next();     
                        }else{
                        System.out.println("These are the passwords of the accounts:");
                        System.out.println("===========================");
                        //for loops to get all of the account member data
                        for(int a = 0; a < January.getNumberOfVisitors(); a++){
                            //for the ID
                            System.out.printf("ID : %d \n",a+1);
                            //for the First Name
                            System.out.printf("First name : %s \n", January.getVisitorIndex(a).getFirstName());
                            //for the Last Name
                            System.out.printf("Last name : %s \n", January.getVisitorIndex(a).getLastName());
                            //for getting the password
                            System.out.printf("Password : %s \n", January.getVisitorIndex(a).getPassword());
                        }
                        System.out.println("Press any key to continue...");
                        String a = input.next();
                            }
                        }
                    else if(choose == 2){
                        if(January.getNumberOfEmployees()<4){
                            if(January.getNumberOfEmployees()==3){
                            System.out.println("\nThe employees candidate are fully registered!");
                            System.out.println("Press any key to continue...");
                            String a = input.next();
                            System.out.println("\n");
                            }else{
                        System.out.println("Please enter 3 employees candidate!");
                        for(int i = 0; i <3;i++){
                        //using the for loops to take multiple inputs. Its actually 3 inputs
                        System.out.printf("ID  %d. Employee first name: ",i+1 );
                        String front = input.next();
                        System.out.printf("ID  %d. Employee last name: ",i+1 );
                        String back = input.next();
                        System.out.printf("ID  %d. Employee age: ",i+1 );
                        int age = input.nextInt();
                        //adding the employee 
                        January.addEmployee(front,back,age);
                        System.out.println("===========================");
                        }
                        }
                        }else{
                            System.out.println("Sorry, the employees are already fully registered!");
                        }
                    }else if(choose == 3){
                        if(January.getNumberOfEmployees()==0){
                            System.out.println("There is no account yet!");
                            System.out.println("Press any key to continue...");
                            String a = input.next();
                            System.out.println("\n");
                        }else{
                            System.out.println("Edit employee profile.\n");
                            //To print the member index and name
                            for(int i = 0; i < January.getNumberOfEmployees(); i++){
                                System.out.printf("%d. %s %s \n", i+1,  January.getEmployeeIndex(i).getFName(), 
                                January.getEmployeeIndex(i).getLName());
                            }
                            System.out.println("Please enter the index of your account: ");
                            int choice =input.nextInt();
                            if(choice > January.getNumberOfEmployees()){
                            //Just in case the ID chosen is greater than the number of account member
                                System.out.println("Invalid index");
                            }else{
                                System.out.println("Edit your first name: ");
                                String fname = input.next();
                            //calling the setter function which basically overwrite the information 
                                January.getEmployeeIndex(choice-1).setFName(fname);
                                System.out.println("Edit your last name: ");
                                String lname = input.next();
                                January.getEmployeeIndex(choice-1).setLName(lname);
                                System.out.println("Edit your age: ");
                                int age = input.nextInt();
                                January.getEmployeeIndex(choice-1).setAge(age);
                                System.out.println("Account successfully updated!!");
                                System.out.printf("ID %d %s %s",choice,January.getEmployeeIndex(choice-1).getFName(),
                                January.getEmployeeIndex(choice-1).getLName());
                                System.out.println("\nPress any key to continue...");
                                String a = input.next();
                                System.out.println("\n");
                            }
                        }
                    }else if(choose ==4){
                        //Printing employee information
                        if(January.getNumberOfEmployees()==0){
                            //to indicate if no employee candidates are registered
                            System.out.println("No employee candidate is registered yet!");
                            System.out.println("Press any key to continue...\n");
                            String a = input.next();
                            System.out.println("\n");
                        }else{
                        //Printing all the employees candidate details
                        System.out.println("\nThese are the employee candidates. \n");
                        //for loop that execute the printing method of choose==4
                        for(int a = 0; a < January.getNumberOfEmployees(); a++){
                            //for the ID
                            System.out.printf("ID : %d \n",a+1);
                            //for the First Name
                            System.out.printf("First name : %s \n", January.getEmployeeIndex(a).getFName());
                            //for the Last Name
                            System.out.printf("Last name : %s \n", January.getEmployeeIndex(a).getLName());
                            //for getting the Age
                            System.out.printf("Age : %s \n", January.getEmployeeIndex(a).getAge());

                            }
                        System.out.println("Press any key to continue...\n");
                        String a = input.next();
                        System.out.println("\n");
                        }
                    }else if(choose == 5){
                        //Exit choose
                        System.out.println("Are you sure you want to log out?(Y/N)");
                        //Asking the user if he/she is sure to log out
                        String b = input.next();
                        //if statement to check input to decide if the user is sure to log out
                        if(b.equals("Y") || b.equals("y")){
                            System.out.println("Goodbye Admin! :)");
                            System.out.println("See you next time!");
                            System.out.println("===================================== ");
                            break;
                        }else if(b.equals("N") || b.equals("n")){
                            System.out.println("======================================");
                            System.out.println("Welcome back! :)");
                        }else{
                            System.out.println("Please select between Y or N!");
                        }
                    }
                }else{
                        //if the user doesnt enter "password"
                        System.out.println("Wrong password!");
                        System.out.println("Press any key to continue...");
                        String a = input.next();
                        System.out.println("\n\n\n\n\n");
                        break;
                        
                    }
                }//while of admin ==1 
            }
//-------------------------------------------------------------------------------------------------------------------------------
        else if(admin==2){
            while(true){
                //main menu for the user to choose
                System.out.printf("======== MONTH : %s =======", themonth);
                //to indicates if an account is created or not; or how many account has been created
                System.out.printf("\nThere are currently: %d accounts\n", January.getNumberOfVisitors());
                System.out.println("What would you like to do?\n ");
                System.out.println("1. Add new member account");
                System.out.println("2. Edit member account");
                System.out.println("3. Login and choose the best employee");
                System.out.println("4. Display account information");
                System.out.println("5. Employee information");
                System.out.println("6. Result");
                System.out.println("7. Logout");
                System.out.println("[Program: If you don't remember your password, please ask admin for more information!]");
                System.out.print("\nPlease select the number: ");
                //taking input as choice from the user
                int choice = input.nextInt();
        //====================================================================================================================== 
                //if statement to check the choice
            if(choice == 1){
                //adding new account
                System.out.print("Enter first name: ");
                //taking input as first name
                String first = input.next();
                System.out.print("Enter last name: ");
                //taking input as last name 
                String last = input.next();
                System.out.print("Enter the gender: ");
                //taking input as gender
                String gender = input.next();
                //taking input as password
                System.out.println("Enter password (num): ");
                int password = input.nextInt();
                //creating new account by calling the addVisitor method
                January.addVisitor(first, last,gender, password);
                
                //sign to know if an account is created
                System.out.println("An account has been successfully created");
                System.out.print("\nPress any key to continue!\n");
                String a = input.next();
            }
        //======================================================================================================================
            else if(choice ==3){
                //The login and choose employee candidates
                if(January.getNumberOfVisitors()==0){
                    //To check account memmber has been made or not
                    System.out.println("There is no account member yet!");
                    System.out.println("Press any key to continue...");
                    String a = input.next();
                }else if(January.getNumberOfEmployees()==0){
                    //To check employee candidats account has been made or not
                    System.out.println("There is no employee candidate resgistered!");
                    System.out.println("Press any key to continue...");
                    String a = input.next();
                
                }else{
                //THE FIRST VOTE WILL OVERWRITE THE SECOND VOTE
                System.out.println("[REMINDER: IF YOU VOTE TWICE, THE FIRST VOTE WILL BE LOST]");
                //for loop that prints index; the index is added by 1 as it start from 0 and the first name
                System.out.print("First log in to your account!\n");
                //Printing the information of the account created
                for(int i = 0; i < January.getNumberOfVisitors(); i++){
                    System.out.printf("%d. %s %s \n", i+1,  January.getVisitorIndex(i).getFirstName(), 
                     January.getVisitorIndex(i).getLastName());
                }
                //getting the account by using index
                System.out.println("Please enter the index of your account: ");
                choice =input.nextInt();
                if(choice>January.getNumberOfVisitors()){
                    //if statment; just in case the user input a super big number 
                    System.out.println("Invalid ID of the employee!");
                    System.out.println("Press any key to continue...");
                    String a = input.next();
                    
                }else{
                //calling the checkpassword method
                //if the password is wrong, it will not take any input for setting the visitor vote
                    if(checkpassword(choice-1)){
                        System.out.print("\nChoose your employee ID!\n\n");
                        for(int i = 0; i < January.getNumberOfEmployees(); i++){
                            //for loops to print the information of the employee
                            System.out.printf("%d. %s  \n", i+1,  January.getEmployeeIndex(i).getFullName());
                        }
                    int n = input.nextInt();
                    //asking input to set up vote
                    if(n>January.getNumberOfEmployees()){
                        System.out.println("Invalid ID!");
                    }else{
                        Vote vot = new Vote(n);
                        NOV++;
                        //choice-1 bcs it starts from 0 ; it is -1 from the ID shown
                        January.getVisitorIndex(choice-1).setMyVote(vot);
                        System.out.println("You have successfully voted!");
                        System.out.println("\n");
                        }
                        }
                    }
                } 
            }
        //======================================================================================================================
            else if(choice ==4){
                //To check whether the account has been created or not
                if(January.getNumberOfVisitors()==0){
                    System.out.println("There is no account member yet!");
                    System.out.println("Press any key to continue...");
                    String a = input.next();
                    System.out.println("\n");
                }else{
                //it shows the information account member that has been created by the user
                System.out.println("\n These are the list of account: \n");
                for(int a = 0; a < January.getNumberOfVisitors(); a++){
                    //by using for loops, it can print all of the visitor list
                    System.out.printf("ID : %d \n",a+1);
                    System.out.printf("First name : %s \n", January.getVisitorIndex(a).getFirstName());
                    System.out.printf("Last name : %s \n", January.getVisitorIndex(a).getLastName());
                    System.out.printf("Age : %s \n", January.getVisitorIndex(a).getGender());

                }
                System.out.println("Press any key to continue !\n");
                String a = input.next();
                System.out.println("\n");
                }
            }
        //======================================================================================================================
            else if(choice ==6){
                //The result page
                if(January.getNumberOfVisitors()==0){
                    //condition if no account member is made
                    System.out.println("There is no account member created");
                    System.out.println("Press any key to continue...");
                    String a = input.next();
                    System.out.println("\n");
                }else if(January.getNumberOfEmployees()==0){
                    //condition if there's no candidate registered
                        System.out.println("There is no employee candidate is registered");
                        System.out.println("Press any key to continue...");
                        String a = input.next();
                        System.out.println("\n");
                
                }else if(NOV<January.getNumberOfVisitors()){
                    System.out.println("Vote :"+NOV);
                    System.out.println("visitor" + January.getNumberOfVisitors());
                    //condition if not all of the account has voted 
                    System.out.println("Not all account has voted! Please vote first!");
                    System.out.println("Press any key to continue...");
                    String a = input.next();
                    System.out.println("\n");
                }else {
                //Calling the BEM function to decide the winner
                BEM();
            }
        }
        //======================================================================================================================
            else if(choice == 5){
                //Printing employee information
                if(January.getNumberOfEmployees()==0){
                    //to indicate if no employee candidates are registered
                    System.out.println("No employee candidate is registered yet!");
                    System.out.println("Press any key to continue...\n");
                    String a = input.next();
                    System.out.println("\n");
                }else{
                //Printing all the employees candidate details
                System.out.println("\nThese are the employee candidates. \n");
                //for loop that execute the printing method of choice==5
                for(int a = 0; a < January.getNumberOfEmployees(); a++){
                    //for the ID
                    System.out.printf("ID : %d \n",a+1);
                    //for the First Name
                    System.out.printf("First name : %s \n", January.getEmployeeIndex(a).getFName());
                    //for the Last Name
                    System.out.printf("Last name : %s \n", January.getEmployeeIndex(a).getLName());
                    //for getting the Age
                    System.out.printf("Age : %s \n", January.getEmployeeIndex(a).getAge());

                }
                System.out.println("Press any key to continue...\n");
                String a = input.next();
                System.out.println("\n");
            }
        }
        //======================================================================================================================
            else if(choice==7){
                //choice==7 is the logout , it prints successfully logged out text and breaks while loop
                System.out.println("Sucessfully logged out! :) ");
                System.out.println("\n");
                break;
        }
        //======================================================================================================================
            else if(choice==2){
                //Edit account information
                if(January.getNumberOfVisitors()==0){
                    //If there is no member account has been made
                    System.out.println("There is no account yet!");
                    System.out.println("Press any key to continue...");
                    String a = input.next();
                    System.out.println("\n");
                }else{
                    //executing the choice==2 program
                    System.out.println("Edit account profile.\n");
                    //To print the member index and name
                    for(int i = 0; i < January.getNumberOfVisitors(); i++){
                        System.out.printf("%d. %s %s \n", i+1,  January.getVisitorIndex(i).getFirstName(), 
                         January.getVisitorIndex(i).getLastName());
                    }
                    System.out.println("Please enter the index of your account: ");
                    choice =input.nextInt();
                    if(choice > January.getNumberOfVisitors()){
                        //Just in case the ID chosen is greater than the number of account member
                        System.out.println("Invalid index");
                    }
                    else if(checkpassword(choice-1)){
                        //calling check password to ensure the edit page is only accessible by the account holder
                        System.out.println("Edit your first name: ");
                        String fname = input.next();
                        //calling the setter function which basically overwrite the information 
                        January.getVisitorIndex(choice-1).setFirstName(fname);
                        System.out.println("Edit your last name: ");
                        String lname = input.next();
                        January.getVisitorIndex(choice-1).setLastName(lname);
                        System.out.println("Edit your gender: ");
                        String gender = input.next();
                        January.getVisitorIndex(choice-1).setGender(gender);
                        System.out.println("Account successfully updated!!");
                        System.out.printf("ID %d %s %s",choice,January.getVisitorIndex(choice-1).getFirstName(),
                        January.getVisitorIndex(choice-1).getLastName());
                        }
                    else{
                        System.out.println("Wrong password!");
                        System.out.println("\n");
                        }
                    }
                }
        //======================================================================================================================
            else{
                //If the user input is not 1,2,3,4,5,6,7
                System.out.println("Please choose the right number!");
                System.out.println("\n");
            }
        }
//-------------------------------------------------------------------------------------------------------------------------------
            }else if(admin==3 ){
                //EXIT 
                System.out.println("Are you sure that you want to exit? (Y/N)");
                //To ensure the user is sure that he wants to exit
                String b = input.next();
                if(b.equals("Y") || b.equals("y")){
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\tGoodbye! Thank you for using our program! :)");
                    System.out.println("\tSee you next time!");
                    System.out.println("=================================================================");
                    SUMMARY();//It calls of the summary method in code below
                    break;//break the first while loop
                }else if(b.equals("N") || b.equals("n")){
                    System.out.println("======================================");
                    System.out.println("Welcome back! :)");
                }else{
                    System.out.println("Please select between Y or N!");
                }
            }else{
                //If he/she not choose between 1-3
                System.out.println("Please select between 1,2,3!");
                System.out.println("\n");
            }
        }//first while loop statement
    }
//-------------------------------------------------------------------------------------------------------------------------------    
    //Summary method to print out the details of the system
    public static void SUMMARY(){
        int z = 0;//for if condition later on
        System.out.printf("=======================THE SUMMARY=======================\n");
        System.out.println("");
        //Get month name
        System.out.println("THE MONTH : " + January.getMonthName());
        // if no account member has been made, no employees have been registered or -
        //no vote has been made or not all vote has been made.
        for (int i = 0; i< January.getNumberOfVisitors(); i++){
            if(January.getVisitorIndex(i).getMyVote()==null){
                z = -1; //indicating if there's an account that hasn't vote
            }
        }
        if(January.getNumberOfVisitors()==0){
            System.out.println("Not enough information to decide the winner!");
        }else if(January.getNumberOfEmployees()==0){
            System.out.println("Not enough information to decide the winner!");
        }else if(z==-1){
            System.out.println("Not enough information to decide the winner!");
        }else{
            //It prints the winner and text THE BEST EMPLOYE ... .
            System.out.println("THE BEST EMPLOYEE OF THE MONTH DETAILS!");
            System.out.println("");
            BEM();//Calling the best employee of the month method
        }
    }
}
//THE END OF THIS PAGE CODE
//-------------------------------------------------------------------------------------------------------------------------------