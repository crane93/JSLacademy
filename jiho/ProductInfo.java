package jiho;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.*;
import constant.Operation;

public class ProductInfo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		selectOperation(s);		
	}
	
	private static void selectOperation(Scanner s) {
		boolean isInfinitWhile = true;
		List<Product> products = new ArrayList<Product>();
//		�� �迭���� ����Ʈ? >> ����Ʈ���� �����ϴ� �Լ��� ���α׷��ֿ� ���ϴ� ������� �Ʒ� get(), add()������ 		
		
		while(isInfinitWhile) {
			System.out.println("��ǰ �߰�(1), ��� ��ǰ ��ȸ(2), ������(3)>> ");
			int currentOpertaion = s.nextInt();
			
			switch (currentOpertaion) {
			case Operation.ADD_PRODUCT:
				products.add(selectOperationModel(s));
				
				break;
			case Operation.SHOW_ALL:
				for (int i = 0; i < products.size(); i++) {
					products.get(i).showAllProperty();
				}
				
				break;
			case Operation.FINISH_PROGRAM:
				isInfinitWhile = false;
				break;
			}
		}
		
	}
	
	private static Product selectOperationModel(Scanner s) {	//�� �۾��� Productinfo �������� ���δٴ� ������ private�� ����, productŸ������ ��ȯ�Ѵ�. =>> �޼ҵ忡 ��ȯ�� Ÿ���� �ʿ��ѵ� ���̵� ����Ʈ�� �������̼��� ������ ���δ�Ʈ�� ���� ������ �ȳ���
		System.out.println("��ǰ ���� å(1), ����CD(2), ȸȭå(3)>> ");
		int currentOpertaion = s.nextInt();
		Product addedProduect = null;	//�ΰ����� �ʱ�ȭ�ϴ� ����> Ȥ�ø� �ڹٳ������� ������ ����������, �Ÿ������ ��������� ������	
		
		switch (currentOpertaion) {
		case Operation.BOOK:
			Book tempBook = new Book();
			tempBook.addBook();
			addedProduect = tempBook;
			break;
			
		case Operation.DISC:
			CompactDisc tempCompactDisc = new CompactDisc();
			tempCompactDisc.addCompactDisc();
			addedProduect = tempCompactDisc;
			break;
			
		case Operation.CONVERSTAION_BOOK:
			ConversationBook tempConversationBook = new ConversationBook();
			tempConversationBook.addConversationBook();
			addedProduect = tempConversationBook;
			break;
		}
		
		return addedProduect;
	}
	
}
