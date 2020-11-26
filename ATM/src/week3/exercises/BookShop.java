package week3.exercises;

public class BookShop {
private int id ;
private String title;
private String author;

public BookShop (int id,String title,String author) {
	this.id=id;
	this.title=title;
	this.author=author;
}
public int getid() {
	return id;
}
public void setid(int id) {
	this.id=id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title=title;
}
public String getauthor() {
	return author;
}
public void setauthor(String author) {
	this.author=author;
}
public String toString() {
return "BOOK ID     = "+id+"\nBOOK TITILE = "+title+" \nBOOK AUTHOR = "+author;	
}
}
