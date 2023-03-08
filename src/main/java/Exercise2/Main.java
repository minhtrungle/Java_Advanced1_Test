package Exercise2;

import java.util.Scanner;

//Test LMT
/*Tạo lớp thử nghiệm chứa hàm main tạo 2 đối tượng NhanVien là KyThuat, 1 đối tượng tạo
sẵn dữ liệu và 1 đối tượng nhập từ bàn phím, sau đó in ra thông tin cả hai đối tượng.*/
public class Main {
    public static void main(String[] args) {
        //Dữ liệu có sẵn
        KyThuat k1 = new KyThuat("20173422", "Le Minh Trung", "21/05/1999", "Thanh Hoa", "Programmer");

        System.out.println("Thông tin nhân viên: ");

        System.out.println(k1);
        String result1 = k1.moTaCongViec();
        System.out.println(result1);

        //Dữ liệu nhập từ bàn phím
        KyThuat k2 = new KyThuat();

        Scanner in = new Scanner(System.in);
        String s1, s2, s3, s4, s5;

        System.out.println("Nhập mã nhân viên: ");
        s1 = in.nextLine();
        k2.setMaNhanVien(s1);

        System.out.println("Nhập họ tên: ");
        s2 = in.nextLine();
        k2.setHoTen(s2);

        System.out.println("Nhập năm sinh: ");
        s3 = in.nextLine();
        k2.setNamSinh(s3);

        System.out.println("Nhập địa chỉ: ");
        s4 = in.nextLine();
        k2.setDiaChi(s4);

        System.out.println("Nhập chuyên ngành: ");
        s5 = in.nextLine();
        k2.setChuyenNghanh(s5);


        System.out.println(k2);
        String result2 = k2.moTaCongViec();
        System.out.println(result2);
    }
}
