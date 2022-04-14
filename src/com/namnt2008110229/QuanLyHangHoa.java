package com.namnt2008110229;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class QuanLyHangHoa {
    private final ArrayList<HangHoa> listHH = new ArrayList<HangHoa>();




	public ArrayList<HangHoa> getListHH() {
		return listHH;
	}

	
	public void suaHangSanhSu(HangSanhSu hang) {
		System.out.println("Vui long lua chon thong tin can sua");
		System.out.println("1. Ten Hang");
		System.out.println("2. So luong ton");
		System.out.println("3. Don gia");
		System.out.println("4. Nha san xuat");
		System.out.println("5. Ngay nhap kho");
		

		int chon = new Scanner(System.in).nextInt();

		switch (chon) {
		case 1:
			System.out.println("Hay nhap ten hang moi");
			String tenHang = new Scanner(System.in).nextLine();
			hang.setTenHang(tenHang);
			break;

		case 2:
			System.out.println("Hay nhap so luong hang ton moi");
			int soluong = new Scanner(System.in).nextInt();
			hang.setSoLuongTon(soluong);
			break;
		case 3:
			System.out.println("Hay nhap don gia moi");
			double donGia = new Scanner(System.in).nextDouble();
			hang.setDonGia(donGia);
			break;
		case 4:
			System.out.println("Hay nhap nha san xuat moi");
			String nhaSX = new Scanner(System.in).nextLine();
			
			hang.setNhaSanXuat(nhaSX);
			
			break;
		case 5:
			System.out.println("Hay nhap ngay nhap kho moi");
			String ngayNhapKho = new Scanner(System.in).nextLine();
			hang.setNgayNhapKho(LocalDateConverter.stringToDate(ngayNhapKho));
			
			break;
			
		
		default:
			break;
		}
	}
	
	public void suaHangDienMay(HangDienMay hang) {
		System.out.println("Vui long lua chon thong tin can sua");
		System.out.println("1. Ten Hang");
		System.out.println("2. So luong ton");
		System.out.println("3. Don gia");
		System.out.println("4. Thoi gian bao hanh");
		System.out.println("5. Cong suat");
		

		int chon = new Scanner(System.in).nextInt();

		switch (chon) {
		case 1:
			System.out.println("Hay nhap ten hang moi");
			String tenHang = new Scanner(System.in).nextLine();
			hang.setTenHang(tenHang);
			break;

		case 2:
			System.out.println("Hay nhap so luong hang ton moi");
			int soluong = new Scanner(System.in).nextInt();
			hang.setSoLuongTon(soluong);
			break;
		case 3:
			System.out.println("Hay nhap đon gia moi");
			double donGia = new Scanner(System.in).nextDouble();
			hang.setDonGia(donGia);
			break;
		case 4:
			System.out.println("Hay nhap thoi gian bao hanh moi");
			int thoiGianBH = new Scanner(System.in).nextInt();
			if(thoiGianBH >= 0) {
				hang.setThoiGianBaoHanh(thoiGianBH);
				System.out.println("Sua thanh cong");
			} else {
				System.out.println("Sua that bai");
			}
			
			break;
		case 5:
			System.out.println("Hay nhap cong suat moi");
			int congSuat = new Scanner(System.in).nextInt();
			if(congSuat > 0) {
				hang.setCongSuat(congSuat);
				System.out.println("Sua thanh cong");
			}else {
				System.out.println("Sua that bai");
			}
			
			break;
			
		
		default:
			break;
		}
	}

	public void suaHangThucPham(HangThucPham hang) {
		System.out.println("Vui long lua chon thong tin can sua");
		System.out.println("1. Ten Hang");
		System.out.println("2. So luong ton");
		System.out.println("3. Don gia");
		System.out.println("4. Ngay San Xuat");
		System.out.println("5. Ngay Het Han");
		System.out.println("6. Nha cung cap");

		int chon = new Scanner(System.in).nextInt();

		switch (chon) {
		case 1:
			System.out.println("Hay nhap ten hang moi");
			String tenHang = new Scanner(System.in).nextLine();
			hang.setTenHang(tenHang);
			break;

		case 2:
			System.out.println("Hay nhap so luong hang ton moi");
			int soluong = new Scanner(System.in).nextInt();
			hang.setSoLuongTon(soluong);
			break;
		case 3:
			System.out.println("Hay nhap don gia moi");
			double donGia = new Scanner(System.in).nextDouble();
			hang.setDonGia(donGia);
			break;
		case 4:
			System.out.println("Hay nhap ngay san xuat moi (dd/MM/yyyy)");
			String ngaySanXuat = new Scanner(System.in).nextLine();
			LocalDate ngaySX = LocalDateConverter.stringToDate(ngaySanXuat);
			if(ngaySX == null) {
				System.err.println("Sua that bai");
			} else {
				hang.setNgaySanXuat(ngaySX);
				System.out.println("Sua thanh cong");
			}
			
			break;
		case 5:
			System.out.println("Hay nhap ngay het han moi (dd/MM/yyyy)");
			String ngayHetHan = new Scanner(System.in).nextLine();
			LocalDate ngayHH = LocalDateConverter.stringToDate(ngayHetHan);
			if(ngayHH == null) {
				System.err.println("Sua that bai");
			}else {
				hang.setNgaySanXuat(ngayHH);
				System.out.println("Sua thanh cong");
			}
			
			break;
			
		case 6:
			System.out.println("Hay nhap nha cung cap moi");
			String nhaCungCap = new Scanner(System.in).nextLine();
			hang.setNhaCungCap(nhaCungCap);
			break;
		default:
			break;
		}
	}


	public void sua(String ma) {

		HangHoa hang = null;

		for(HangHoa hh : listHH) {
			if(ma.equalsIgnoreCase(hh.getMaHang())) {
				hang = hh;
			}
		}

		if(hang != null) {
			if(hang instanceof HangThucPham) {
				suaHangThucPham((HangThucPham) hang);
			}else if(hang instanceof HangDienMay) {
				suaHangDienMay((HangDienMay) hang);
			}else if(hang instanceof HangSanhSu) {
				suaHangSanhSu((HangSanhSu) hang);
			}
		}else {
			System.out.println("Khong tim thay hang");
		}

	}

	public void in() {
		for(HangHoa hh : listHH) {
			if(hh instanceof HangDienMay) {
				System.out.println("------------------ Hang Dien May -------------------");
				System.out.println(hh);

				System.out.println("-----------------------------------------------------");
			} else if(hh instanceof HangSanhSu) {
				System.out.println("------------------ Hang Sanh Su-------------------");
				System.out.println(hh);

				System.out.println("-----------------------------------------------------");
			} else {
				System.out.println("------------------ Hang Thuc Pham -------------------");
				System.out.println(hh);

				System.out.println("-----------------------------------------------------");
			}
		}
	}


	public void them(HangHoa hang) {
		if(!isContain(hang)) {
			listHH.add(hang);
			System.out.println("Them Thanh Cong");
		}else {
			System.out.println("Ma hang đa ton tai");
		}
	}

	public void xoa() {
		System.out.println("Moi ban nhap vao ma can xoa");
		String maCanXoa = new Scanner(System.in).nextLine();
		boolean flag = false;
		Iterator<HangHoa> itr = listHH.iterator();

		while(itr.hasNext()) {
			if(itr.next().getMaHang().equalsIgnoreCase(maCanXoa)) {
				itr.remove();
				flag = true;
			}
		}
		if(!flag) {
			System.out.println("Khong tim thay");
		} else {
			System.out.println("Xoa thanh cong");
		}
	}


	public HangHoa timKiem(int option) {
		switch(option) {
		case 1 :
			System.out.println("Moi ban nhap vao ma can tim kiem");
			String ma = new Scanner(System.in).nextLine();
			ma = ma.trim();
			HangHoa hangCanTim = null;
			for(HangHoa hh : listHH) {
				if(ma.equalsIgnoreCase(hh.getMaHang())) {
					System.out.println("----------Da tim thay san pham-------------");
					hangCanTim = hh;
					System.out.println("--------------------------------------------");
				}
			}

			if(hangCanTim == null ) {
				System.out.println("Khong tim thay");
				return null;
			} else {
				System.out.println(hangCanTim);
				return hangCanTim;
			}
			


		case 2 :
			System.out.println("Moi ban nhap vao ten hang can tim ");
			String tenHang = new Scanner(System.in).nextLine();
			tenHang = tenHang.trim();
			HangHoa tenHangCanTim = null;
			for(HangHoa hh : listHH) {
				if(tenHang.equalsIgnoreCase(hh.getTenHang())) {
					tenHangCanTim = hh;
				}
			}
			if(tenHangCanTim == null) {
				System.out.println("Khong tim thay");
				return null;
			}else {
				System.out.println(tenHangCanTim);
				return tenHangCanTim;
			}
			
		}
		return null;
	}


	public HangDienMay nhapHangDienMay() {
		String maHang = null;
		String tenHang = null;
		int soLuongTon = 0;
		double donGia = 0;
		int thoiHanBaoHanh = 0;
		int congSuat = 0;
		boolean flag = false;
		HangDienMay hangDienMay = null;


		while(!flag) {
			boolean subFlag = true;

			while(subFlag) { 

				System.out.println("Moi ban nhap vao ma hang dien may");
				Scanner scMa = new Scanner(System.in);
				if(scMa.hasNext()) {
					maHang = scMa.nextLine();


				} else { 
					continue;
				}




				System.out.println("Moi ban nhap vao don gia");
				Scanner scDouble = new Scanner(System.in);
				if(scDouble.hasNextDouble()) {
					donGia = scDouble.nextDouble();

				} else {
					System.err.println("Dinh dang so nhap khong hop le");
					continue;
				}

				System.out.println("Moi ban nhap vao ten hang");
				Scanner scTen = new Scanner(System.in);
				if(scTen.hasNext()) {
					tenHang = scTen.nextLine();

				} else {
					continue;
				}

				System.out.println("Moi ban nhap vao so luong ton");
				Scanner scSoLuong = new Scanner(System.in);
				if(scSoLuong.hasNextInt()) {
					soLuongTon = scSoLuong.nextInt();

				}else {
					System.err.println("Dinh dang so nhap khong hop le");
					continue;
				}




				System.out.println("Moi ban nhap vao thoi han bao hanh");
				Scanner scNCC = new Scanner(System.in);
				if(scNCC.hasNextInt()) {
					thoiHanBaoHanh = scNCC.nextInt();

				}else {
					System.err.println("Ban nhap sai dinh dang so");
					continue;
				}




				System.out.println("Moi ban nhap vao cong suat");
				Scanner scCS = new Scanner(System.in);
				if(scCS.hasNextInt()) {
					congSuat = scCS.nextInt();
					subFlag = false;
				}else {
					System.err.println("Ban nhap sai dinh dang so");

					continue;

				}







			}



			hangDienMay = new HangDienMay(maHang, tenHang, soLuongTon, donGia,thoiHanBaoHanh,congSuat);

			flag = hangDienMay.validate();



		}

		return hangDienMay;

	}












	public HangSanhSu nhapHangSanhSu() {
		String maHang = null;
		String tenHang = null;
		int soLuongTon = 0;
		double donGia = 0;
		LocalDate ngayNhapKho = null;
		String ngayNhapKhoString = null;
		String nhaSanXuat = null;
		HangSanhSu hangSanhSu = null;
		boolean flag = false;



		while(!flag) {
			boolean subFlag = true;

			while(subFlag) {
				;
				System.out.println("Moi ban nhap vao ma hang Sanh Su");
				Scanner scMa = new Scanner(System.in);
				if(scMa.hasNext()) {
					maHang = scMa.nextLine();


				} else { 
					continue;
				}




				System.out.println("Moi ban nhap vao don gia");
				Scanner scDouble = new Scanner(System.in);
				if(scDouble.hasNextDouble()) {
					donGia = scDouble.nextDouble();

				} else {
					System.err.println("Dinh Dang so nhap khong hop le");
					continue;
				}

				System.out.println("Moi ban nhap vao ten hang");
				Scanner scTen = new Scanner(System.in);
				if(scTen.hasNext()) {
					tenHang = scTen.nextLine();

				} else {
					continue;
				}

				System.out.println("Moi ban nhap vao so luong ton");
				Scanner scSoLuong = new Scanner(System.in);
				if(scSoLuong.hasNextInt()) {
					soLuongTon = scSoLuong.nextInt();

				}else {
					System.err.println("Dinh Dang so nhap khong hop le");
					continue;
				}




				System.out.println("Moi ban nhap vao nha cung cap");
				Scanner scNCC = new Scanner(System.in);
				if(scNCC.hasNext()) {
					nhaSanXuat = scNCC.next();

				}else {
					continue;
				}




				System.out.println("Moi ban nhap vao ngay san xuat");
				Scanner scNNK = new Scanner(System.in);
				if(scNNK.hasNext()) {
					ngayNhapKhoString = scNNK.nextLine();
					ngayNhapKho = LocalDateConverter.stringToDate(ngayNhapKhoString);
					if(ngayNhapKho != null) {
						subFlag = false;
					}else {
						System.err.println("Ban nhap sai dinh dang dd/MM/yyyy");
						continue;
					}
				}







			}


			hangSanhSu = new HangSanhSu(maHang, tenHang, soLuongTon, donGia,nhaSanXuat,ngayNhapKho);

			flag = hangSanhSu.validate();

		}

		return hangSanhSu;

	}


	public HangThucPham nhapHangThucPham() {
		String maHang = null;
		String tenHang = null;
		int soLuongTon = 0;
		double donGia = 0;
		String ngaySXString = null;
		String ngayHHString = null;
		LocalDate ngaySX = null;
		LocalDate ngayHH = null;
		String nhaCungCap = null;
		HangThucPham hangThucPham = null;
		boolean flag = false;

		while(!flag) {
			boolean subFlag = true;

			while(subFlag) {

				System.out.println("Moi ban nhap vao ma hang Thuc pham");
				Scanner scMa = new Scanner(System.in);
				if(scMa.hasNext()) {
					maHang = scMa.nextLine();


				} else { 
					continue;
				}




				System.out.println("Moi ban nhap vao don gia");
				Scanner scDouble = new Scanner(System.in);
				if(scDouble.hasNextDouble()) {
					donGia = scDouble.nextDouble();

				} else {
					System.err.println("Dinh Dang so nhap khong hop le");
					continue;
				}

				System.out.println("Moi ban nhap vao ten hang");
				Scanner scTen = new Scanner(System.in);
				if(scTen.hasNext()) {
					tenHang = scTen.nextLine();

				} else {
					continue;
				}

				System.out.println("Moi ban nhap vao so luong ton");
				Scanner scSoLuong = new Scanner(System.in);
				if(scSoLuong.hasNextInt()) {
					soLuongTon = scSoLuong.nextInt();

				}else {
					System.err.println("Dinh Dang so nhap khong hop le");
					continue;
				}




				System.out.println("Moi ban nhap vao nha cung cap");
				Scanner scNCC = new Scanner(System.in);
				if(scNCC.hasNext()) {
					nhaCungCap = scNCC.next();

				}else {
					continue;
				}




				System.out.println("Moi ban nhap vao ngay san xuat");
				Scanner scNSX = new Scanner(System.in);
				if(scNSX.hasNext()) {
					ngaySXString = scNSX.nextLine();
					ngaySX = LocalDateConverter.stringToDate(ngaySXString);
					if(ngaySX != null) {

					}else {
						System.err.println("Ban nhap sai dinh dang dd/MM/yyyy");
						continue;
					}
				}



				System.out.println("Moi ban nhap vao ngay het han");

				Scanner scNHH = new Scanner(System.in);
				if(scNHH.hasNext()) {
					ngayHHString = scNHH.nextLine();
					ngayHH = LocalDateConverter.stringToDate(ngayHHString);
					if(ngayHH != null) {
						subFlag = false;
					}else {
						System.err.println("Ban nhap sai đinh dang dd/MM/yyyy");
						continue;
					}
				}



			}


			hangThucPham = new HangThucPham(maHang, tenHang, soLuongTon, donGia, ngaySX, ngayHH, nhaCungCap);

			flag = hangThucPham.validate();
		}

		return hangThucPham;

	}

	public boolean isContain(HangHoa hang) {
		for(HangHoa h : listHH) {
			if(h.getMaHang().equalsIgnoreCase(hang.getMaHang())) {
				return true;
			}else {
				return false;
			}
		}

		return false;
	}


}
