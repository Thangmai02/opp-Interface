package model;

public class xeMay extends xe implements XemThongTin{
    private String phanKhoi;
    public  xeMay(){}

    public String getPhanKhoi() {
        return phanKhoi;
    }

    public void setPhanKhoi(String phanKhoi) {
        this.phanKhoi = phanKhoi;
    }

    public  xeMay(String phanKhoi, String ten , String gia){
        super(ten,gia);
        this.phanKhoi=phanKhoi;
    }
    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Phân khối: " + phanKhoi);
    }

    @Override
    public void suaTen(String tenMoi) {
        super.suaTen(tenMoi);
    }
}
