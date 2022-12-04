package TPMODUL2_RAFIF;

public class Handphone extends Perangkat {
    protected Boolean fingerprint;

    public Handphone(String drive, int ram, float processor, boolean fingerprint){
        super(drive, ram, processor);
        this.fingerprint = fingerprint;
    }

    @Override
    public void informasi(){
        if (fingerprint) {
            System.out.printf("This phone has a %s hard drive with %d GB RAM and %.2f GHz Processor. This phone is included with Fingerprint.\n", this.drive, this.ram, this.processor);
        }
        else{
            System.out.printf("This phone has a %s hard drive with %d GB RAM and %.2f GHz Processor. This phone is not included with Fingerprint.\n", this.drive, this.ram, this.processor);
        }
    }

    public void telfon(int no_hp){
        System.out.printf("Handphone is calling %d \n", no_hp);
    }

    public void kirimSMS(int no_hp){
        System.out.printf("Handphone is sending message to %d\n", no_hp);
    }

    public void kirimSMS(int no_hp1, int no_hp2){
        System.out.printf("Handphone is sending messages to %d and %d\n", no_hp1, no_hp2);
    }
}
