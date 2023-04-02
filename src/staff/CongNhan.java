package staff;

import java.util.Scanner;

public class CongNhan extends CanBo {
	private int bac;
	Scanner scanner = new Scanner(System.in);

	public CongNhan() {
		super();
	}

	public CongNhan(int bac) {
		super();
		this.bac = bac;
	}

	public int getBac() {
		return this.bac;
	}

	public void setNganhDaoTao(int bac) {
		this.bac = bac;
	}

	public void input() {
		super.input();
		System.out.print("Nhap bac: ");
		bac = scanner.nextInt();
	}

	public String getDetailStaff() {
		return super.getDetailStaff() + ", Bac: " + this.bac;
	}
}
