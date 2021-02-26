import java.util.Scanner;
public class CalD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so thu nhat: ");
        String a = sc.next();
        System.out.print("nhap so thu hai: ");
        String b = sc.next();
        Double num1 = Double.parseDouble(a);
        Double num2 = Double.parseDouble(b);
        Double sum,dif,pro,quo;
        sum = num1 + num2;
        dif = num1 - num2;
        pro = num1*num2;
        System.out.println("Tong la :" + sum);
        System.out.println("Hieu la :" + dif);
        System.out.println("Tich la :" + pro);
        if (num2 == 0){
            System.out.println("So chia la 0");
        } else {
            quo = num1/num2;
            System.out.println("Thuong la :" + quo);
        }
        sc.close();
    }
}
