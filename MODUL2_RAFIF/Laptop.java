package MODUL2_RAFIF;

public class Laptop extends Perangkat {
    protected Boolean webcam;

    public Laptop(String drive, int ram, float processor, boolean webcam){
        super(drive, ram, processor);
        this.webcam = webcam;
    }

    @Override
    public void informasi(){
        if (webcam){
            System.out.printf("This laptop has a %s hard drive with %d GB RAM and %.2f GHz Processor. This laptop is incuded with Webcam.\n", this.drive, this.ram, this.processor);
        }
        else{
            System.out.printf("This laptop has a %s hard drive with %d GB RAM and %.2f GHz Processor. This laptop is not included with Webcam.\n", this.drive, this.ram, this.processor);
        }
    }

    public void bukaGame(String nama_game){
        System.out.printf("Opening %s please wait...\n", nama_game);
    }

    public void kirimEmail(String email){
        System.out.printf("Sending email to %s\n", email);
    }

    public void kirimEmail(String email1, String email2){
        System.out.printf("Sending email to %s dan %s\n", email1, email2);
    }
}