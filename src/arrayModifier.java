import java.util.Scanner;

public class arrayModifier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please input a phrase. ");
        String userInp = input.next();
        int num = userInp.length();
        char[][] usrArray = arrayCreator(userInp);

        for (int i = 0; i < usrArray.length; i++) {
            System.out.println(" ");
            
            for (int j = 0; j < usrArray[i].length; j++) {

                System.out.print(usrArray[i][j] + " ");
            }
        }
        



    }

    //method that creates an array and fills it with the characters from the phrase inputted by the user

    public static char[][] arrayCreator(String str) {
        
        int index = 0;
        int strSize = str.length();
        char [][] newArray = new char[strSize][strSize];

            //creates empty rows seperated by a line break, then runs inner loop, then incr. index
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(" ");

            //creates columns and fills them with the str
            for (int j = 0; j < newArray.length; j++) {
                 
               
                newArray[i][j] = str.charAt(j);
                index++;
               
        }
            
            
        }
        return newArray;
    }
}
