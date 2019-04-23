class Lab1Task1{
	public static void main(String args[]){
		System.out.println("Lab1Task 1");
		String name = " Altamash Akber ";
		int rollNo=38;
		long total_Marks= 500;
		float o_Marks=400f;
		char grade='A';
		double percentage= (o_Marks*100)/total_Marks;
		System.out.println("Name: "+name);
		System.out.println("RollNo: "+rollNo);
		System.out.println("Total Marks: "+total_Marks);
		System.out.println("Obtained: "+o_Marks);
		System.out.println("Percentage: "+percentage+"%");
		System.out.println("Grade: "+grade);
		if(percentage>=50){
		System.out.print("Pass");
		}
		else{
			System.out.print("Fail");
		}
		
}
}
