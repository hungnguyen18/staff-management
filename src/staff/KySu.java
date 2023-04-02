package staff;

import java.util.Scanner;

public class KySu extends CanBo {
	private String nganhDaoTao;
	Scanner scanner = new Scanner(System.in);

	public KySu() {
		super();
	}

	public KySu(String nganhDaoTao) {
		super();
		this.nganhDaoTao = nganhDaoTao;
	}

	public String getNganhDaoTao() {
		return this.nganhDaoTao;
	}

	public void setNganhDaoTao(String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}

	public void input() {
		super.input();
		System.out.print("Nhap nganh dao tao: ");
		nganhDaoTao = scanner.nextLine();
	}

	public String getDetailStaff() {
		return super.getDetailStaff() + ", Nganh dao tao: " + this.nganhDaoTao;
	}
}
