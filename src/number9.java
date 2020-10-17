import java.util.Arrays;

public class number9 {
    public static void main(String[] args) {
         int[] numbers = {15,10,51,-6,-5,3,-10,-34,0,32,56,-12,24,-52};
         int[] newNumbers = new int[numbers.length];

         for(int i = numbers.length - 1; i > 0;) {
              for(int j = 0; j < numbers.length; j++) {
                  newNumbers[j] = numbers[i];
                    i--;
              }
         }
         //   Arrays.sort(numbers);
        System.out.println(Arrays.toString(newNumbers));
    }
}
