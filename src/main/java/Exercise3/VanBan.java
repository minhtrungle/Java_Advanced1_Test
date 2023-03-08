package Exercise3;

public class VanBan {
    private String kyTu;

    public VanBan() {
    }

    public VanBan(String kyTu) {
        this.kyTu = kyTu;
    }

    public String getKyTu() {
        return kyTu;
    }

    public void setKyTu(String kyTu) {
        this.kyTu = kyTu;
    }

    //Đếm số từ của văn bản
    public long demSoTuVanBan(String s) {
        int wordCount = 0;

        boolean word = false;
        int endOfLine = s.length() - 1;

        for (int i = 0; i < s.length(); i++) {

            if (Character.isLetter(s.charAt(i)) && i != endOfLine) {
                word = true;
            } else if (!Character.isLetter(s.charAt(i)) && word) {
                wordCount++;
                word = false;

            } else if (Character.isLetter(s.charAt(i)) && i == endOfLine) {
                wordCount++;
            }
        }
        return wordCount;

    }

    //chuẩn hoá một xâu theo tiêu chuẩn
    public String chuanHoaVanBanTieuChuan() {
        String result = kyTu.trim().replaceAll("\\s+", " ");
        return result;
    }

    //chuyển đổi toàn bộ văn bản thành viết hoa.
    public String toanBoVanBanVietHoa() {
        String result = kyTu.toUpperCase();
        return result;
    }

    //chuyển đổi toàn bộ văn bản thành viết thường.
    public String toanBoVanBanVietThuong() {
        String result = kyTu.toLowerCase();
        return result;
    }

    //viết hoa chữ cái đầu tiên của mỗi từ trong văn bản.
    public String vietHoaChuCaiDau(String s) {// get the first character of the inputString
        char firstLetter = s.charAt(0);

        char capitalFirstLetter = Character.toUpperCase(firstLetter);

        return s.replace(s.charAt(0), capitalFirstLetter);
    }

    @Override
    public String toString() {
        return "VanBan[" +
                "kyTu='" + kyTu + '\'' +
                ']';
    }
}
