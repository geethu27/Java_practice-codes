public class ternary_operator {
    public static void main(String[] args) {
        // Checks the number is even or odd
        int num = 4;
        String status = num % 2 == 0 ?  "is Even" : "is Odd";
        System.out.println(num +  status);
    }
}