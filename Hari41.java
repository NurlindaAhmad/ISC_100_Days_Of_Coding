import java.util.Scanner;

public class Hari41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("");
        int jumlahnilai = sc.nextInt();

        double sum = 0;

        for (int i = 1; i <= jumlahnilai; i++) {
            System.out.print("inputan " + i + ":" );
            double nilai = sc.nextDouble();
            sum += nilai;
        }
        
        double average = sum / jumlahnilai;

        System.out.println("Average : " + average);
        System.out.println("SUM : " + sum);

        sc.close();
    }
}