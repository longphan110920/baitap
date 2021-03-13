package bai2;

import java.util.Scanner;


public class ThoiGian {
    private int gio, phut, giay;
    Scanner in = new Scanner(System.in);
    public ThoiGian(){
        gio = phut = giay = 0;
    }
    
    public ThoiGian(int gio, int phut, int giay){
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }
    
    public void nhap(){
        System.out.print("Nhap gio: ");
        gio = Integer.parseInt(in.nextLine().trim());
        System.out.print("Nhap phut: ");
        phut = Integer.parseInt(in.nextLine().trim());
        System.out.print("Nhap giay: ");
        giay = Integer.parseInt(in.nextLine().trim());
    }
    
    public void xuat(){
        System.out.println(gio + " gio, " + phut + " phut, " + giay + " giay");
    }
    
    public int chuyen(){
        int t = gio*3600 + phut*60 + giay;
        return t;
    }
}
