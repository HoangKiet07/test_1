import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachSinhVien dsSV = new DanhSachSinhVien();
        int luachon = 0;
        do {
            System.out.println("MENU-------------------------------");
            System.out.println(
                    "1. THEM SINH VIEN\n" + "2.IN DANH SACH SINH VIEN\n" + "3.LAY SO LUONG SINH VIEN\n" + "4. KIEM TRA SINH VIEN CO TON TAI KHONG\n"+
                            "5. XOA SINH VIEN\n" + "6. TIM KIEM TAT CA SINH VIEN QUA TEN\n" +"7. DAO NGUOC XAU BAT KI\n"+
                            "8. THOAT"
            );
            System.out.println("VUI LONG CHON: ");
            luachon = sc.nextInt();
            sc.nextLine();
            if (luachon == 1){
                System.out.println("Nhap MSSV: ");
                String maSV = sc.nextLine();

                System.out.println("Nhap ho ten: ");
                String hoTen = sc.nextLine();

                System.out.println("Nhap nam sinh: ");
                int namSinh = sc.nextInt();

                System.out.println("Nhap diem TB: ");
                float diemTB = sc.nextFloat();

                SinhVien sv = new SinhVien(maSV, hoTen, namSinh, diemTB);
                dsSV.addSV(sv);
            }else if (luachon == 2){
                dsSV.inDS();
            }else if (luachon == 3){
                System.out.println(dsSV.soL());
            }else if (luachon == 4){
                System.out.println("VUI LONG NHAP MSSV: ");
                String mssv = sc.nextLine();
                SinhVien sv = new SinhVien(mssv);
                System.out.println(dsSV.check(sv));
            }else if (luachon == 5){
                System.out.println("VUI LONG NHAP MSSV: ");
                String mssv = sc.nextLine();
                SinhVien sv = new SinhVien(mssv);
                System.out.println(dsSV.xoa(sv));
            }else if (luachon == 6){
                System.out.println("VUI LONG NHAP HO TEN: ");
                String hoTen = sc.nextLine();
                dsSV.timKiem(hoTen);
            }else if (luachon == 7){
                System.out.println("NHAP XAU:");
                String xau = sc.nextLine();
                System.out.println(dsSV.daoNguoc(xau));
            }
            System.out.println();
        }while(luachon != 0);
        System.out.println("SEE YOU AGAIN");
    }
}
