import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayFun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chieu dai mang : ");
        int n = sc.nextInt();
        int[] a = new int[1000];
        int[] ar = new int[n];
        Random rd = new Random();
        for(int i = 0;i<1000;i++){
            a[i] = rd.nextInt(1000);
        }
        for(int i = 0;i<n;i++){
            System.out.printf("Nhap vao phan tu a[%d] : (an $ de bo qua)\n",i);
            String strNum = sc.next();
            if(strNum.compareTo("$") == 0){
                ar[i] = a[i];
            }else{
                int num = Integer.parseInt(strNum);
                ar[i] = num;
            }
        }
        int Sum = 0;
        for(int i = 0;i<n;i++){
            Sum = Sum + ar[i];
        }
        double Avg;
        Avg = (double)Sum/(double)n;
        System.out.println("Unsorted array : " + Arrays.toString(ar));
        Arrays.sort(ar);
        System.out.println("Sum = " + Sum + "\nAvg = " + Avg);
        sc.close();
        System.out.println("Sorted array : " + Arrays.toString(ar));

    }
}
