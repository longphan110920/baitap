package bai4;

import java.util.Scanner;

public class SinhVien {
    private String hoTen, ngaySinh, gioiTinh, lop;
    private double toan, ly, hoa, dtb;
    Scanner in = new Scanner(System.in);

    public SinhVien() {
    }
    
    private double tinhDTB(){
        return (toan + ly + hoa) / 3;
    }
    
    public void nhap(){
        System.out.print("Nhap ho ten: ");
        this.hoTen = in.nextLine().trim();
        System.out.print("Nhap ngay sinh: ");
        this.ngaySinh = in.nextLine().trim();
        System.out.print("Nhap gioi tinh: ");
        this.gioiTinh = in.nextLine().trim();
        System.out.print("Nhap lop: ");
        this.lop = in.nextLine().trim();
        System.out.print("Nhap diem toan: ");
        this.toan = Integer.parseInt(in.nextLine().trim());
        System.out.print("Nhap diem ly: ");
        this.ly = Integer.parseInt(in.nextLine().trim());
        System.out.print("Nhap diem hoa: ");
        this.hoa = Integer.parseInt(in.nextLine().trim());
        this.dtb = tinhDTB();
    }
    
    public void xuat(){
        System.out.println(hoTen + "\t" + ngaySinh + "\t" + gioiTinh + "\t" 
                + lop + "\t" + toan + "\t" + ly + "\t" + hoa + "\t" + dtb);
    }

    public double getDtb() {
        return dtb;
    }
}
