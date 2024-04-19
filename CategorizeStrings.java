package categorizestrings;

import java.util.Scanner;

public class CategorizeStrings {
    public static void main(String[] args) {
        String cont;
        do {
            Scanner user = new Scanner(System.in);
            String[] str = new String[10];
            String[] longStr = new String[10];
            String[] shortStr = new String[10];
            int x, y, a = 0, b = 0, length;

            for (x = 0; x < 10; x++) {
                System.out.print("Please enter your input (Enter 'Stop' to cancel): ");
                str[x] = user.nextLine();
                if (str[x].equalsIgnoreCase("stop")) {
                    break;
                }
                if (x == 9) {
                    System.out.println("You have reached the maximum amount of inputs");
                }
              
            }

            for (y = 0; y < x; y++) {
                length = str[y].length();
                if (length > 10) {
                    longStr[a] = str[y];
                    a++;
                } else {
                    shortStr[b] = str[y];
                    b++;
                }
            }

            System.out.print("\nWould you like to display long Strings or short Strings?(Input 'long' or 'short'): ");
            String strOutput = user.nextLine();
            if (strOutput.equalsIgnoreCase("short")) {
                if (shortStr[0] == null) {
                    System.out.println("There are no short strings in your input!");
                } else {
                    for (y = 0; y < b; y++) {
                        System.out.println(shortStr[y]);
                    }
                }
            } else {
                if (longStr[0] == null) {
                    System.out.println("There are no long strings in your input!");
                } else {
                    for (y = 0; y < a; y++) {
                        System.out.println(longStr[y]);
                    }
                }
            }

                System.out.println("Enter types of String display ('1' for no space, '2' one space, '3' for more than one space: ");
                String strType = user.nextLine();
                
                CategorizeStrings2 categorize = new CategorizeStrings2();

                for(y = 0; y < x; y++)
                {
                    categorize.categorizer(new String[]{str[y]}, 1);
                     
                }
                
                categorize.displayString(strType);
                

            System.out.print("\nDo you want to continue? (Y/N): ");
            
            cont = user.nextLine();
        } while (cont.equalsIgnoreCase("Y"));
        System.out.println("Ewan ko");
    }
}
