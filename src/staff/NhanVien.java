package staff;

import java.util.Scanner;

public class NhanVien extends CanBo{
	private String congViec;
	Scanner scanner = new Scanner(System.in);

	public NhanVien() {
		super();
	}

	public NhanVien(String congViec) {
		super();
		this.congViec = congViec;
	}

	public String getCongViec() {
		return this.congViec;
	}

	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}

	public void input() {
		super.input();
		System.out.print("Nhap cong viec: ");
		congViec = scanner.nextLine();
	}

	public String getDetailStaff() {
		return super.getDetailStaff() + ", Cong viec: " + this.congViec;
	}
}
