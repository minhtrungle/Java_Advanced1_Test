package Exercise3;

public class Main {
    public static void main(String[] args) {
        VanBan v = new VanBan("le minh trung");

        String s1, s2, s3, s4;

        // đếm số từ của văn bản
        int count = (int) v.demSoTuVanBan("le minh trung");
        System.out.println("Van ban co so tu la: " + count);

        // chuẩn hoá một xâu theo tiêu chuẩn
        s1 = v.chuanHoaVanBanTieuChuan();
        v.setKyTu(s1);
        System.out.println("Van ban sau chuan hoa: " + v);

        // chuyển đổi toàn bộ văn bản thành viết hoa.
        s2 = v.toanBoVanBanVietHoa();
        v.setKyTu(s2);
        System.out.println("Van ban sau khi viet hoa toan bo: " + v);

        // chuyển đổi toàn bộ văn bản thành viết thường.
        s3 = v.toanBoVanBanVietThuong();
        v.setKyTu(s3);
        System.out.println("Van ban sau khi viet thuong toan bo: " + v);

        // viết hoa chữ cái đầu tiên của mỗi từ trong văn bản.
        s4 = v.vietHoaChuCaiDau("le minh trung");
        v.setKyTu(s4);
        System.out.println("Van ban sau khi viet hoa chu cai dau: " + v);
    }
}



