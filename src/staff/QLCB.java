package staff;

import java.util.Scanner;

public class QLCB {
	Scanner scanner = new Scanner(System.in);
	int quantity;

	public void run() {
		System.out.print("Nhap so luong can bo: ");
		quantity = scanner.nextInt();
		CanBo[] canBo = new CanBo[quantity];

		for (int i = 0; i < quantity; i++) {
			System.out.println("\nNhap thong tin can bo thu " + (i + 1));
			System.out.print("Chon can bo (1-Cong nhan, 2-Ky su, 3-Nhan vien): ");
			int choose = scanner.nextInt();

			switch (choose) {
			case 1:
				canBo[i] = new CongNhan();
				break;
			case 2:
				canBo[i] = new KySu();
				break;
			case 3:
				canBo[i] = new NhanVien();
				break;
			default:
				break;
			}

			if (choose < 4) {
				canBo[i].input();
			}
		}

		System.out.println("----------------------\nThong tin can bo: ");
		for (int i = 0; i < quantity; i++) {
			if (canBo[i] instanceof CongNhan) {
				System.out.println("Cong nhan: \n" + canBo[i].getDetailStaff());
			} else if (canBo[i] instanceof KySu) {
				System.out.println("Ky su: \n" + canBo[i].getDetailStaff());
			} else if (canBo[i] instanceof NhanVien) {
				System.out.println("Nhan vien: \n" + canBo[i].getDetailStaff());
			}
		}

	}
}
