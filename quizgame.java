import java.io.*;
import java.lang.*;

public class quizgame {

    public static void main(String[] args) throws IOException {
        System.out.println("*********** Welcome To KBC *********");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(reader);

        while (true) {
            System.out.println("==================MAIN MENU=================");
            System.out.println("type 1. for MISCELLANEOUS");
            System.out.println("type 2. for COMPUTERS");
            System.out.println("type 3. to exit");
            System.out.println("============================================");
            System.out.println("PLEASE ENTER YOUR CHOICE OF INTEREST");
            System.out.println();
            System.out.println("PRESS 1 OR 2 OR 3");
            int choice = Integer.parseInt(input.readLine());
            if (choice == 1) {
                int score = 0;
                System.out.println("GET READY FOR THE BRAIN STORMING SESSION");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("\n");
                System.out.println("*****Q1)WHICH IS THE BIGGEST OCEAN IN THE WORLD?*******");
                System.out.println("######### 1.ATLANTIC OCEAN ########");
                System.out.println("######### 2.INDIAN OCEAN ##########");
                System.out.println("######### 3.ARCTIC OCEAN ##########");
                System.out.println("######### 4.PACIFIC OCEAN ##########");
                System.out.println("ENTER YOUR CHOICE");
                int ch = Integer.parseInt(input.readLine());
                if (ch == 4) {
                    score = score + 10;
                    System.out.println("YOUR SCORE IS: " + score);
                    System.out.println();
                } else
                    System.out.println("~~~SORRY WRONG ANSWER!!:( THE CORRECT ANSWER IS PACIFIC OCEAN");
                System.out.println();
                System.out.println("*****Q2)WHAT IS THE NAME OF PRIME MINISTER OF INDIA IN 2014?");
                System.out.println("####### 1.INDIRA GANDHI #######");
                System.out.println("####### 2.RAHUL GANDHI ########");
                System.out.println("####### 3.NARENDRA MODI #######");
                System.out.println("####### 4.JAWAHARLAL NEHRU #######");
                ch = Integer.parseInt(input.readLine());
                if (ch == 3) {
                    score = score + 10;
                    System.out.println("YOUR SCORE IS: " + score);
                    System.out.println();
                } else
                    System.out.println("~~~SORRY WRONG ANSWER!!:( THE CORRECT ANSWER IS NARENDRA MODI");
                System.out.println();
                System.out.println("*****Q3)which is the biggest flower in the world?");
                System.out.println("####### 1.RAFFLESIA #######");
                System.out.println("####### 2.ROSE ########");
                System.out.println("####### 3.GULMOHAR #######");
                System.out.println("####### 4.LILY #######");
                ch = Integer.parseInt(input.readLine());
                if (ch == 1) {
                    score = score + 10;
                    System.out.println("YOUR SCORE IS " + score);
                    System.out.println();
                } else
                    System.out.println("~~~SORRY WRONG ANSWER!!:( THE CORRECT ANSWER IS RAFFLESIA");
                System.out.println();
                System.out.println("*****Q4)who is the inventer of ATM?");
                System.out.println("####### 1.MARCONI #######");
                System.out.println("####### 2.ISAAC NEWTON ########");
                System.out.println("####### 3.GALILEO GALILEI #######");
                System.out.println("####### 4.JOHN SHEPHERD BARRON #######");
                ch = Integer.parseInt(input.readLine());
                if (ch == 4) {
                    score = score + 10;
                    System.out.println("YOUR SCORE IS: " + score);
                    System.out.println();
                } else
                    System.out.println("~~~SORRY WRONG ANSWER!!:( THE CORRECT ANSWER IS JOHN SHEPERD BARRON");
                System.out.println();
                System.out.println("*****Q5)In which game do people jump from a considerable height while attached to an elastic rope?");
                System.out.println("####### 1.SKY DIVING #######");
                System.out.println("####### 2.BUNGEE JUMPING ########");
                System.out.println("####### 3.HAND GLIDING #######");
                System.out.println("####### 4.SCUBA DIVING #######");
                ch = Integer.parseInt(input.readLine());
                if (ch == 2) {
                    score = score + 10;
                    System.out.println("YOUR SCORE IS: " + score);
                    System.out.println();
                } else
                    System.out.println("~~~SORRY WRONG ANSWER!!:( THE CORRECT ANSWER IS BUNGEE DIVING");
                System.out.println();
                System.out.println("*****Q6)Which bollywood movie is based on a chetan bhagat's novel'famous point someone-what not do at IIT'?");
                System.out.println("####### 1. 2STATES #######");
                System.out.println("####### 2. YEH JAWAANI HAI DEEWANI ########");
                System.out.println("####### 3. SALAAM NAMASTE #######");
                System.out.println("####### 4. 3IDIOTS #######");
                ch = Integer.parseInt(input.readLine());
                if (ch == 4) {
                    score = score + 10;
                    System.out.println("YOUR SCORE IS" + score);
                    System.out.println();
                } else
                    System.out.println("~~~~~~SORRY WRONG ANSWER!!:( THE CORRECT ANSWER IS 3IDIOTS");
                System.out.println();
                System.out.println("FINALLY U HAVE SCORED " + score);
                if (score <= 20)
                    System.out.println("you get GRADE C ...BETTER LUCK NEXT TIME:)");
                else if (score <= 50)
                    System.out.println("CONGRATULATIONS U GET GRADE B ...TRY TO GET GRADE A");
                else
                    System.out.println("CONGRATULATIONS YOU GET GRADE A :)");
            } else if (choice == 2) {
                int score = 0;
                System.out.println("GET READY FOR BRAIN STORMING SESSION!!");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("********Q1.In which menu does the control panel found?********");
                System.out.println("####### 1) START #####");
                System.out.println("####### 2) MS OFFICE ######");
                System.out.println("####### 3) ACCESSORIES #####");
                System.out.println("####### 4) ALL PROGRAMS ######");
                int ch = Integer.parseInt(input.readLine());
                if (ch == 1) {
                    score = score + 10;
                    System.out.println("YOUR SCORE IS: " + score);
                    System.out.println();
                } else
                    System.out.println("SORRY WRONG ANSWER!!:( THE CORRECT ANSWER IS START");
                System.out.println("******* Q2.Which of the following is also known as entry controlled loop?");
                System.out.println("####### 1) while loop ####");
                System.out.println("####### 2) do while loop ######");
                System.out.println("####### 3) none of these ####");
                ch = Integer.parseInt(input.readLine());
                if (ch == 1) {
                    score = score + 10;
                    System.out.println("YOUR SCORE IS: " + score);
                    System.out.println();
                } else
                    System.out.println("SORRY! WRONG ANSWER!!:( THE CORRECT ANSWER IS WHILE LOOP");
                System.out.println("******* Q3.what value does default constructor initializes the varaibles in memory");
                System.out.println("####### 1) Two ######");
                System.out.println("####### 2) One ######");
                System.out.println("####### 3) Zero #####");
                System.out.println("####### 4) None of these ######");
                ch = Integer.parseInt(input.readLine());
                if (ch == 3) {
                    score = score + 10;
                    System.out.println("YOUR SCORE IS: " + score);
                    System.out.println();
                } else
                    System.out.println("SORRY WRONG CHOICE!!:( THE CORRECT ANSWER IS ZERO");
                System.out.println("******* Q4.Private,Public and Protected are the types of___________");
                System.out.println("####### 1) Excess modifiers ####");
                System.out.println("####### 2) Data type ######");
                System.out.println("####### 3) Access modifiers ####");
                System.out.println("####### 4) None of these ######");
                ch = Integer.parseInt(input.readLine());
                if (ch == 3) {
                    score = score + 10;
                    System.out.println("YOUR SCORE IS: " + score);
                    System.out.println();
                } else
                    System.out.println("SORRY WRONG ANSWER!!:( THE CORRECT ANSWER IS ACCESS MODIFIERS");
                System.out.println("******* Q5.objects are created using __________operators");
                System.out.println("####### 1) new ####");
                System.out.println("####### 2) dot ######");
                System.out.println("####### 3) ralational ####");
                System.out.println("####### 4) none of these ######");
                ch = Integer.parseInt(input.readLine());
                if (ch == 1) {
                    score = score + 10;
                    System.out.println("YOUR SCORE IS: " + score);
                    System.out.println();
                } else
                    System.out.println("SORRY WRONG ANSWER!!:(THE CORRECT ANSWER IS NEW");
                System.out.println("******* Q6.__________is the way of combining both the data and the functions that operate on that data under a single unit");
                System.out.println("####### 1) Abstraction ####");
                System.out.println("####### 2) Encapsulation ######");
                System.out.println("####### 3) Inheritance ####");
                System.out.println("####### 4) Polymorphism ######");
                ch = Integer.parseInt(input.readLine());
                if (ch == 2) {
                    score = score + 10;
                    System.out.println("YOUR SCORE IS" + score);
                    System.out.println();
                } else
                    System.out.println("SORRY WRONG ANSWER!!:( THE CORRECT ANSWER IS ENCAPSULATION");
                System.out.println("FINALLY U HAVE SCORED : " + score);
                if (score <= 20)
                    System.out.println("you get GRADE C ..BETTER LUCK NEXT TIME:)");
                else if (score <= 50)
                    System.out.println("CONGRATULATIONS U GET GRADE B ...TRY TO GET GRADE A");
                else
                    System.out.println("CONGRATULATIONS YOU GET GRADE A:)");
            } else if (choice == 3) {
                System.out.println("Thank you.");
                break;
            } else {
                System.out.println("WRONG CHOICE!!");
            }

        }//end of while loop
    } //end of main
}//end of class


