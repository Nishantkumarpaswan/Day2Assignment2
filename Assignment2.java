import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;

        System.out.print("Enter a string: ");
        str = sc.nextLine();

        int choice;
        char continueChoice;

        do {
            System.out.println("\n********** MENU **********");
            System.out.println("1. Count Vowels and Consonants");
            System.out.println("2. Check Palindrome");
            System.out.println("3. Reverse the String");
            System.out.println("4. Convert to Uppercase and Lowercase");
            System.out.println("5. Replace a Word");
            System.out.println("6. Exit");
            System.out.println("**************************");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    int vowels = 0, consonants = 0;
                    String Str = str.toLowerCase();
                    for(int i=0;i<str.length();i++){
                        char ch=str.charAt(i);
                        if(ch=='a'|| ch=='e'|| ch=='i'||ch=='o'|| ch=='u'){
                            vowels++;
                        }
                        else{
                            consonants++;
                        }

                    }
                    System.out.println("Vowels: " + vowels);
                    System.out.println("Consonants: " + consonants);
                    break;

                case 2:
                System.out.println("enter the string");
                str=sc.nextLine();
                String str2=str;

                    String rev="";
                    for(int i=str.length()-1;i>=0;i--){
                        rev=rev+str.charAt(i);
                    }
                    if(str.equalsIgnoreCase(str2)){
                        System.out.println("palindrome no");
                    }
                    else{
                        System.out.println("not a palindrome no");
                    }
                    break;

                case 3:
                System.out.println("enter the string");
                str=sc.nextLine();
                String str3=str;
                    String rev1="";
                    for(int i=str.length()-1;i>=0;i--){
                        rev=rev1+str.charAt(i);
                    }
                    System.out.println("ther reversed String is"+rev1);
                    break;

                case 4:
                    System.out.println("Uppercase: " + str.toUpperCase());
                    System.out.println("Lowercase: " + str.toLowerCase());
                    break;

                case 5:
                    System.out.print("Enter the word to replace: ");
                    String oldWord = sc.nextLine();
                    System.out.print("Enter the new word: ");
                    String newWord = sc.nextLine();
                    str = str.replace(oldWord, newWord);
                    System.out.println("Updated String: " + str);
                    break;

                case 6:
                    System.out.println("Exiting program.");
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

            System.out.print("\nBack to Menu? (Y/N): ");
            continueChoice = sc.next().charAt(0);
            sc.nextLine(); // consume newline

        } while (continueChoice == 'Y' || continueChoice == 'y');

        sc.close();
        System.out.println("Program terminated.");
    }
}
