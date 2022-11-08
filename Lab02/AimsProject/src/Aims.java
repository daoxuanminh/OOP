import w2.*;

public class Aims {
	public static void main(String[] args) {

		Cart anOrder = new Cart();

		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		anOrder.addDigitalVideoDisc(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "Geogre Lucas", 87, 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		anOrder.addDigitalVideoDisc(dvd3);
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Conan Movie 25", "Toto Animation", "Gosho Aoyama", 110, 99.99f);
		anOrder.addDigitalVideoDisc(dvd4);

		System.out.println("total cost is: ");
		System.out.println(anOrder.TotalCost());

		System.out.println("total cost after remove dvd3 is: ");
		anOrder.removeDigitalVideoDisc(dvd3);
		System.out.println(anOrder.TotalCost());

	}
}
