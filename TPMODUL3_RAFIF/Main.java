package TPMODUL3_RAFIF;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Restaurant resto = new Restaurant();
        int customerID, orderQty;
        System.out.println("<<== Selamat Datang di Restoran EAD! ==>>");
        try {
            System.out.println("Masukkan ID Customer: ");
            customerID = sc.nextInt();

            System.out.println("Berapa banyak makanan yang diinginkan?: ");
            orderQty = sc.nextInt();

            Thread thread1 = new Thread(resto);
            Waiters waiter = new Waiters(customerID, orderQty);
            Thread thread2 = new Thread(waiter);

            thread1.start();
            thread2.start();
            thread1.join();
            thread2.join();

        } 
        catch (Exception e) {
            System.out.println("Input harus berupa tipe data Integer!");
        }
        sc.close();

    }

}
