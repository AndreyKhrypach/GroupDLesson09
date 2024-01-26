import java.util.Arrays;
import java.util.Random;

public class Lesson09Program {
    public static void main(String[] args) {

        int[] array = new int[]{1, 1, 1, 5, 5};
        System.out.println(Arrays.toString(array));
        int countLeftSide = 1;
        int countRightSide = 1;

        for (int i = 0; i < array.length - 1; i++) {
            if(array[i] == array[i + 1]){
                countLeftSide++;
            }
            else {
                break;
            }
        }
        System.out.println("Left side number = " + array[0] + " count = "+ countLeftSide);
        reverseArray(array);
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length - 1; i++) {
            if(array[i] == array[i + 1]){
                countRightSide++;
            }else{
                break;
            }
        }

        System.out.println("Right side number = " + array[0] + " count = "+ countRightSide);
//        int[] arrayQueue = new int[53];
//        initializeArray(arrayQueue);
//        int time = 0;
//        for (int i = 0; i < arrayQueue.length; i++) {
//            time += arrayQueue[i];
//            System.out.println(time);
//        }

//        int[] array = new int[100];
//        initializeArray(array);
//        System.out.println(Arrays.toString(array));
//
//        int countPositive = 0;
//        int countNegative = 0;
//        int countZero = 0;
//        for (int i = 0; i < array.length; i++) {
//            if(array[i] > 0){
//                countPositive++;
//            } else if (array[i] < 0) {
//                countNegative++;
//            }else {
//                countZero++;
//            }
//        }
//
//        System.out.println("Negative numbers = " + countNegative);
//        System.out.println("Positive numbers = " + countPositive);
//        System.out.println("Zero numbers = " + countZero);

//        InterestingNumber interestingNumber = new InterestingNumber();
//        System.out.println(interestingNumber.defaultNumber);
//        interestingNumber.interestingDivide();
//        System.out.println( interestingNumber.defaultNumber /
//                interestingNumber.defaultNumber == interestingNumber.defaultNumber
//        / interestingNumber.defaultNumber);

//        int sumNumbers = 0;
//        for (int i = 0; i <= 7; i++) {
//            sumNumbers += i;
//        }
//        System.out.println(sumNumbers);

        // factorial = 1 * 2 * 3 * 4 * 5 *.... 20
//        long factorial = 1;
//        for (int i = 1; i <= 20; i++ ) {
//            factorial *= i;
//
//            System.out.print(factorial + ":" + i + " ");
//            if(i % 4 == 0){
//                System.out.println();
//            }
//        }
//        System.out.println(factorial);
    }

    public static void initializeArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(9) + 1;
        }
    }

    public static void reverseArray(int[] array){
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }
    public static void displayNumbers(int a, int b) {
        System.out.println(a + " : " + b);
    }

    public static void displayNumbers(byte a, byte b) {
        System.out.println(a + " : " + b);
    }

    public static void displayNumbers(short a, short b) {
        System.out.println(a + " : " + b);
    }

    public static void displayNumbers(int a, byte b) {
        System.out.println(a + " : " + b);
    }

    public static void displayNumbers(int a, long b) {
        System.out.println(a + " : " + b);
    }

    public static void displayNumbers(byte a, int b) {
        System.out.println(a + " : " + b);
    }

    public static void getDuplicates(int[] array) {
        int duplicateNumber = 1;
        int duplicateLength = 1;
        for (int index = 0; index < array.length; index++) {
            if (index == 0) {
                duplicateNumber = array[index];
                continue;
            }

            if (duplicateNumber == array[index]) {
                duplicateLength++;
            } else {
                break;
            }
        }
        System.out.println(duplicateNumber + ":" + duplicateLength);
    }

    public static int[] revertArray(int[] array) {
        int[] array2 = new int[array.length];
        for (int i = array.length-1; i > 0;) {
            for (int j = 0; j < array.length; j++) {
                array2[j] = array[i];
                i--;
            }
        }
        return array2;
    }
}
