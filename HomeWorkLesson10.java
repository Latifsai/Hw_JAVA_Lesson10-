import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWorkLesson10 {
    public static void main(String[] args) {

        BubbleSort();

    }

    static void BubbleSort() {

        Random random = new Random();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array lenght:");
        int arrayLenght = scanner.nextInt();




        int[] sortWithBubble = new int[arrayLenght];
        for (int i = 0; i < arrayLenght; i++) {
            int randomMethod = random.nextInt(0, 500);
            System.out.println("sortWithBubble [" + i + "]=");
            sortWithBubble[i] = randomMethod;

        }
        System.out.println(Arrays.toString(sortWithBubble));

        boolean isReady;


        do {
            isReady = true;
            for (int i = 1; i < sortWithBubble.length; i++) {
                if (sortWithBubble[i] < sortWithBubble[i - 1]) {
                    int varForThisTime = sortWithBubble[i];
                    sortWithBubble[i] = sortWithBubble[i - 1];
                    sortWithBubble[i - 1] = varForThisTime;
                    isReady = false;
                }

            }
            System.out.println(Arrays.toString(sortWithBubble));
        }while (!isReady);
    }




}
