package bt;

import java.util.Scanner;
//thuoc tinh
public class SanPham {
	public String ten;
	public double gia;
	public double giamGia;
	//phuong thuc
	public double tinhThueNhapKhau() {
		double tnk = gia * 0.1;
		return tnk;
	}
	public void xuat() {
		System.out.printf("Thong tin san pham:\n");
		System.out.printf("Ten San Pham: %s\n", ten);
		System.out.printf("Gia San Pham: %.1f\n", gia);
		System.out.printf("Giam gia: %.1f\n", giamGia);
		System.out.printf("Thue nhap khau: %.1f\n", tinhThueNhapKhau());
	}
	public void nhap() {
		System.out.println("\nNhap thong tin san pham: Ten; Gia; Giam Gia; Thue");
	try (Scanner scanner = new Scanner(System.in)) {
		ten = scanner.next();
		gia = Double.parseDouble(scanner.next());
		giamGia = Double.parseDouble(scanner.next());
	  }
	}
	//// constructor
	
	////
	public SanPham(String ten, double gia, double giamGia) {
		this.ten = ten;
		this.gia = gia;
		this.giamGia = giamGia;
	}
	public SanPham() {
	}
	public SanPham(String ten, double gia) {
		this(ten,gia,0);
	}
}