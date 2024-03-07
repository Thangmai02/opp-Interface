package model;

public class xe implements XemThongTin{
    private String ten;
    private String gia;
    public xe(){}
    public xe( String ten,String gia){
        this.gia=gia;
        this.ten=ten;

    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }
    public void inThongTin() {
        System.out.println("Tên xe: " + ten);
        System.out.println("Giá: " + gia);
    }


    public void suaTen(String tenMoi) {
        this.ten = tenMoi;
    }
}
