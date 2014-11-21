public class BangDiem {
	private int toan = 0;
	private int ly = 0;

	public BangDiem() {
	}

	public BangDiem(int dtoan,int dly) {
		this.setToan(dtoan);
		this.ly = dly;
	}
	
	public BangDiem(int dtoan) {
		this.toan = dtoan;
	}
	
	public int getToan() {
		return toan;
	}

	public void setToan(int toan)  {
		if (toan < 0){
			System.out.println("khong hop le");
			return;
		}
		this.toan = toan;
	}

	public int getLy() {
		return ly;
	}

	public void setLy(int ly) {
		this.ly = ly;
	}
}
