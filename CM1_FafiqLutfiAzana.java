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
    double nilaiUts1 = sc.nextDouble();
    System.out.print("Nilai UAS\t: ");
    double nilaiUas1 = sc.nextDouble();
    System.out.print("Nilai Tugas\t: ");
    double nilaiTugas1 = sc.nextDouble();
    String nilaiHuruf1;
    String status1;

//INPUT NILAI MATKUL 2
    System.out.println("=== Mata Kuliah 2: Struktur Data ===");
    System.out.print("Nilai UTS\t: ");
    double nilaiUts2 = sc.nextDouble();
    System.out.print("Nilai UAS\t: ");
    double nilaiUas2 = sc.nextDouble();
    System.out.print("Nilai Tugas\t: ");
    double nilaiTugas2 = sc.nextDouble();
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
    
    if (nilaiAkhir1 >= 60 && nilaiTugas1 <= 100 && nilaiTugas1 >= 0 && nilaiUas1 <= 100 && nilaiUas1 >= 0 && nilaiUts1 <= 100 && nilaiUts1 >= 0) {
        status1 = "LULUS";
    }else if (nilaiAkhir1 < 60 && nilaiTugas1 <= 100 && nilaiTugas1 >= 0 && nilaiUas1 <= 100 && nilaiUas1 >= 0 && nilaiUts1 <= 100 && nilaiUts1 >= 0) {
        status1 = "TIDAK LULUS";
    }else {
        status1 = "INPUT NILAI TIDAK VALID";
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

    if (nilaiAkhir2 >= 60 && nilaiTugas2 <= 100 && nilaiTugas2 >= 0 && nilaiUas2 <= 100 && nilaiUas2 >=0 && nilaiUts2 <= 100 && nilaiUts2 >=0) {
        status2 = "LULUS";
    }else if (nilaiAkhir2 < 60 && nilaiTugas2 <= 100 && nilaiTugas2 >= 0 && nilaiUas2 <= 100 && nilaiUas2 >=0 && nilaiUts2 <= 100 && nilaiUts2 >=0) {
        status2 = "TIDAK LULUS";
    }else {
        status2 = "INPUT NILAI TIDAK VALID";
    }

//LOGIC 3 (nested if)
    double rataAkhir = (nilaiAkhir1 + nilaiAkhir2) / 2;
    if (status1 == "LULUS" && status2 == "LULUS"){
        if (rataAkhir >= 70) {
            statusAkhir = "LULUS";
        }else {
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
    System.out.println("______________________________________________________________________________________________");
    System.out.println("Mata Kuliah\t\t\tUTS\tUAS\tTugas\tNilai Akhir\tNilai Huruf\tStatus");
    System.out.println("______________________________________________________________________________________________");
    System.out.println("Algoritma Pemrograman\t\t" + nilaiUts1 + "\t" + nilaiUas1 + "\t" + nilaiTugas1 + "\t" + rataLimit1 + "\t\t  " + nilaiHuruf1 + "\t\t" + status1);
    System.out.println("Struktur Data\t\t\t" + nilaiUts2 + "\t" + nilaiUas2 + "\t" + nilaiTugas2 + "\t" + rataLimit2 + "\t\t  " + nilaiHuruf2 + "\t\t" + status2);
    System.out.println("");
    System.out.println("Rata-Rata Nilai Akhir\t:" + rataLimit3);
    System.out.println("Status Semester\t\t:" + statusAkhir);  
    
    sc.close();
    }
}