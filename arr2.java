class App{
  public static void main(String str[]){
	  
	  
	for(int i=0; i<=empId.count ; i++){
		System.out.print(" Emp id is"+ i);
	}
    Emp obj1 = new Emp(1001, "Abc");   

//	System.out.println("Values of ID: "+ obj1.getEmpID());
//	System.out.println("values of name: "+ obj1.getName());
	
	obj1.setEmpId(1001);
	obj1.setName("Naman");
	
	System.out.println("Values of ID: "+ obj1.getEmpID());
	System.out.println("values of name: "+ obj1.getName());
	
	Emp obj2 = new Emp(1002, "Bcd");// obj1 is just address
	obj2.setEmpId(2000);
	obj2.setName("Rohan");
	
	System.out.println("Values of ID: "+ obj2.getEmpID());
	System.out.println("values of name: "+ obj2.getName());
	
	Emp obj3 = new Emp(1003);

	System.out.println("Values of ID: "+ obj3.getEmpID());
	System.out.println("values of name: "+ obj3.getName());

	
  }
}
    