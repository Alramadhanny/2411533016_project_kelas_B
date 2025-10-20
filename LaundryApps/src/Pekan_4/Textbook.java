package Pekan_4;

public class Textbook extends Book {
	private String studyField;
	
	public Textbook(String title, String author, String genre) {
		super(title, author);
		this.studyField= genre;
	}
	
	public String getStudyField() { return studyField; }
}
