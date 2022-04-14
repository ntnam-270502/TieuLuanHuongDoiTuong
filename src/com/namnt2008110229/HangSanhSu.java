package com.namnt2008110229;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class HangSanhSu extends HangHoa{
    private String nhaSanXuat;
	private LocalDate ngayNhapKho;
	
	
	public HangSanhSu(String maHang, String tenHang, int soLuongTon, double donGia,
			String nhaSanXuat, LocalDate ngayNhapKho) {
		super(maHang, tenHang, soLuongTon, donGia);
		this.nhaSanXuat = nhaSanXuat;
		this.ngayNhapKho = ngayNhapKho;
	}
	
	

	public String getNhaSanXuat() {
		return nhaSanXuat;
	}



	public void setNhaSanXuat(String nhaSanXuat) {
		this.nhaSanXuat = nhaSanXuat;
	}



	public LocalDate getNgayNhapKho() {
		return ngayNhapKho;
	}



	public void setNgayNhapKho(LocalDate ngayNhapKho) {
		this.ngayNhapKho = ngayNhapKho;
	}

	@Override
	public boolean validate() {
		
		return super.validate();
	}

	@Override
	public double getVAT() {
		double VAT = (getDonGia() * 10) / 100;
		return VAT;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\n" +
				"Nha san xuat : "+this.nhaSanXuat+"\n"+
				"Ngay nhap kho "+LocalDateConverter.dateToString(ngayNhapKho);
		
	}



	@Override
	public void danhGiaMucDo() {
		if(getSoLuongTon() > 50 && ChronoUnit.DAYS.between(ngayNhapKho, LocalDate.now()) > 10) {
			System.err.println("Kho ban");
		} else {
			System.out.println("Khong danh gia");
		}
		
	}
	
}
