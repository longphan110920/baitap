package bt;

import java.util.Scanner;
//thuoc tinh
public class bai4 {
	private String ten;
	private double gia;
	private double giamGia;
	
	public String getTenSP() {
		return ten;
	}
	
	public void setTenSP(String ten) {
		this.ten=ten;
	}
	
	public double getGiaSP() {
		return gia;
	}
	
	public void setGiaSP(double gia) {
		this.gia=gia;
	}
	
	public double getGiamGia() {
		return giamGia;
	}
	
	public void setGiamGia(double giamGia) {
		this.giamGia=giamGia;
	}
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
	public bai4(String ten, double gia, double giamGia) {
		this.ten = ten;
		this.gia = gia;
		this.giamGia = giamGia;
	}
	public bai4() {
	}
	public bai4(String ten, double gia) {
		this(ten,gia,0);
	}
}