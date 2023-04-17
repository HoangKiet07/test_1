import java.util.Objects;

public class SinhVien implements People{
    private String maSV;
    private String hoTen;
    private int namSinh;
    private float diemTB;

    public SinhVien(String maSV, String hoTen, int namSinh, float diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diemTB = diemTB;
    }

    public SinhVien(String mssv) {
        this.maSV = mssv;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSV='" + maSV + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", namSinh=" + namSinh +
                ", diemTB=" + diemTB +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SinhVien sinhVien)) return false;
        return Objects.equals(getMaSV(), sinhVien.getMaSV());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMaSV(), getHoTen(), getNamSinh(), getDiemTB());
    }

    @Override
    public void inTenKiet() {
        System.out.println("Kiet");
    }

    @Override
    public String inTenAnhLoc(String x) {
        return x;
    }
}
