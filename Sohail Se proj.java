class Data{	
void studentData(){		
java.util.Scanner in = new java.util.Scanner(System.in);		
System.out.println("Talha's ID is 11");		
System.out.println("Sohail's ID is 12");	
System.out.println("Mansoor's ID is 13");	
System.out.print("Enter Student ID:");		
int id = in.nextInt();			
if (id == 12){			
String name = "Sohail";			
String rollno = "2k17/csee/74";			
System.out.println("Name:"+name);		
System.out.println("Roll no is:"+rollno);			
}			
}	
public static void main(String str[]){		
Data d = new Data();		
d.studentData();		
}	
}
