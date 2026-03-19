public class Day_4 {
    public static void main(String[] args) {
        // Sum of the range using brute_force method

        int a = 5;
        int b = 10;
        int sum = 0;

        for(int i = a; i <= b; i++) {
            sum = sum + i;
            System.out.println("The sum is: " + sum);
        }




        // Sum of range using formula
        System.out.println("Method 2");

        int num1 = 2;
        int num2 = 4;
        int Sum = num2 * (num2 + 1)/2 - num1 * (num1 + 1) / 2 + num1;
        System.out.println("The range is: " + Sum);

    }
}