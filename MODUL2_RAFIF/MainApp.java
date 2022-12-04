package MODUL2_RAFIF;

public class MainApp {
    public static void main(String[] args) throws Exception {
        System.out.println("<<< Device Identifier Catalog >>>");
        Perangkat unknown = new Perangkat("SATA", 512, 3.38F);
        unknown.informasi();
        System.out.println("");
        Laptop laptop = new Laptop("WD", 256, 5.72F, false);
        laptop.informasi();
        laptop.bukaGame("Minecraft");
        laptop.kirimEmail("rasal@gmail.com");
        laptop.kirimEmail("shio@yahoo.com", "kenneth123@gmail.com");
        System.out.println("");
        Handphone hp = new Handphone("Snapdragon", 4, 4.73F, true);
        hp.informasi();
        hp.telfon(448781345);
        hp.kirimSMS(448781345);
        hp.kirimSMS(448781345, 628129387);
    }
}
