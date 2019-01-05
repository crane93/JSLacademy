package Model;

import java.util.Scanner;

public class Product {
	protected int id;
	protected String explain;
	protected String maker;
	protected int price;
	
	protected Scanner s;
	
    public Product() {
    	this.id = 0;
    	this.s = new Scanner(System.in);		//�����ε� ���̱� ������ �����ڿ� �־��  �ٽ� Ÿ��ĥ�ʿ� ����  (����̿�Ģ)
    }
	
	public void addProduct() {
		this.id++;
		
		System.out.println("��ǰ ����>> ");
		this.explain = this.s.next();
		System.out.println("������>> ");
		this.maker = this.s.next();
		System.out.println("����>> ");
		this.price = this.s.nextInt();
	}
	
	public void showProduct() {
		System.out.println("��ǰ ID>>"+this.id);
		System.out.println("��ǰ ����>>"+this.explain);
		System.out.println("������>>"+this.maker );
		System.out.println("����>>"+this.price );
	}
	
	public void showAllProperty() {
		
	}
	
	
	public int getId() {
		return id;
	}
	//�����丮 ���� �� �¾��̵�� �ʿ�����Ű��Ƽ� ����ϴ� ��
//	public void setId(int id) {
//		this.id = id;
//	}
	
	public String getExplain() {
		return explain;
	}
//	public void setExplain(String explain) {
//		this.explain = explain;
//	}
	public String getMaker() {
		return maker;
	}
//	public void setMaker(String maker) {
//		this.maker = maker;
//	}
	public int getPrice() {
		return price;
	}
//	public void setPrice(int price) {
//		this.price = price;
//	}
}
