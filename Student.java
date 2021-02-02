//	  ANSWER TO THE QUESTION NO A :
//***************************************** 

public class Student{
//private data member
private int id;
private String name;
private double cgpa;

//getter method
public int getId(){
return id;
}
public String getName(){
return name;
}
public double  getCgpa(){
return cgpa;
}
//setter method for name
public void setId(int id){
this.id=id ;
}
public void setName(String name){
this.name=name ;
}
public void setCgpa(double cgpa){
this.cgpa=cgpa  ;
}

public static void main(String[] args){
//creating instance of the encapsulated class
Student s= new Student();
//setting value in the name member
s.setName("Punom");
s.setId(2);
s.setCgpa(3.7);
//getting value of the name member
System.out.println("ID :"+s.getId());
System.out.println("NAME :"+s.getName());

System.out.println("CGPA :"+s.getCgpa());
}
}
