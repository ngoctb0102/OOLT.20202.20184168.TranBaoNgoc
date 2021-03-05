import java.util.Random;
import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so dong cua mang : ");
        int iLine = sc.nextInt();
        System.out.println("Nhap so cot cua mang : ");
        int iCol = sc.nextInt();
        Random rd = new Random();
        int[][] Matrices1 = new int[iLine][iCol];
        int[][] Matrices2 = new int[iLine][iCol];
        System.out.println("Nhap du lieu cho ma tran thu nhat: (nhan $ neu muon tu dong nhap)");
        for(int i = 0;i<iLine;i++){
            for(int j = 0;j<iCol;j++){
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]:");
                String strNum = sc.next();
                if(strNum.compareTo("$") == 0){
                    Matrices1[i][j] = rd.nextInt(100);
                }else{
                    int num = Integer.parseInt(strNum);
                    Matrices1[i][j] = num;
                }
            }
        }
        System.out.println("Nhap du lieu cho ma tran thu nhat: (nhan $ neu muon tu dong nhap)");
        for(int i = 0;i<iLine;i++){
            for(int j = 0;j<iCol;j++){
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                String strNum = sc.next();
                if(strNum.compareTo("$") == 0){
                    Matrices2[i][j] = rd.nextInt(100);
                }else{
                    int num = Integer.parseInt(strNum);
                    Matrices2[i][j] = num;
                }
            }
        }
        int [][] Sum = new int[iLine][iCol];
        for(int i = 0;i<iLine;i++){
            for(int j = 0;j<iCol;j++){
                Sum[i][j] = Matrices1[i][j] + Matrices2[i][j];
            }
        }
        sc.close();
        System.out.println("Ma tran thu nhat :");
        for(int i = 0;i<iLine;i++){
            for(int j = 0;j<iCol;j++){
                System.out.print(Matrices1[i][j] + "\t");
            }
            System.out.print("\n");
        }
        System.out.println("Ma tran thu hai :");
        for(int i = 0;i<iLine;i++){
            for(int j = 0;j<iCol;j++){
                System.out.print(Matrices2[i][j] + "\t");
            }
            System.out.print("\n");
        }
        System.out.println("Tong cua 2 ma tran :");
        for(int i = 0;i<iLine;i++){
            for(int j = 0;j<iCol;j++){
                System.out.print(Sum[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}
