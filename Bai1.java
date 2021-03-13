package bai1;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		diem d = new diem();
		d.nhap();
		d.xuat();
		d.diemdoixung();
		d.khoangcach2diem();
	}
}
	class diem{
		int x,y;
		int x1,y1;
		double kc;
		void nhap() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Nhap toa do x:");
			x = scanner.nextInt();
			System.out.println("Nhap toa do y:");
			y = scanner.nextInt();
		}
		
		void xuat() {
			System.out.println("Toa do cua diem do la:" + (x+","+y));
		}
		void diemdoixung() {
			x1 = -x;
			y1 = y;
			System.out.println("Toa do diem doi xung qua Ox la:" + (x1+","+y1));
		}
		void khoangcach2diem() {
			kc = Math.sqrt(Math.pow((x1-x),2) + Math.pow((y1-y),2));
			System.out.println("Khoang cach 2 diem la:" + kc);
		}
	}