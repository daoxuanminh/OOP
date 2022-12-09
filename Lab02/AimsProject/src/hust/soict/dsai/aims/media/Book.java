package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book {
	private List<String> authors = new ArrayList<String>();

	public Book() {
		// TODO Auto-generated constructor stub

	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}

	public void addAuthor(String authorName) {
		if (!authors.contains(authorName)) {
			authors.add(authorName);
		}
	}

	public void removeAuthor(String authorName) {
		if (authors.contains(authorName)) {
			authors.remove(authorName);
		}
	}
}
