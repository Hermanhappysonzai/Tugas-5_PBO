import java.util.Scanner;

public class Main {
    static void batas() {
        System.out.println("===========================");
    }

    static void menu() {
        System.out.println("\tMenu");
        System.out.println("===========================");
        System.out.println("1. Info murid");
        System.out.println("2. Info guru");
        System.out.println("3. Menambah nilai Kursus");
        System.out.println("4. Tampilkan nilai Kursus");
        System.out.println("5. Tampilkan rata-rata nilai course");
        System.out.println("6. Tambahkan kursus guru");
        System.out.println("7. Hapus kursus guru");
        System.out.println("8. Exit");
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Nama Siswa : ");
        String nama_murid = sc.next();
        System.out.print("Alamat Siswa\t: ");
        String alamat_murid = sc.next();
        Student murid = new Student(nama_murid, alamat_murid);
        batas();

        System.out.print("Masukan Nama Guru : ");
        String nama_guru = sc.next();
        System.out.print("Alamat Guru\t: ");
        String alamat_guru = sc.next();
        Teacher guru = new Teacher(nama_guru, alamat_guru);

        while (true) {
            System.out.println("");
            batas();
            menu();
            System.out.print("Input no Menu : ");
            int noMenu = sc.nextInt();
            switch (noMenu) {
                case 1:
                    System.out.println(murid);
                    break;
                case 2:
                    System.out.println(guru);
                    break;
                case 3:
                    System.out.print("Masukan Nama Kursus : ");
                    String kursus = sc.next();
                    System.out.print("Masukan Nilai : ");
                    int nilaiKursus = sc.nextInt();
                    murid.addCourseGrade(kursus, nilaiKursus);
                    break;
                case 4:
                    murid.printGrades();
                    break;
                case 5:
                    System.out.println("Rata-rata : " + murid.getAverageGrade());
                    break;
                case 6:
                    System.out.print("Masukan Nama Kursus yang akan ditambahkan : ");
                    String tambahKursus = sc.next();
                    guru.addCourse(tambahKursus);
                    break;
                case 7:
                    System.out.print("Masukan Nama Kursus yang akan dihapus : ");
                    String hapusKursus = sc.next();
                    guru.removeCourse(hapusKursus);
                    break;
                case 8:
                    System.out.println("Exiting Program...");
                    System.exit(0);
                    break;
            }
        }
    }
}
