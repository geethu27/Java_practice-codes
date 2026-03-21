public class Day_5 {
    public static void main(String[] args) {
        // Break statement using Do-while Loop
        int i = 0;

        do {
            if(i == 80) {
                // Incrementing variable by 5
                i += 5;
                break;
            }
            System.out.print(i + " ");

            // printing elements to show break usage
            i += 5;
        }
        while(i <= 100);
    }
    
}
