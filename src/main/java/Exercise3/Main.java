package Exercise3;

public class Main {
    public static void main(String[] args) {
        VanBan v = new VanBan("le minh trung");

        // đếm số từ của văn bản
        int count = (int) v.demSoTuVanBan("le minh trung");
        System.out.println("Co so tu la: " + count);

        // chuẩn hoá một xâu theo tiêu chuẩn
        String s1 = v.chuanHoaVanBanTieuChuan();
        v.setKyTu(s1);
        System.out.println(v);

        // chuyển đổi toàn bộ văn bản thành viết hoa.
        String s2 = v.toanBoVanBanVietHoa();
        v.setKyTu(s2);
        System.out.println(v);

        // chuyển đổi toàn bộ văn bản thành viết thường.
        String s3 = v.toanBoVanBanVietThuong();
        v.setKyTu(s3);
        System.out.println(v);

        // viết hoa chữ cái đầu tiên của mỗi từ trong văn bản.
        String s4 = v.vietHoaChuCaiDau("le minh trung");
        v.setKyTu(s4);
        System.out.println(v);
    }
}



