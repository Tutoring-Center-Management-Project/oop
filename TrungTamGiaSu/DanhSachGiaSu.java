/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrungTamGiaSu;

//import java.time.Clock;
import java.util.ArrayList;
/**
 *
 * @author PC
 */
public class DanhSachGiaSu {
    private ArrayList<GiaSu> danhsach;

    public DanhSachGiaSu() {
        this.danhsach=new ArrayList<GiaSu>();
    }

    public DanhSachGiaSu(ArrayList<GiaSu> danhsach) {
        this.danhsach = danhsach;
    }
// Thêm gia sư vào danh sách.
    public void themGiaSu(GiaSu gs)
    {
        this.danhsach.add(gs);
    }
// In danh sách gia sư ra màn hình.    
    public void inDanhSachGiasu()
    {
        for(GiaSu giasu:danhsach)
        {
            System.out.println(giasu);
        }
    }
 // Lấy ra số lượng gia sư trong danh sách.   
    public int laySoLuongGiaSu()
    {
        return this.danhsach.size();
    }
 // Tìm kiếm tất cả gia sư dựa trên Tên được nhập từ bàn phím.   
    public void timGiaSu(String ten) {
	for (GiaSu giasu : danhsach) {
	    if(giasu.getHoVaTen().indexOf(ten)>=0) {
		System.out.println(giasu);}
    }
}
    // Làm rỗng danh sách gia sư.
    public void LamRongDanhSach()
    {
        this.danhsach.removeAll(danhsach);
    }
    // Xóa một gia sư ra khỏi danh sách dựa trên mã id.
    public boolean XoaGiaSuKhoiDanhSach(GiaSu gs)
    {
        return this.danhsach.remove(gs);
    }
    // Kiểm tra gia sư có tồn tại trong danh sách hay không, dựa trên mã id.
    public boolean KiemTraTonTai(GiaSu gs)
    {
        return this.danhsach.contains(gs);
    }
    // Kiểm tra danh sách có rỗng hay không.
    public boolean kiemTraDanhSachRong() {
	return this.danhsach.isEmpty();
  
}
}
