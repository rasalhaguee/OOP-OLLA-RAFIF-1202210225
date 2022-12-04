package TPMODUL2_RAFIF;

public class Perangkat {
    protected String drive;
    protected Integer ram;
    protected Float processor;

    public Perangkat(String drive, int ram, float processor){
        this.drive = drive;
        this.ram = ram;
        this.processor = processor;
    }

    public void informasi(){
        System.out.printf("This unknown device has a %s hard drive with %d GB RAM and %.2f GHz Processor.\n", this.drive, this.ram, this.processor);
    }
}
