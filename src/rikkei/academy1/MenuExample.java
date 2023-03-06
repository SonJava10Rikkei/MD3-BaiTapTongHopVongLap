package rikkei.academy1;

import java.util.Scanner;

public class MenuExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Menu:");
            System.out.println("1. In ra các số chẵn và tính tổng trong khoảng từ 0 đến n");
            System.out.println("2. In ra các số lẻ và tính tổng trong khoảng từ 0 đến n");
            System.out.println("3. Kiểm tra n có phải là số nguyên tố không");
            System.out.println("4. Kiểm tra n có phải số hoàn hảo không ");
            System.out.println("5. In ra các số nguyên tố trong khoảng 0... n");
            System.out.println("6. In ra các ước số của n và tính tổng ");
            System.out.println("7. Thoát chương trình");
            System.out.print("--> Mời bạn chọn chức năng: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    printEvenNumbersAndSum(scanner);
                    System.out.println("\n");
                    break;
                case 2:
                    printOddNumbersAndSum(scanner);
                    break;
                case 3:
                    checkPrime(scanner);
                    System.out.println("\n");
                    break;
                case 4:
                    checkPerfectNumber(scanner);
                    System.out.println("\n");
                    break;
                case 5:
                    printPrime(scanner);
                    System.out.println("\n");
                    break;
                case 6:
                    printDivisorsAnhSum(scanner);
                    System.out.println("\n");
                    break;
                case 7:
                    System.out.println("--> Đã thoát chương trình\n");
                    System.exit(0);
                    break;
                default:
                    System.out.println("--> Sai chức năng, mời chọn lại\n");
                    break;
            }
        } while (true);
    }

    //    1. Số chẵn
    public static void printEvenNumbersAndSum(Scanner scanner) {
        System.out.print("--> Nhập n: ");
        int n = scanner.nextInt();
        int sum = 0;
        System.out.print("--> Các số chẵn trong khoảng từ 0 đến n: ");
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println("\n -->Tổng các số chẵn trong khoảng từ 0 đến n: " + sum);
    }

//    2. Số lẻ

    public static void printOddNumbersAndSum(Scanner scanner) {
        System.out.print("--> Nhập n: ");
        int n = scanner.nextInt();
        int sum = 0;
        System.out.print("--> Các số lẻ trong khoảng từ 0 đến n: ");
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println("\n--> Tổng các số lẻ trong khoảng từ 0 đến n: " + sum);
    }

    //    3. Số nguyên tố
    public static void checkPrime(Scanner scanner) {
        System.out.print("--> Nhập n: ");
        int n = scanner.nextInt();
        if (isPrime(n)) {
            System.out.println("--> " + n + " là số nguyên tố");
        } else {
            System.out.println("--> " + n + " không phải là số nguyên tố");
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    //    4. Số hoàn hảo
    public static void checkPerfectNumber(Scanner scanner) {
        System.out.print("--> Nhập n: ");
        int n = scanner.nextInt();
        if (isPerfectNumber(n)) {
            System.out.println("--> " + n + " la so hoan hao.");
        } else {
            System.out.println("--> " + n + " khong phai la so hoan hao.");
        }
    }

    public static boolean isPerfectNumber(int n) {
        int sumDivisors = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sumDivisors += i;
            }
        }
        return sumDivisors == n;
    }

//    5. In số nguyên tố trong khoảng

    public static void printPrime(Scanner scanner) {
        System.out.print("--> Nhập n: ");
        int n = scanner.nextInt();
        System.out.print("--> Các nguyên tố trong khoảng từ 0 đến " + n + " : \n");
        for (int i = 0; i < n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

//    6. In ra các ước số của n và tính tổng

    public static void printDivisorsAnhSum(Scanner scanner) {
        System.out.print("--> Nhập n: ");
        int n = scanner.nextInt();
        int sum = 0;
        System.out.print("--> Các ước số của n là: ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println("\n--> Tổng các ước số của n là: " + sum);
    }
}