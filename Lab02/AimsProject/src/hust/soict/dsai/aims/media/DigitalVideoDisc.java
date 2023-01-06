package hust.soict.dsai.aims.media;

import hust.soict.dsai.aims.exception.PlayerException;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Playable;

public class DigitalVideoDisc extends Media implements Playable {
	private String director;
	private int length;
	private static int nbDigitalVideoDiscs = 0;

	public void setDirector(String director) {
		this.director = director;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getDirector() {
		return director ;
	}

	public int getLength() {
		return length;
	}

	public DigitalVideoDisc(String title) {
		super();
		this.setTitle(title);
		nbDigitalVideoDiscs++;
		this.setId(nbDigitalVideoDiscs);
	}

	public DigitalVideoDisc(String category, String title, float cost) {
		super();
		this.setTitle(title);
		this.setCategory(category);
		this.setCost(cost);
		nbDigitalVideoDiscs++;
		this.setId(nbDigitalVideoDiscs);
	}

	public DigitalVideoDisc(String director, String category, String title, float cost) {
		super();
		this.setTitle(title);
		this.setCategory(category);
		this.setDirector(director);
		this.setCost(cost);
		nbDigitalVideoDiscs++;
		this.setId(nbDigitalVideoDiscs);
	}

	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.setTitle(title);
		this.setCategory(category);
		this.setDirector(director);
		this.setLength(length);
		this.setCost(cost);
		nbDigitalVideoDiscs++;
		this.setId(nbDigitalVideoDiscs);
	}
	@Override
	public String toString() {
		String result = this.getId() + ".DVD-";
		if (this.getTitle() != null) {
			result += this.getTitle();
		}
		if (this.getCategory() != null) {
			result += "-" + this.getCategory();
		}
		if (this.getDirector() != null) {
			result += "-" + this.getDirector();
		}
		if (this.getLength() > 0) {
			result += "-" + this.getLength();
		}
		return result + ":" + this.getCost() + "$";
	}

	public boolean isMatch(String title) {
		if (this.getTitle().equals(title)) {
			return true;
		}
		return false;
	}

	public boolean isMatch(int id) {
		if (this.getId() == id) {
			return true;
		}
		return false;
	}

	public void play() throws PlayerException {
		if(this.getLength()>0) {
			System.out.println("Play DVD: " + this.getTitle());
			System.out.println("DVD length: " + this.getLength());
			}else {
				throw new PlayerException("Error:DVD length is non-positive");
			}
	}

}