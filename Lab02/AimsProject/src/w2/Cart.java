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

	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered[i].equals(disc))
				itemsOrdered[i] = null;
		}
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