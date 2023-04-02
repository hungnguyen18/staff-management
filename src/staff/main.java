package staff;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CanBo canBo = new CanBo();
		KySu kySu = new KySu();
		CongNhan congNhan = new CongNhan();
		
		
		congNhan.input();
		System.out.println(congNhan.getDetailStaff());
	}

}
