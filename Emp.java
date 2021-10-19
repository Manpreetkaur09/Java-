class Emp{

	private int empId;
	private String name;
//	private long contactNumber;
//	private double sal;

	

    public void setEmpId(int id){
		empId=id;
	}

	public int getEmpID(){
		return empId;
	} 

	public void setName(String nm){
		name=nm;
	}
	public String getName(){
		return name;
	}
	public Emp(int id){
		this(id, "xxx");
	}
	
	public Emp(int id, String n1){
		empId=id;
		name=n1;
	}

    

}
