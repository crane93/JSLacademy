package Model;

import Model.Book;

public class ConversationBook extends Book{
	private String language;

	public void addConversationBook() {
		this.addBook();
		
		System.out.println("���>> ");
		this.language = this.s.next();
	}

	@Override
	public void showAllProperty() {
		System.out.println("��ǰ ID>>"+this.getId());
		System.out.println("��ǰ ����>>"+this.getExplain());
		System.out.println("������>>"+this.getMaker() );
		System.out.println("����>>"+this.getPrice() );
		
		System.out.println("ISBN>>"+this.getISBN() );
		System.out.println("����>>"+this.getAuthor());
		System.out.println("å �̸�>>"+this.getBookname());
		
		System.out.println("���>>"+this.language);
	}
	
//	public String getLanguage() {
//		return language;
//	}

//	public void setLanguage(String language) {
//		this.language = language;
//	}
}
