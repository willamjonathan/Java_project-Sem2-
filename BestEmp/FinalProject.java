public class FinalProject extends Driver implements Background, animation {
    //This class extends the driver class and implements background and animation interfaces
    public static void main(String[] args){
        //To print the HI animation
        for(int i = 0; i < hiAnimation.length; i++){
            //using for loops to print all the string in the array
            System.out.println(hiAnimation[i]);
        }
        System.out.println("======================================");
        System.out.println("Press any key to continue...");
        String a = input.next();
        //after inputing a keyword it will prints the background of the app information
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        for(int i = 0; i < BACKGROUND.length; i++){
            //using for loops to print all the string in background array
            System.out.println(BACKGROUND[i]);
        }
        System.out.println("Press any key to continue...");
        String b = input.next();
        //after inputing a keyword it will execute the driver class and print a text
        System.out.println("\n\n\t\tWelcome to the voting program!\n");
        //calling mainpage method from driver class
        MAINPAGE(); // as we use static, no need for object
        System.out.println("======================================");
        //To print the good bye animation 
        for(int i = 0; i < goodbyeAnimation.length; i++){
            //using for loops to print all the string in the array
            System.out.println(goodbyeAnimation[i]);
        }
        System.out.println("\n");
    }
}
