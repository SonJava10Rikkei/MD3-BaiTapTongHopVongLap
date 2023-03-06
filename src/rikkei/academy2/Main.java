package rikkei.academy2;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static SinhVien[] sinhViens = new SinhVien[0];

    public static void main(String[] args) {
        int check = 0;
        SinhVien sinhVien = new SinhVien();
        do {
            System.out.println("1. Nhập thông tin sinh viên");
            System.out.println("2. Hiển thị thông tin sinh viên");
            System.out.println("3. Tính tuổi sinh viên");
            System.out.println("4. Thoắt");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    sinhVien = inputValue(sinhVien);
                    break;
                case 2:
                    System.out.println(sinhVien);
                    break;
                case 3:
                    age(sinhVien, 1, false);
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        } while (check != 4);

    }

    static SinhVien inputValue(SinhVien sinhVien) {
        System.out.println("nhập thong tin sinh viên");
        System.out.println(" mã sv: ");
        sinhVien.setMaSv(scanner.nextInt());
        System.out.println("tên sv: ");
        sinhVien.setTen(scanner.next());
        System.out.println("năm sinh:");
        sinhVien.setNamSinh(scanner.nextInt());
        System.out.println("Giới tính :");
        sinhVien.setGioiTinh(scanner.next());
        System.out.println("sdt :");
        sinhVien.setSdt(scanner.next());
        System.out.println("Email :");
        sinhVien.setEmail(scanner.next());
        System.out.println("Địa chỉ :");
        sinhVien.setDiaChi(scanner.next());
        return sinhVien;
    }

    static void age(SinhVien sinhVien, int sad, boolean b) {
//        System.out.println(sad);
//        System.out.println(b);
        System.out.println("\n--> Tuổi sinh viên là " + (LocalDate.now().getYear() - sinhVien.getNamSinh()));
    }
}
