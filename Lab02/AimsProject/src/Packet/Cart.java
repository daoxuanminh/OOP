package Packet;

public class Cart {
    public static final int MAX_NUMBER_ORDERED = 20;
    DigitalVideoDisc newDvD;
    private DigitalVideoDisc itemsOder[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
    public void addDigitalVideoDisc(DigitalVideoDisc newProduct){
        if (itemsOder.length < MAX_NUMBER_ORDERED){
            itemsOder[itemsOder.length] = newProduct; 
        }
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc product){
        for (int i = 0; i < itemsOder.length; i++){
            if (itemsOder[i].equals(product)){
                itemsOder[i] = null;
            }
        }
    }
    public int totalCost(){
        int sum = 0;
        for (int i = 0; i < itemsOder.length; i++){
            sum+=itemsOder[i].getCost();
        }
        return sum;
    }
}
