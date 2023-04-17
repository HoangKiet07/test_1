import java.util.HashSet;
import java.util.Set;

public class DanhSachSinhVien {
    private Set<SinhVien> dsSV = new HashSet<SinhVien>();

    public DanhSachSinhVien(Set<SinhVien> dsSV) {
        this.dsSV = dsSV;
    }

    public DanhSachSinhVien() {
        this.dsSV = new HashSet<SinhVien>();
    }

    // 1
    public void addSV(SinhVien sv){
        this.dsSV.add(sv);
    }

    // 2
    public void inDS(){
        for (SinhVien sv : dsSV) {
            System.out.println(sv.toString());
        }
    }

    // 3
    public int soL(){
        return this.dsSV.size();
    }

    // 4
    public boolean check(SinhVien sinhVien){
        for (SinhVien sv: this.dsSV) {
            if (sinhVien.equals(sv) == true) return true;
        }
        return false;
    }

    // 5
    public boolean xoa(SinhVien sinhVien){
        for (SinhVien sv: this.dsSV) {
            if (sinhVien.equals(sv) == true){
                dsSV.remove(sv);
                System.out.println("XOA THANH CONG");
                return true;
            }
        }
        System.out.println("XOA THAT BAI");
        return false;
    }

    //6
    public void timKiem(String ten){
        int m = 0;
        for (SinhVien sv: dsSV) {
            if (sv.getHoTen().indexOf(ten) >=0 ){
                System.out.println(sv.toString());
                m++;
            }
        }
        if (m==0) System.out.println("KHONG TIM THAY");
    }

    // 7
    public String daoNguoc(String s){
        String s_n = "";
        char mang_s[] = s.toCharArray();
        for (int i = s.length()-1; i>=0; i--){
            s_n = s_n + mang_s[i];
        }
        return s_n;
    }

}
