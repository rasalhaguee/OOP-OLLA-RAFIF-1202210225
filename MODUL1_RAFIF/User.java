import java.util.Scanner;
public class User {
    Scanner sc = new Scanner(System.in);
    public void user() {
        
        System.out.print("Masukkan Nama: ");
        String inputnama = sc.nextLine();
        System.out.print("Masukkan Nomor Handphone: ");
        Integer inputhp = sc.nextInt();

        System.out.println("\nProses Registrasi Berhasil!\nName: " + inputnama + "\nNo. Handphone: " +inputhp);
    }
    // TODO Create Attribute of User; Name and Phone Number then Create Setter
    
    // TODO Create Method to Register User and Display User's Name and Phone Number and success message


}
