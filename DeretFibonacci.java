import java.util.Scanner;

public class DeretFibonacci {
    static int fibonacci(int n) {
        if (n <= 1) {
            return n;  
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); 
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jumlah deret fibonacci: ");
        int jumlah = input.nextInt(); 

        int total = 0; 
        System.out.print("Deret Fibonacci: ");

        for (int i = 0; i < jumlah; i++) {
            int nilai = fibonacci(i); 
            total += nilai;
            if (i < jumlah - 1) {
                System.out.print(nilai + " + ");
            } else {
                System.out.print(nilai + " = " + total);
            }
        }

        input.close();
    }
}
