
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Zadatak 1.

        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the size of the Array: ");

        int sizeOfArray = reader.nextInt();
        int[] numbersInArray = new int[sizeOfArray];

        for (int i = 0; i < sizeOfArray; i++) {
            System.out.println("Enter a number for position " + i + ": ");
            numbersInArray[i] = reader.nextInt();
        }

        System.out.println("The numbers in Array are: ");
        for (int i = sizeOfArray - 1; i >= 0; i--) {
            if (numbersInArray[i] % 2 ==0) {
                System.out.println(numbersInArray[i] + " number is even.");
            }else {
                System.out.println(numbersInArray[i] + " number is odd.");
            }
        }

        //Zadatak 2.

        int[] basicArray = {76543210, 6543210, 543210, 43210, 3210, 210, 10, 1, -1, -10, -210, -3210, -43210, -543210, -6543210};
        String[] positionArray = {"1st: ", "2nd: ", "3rd: ", "4th: ", "5th: ", "6th: ", "7th: ", "8th: ", "9th: ",
                                    "10th: ", "11th: ", "12th: ", "13th: ", "14th: ", "15th: "};

        if (basicArray.length <= 15) {
            for (int i = 0; i < basicArray.length; i++) {
                System.out.println( positionArray[i] + basicArray[i]);
            }
        }else {
            System.out.println("Basic array has more than 15 positions!");
        }

        //Zadatak 3.

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\nEnter the size of Array: ");

        int sizeOfArray2 = scanner.nextInt();
        int[] enteredArray = new int[sizeOfArray2];

        System.out.println("Enter the elements of Array: ");
        for (int i = 0; i < sizeOfArray2; i++) {
            enteredArray[i] = scanner.nextInt();
        }

        System.out.print("Array printed in reverse order: ");
        for (int i = sizeOfArray2 -1; i >= 0; i--) {
            System.out.print(enteredArray[i] + " ");
        }

        //Zadatak 4.

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("\n\nEnter a random word to check if it is palindrome: ");
        String wordToCheck = scanner1.nextLine();

        boolean isWordPalindrome = true;
        char[] wordCharacters = wordToCheck.toCharArray();
        for (int i = 0; i < wordCharacters.length / 2; i++) {
            if (wordCharacters[i] != wordCharacters[wordCharacters.length - i - 1]) {
                isWordPalindrome = false;
                break;
            }
        }

        if (isWordPalindrome) {
            System.out.println(wordToCheck + " is palindrome");
        }else {
            System.out.println(wordToCheck + " is not palindrome");
        }

        //Zadatak 5.

        Scanner scanner2 = new Scanner(System.in);

        System.out.println("\nEnter the first number in range: ");
        int rangeStart = scanner2.nextInt();

        System.out.println("Enter the last number in range: ");
        int rangeEnd = scanner2.nextInt();

        System.out.println("Even numbers in range are: ");
        for (int i = rangeStart + 1; i < rangeEnd; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }

        //Zadatak 6.

        int[] firstArray = {1, 2, 3};
        int[] secondArray = {4, 5, 6};
        char[] thirdArray = {'a', 'b', 'c'};

        int[] largeArray = new int[firstArray.length + secondArray.length + thirdArray.length];

        int index = 0;
        for (int i = 0; i < firstArray.length; i++) {
            largeArray[index++] = firstArray[i];
        }

        for (int i = 0; i < secondArray.length; i++) {
            largeArray[index++] = secondArray[i];
        }

        for (char i = 0; i < thirdArray.length; i++) {
            largeArray[index++] = thirdArray[i];
        }

        System.out.println("\nLarge Array is:" + Arrays.toString(largeArray));



    }
}