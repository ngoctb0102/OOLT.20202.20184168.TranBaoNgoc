import java.util.Scanner;

public class eq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chon chuc nang: \n1. Giai pt bac 1\n2. Pt bac nhat 1 an\n3. Pt bac 2");
        int x = sc.nextInt();
        if (x == 1){
            System.out.print("Nhap he so a :");
            String hsa = sc.next();
            double a = Double.parseDouble(hsa);
            System.out.print("Nhap he so b :");
            String hsb = sc.next();
            double b = Double.parseDouble(hsb);
            if(a == 0){
                if(b == 0){
                    System.out.println("Pt co vo so nghiem");
                } else{
                    System.out.println("Pt vo nghiem");
                }
            }else{
                double pt1;
                pt1 = -b/a;
                System.out.println("Pt co nghiem duy nhat x = " + pt1);
            }
        }
        if (x==2){
            System.out.print("nhap he so a1 :");
            String hs1 = sc.next();
            double a1 = Double.parseDouble(hs1);
            System.out.print("Nhap he so b1 :");
            String hs2 = sc.next();
            double b1 = Double.parseDouble(hs2);
            System.out.print("Nhap he so c1 :");
            String hs3 = sc.next();
            double c1 = Double.parseDouble(hs3);
            System.out.print("Nhap he so a2 :");
            String hs4 = sc.next();
            double a2 = Double.parseDouble(hs4);
            System.out.print("Nhap he so b2 :");
            String hs5 = sc.next();
            double b2 = Double.parseDouble(hs5);
            System.out.print("Nhap he so c2 :");
            String hs6 = sc.next();
            double c2 = Double.parseDouble(hs6);
            double D,D1,D2;
            D = a1*b2-a2*b1;
            D1 = c1*b2 - c2*b1;
            D2 = a1*c2 - a2*c1;
            if(D == 0){
                if(D1 == D2 & D1 == 0 ){
                    System.out.println("He pt co vo so nghiem");
                }else {
                    System.out.println("He phuong trinh vo nghiem");
                }
            }else{
                double x1,x2;
                x1 = D1/D;
                x2 = D2/D;
                System.out.println("He pt co nghiem duy nhat");
                System.out.println("x1 = "+x1);
                System.out.println("x2 = "+x2);
            }
        }
        if (x == 3){
            System.out.print("Nhap he so 1:");
            String hsa = sc.next();
            double a = Double.parseDouble(hsa);
            System.out.print("Nhap he so 2:");
            String hsb = sc.next();
            double b = Double.parseDouble(hsb);
            System.out.print("Nhap he so 3:");
            String hsc = sc.next();
            double c = Double.parseDouble(hsc);
            double delta;
            delta = Math.pow(b,2) - 4*a*c;
            if(delta < 0){
                System.out.println("Phuong trinh vo nghiem");
            }
            if(delta == 0){
                System.out.println("Phuong trinh co nghiem kep");
                double n;
                n = (-b + Math.sqrt(delta))/(2*a);
                System.out.println("x = "+n);
            }
            if(delta > 0){
                System.out.println("Phuong trinh co 2 nghiem phan biet");
                double n1,n2;
                n1 = (-b+Math.sqrt(delta))/(2*a);
                n2 = (-b-Math.sqrt(delta))/(2*a);
                System.out.println("x1 = "+n1);
                System.out.println("x2 = "+n2);
            }
        }
        sc.close();
    }
}
