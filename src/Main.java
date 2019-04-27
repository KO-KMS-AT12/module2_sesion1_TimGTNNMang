import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gia tri nho nhat trong mang la : "+findMin(hienThi(nhapPhanTuMang(nhapSize(scanner), scanner))));
    }

    static int nhapSize(Scanner scanner) {
        System.out.print("Nhap kich thuoc mang : ");
        int size = scanner.nextInt();
        return size;
    }

    static int[] nhapPhanTuMang(int size, Scanner scanner) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Phan tu thu arr[%d] la : ", i);
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    static int[] hienThi(int[] arr) {
        System.out.print("{ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("}\n");
        return arr;
    }

    static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
