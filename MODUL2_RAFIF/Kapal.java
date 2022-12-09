package MODUL2_RAFIF;
public class Kapal extends TransportasiAir{
    protected String mesin;
    
    public Kapal(int jumlahKursi, int biaya, String mesin){
        super(jumlahKursi, biaya);
        this.mesin = mesin;
    }

    @Override
    public void informasi(){
        System.out.printf("\nTransportasi Air dengan jenis Kapal dengan kursi penumpang berjumlah %d memiliki harga Rp.%d", this.jumlahKursi, this.biaya);
    }

    @Override
    public void berlayar(){
        System.out.printf("\nTransportasi Air dengan jenis Kapal sedang berlayar menggunakan mesin %s dengan kecepatan yang tidak stabil.", this.mesin);
    }

    public void berlayar(int kecepatan){
        System.out.printf("\nTransportasi Air dengan jenis Kapal sedang berlayar menggunakan mesin %s dengan kecepatan stabil di sekitar %d knot.", this.mesin, kecepatan);
    }

    @Override
    public void berlabuh(){
        System.out.println("\nTransportasi Air dengan jenis Kapal sedang berlabuh di pelabuhan tersebut.");
    }
}
