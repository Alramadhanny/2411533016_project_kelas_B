package Pekan4;

public class Magazine extends Book {
	private String category;
	
	public Magazine(String title, String author, String genre) {
		super(title, author);
		this.category = genre;
	}
	
	public String getCategory() { return category; }
}
