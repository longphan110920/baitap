package bai2;

import java.util.Scanner;


public class Bai2 {

   
    public static void main(String[] args) {
        ThoiGian t = new ThoiGian();
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.println("-----MENU-----");
            System.out.println("1. Nhap");
            System.out.println("2. Xuat");
            System.out.println("3. Chuyen sang giay");
            System.out.println("4. Nhap danh sach");
            System.out.println("0. Exit");
            System.out.println("--------------");
            
            System.out.print("Ban chon (0->4): ");
            int choice = Integer.parseInt(in.nextLine().trim());
            
            switch(choice){
                case 1:
                    t.nhap();
                    break;
                case 2:
                    t.xuat();
                    break;
                case 3:
                    int s = t.chuyen();
                    System.out.println("Chuyen sang giay: " + s);
                    break;
                case 4:
                    System.out.print("Nhap so van dong vien: ");
                    int n = Integer.parseInt(in.nextLine().trim());
                    ThoiGian[] a = new ThoiGian [n];
                    int sum = 0;
                    int res = 0, tmp1 = 0, tmp2;
                    for(int i=0;i<a.length;i++){
                        System.out.println("Nhap van dong vien " + i);
                        a[i] = new ThoiGian();
                        a[i].nhap();
                        tmp2 = a[i].chuyen();
                        if(i==0)    tmp1 = tmp2;
                        else if(tmp1 > tmp2){
                            tmp1 = tmp2;
                            res = i;
                        }
                        sum += tmp2;
                    }
                    System.out.println("Van dong vien thu " + res + " chay nhanh nhat: " + tmp1 + " giay");
                    System.out.println("Thoi gian chay trung binh cua cac van dong vien: " + (sum/n) + " giay");
                    break;
                case 0:   
                    System.out.println("Bye!");
                    System.exit(0);
                default:
                    System.out.println("Nhap tu 0->4");
            }
        }
    }
}