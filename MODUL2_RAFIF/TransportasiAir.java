package MODUL2_RAFIF;
public class TransportasiAir {
    protected int jumlahKursi;
    protected int biaya;

    public TransportasiAir(int jumlahKursi, int biaya){
        this.jumlahKursi = jumlahKursi;
        this.biaya = biaya;
    }
    
    public void informasi(){
        System.out.printf("Transportasi Air tidak diketahui memiliki %d kursi penumpang dengan harga Rp.%d", this.jumlahKursi, this.biaya);
    }

    public void berlayar(){
        System.out.println("\nTransportasi Air tidak diketahui sedang berlayar di laut lepas.");
    }
    
    public void berlabuh(){
        System.out.println("Transportasi Air tidak diketahui sedang berlabuh di pelabuhan tersebut.");
    }
}
