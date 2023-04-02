package staff;

import java.util.Scanner;

public class CanBo {
	private String hoTen, diaChi, gioiTinh;
	private int tuoi;
	Scanner scanner = new Scanner(System.in);

	public CanBo() {
		super();
	}

	public CanBo(String hoTen, String diaChi, String gioiTinh, int tuoi) {
		super();
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.gioiTinh = gioiTinh;
		this.tuoi = tuoi;
	}

	public String getHoTen() {
		return this.hoTen;
	}

	public void setHoten(String hoten) {
		this.hoTen = hoten;
	}

	public String getDiaChi() {
		return this.diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getGioiTinh() {
		return this.gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public int getTuoi() {
		return this.tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public void input() {
		System.out.print("Nhap ho ten: ");
		hoTen = scanner.nextLine();
		System.out.print("Nhap gioi tinh: ");
		gioiTinh = scanner.nextLine();
		System.out.print("Nhap dia chi: ");
		diaChi = scanner.nextLine();
		System.out.print("Nhap tuoi: ");
		tuoi = scanner.nextInt();
	}

	public String getDetailStaff() {
		return "Ho ten can bo: " + this.hoTen + ", Gioi tinh: " + this.gioiTinh + ", Dia chi: " + this.diaChi
				+ ", Tuoi: " + this.tuoi;

	}
}
