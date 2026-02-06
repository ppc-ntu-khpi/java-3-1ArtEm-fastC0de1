package test;
import java.util.Scanner;
import domain.Exercise;

public class TestResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start of the range ");
        int start = sc.nextInt();
        System.out.println("Enter the end of the range ");
        int end = sc.nextInt();
        int size = end - start + 1;
        int[] arr = new int[size];
        
        int index = 0;
        for (int i = start; i <= end; ++i){
            arr[index] = i;
            index++;
        }
        Exercise exercise = new Exercise();
        String result = exercise.Calculate(arr, size);
        System.out.println(result);
    }
}
