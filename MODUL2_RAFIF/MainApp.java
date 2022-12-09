package MODUL2_RAFIF;
public class MainApp {
    public static void main(String[] args) throws Exception {
        System.out.println("<<== Showroom Transportasi Air ==>>");
        TransportasiAir transportair = new TransportasiAir(8, 100000);
        transportair.informasi();
        transportair.berlayar();
        transportair.berlabuh();

        Sampan sampan = new Sampan(4, 50000, 2);
        sampan.informasi();
        sampan.berlayar();
        sampan.berlabuh();
        sampan.berlabuh(1);
        System.out.println("");
        
        Kapal kapallaut = new Kapal(50, 25000000, "Turbin");
        kapallaut.informasi();
        kapallaut.berlayar();
        kapallaut.berlayar(30);
        kapallaut.berlabuh();
    }
}