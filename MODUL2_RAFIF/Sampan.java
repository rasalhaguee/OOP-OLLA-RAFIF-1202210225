package MODUL2_RAFIF;
public class Sampan extends TransportasiAir{
    protected int layar;

    public Sampan(int jumlahKursi, int biaya, int layar){
        super(jumlahKursi, biaya);
        this.layar = layar;
    }

    @Override
    public void informasi(){
        System.out.printf("\nTransportasi Air dengan jenis Sampan dengan kursi penumpang berjumlah %d memiliki harga Rp.%d", this.jumlahKursi, this.biaya);
    }

    @Override
    public void berlayar(){
        System.out.printf("\nTransportasi Air dengan jenis Sampan sedang berlayar menggunakan %d layar.", this.layar);
    }

    @Override
    public void berlabuh(){
        System.out.printf("\nTransportasi Air dengan jenis Sampan sedang berlabuh di pelabuhan tersebut tanpa jangkar.");
    }

    public void berlabuh(int jangkar){
        System.out.printf("\nTransportasi Air dengan jenis Sampan sedang berlabuh di pelabuhan tersebut menggunakan %d jangkar.", jangkar);
    }
}
