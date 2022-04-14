package com.namnt2008110229;

public abstract class HangHoa {
    private String maHang;
	private String tenHang;
	private int soLuongTon;
	private double donGia;
	
	
	public HangHoa(String maHang, String tenHang, int soLuongTon, double donGia) {
		
		this.maHang = maHang;
		this.tenHang = tenHang;
		this.soLuongTon = soLuongTon;
		this.donGia = donGia;
	}

	
	
	public String getMaHang() {
		return maHang;
	}
	public String getTenHang() {
		return tenHang;
	}
	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}
	public int getSoLuongTon() {
		return soLuongTon;
	}
	public void setSoLuongTon(int soLuongTon) {
		this.soLuongTon = soLuongTon;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	
	public boolean validate() {
		if(maHang == null || maHang.isEmpty()) {
			System.out.println("Ma Hang Khong duoc de trong");
			return false;
		} else if(tenHang == null || tenHang.isEmpty()) {
			System.out.println("Ten Hang Khong duoc de trong");
			return false;
		} else if(soLuongTon < 0) {
			System.out.println("So luong hang ton phai lon hon hoac bang 0");
			return false;
		} else if(donGia <= 0) {
			System.out.println("Don gia phai lon hon 0");
			return false;
		}
		
		return true;
		
	}
	
	public abstract double getVAT();
	
	public abstract void danhGiaMucDo();
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Ma Hang : "+this.maHang+"\n"+
				"Ten hang : "+this.tenHang+"\n"+
				"So luong ton : "+this.soLuongTon+"\n"+
				"Don gia : "+this.donGia;
				
	}
	
}
