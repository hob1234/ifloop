package assignment3;

public class Numbers {

    public static void main(String[] args) {
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] = i + 1);
        }
        for (int n : numbers) {
            System.out.println(n);
        }
    }

}
