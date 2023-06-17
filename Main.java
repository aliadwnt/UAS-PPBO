/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
// 1. Kelas Mahasiswa sebagai objek utama
// OBJECT 1
// Class Mahasiswa untuk merepresentasikan mahasiswa
class Mahasiswa {
    // Atribut
    private String nama;
    private int nim;

    // Constructor
    public Mahasiswa(String nama, int nim) {
        this.nama = nama;
        this.nim = nim;
    }

    // OBJECT 2
    // Method untuk mendapatkan nama mahasiswa
    public String getNama() {
        return nama;
    }

    // OBJECT 3
    // Method untuk mendapatkan NIM mahasiswa
    public int getNim() {
        return nim;
    }

    // OBJECT 4
    // Method untuk mengatur nama mahasiswa
    public void setNama(String nama) {
        this.nama = nama;
    }

    // OBJECT 5
    // Method untuk mengatur NIM mahasiswa
    public void setNim(int nim) {
        this.nim = nim;
    }

    // OBJECT 6
    // Method untuk menampilkan informasi mahasiswa
    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}

public class Main {
    public static void main(String[] args) {
        // Membuat objek mahasiswa
        Mahasiswa mahasiswa = new Mahasiswa("Alya Dewanto", 2222004);

        // OBJECT 7
        // Memanggil method getNama untuk mendapatkan nama mahasiswa
        String namaMahasiswa = mahasiswa.getNama();
        System.out.println("Nama Mahasiswa: " + namaMahasiswa);

        // OBJECT 8
        // Memanggil method getNim untuk mendapatkan NIM mahasiswa
        int nimMahasiswa = mahasiswa.getNim();
        System.out.println("NIM Mahasiswa: " + nimMahasiswa);

        // OBJECT 9
        // Memanggil method setNama untuk mengubah nama mahasiswa
        mahasiswa.setNama("Alia Dewanto");

        // OBJECT 10
        // Memanggil method setNim untuk mengubah NIM mahasiswa
        mahasiswa.setNim(3922004);

        // Menampilkan informasi mahasiswa setelah perubahan
        mahasiswa.displayInfo();
    }
}
