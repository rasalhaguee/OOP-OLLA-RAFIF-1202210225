package MODUL1_RAFIF;

public class User {
    String Nama;
    Integer Nohp;

    public void setNama (String Nama) {
        this.Nama = "Rafif_SI4503";
    }
    public void setNohp (Integer Nohp) {
        this.Nohp = 1202210225;
    }
    //     System.out.print("Masukkan Nama: ");
    //     String inputnama = sc.nextLine();
    //     System.out.print("Masukkan Nomor Handphone: ");
    //     Integer inputhp = sc.nextInt();
    public void register() {
        System.out.println("\nProses Registrasi Berhasil!");
        System.out.println("\nName: " + Nama);
        System.out.println("\nNo. Handphone: " + Nohp);
    }
}
    // TODO Create Attribute of User; Name and Phone Number then Create Setter
    
    // TODO Create Method to Register User and Display User's Name and Phone Number and success message
    
    


