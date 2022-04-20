package com.namnt2008110229;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
		QuanLyHangHoa quanLyHangHoa = new QuanLyHangHoa();



		HangThucPham hangThucPham1 = new HangThucPham("123", "Chuoi america", 40, 40000, LocalDateConverter.stringToDate("10/04/2019"), 
				LocalDateConverter.stringToDate("10/10/2019"), "america tho");

		HangThucPham hangThucPham2 = new HangThucPham("456", "Gao nep gao te", 30, 60000, LocalDateConverter.stringToDate("30/04/1975")
				, LocalDateConverter.stringToDate("30/04/2022"), "Co gai mien tay");

		HangThucPham hangThucPham3 = new HangThucPham("789", "Sua bo tuoi",40, 50000, 
				LocalDateConverter.stringToDate("26/11/2020"),LocalDateConverter.stringToDate("28/11/2021") , "Vinamilk");
        
        HangThucPham hangThucPham4 = new HangThucPham("345", "Hot Ga Ba Huan",70,35000,
                 LocalDateConverter.stringToDate("27/05/2020"),LocalDateConverter.stringToDate("27/08/2020"), "Ba Huan");


		HangDienMay hangDienMay1 = new HangDienMay("101112", "Tu lanh", 30, 500000, 12, 300);

		HangDienMay hangDienMay2 = new HangDienMay("131415", "Ti vi", 30, 900000, 12, 300);

		HangDienMay hangDienMay3 = new HangDienMay("161718", "Playstation", 30, 600000, 12, 300);

		HangDienMay hangDienMay4 = new HangDienMay("123582", "Playstation 5", 30, 600000, 12, 300);

		HangSanhSu hangSanhSu1 = new HangSanhSu("192021", "Binh hoa su", 20, 70000, "Gom Thanh Nam", LocalDateConverter.stringToDate("29/03/2022"));

		HangSanhSu hangSanhSu2 = new HangSanhSu("222324", "Gom bat trang", 20, 70000, "Viet Nam", LocalDateConverter.stringToDate("29/04/2022"));

		HangSanhSu hangSanhSu3 = new HangSanhSu("222324", "Gom Su Minh Long", 20, 70000, "Viet Nam", LocalDateConverter.stringToDate("29/06/2022"));

		HangSanhSu hangSanhSu4 = new HangSanhSu("222228", "Ly Su Uong Cafe", 10, 55000, "Gom Viet", LocalDateConverter.stringToDate("22/08/2022"));

		quanLyHangHoa.getListHH().add(hangThucPham1);
		quanLyHangHoa.getListHH().add(hangThucPham2);
		quanLyHangHoa.getListHH().add(hangThucPham3);
		quanLyHangHoa.getListHH().add(hangThucPham4);


		quanLyHangHoa.getListHH().add(hangDienMay1);
		quanLyHangHoa.getListHH().add(hangDienMay2);
		quanLyHangHoa.getListHH().add(hangDienMay3);
		quanLyHangHoa.getListHH().add(hangDienMay4);

		quanLyHangHoa.getListHH().add(hangSanhSu1);

		quanLyHangHoa.getListHH().add(hangSanhSu2);

		quanLyHangHoa.getListHH().add(hangSanhSu3);

		quanLyHangHoa.getListHH().add(hangSanhSu4);

		boolean flag = true;
		while(flag) {
			System.out.println("1. Them mot san pham moi vao danh sach");
			System.out.println("2. Xoa mot san pham theo ma");
			System.out.println("3. In ra tat ca san pham");
			System.out.println("4. Tim kiem san pham");
			System.out.println("5. Sua san pham");
			System.out.println("6. Danh gia muc do ban buon");
			System.out.println("Nhan -1 de ket thuc chuong trinh");
			System.out.println("-------------------------------------------");
			System.out.println("Moi ban nhap lua chon");
			int chon = new Scanner(System.in).nextInt();

			switch (chon) {
			case 1:
				System.out.println("Moi ban chon hang muon nhap");	
				System.out.println("1. Hang Thuc Pham");
				System.out.println("2. Hang Dien may");
				System.out.println("3. Hang Sanh Su");

				int option = new Scanner(System.in).nextInt();

				switch (option) {
				case 1:
					HangThucPham hangTP = quanLyHangHoa.nhapHangThucPham();
					quanLyHangHoa.them(hangTP);
					break;
				case 2:
					HangDienMay hangDM = quanLyHangHoa.nhapHangDienMay();
					quanLyHangHoa.them(hangDM);
					break;
				case 3:
					HangSanhSu hangSS = quanLyHangHoa.nhapHangSanhSu();
					quanLyHangHoa.them(hangSS);
					break;
				default:
					System.err.println("Vui long chon dung option");
					break;
				}

				break;

			case 2:
				quanLyHangHoa.xoa();
				break;
			case 3:
				quanLyHangHoa.in();
				break;
			case 4:
				System.out.println("Moi ban lua chon phuong thuc tim kiem");
				System.out.println("1. Tim kiem theo ma hang");
				System.out.println("2. Tim kiem theo ten hang");
				int timkiemOption = new Scanner(System.in).nextInt();
				quanLyHangHoa.timKiem(timkiemOption);
				break;
			case 5 :
				System.out.println("Moi ban nhap ma can sua");
				String maCanSua = new Scanner(System.in).nextLine();
				quanLyHangHoa.sua(maCanSua);
				break;

			case 6 : 
				System.out.println("Moi ban lua chon ma hang can danh gia");
				String maHangDG = new Scanner(System.in).nextLine();
				boolean checkExsist = false;
				for(HangHoa hangHoa : quanLyHangHoa.getListHH()) {
					if(hangHoa.getMaHang().contentEquals(maHangDG)) {
						System.out.println(hangHoa);
						hangHoa.danhGiaMucDo();
						checkExsist = true;

					}

				}
				
				if(!checkExsist) { 
					System.err.println("Khong tim thay");
				}

				break;
			case -1:
				flag = false;
				System.out.println("Cam on ban da su dung chuong trinh");
				break;
			default:
				System.out.println();
				System.err.println("Vui long chon dung chuc nang");
				break;
			}

		}








	}



}
