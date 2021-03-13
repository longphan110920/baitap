package bai4;

import java.util.Scanner;
public class Bai4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SinhVien[] sv = null;
        while(true){
            System.out.println("-----MENU-----");
            System.out.println("1. Nhap danh sach sinh vien");
            System.out.println("2. Xuat danh sach sinh vien");
            System.out.println("3. Sap xep theo diem trung binh giam dan");
            System.out.println("0. Exit");
            System.out.println("--------------");
            
            System.out.print("Ban chon (0->3): ");
            int choice = Integer.parseInt(in.nextLine().trim());
            
            switch(choice){
                case 1:
                    System.out.print("Nhap so luong sinh vien: ");
                    int n = Integer.parseInt(in.nextLine().trim());
                    sv = new SinhVien[n];
                    for(int i=0;i<n;i++){
                        System.out.println("Nhap sinh vien thu " + i);
                        sv[i] = new SinhVien();
                        sv[i].nhap();
                    }
                    break;
                case 2:
                    System.out.println("Ho ten \t Ngay sinh \t Gioi tinh \t Lop \t"
                            + "Diem toan \t Diem ly \t Diem hoa \t Diem trung binh");
                    for(int i=0;i<sv.length;i++){
                        sv[i].xuat();
                    }
                    break;
                case 3:
                    for(int i=0;i<sv.length-1;i++){
                        for(int j=i+1;j<sv.length;j++){
                            if(sv[j].getDtb() > sv[i].getDtb()){
                                SinhVien s = sv[i];
                                sv[i] = sv[j];
                                sv[j] = s;
                            }
                        }
                    }
                    System.out.println("Ho ten \t Ngay sinh \t Gioi tinh \t Lop \t"
                            + "Diem toan \t Diem ly \t Diem hoa \t Diem trung binh");
                    for(int i=0;i<sv.length;i++){
                        sv[i].xuat();
                    }
                    break;
                case 0:   
                    System.out.println("Bye!");
                    System.exit(0);
                default:
                    System.out.println("Nhap tu 0->3");
            }
        }
    }
    
}
