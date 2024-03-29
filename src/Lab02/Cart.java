package Lab02;

public class Cart {
    private int qtyOrdered = 0;
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemOdrered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < 20) {
            itemOdrered[qtyOrdered] = disc;
            qtyOrdered += 1;
        }
        else {
            System.out.println("Full of slots");
        }
    }
    
    public void removeDigitalVideoDisc (DigitalVideoDisc disc) {
        outter :if (qtyOrdered == 0) {
            System.out.println("Cart is empty");
        }
        else {
            for (int i = 0; i < qtyOrdered; i++) {
                if (itemOdrered[i] == disc) {
                    itemOdrered[i] = itemOdrered[qtyOrdered-1];
                    itemOdrered[qtyOrdered-1] = null;
                    System.out.println("Deleted");
                    qtyOrdered -= 1;
                    break outter;
                }
            }
            System.out.println("Can't found element");
        }
    }

	public float totalCost() {
		float sum = 0;
		for(int i = 0; i < qtyOrdered; i++) {
			sum += itemOdrered[i].getCost();
		}
		return sum;
    }
}
