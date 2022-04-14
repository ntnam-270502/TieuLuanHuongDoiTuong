package com.namnt2008110229;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
public class HangThucPham extends HangHoa{
    private LocalDate ngaySanXuat;
	private LocalDate ngayHetHan;
	private String nhaCungCap;
	
	
	public HangThucPham(String maHang, String tenHang, int soLuongTon, double donGia
			,LocalDate ngaySanXuat, LocalDate ngayHetHan, String nhaCungCap) {
		super(maHang, tenHang, soLuongTon, donGia);
		this.ngaySanXuat = ngaySanXuat;
		this.ngayHetHan = ngayHetHan;
		this.nhaCungCap = nhaCungCap;
	}
	
	
	

	public LocalDate getNgaySanXuat() {
		return ngaySanXuat;
	}




	public void setNgaySanXuat(LocalDate ngaySanXuat) {
		this.ngaySanXuat = ngaySanXuat;
	}




	public LocalDate getNgayHetHan() {
		return ngayHetHan;
	}




	public void setNgayHetHan(LocalDate ngayHetHan) {
		this.ngayHetHan = ngayHetHan;
	}




	public String getNhaCungCap() {
		return nhaCungCap;
	}




	public void setNhaCungCap(String nhaCungCap) {
		this.nhaCungCap = nhaCungCap;
	}

	@Override
	public boolean validate() {
		
		if(ngaySanXuat.compareTo(ngayHetHan) > 0) {
			System.err.println("Ngay Het Han phai sau ngay san xuat");
			return false;
		}
		
		return super.validate();
	}
	
	


	@Override
	public double getVAT() {
		double VAT = (getDonGia() * 5) / 100;
		return VAT;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\n"+
				"Ngay San Xuat : "+LocalDateConverter.dateToString(ngaySanXuat)+"\n"+
				"Ngay Het Han : "+LocalDateConverter.dateToString(ngayHetHan)+"\n"+
				"Nha Cung Cap : "+this.nhaCungCap;
		
		
	}




	@Override
	public void danhGiaMucDo() {
		if(getSoLuongTon() > 0 && LocalDate.now().compareTo(ngayHetHan) > 0) {
			System.err.println("Khó bán");
		} else {
			System.out.println("Không đánh giá");
		}
		
	}

}
