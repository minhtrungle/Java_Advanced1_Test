package Exercise3;

public class Main {
    public static void main(String[] args) {
        VanBan v1 = new VanBan();
        v1.setKyTu("Le Minh Trung");
        // đếm số từ của văn bản
        System.out.println("So tu la:");
        System.out.println(v1.demSoTuVanBan("le minh trung"));

        // chuẩn hoá một xâu theo tiêu chuẩn
        v1.setKyTu(v1.chuanHoaVanBanTieuChuan());
        System.out.println(v1);

        // chuyển đổi toàn bộ văn bản thành viết hoa.
        v1.setKyTu(v1.toanBoVanBanVietHoa());
        System.out.println(v1);

        // chuyển đổi toàn bộ văn bản thành viết thường.
        v1.setKyTu(v1.toanBoVanBanVietThuong());
        System.out.println(v1);

        // viết hoa chữ cái đầu tiên của mỗi từ trong văn bản.
        v1.setKyTu(v1.vietHoaChuCaiDau("le minh trung"));
        System.out.println(v1);
    }
}



