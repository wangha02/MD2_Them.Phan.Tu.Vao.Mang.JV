import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap do dai cua mang ");
        int size = scanner.nextInt(); // nhap do dai//
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("so phan tu thu " + i); // số phần tử thứ
            array[i] = scanner.nextInt();
        }

        System.out.println("Nhap vao vi tri can them vao: ");
        int j = scanner.nextInt(); //giá trị mới (index)
        System.out.println("Nhap gia tri can them: ");
        int value = scanner.nextInt(); // giá trị của mảng

        int number[] = new int[size + 1]; // tạo mảng mới có độ dài cũ nhưng tăng thêm 1
        if (j <= 0 || j >= array.length - 1) {
            System.out.println("khong chen duoc vao phan tu vao mang");
        } else {
            for (int i = 0; i < size; i++) { // chèn phần tử của mảng cũ vào mảng mới
                number[i] = array[i];
            }
            number[j] = value; // gán "giá trị mới" vào "mảng"
            for (int i = j + 1; i < size + 1; i++) {
                number[i] = array[i - 1]; // trừ đi vị trí thêm vào = vị trí của mảng
            }
        }
        for (int k : number) { // chạy lại mảng mới
            System.out.print(k + " ");// in ra mảng mới
        }
    }
}