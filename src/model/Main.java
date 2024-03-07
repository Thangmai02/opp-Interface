package model;

public class Main {
    public static void main(String[] args) {
        xeMay xeMay = new xeMay("4444444", "Wave Alpha", "150");
        oTo oTo = new oTo("Toyota Camry", "1000000000", "5");
        System.out.println("Thông tin của xe máy:");
        xeMay.inThongTin();

        System.out.println("\nThông tin của xe ô tô:");
        oTo.inThongTin();
        xeMay.suaTen("Wave RSX");
        oTo.suaTen("Toyota Fortuner");
        System.out.println("\nThông tin sau khi đổi tên:");
        System.out.println("Tên xe máy: " + xeMay.getTen());
        System.out.println("Tên xe ô tô: " + oTo.getTen());
    }
}
