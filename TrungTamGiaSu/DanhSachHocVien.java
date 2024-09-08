/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrungTamGiaSu;

/**
 *
 * @author PC
 */
import java.util.ArrayList;
public class DanhSachHocVien {
    private ArrayList<Parents>dshocvien;

    public DanhSachHocVien(ArrayList<Parents>dshocvien) {
        this.dshocvien = dshocvien;
    }

    public DanhSachHocVien() {
        this.dshocvien=new ArrayList<Parents>();
    }
    //Thêm học viên vào danh sách
    public void themHocVien(Parents hv)
    {
        this.dshocvien.add(hv);
    }
    //In danh sách học viên ra màn hình
    public void inDanhSachHocVien()
    {
        for(Parents hv:dshocvien)
        {
            System.out.println(hv);
        }
    }
    //Lấy ra số lương học viên trong danh sách
    public int laySoLuongHocVien()
    {
        return this.dshocvien.size();
    }
    // Tìm kiếm tất cả học viên dựa trên Tên được nhập từ bàn phím.   
    public void timHocVien(String ten) {
	for (Parents hv : dshocvien) {
	    if(hv.getStudentName().indexOf(ten)>=0) {
		System.out.println(hv);}
    }
}
    // Làm rỗng danh sách học viên.
    public void LamRongDanhSach()
    {
        this.dshocvien.removeAll(dshocvien);
    }
    // Xóa một học viên ra khỏi danh sách dựa trên mã id.
    public boolean XoaHocVienKhoiDanhSach(Parents hv)
    {
        return this.dshocvien.remove(hv);
    }
    // Kiểm tra học viên có tồn tại trong danh sách hay không, dựa trên mã id.
    public boolean KiemTraTonTai( Parents hv)
    {
        return this.dshocvien.contains(hv);
    }
    // Kiểm tra danh sách có rỗng hay không.
    public boolean kiemTraDanhSachRong() {
	return this.dshocvien.isEmpty();
  
}
   
    
    
    
}

    
    
    

