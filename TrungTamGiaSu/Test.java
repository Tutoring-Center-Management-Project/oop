/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrungTamGiaSu;

import java.util.Scanner;

public class Test {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        int luaChon=0;
        do {
        //Hiển thị menu    
        System.out.println("MENU ---------- ");
        System.out.println("Vui lòng chọn chức năng: ");
        System.out.println("1. Quản lý gia sư");
        System.out.println("2. Quản lý học viên");
        System.out.println("0. Thoát khỏi chương trình");
        System.out.print("Nhập lựa chọn của bạn: ");
        luaChon = sc.nextInt();
        sc.nextLine();
        
            switch (luaChon) {
                case 0:
                    System.out.println("Đã thoát khỏi chương trình.");
                    break;
                case 1:
                    quanLyGiaSu();
                    break;
                case 2:
                    quanLyHocVien();
                    break;
                
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (luaChon != 0);
    }

   
    public static void quanLyGiaSu() {
        DanhSachGiaSu dsgs = new DanhSachGiaSu();
        int luaChon;
        do {
            System.out.println("1. Thêm gia sư vào danh sách.");
            System.out.println("2. In danh sách gia sư ra màn hình.");
            System.out.println("3. Kiểm tra danh sách gia sư có rỗng hay không.");
            System.out.println("4. Lấy ra số lượng gia sư trong danh sách.");
            System.out.println("5. Làm rỗng danh sách gia sư.");
            System.out.println("6. Kiểm tra gia sư có tồn tại trong danh sách hay không, dựa trên mã id.");
            System.out.println("7. Xóa một gia sư ra khỏi danh sách dựa trên mã id.");
            System.out.println("8. Tìm kiếm tất cả gia sư dựa trên Tên được nhập từ bàn phím.");
            System.out.println("0. Quay lại menu chính.");
            System.out.print("Nhập lựa chọn của bạn: ");
            luaChon = sc.nextInt();
            sc.nextLine();

            switch (luaChon) {
                case 0:
                System.out.println("Quay lại menu chính.");
                    break;
                case 1:
                {// Thêm gia sư vào danh sách
                System.out.println("Nhập Id: "); 
                String id = sc.nextLine();
                System.out.println("Nhập họ và tên: "); 
                String hoVaTen = sc.nextLine();
                System.out.println("Nhập số điện thoại: "); 
                String sdt = sc.nextLine();
                System.out.println("Nhập môn học: "); 
                String monhoc = sc.nextLine();
                System.out.println("Nhập địa chỉ: ");
                String diachi=sc.nextLine();
                System.out.println("Nhập trường đang học: ");
                String truongdanghoc=sc.nextLine();
                System.out.println("Nhập mức lương mong muốn: ");
                String mucluong=sc.nextLine();
                System.out.println("Kiểm tra gia sư có phải isteacher (Y/N): ");
                Boolean isteacher=sc.nextBoolean(); 
                System.out.println("Nhập kinh nghiệm của gia sư: ");
                String kinhnghiem=sc.nextLine();
                System.out.println("Nhập email của gia sư :");
                String email=sc.nextLine();
                GiaSu gs = new GiaSu(id,hoVaTen, sdt, monhoc,email,diachi,truongdanghoc,mucluong,isteacher,kinhnghiem);
                dsgs.themGiaSu(gs);
                break;}
                
                case 2:
                // In danh sách gia sư
                dsgs.inDanhSachGiasu();
                break;
                
                case 3:
                // Kiểm tra danh sách có rỗng hay không.    
                System.out.println("Danh sách rỗng: "+ dsgs.kiemTraDanhSachRong());
                break;
                
                case 4:
                // Lấy ra số lượng gia sư trong danh sách.    
                System.out.println("Số lượng hiện tại: "+ dsgs.laySoLuongGiaSu());    
                break;
                
                case 5:
                // Làm rỗng danh sách gia sư.
                dsgs.LamRongDanhSach();
                break;
                
                case 6:
                // Kiểm tra gia sư có tồn tại trong danh sách hay không, dựa trên mã id.    
                System.out.println("Nhập id: "); 
                String maId = sc.nextLine();
		GiaSu gs = new GiaSu(maId);
                System.out.println("Kiếm tra gia sư có trong danh sách: "+dsgs.KiemTraTonTai(gs));
                break;
                
                case 7:
                // Xóa một gia sư ra khỏi danh sách dựa trên mã id.
                System.out.println("Nhập  Id: "); 
                String Id = sc.nextLine();
		GiaSu giasu = new GiaSu(Id);
		System.out.println("Xóa gia sư khỏi danh sách: "+dsgs.XoaGiaSuKhoiDanhSach(giasu));
                break;
                
                case 8:
                // Tìm kiếm tất cả gia sư dựa trên Tên được nhập từ bàn phím.       
                System.out.println("Nhập họ và tên: "); 
                String hoVaTen = sc.nextLine();
		System.out.println("Kết quả tìm kiếm: ");
		dsgs.timGiaSu(hoVaTen);
                break;
                
                default:
                System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (luaChon != 0);
        }

    public static void quanLyHocVien() {
        Scanner sc=new Scanner(System.in);
        DanhSachHocVien dshv=new DanhSachHocVien();
        int luaChon;
        do {
        System.out.println("1. Thêm học viên vào danh sách.");
        System.out.println("2. In danh sách học viên ra màn hình.");
        System.out.println("3. Kiểm tra danh sách học viên có rỗng hay không.");
        System.out.println("4. Lấy ra số lượng học viên trong danh sách.");
        System.out.println("5. Làm rỗng danh sách học viên.");
        System.out.println("6. Kiểm tra học viên có tồn tại trong danh sách hay không, dựa trên mã id.");
        System.out.println("7. Xóa một học viên ra khỏi danh sách dựa trên mã id.");
        System.out.println("8. Tìm kiếm tất cả học viên dựa trên Tên được nhập từ bàn phím.");
        System.out.println("0. Quay lại menu chính.");
        System.out.print("Nhập lựa chọn của bạn: ");
        luaChon = sc.nextInt();
        sc.nextLine();
        
            
            switch (luaChon) {
                case 0:
                System.out.println("Quay lại menu chính.");
                    break;
                case 1:
                {// Thêm học viên vào danh sách
                System.out.println("Nhập Id: "); 
                String id = sc.nextLine();
                System.out.println("Nhập họ và tên: "); 
                String hoVaTen = sc.nextLine();
                System.out.println("Nhập địa chỉ: "); 
                String diachi = sc.nextLine();
                System.out.println("Nhập môn học: "); 
                String monhoc = sc.nextLine();
                System.out.println("Nhập số buổi: ");
                int sobuoi=sc.nextInt();
                System.out.println("Nhập học phí: ");
                String hocphi=sc.nextLine();
                System.out.println("Nhập yêu cầu thêm: ");
                String bonus=sc.nextLine();
               
                Parents hv = new Parents(id,hoVaTen, diachi, monhoc,sobuoi,hocphi,bonus);
                dshv.themHocVien(hv);
                break;}
                
                case 2:
                // In danh sách học viên
                dshv.inDanhSachHocVien();
                break;
                
                case 3:
                //Kiểm tra danh sách học viên có rỗng hay không
                System.out.println("Danh sách rỗng: "+ dshv.kiemTraDanhSachRong());
                break;
                
                case 4:
                //Lấy ra số lượng học viên trong danh sách
                System.out.println("Số lượng hiện tại: "+ dshv.laySoLuongHocVien());    
                break;
                
                case 5:
                //Làm rỗng danh sách học viên    
                dshv.LamRongDanhSach();
                break;
                
                case 6:
                //Kiểm tra học viên có tồn tại trong danh sách hay không, dựa trên mã id
                System.out.println("Nhập id: "); 
                String maId = sc.nextLine();
		Parents hv = new Parents(maId);
                System.out.println("Kiếm tra học viên có trong danh sách: "+dshv.KiemTraTonTai(hv));
                break;
                
                case 7:
                //Xóa một học viên ra khỏi danh sách dựa trên mã id
                System.out.println("Nhập  Id: "); 
                String Id = sc.nextLine();
		Parents hocvien = new Parents(Id);
		System.out.println("Xóa học viên khỏi danh sách: "+dshv.XoaHocVienKhoiDanhSach(hocvien));
                break;
                
                case 8:
                //Tìm kiếm tất cả học viên dựa trên Tên được nhập từ bàn phím    
                System.out.println("Nhập họ và tên: "); 
                String hoVaTen = sc.nextLine();
		System.out.println("Kết quả tìm kiếm: ");
		dshv.timHocVien(hoVaTen);
                break;
                default:
                System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (luaChon != 0);
    }

   
}