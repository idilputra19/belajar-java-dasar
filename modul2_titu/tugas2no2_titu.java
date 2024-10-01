public class tugas2no2_titu {
    public static void main(String[] args) {
        String[] bank;
        bank = new String[8]; // Mengubah ukuran array menjadi 8 untuk 8 bank
        
        // Mengisi array dengan nama bank
        bank[0] = "Bank BTN";
        bank[1] = "Bank BCA";
        bank[2] = "Bank BRI";
        bank[3] = "Bank BNI";
        bank[4] = "Bank CIMB Niaga";
        bank[5] = "Bank Permata";
        bank[6] = "Bank Danamon";
        bank[7] = "Bank Mandiri";
        
        // Menampilkan salah satu nama bank, misalnya bank pertama
        System.out.println("Nama Bank ke-1: " + bank[0]);
    }
}
