import java.util.Arrays;
import java.util.Scanner;

public class Main {
    int[] arr;
    Main(int x){
        arr = new int[x];
    }
    public void Display(){
        Arrays.sort(arr); //https://www.geeksforgeeks.org/arrays-sort-in-java-with-examples/
        for(int A : arr){
            System.out.println(A + " ");
        }
    }
    public void input(){
        Scanner numbers = new Scanner(System.in);
        for(int i=0;i< arr.length;i++){
            arr[i] = numbers.nextInt();
        }

    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.print("Enter num of numbers: ");
        int num = x.nextInt();
        while(num < 0){
            System.out.print("Enter num of numbers: ");
            num = x.nextInt();
        }
        Main number = new Main(num);
        number.input();
        number.Display();


    }


}
