package Exercise3;

public class Main {
    public static void main(String[] args) {
        VanBan v = new VanBan("le minh trung");
        // đếm số từ của văn bản
        System.out.println("So tu la:");
        System.out.println(v.demSoTuVanBan("le minh trung"));

        // chuẩn hoá một xâu theo tiêu chuẩn
        v.setKyTu(v.chuanHoaVanBanTieuChuan());
        System.out.println(v);

        // chuyển đổi toàn bộ văn bản thành viết hoa.
        v.setKyTu(v.toanBoVanBanVietHoa());
        System.out.println(v);

        // chuyển đổi toàn bộ văn bản thành viết thường.
        v.setKyTu(v.toanBoVanBanVietThuong());
        System.out.println(v);

        // viết hoa chữ cái đầu tiên của mỗi từ trong văn bản.
        v.setKyTu(v.vietHoaChuCaiDau("le minh trung"));
        System.out.println(v);
    }
}



