package exceptions;

import java.util.Scanner;

public class Exceptions {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean valid = false;
        int num = 0;
        
        while (valid == false) {
            try {
                System.out.println("Type in a number");
                num = input.nextInt();
                //put other validation here such as (if num > whatever)
                valid = true;
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Incorrect");
                input.next();
            }
        }

        System.out.println("User inputted following number: " + num);

    }

}
