/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        int choice;
        System.out.println("Pick one:1.Hi\t2.Hey\t3.Hello\t");
        Scanner s=new Scanner(System.in);
        choice=s.nextInt();
        switch(choice)
        {
            case 1:System.out.println("You said Hi");
            break;
            case 2:System.out.println("You said Hey");
            break;
            case 3:System.out.println("You said Hello");
            break;
                
        }
    }
}



