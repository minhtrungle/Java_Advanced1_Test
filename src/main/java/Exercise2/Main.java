package Exercise2;

import java.util.Scanner;

//Test LMT
/*Tạo lớp thử nghiệm chứa hàm main tạo 2 đối tượng NhanVien là KyThuat, 1 đối tượng tạo
sẵn dữ liệu và 1 đối tượng nhập từ bàn phím, sau đó in ra thông tin cả hai đối tượng.*/
public class Main {
    public static void main(String[] args) {
        //Dữ liệu có sẵn
        NhanVien nv1 = new KyThuat("20173422", "Le Minh Trung", "21/05/1999", "Thanh Hoa", "Programmer");

        System.out.println("Thông tin nhân viên: ");

        System.out.println(nv1);
        String result1 = nv1.moTaCongViec();
        System.out.println(result1);

        //Dữ liệu nhập từ bàn phím
        Scanner in = new Scanner(System.in);

        System.out.println("Nhập mã nhân viên: ");
        String maNhanVien = in.nextLine();

        System.out.println("Nhập họ tên: ");
        String hoTen = in.nextLine();

        System.out.println("Nhập năm sinh: ");
        String namSinh = in.nextLine();

        System.out.println("Nhập địa chỉ: ");
        String diaChi = in.nextLine();

        System.out.println("Nhập chuyên ngành: ");
        String chuyenNganh = in.nextLine();

        NhanVien nv2 = new KyThuat(maNhanVien, hoTen, namSinh, diaChi, chuyenNganh);

        System.out.println(nv2);
        String result2 = nv2.moTaCongViec();
        System.out.println(result2);
    }
}
