class Hello{
	public static void main(String args[]){
		if(args.length == 0){
			
		System.out.print("Hello World " );
		}
		else{
			System.out.print("Hello World");
			for(int i=0;i<args.length;i++){
				System.out.print(" " +args[i].toUpperCase());
			}
		}
	
	}
}