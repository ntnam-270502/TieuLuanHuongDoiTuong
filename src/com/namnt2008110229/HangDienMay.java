package com.namnt2008110229;

public class HangDienMay extends HangHoa {
    private int thoiGianBaoHanh;
	private int congSuat;
	
	
	
	
	public int getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}

	public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}

	public int getCongSuat() {
		return congSuat;
	}

	public void setCongSuat(int congSuat) {
		this.congSuat = congSuat;
	}

	public HangDienMay(String maHang, String tenHang, int soLuongTon, double donGia,
			int thoiGianBaoHanh, int congSuat) {
		super(maHang, tenHang, soLuongTon, donGia);
		this.thoiGianBaoHanh = thoiGianBaoHanh;
		this.congSuat = congSuat;
	}
	
	@Override
	public boolean validate() {
		if(thoiGianBaoHanh < 0 || congSuat < 0) {
			System.err.println("Thoi gian bao hanh hoac cong suat khong đuoc nho hon 0");
			return false;
		}
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
		return super.toString()+"\n"+
				"Thoi gian bao hanh : "+this.thoiGianBaoHanh+"\n"+
				"Cong Suat : "+this.congSuat;
	}

	@Override
	public void danhGiaMucDo() {
		if(getSoLuongTon() < 3) {
			System.err.println("Ban duoc");
		} else {
			System.out.println("Khong danh gia");
		}
		
	}
	
}
