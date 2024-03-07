package model;

public class oTo extends xe implements XemThongTin{
    private String soCho;
    public oTo(){}
    public  oTo( String ten , String gia, String soCho){
        super(ten,gia);
        this.soCho=soCho;
    }

    public String getSoCho() {
        return soCho;
    }

    public void setSoCho(String soCho) {
        this.soCho = soCho;
    }
    @Override
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Số chỗ: " + soCho);
    }

    @Override
    public void suaTen(String tenMoi) {
        super.suaTen(tenMoi);
    }
}
