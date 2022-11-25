package w2;

public class Cart {

	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;

	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered < MAX_NUMBERS_ORDERED) {
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered++;
		}
	}

	public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
		for (int i = 0; i < dvdList.length; i++) {
			itemsOrdered[qtyOrdered] = dvdList[i];
			qtyOrdered++;
		}
	}

	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		itemsOrdered[qtyOrdered] = dvd1;
		qtyOrdered++;
		itemsOrdered[qtyOrdered] = dvd2;
		qtyOrdered++;
	}

	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered[i].equals(disc)) {
				for (int j = i; j < qtyOrdered - 1; j++) {
					itemsOrdered[j] = itemsOrdered[j + 1];
				}
			}

		}
		itemsOrdered[qtyOrdered] = null;
		qtyOrdered--;
	}

	public void coppy(DigitalVideoDisc a) {

	}

	public float TotalCost() {
		float sum = 0;

		for (int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered[i] != null) {
				sum += itemsOrdered[i].getCost();

			}
		}

		return sum;
	}
}