import java.util.Scanner;

public class ArrayDeclearation {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        double[] arr = new double[5];
        
        for(int index = 0; index < arr.length; index++) {
            System.out.print("Enter " + (index + 1) + " number: ");
            arr[index] = scanner.nextDouble();
        }
        for(int count = 0; count < arr.length; count++) {
            System.out.println(arr[count]);
        }
    }
}

