import java.util.Scanner;

public class CM1_FafiqLutfiAzana {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

//INPUT BIODATA
    System.out.println("===== INPUT DATA MAHASISWA =====");
    System.out.print("Nama\t: ");
    String nama = sc.nextLine();
    System.out.print("NIM\t: ");
    String NIM = sc.nextLine();
    String statusAkhir;

//INPUT NILAI MATKUL 1
    System.out.println("=== Mata Kuliah 1: Algoritma dan Pemrograman ===");
    System.out.print("Nilai UTS\t: ");
    int nilaiUts1 = sc.nextInt();
    System.out.print("Nilai UAS\t: ");
    int nilaiUas1 = sc.nextInt();
    System.out.print("Nilai Tugas\t: ");
    int nilaiTugas1 = sc.nextInt();
    String nilaiHuruf1;
    String status1;

//INPUT NILAI MATKUL 2
    System.out.println("=== Mata Kuliah 2: Struktur Data ===");
    System.out.print("Nilai UTS\t: ");
    int nilaiUts2 = sc.nextInt();
    System.out.print("Nilai UAS\t: ");
    int nilaiUas2 = sc.nextInt();
    System.out.print("Nilai Tugas\t: ");
    int nilaiTugas2 = sc.nextInt();
    String nilaiHuruf2;
    String status2;

//LOGIC 1
    double nilaiAkhir1 = ((nilaiUas1 * 0.3) + (nilaiUts1 * 0.3) + (nilaiTugas1 * 0.4));
    if (nilaiAkhir1 <= 100 && nilaiAkhir1 > 80){
        nilaiHuruf1 = "A";
    }else if (nilaiAkhir1 <= 80 && nilaiAkhir1 > 73) {
        nilaiHuruf1 = "B+";
    }else if (nilaiAkhir1 <= 73 && nilaiAkhir1 > 65) {
        nilaiHuruf1 = "B";
    }else if (nilaiAkhir1 <= 65 && nilaiAkhir1 > 60) {
        nilaiHuruf1 = "C+";
    }else if (nilaiAkhir1 <= 60 && nilaiAkhir1 > 50) {
        nilaiHuruf1 = "C";
    }else if (nilaiAkhir1 <= 50 && nilaiAkhir1 > 39) {
        nilaiHuruf1 = "D";
    }else {
        nilaiHuruf1 = "E";
    }
    
    if (nilaiAkhir1 > 60) {
        status1 = "LULUS";
    }else{
        status1 = "TIDAK LULUS";
    }

//LOGIC 2
 double nilaiAkhir2 = ((nilaiUas2 * 0.3) + (nilaiUts2 * 0.3) + (nilaiTugas2 * 0.4));
    if (nilaiAkhir2 <= 100 && nilaiAkhir2 > 80){
        nilaiHuruf2 = "A";
    }else if (nilaiAkhir2 <= 80 && nilaiAkhir2 > 73) {
        nilaiHuruf2 = "B+";
    }else if (nilaiAkhir2 <= 73 && nilaiAkhir2 > 65) {
        nilaiHuruf2 = "B";
    }else if (nilaiAkhir2 <= 65 && nilaiAkhir2 > 60) {
        nilaiHuruf2 = "C+";
    }else if (nilaiAkhir2 <= 60 && nilaiAkhir2 > 50) {
        nilaiHuruf2 = "C";
    }else if (nilaiAkhir2 <= 50 && nilaiAkhir2 > 39) {
        nilaiHuruf2 = "D";
    }else {
        nilaiHuruf2 = "E";
    }

    if (nilaiAkhir2 > 60) {
        status2 = "LULUS";
    }else{
        status2 = "TIDAK LULUS";
    }

//LOGIC 3 (nested if)
    double rataAkhir = (nilaiAkhir1 + nilaiAkhir2) / 2;
    if (status1 == "LULUS" && status2 == "LULUS"){
        if (nilaiAkhir1 > 70 && nilaiAkhir2 > 70) {
            statusAkhir = "LULUS";
        }else{
            statusAkhir = "TIDAK LULUS";
        }
    }else{
        statusAkhir = "TIDAK LULUS";
    }

//FORMATTING
    String rataLimit1 = String.format("%.2f", nilaiAkhir1);
    String rataLimit2 = String.format("%.2f", nilaiAkhir2);
    String rataLimit3 = String.format("%.2f", rataAkhir);

//OUTPUT
    System.out.println("==================== HASIL PENILAIAN AKADEMIK ====================");
    System.out.println("Nama\t: "+ nama);
    System.out.println("NIM\t: "+ NIM);

    if (nilaiAkhir1 <= 100 && nilaiTugas1 <= 100 && nilaiUas1 <= 100 && nilaiUts1 <= 100 && nilaiAkhir2 <= 100 && nilaiTugas2 <= 100 && nilaiUas2 <= 100 && nilaiUts2 <= 100) {
    System.out.println("______________________________________________________________________________________");
    System.out.println("Mata Kuliah\t\t\tUTS\tUAS\tTugas\tNilai Akhir\tNilai Huruf\tStatus");
    System.out.println("______________________________________________________________________________________");
    System.out.println("Algoritma Pemrograman\t\t " + nilaiUts1 + "\t" + nilaiUas1 + "\t" + nilaiTugas1 + "\t" + rataLimit1 + "\t\t" + nilaiHuruf1 + "\t\t" + status1);
    System.out.println("Struktur Data\t\t\t " + nilaiUts2 + "\t" + nilaiUas2 + "\t" + nilaiTugas2 + "\t" + rataLimit2 + "\t\t" + nilaiHuruf2 + "\t\t" + status2);
    System.out.println("");
    System.out.println("Rata-Rata Nilai Akhir\t:" + rataLimit3);
    System.out.println("Status Semester\t\t:" + statusAkhir);

    }else {
        System.out.println("Input Nilai Tidak Valid!!!");
    }
  
    sc.close();
    }
}