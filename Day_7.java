// Multidimensional Arrays using user input
import java.util.Scanner;
public class Day_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking number of rows and columns as input from the user
        System.out.print("Enter the number of rows:");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns:");
        int cols = sc.nextInt();

        // creating a 2D array
        int[][] arr = new int[rows][cols];

        System.out.println("Enter the elements of array: ");

        // taking input for the 2D array
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Elements of arrays are: ");
        // printing 2D array
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}