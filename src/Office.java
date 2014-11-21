
public class Office {
	public String name;
	private int age;
	private float salary;
	private BangDiem db;
	public Office (String name,int age, float salary){
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public void sayHello(){
		System.out.println("My name is " +name);
	}
	
	public void sayAge(){
		System.out.println("I'm " + age + "  years old");
	}
	
	public void docDiem(){
		System.out.println("Diem toan cua tao la:" + this.db.getToan());
		System.out.println("Diem toan cua ly la:" + this.db.getLy());
	}
	
	public void saySalary(){
		System.out.println("My salary is " + salary );
	}
	
	public void selfIntroduce(){
		this.sayHello();
		this.sayAge();
		this.saySalary();
		this.docDiem();
		
	}

	public BangDiem getDb() {
		return db;
	}

	public void setDb(BangDiem db) {
		this.db = db;
	}

}
