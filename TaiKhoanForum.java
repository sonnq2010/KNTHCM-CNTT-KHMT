public class TaiKhoanForum {
    private String tenDangNhap;
    private String password;
    private String ngayTao;
    private int soBaiDaDang;

    public TaiKhoanForum() {}

    public TaiKhoanForum(String tenDangNhap, String password, String ngayTao, int soBaiDaDang) {
        this.tenDangNhap = tenDangNhap;
        this.password = password;
        this.ngayTao = ngayTao;
        this.soBaiDaDang = soBaiDaDang;
    }

    public boolean doiMatKhau(String old_pw, String new_pw) {
        if (this.password != old_pw) return false;

        this.password = new_pw;
        return true;
    }

    public String loaiThanhVien() {
        if (this.soBaiDaDang >= 50) return "Thanh vien VIP";
        if (this.soBaiDaDang >= 30) return "Thanh vien nang dong";
        if (this.soBaiDaDang >= 5) return "Thanh vien co dong gop";
        return "Thanh vien moi";
    }

    public String toString() {
        return String.format("(%s, %s, %s)", tenDangNhap, ngayTao, this.loaiThanhVien());
    }

    public static void main(String[] args) {
        TaiKhoanForum account = new TaiKhoanForum(
            "sonnq2010", 
            "password_test",
            "20/10/2000",
            100
        );

        System.out.println(account.doiMatKhau("password_test", "new_password"));
        System.out.println(account.loaiThanhVien());
        System.out.println(account.toString());
    }
}
