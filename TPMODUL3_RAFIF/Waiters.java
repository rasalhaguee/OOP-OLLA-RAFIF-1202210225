package TPMODUL3_RAFIF;

public class Waiters implements Runnable {

    private final int orderQty;
    private final int customerID;
    static int foodPrice = 14500;

    public Waiters(int customerID, int orderQty) {
        this.customerID = customerID;
        this.orderQty = orderQty;
    }

    @Override
    public void run() {
        while (true) {
            getFood();
            try {
                Thread.sleep(5000);
            } 
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void orderInfo() {
        System.out.println("<<<<<================================================>>>>>");
        System.out.println("ID Customer\t: " + this.customerID);
        System.out.println("Jumlah Makanan\t: " + this.orderQty);
        System.out.println("Harga Total\t: " + this.orderQty * foodPrice);
        System.out.println("Terima kasih telah berbelanja di Restoran EAD!");
        System.out.println("<<<<<================================================>>>>>");
    }

    public void getFood() {
        synchronized(Restaurant.getLock()) {

            System.out.println("> Pelayan: Makanan siap untuk diantar.");
            Restaurant Restaurant = new Restaurant();
            Restaurant.setWaitingForPickup(false);

            if (Restaurant.getFoodNumber() == this.orderQty + 1) {
                orderInfo();
                System.exit(0);
            }
            Restaurant.getLock().notifyAll();
            System.out.println("> Pelayan: Menyampaikan ke restoran untuk membuat makanan selanjutnya.\n");

        }
    }
}
