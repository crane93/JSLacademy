package Model;

import Model.Product;		//ProductŬ������ ��� �ִ��� �˱� ����

public class Book extends Product{
	private int ISBN;
	private String author;
	private String bookname;
	
	public void addBook() {
		this.addProduct();
		
		System.out.println("ISBN>> ");
		this.ISBN = this.s.nextInt();
		System.out.println("����>> ");
		this.author = this.s.next();
		System.out.println("å �̸�>> ");
		this.bookname = this.s.next();
	}
	
	@Override
	public void showAllProperty() {
		this.showProduct();
		
		System.out.println("ISBN>>"+this.ISBN );
		System.out.println("����>>"+this.author);
		System.out.println("å �̸�>>"+this.bookname);
	}
	
	
	public int getISBN() {
		return ISBN;
	}
//	public void setISBN(int iSBN) {
//		ISBN = iSBN;
//	}
	public String getAuthor() {
		return author;
	}
//	public void setAuthor(String author) {
//		this.author = author;
//	}
	public String getBookname() {
		return bookname;
	}
//	public void setBookname(String bookname) {
//		this.bookname = bookname;
//	}

}
