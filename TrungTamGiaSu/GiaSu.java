/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrungTamGiaSu;

import java.util.Objects;

/**
 *
 * @author PC
 */
public class GiaSu implements Comparable<GiaSu> {
    private String Id;
    private String HoVaTen;
    private String SoDienThoai;
    private String MonHoc;
    private String Email;
    private String DiaChi;
    private String TruongDangHoc;
    private String MucLuongMongMuon;
    private Boolean IsTeacher;
    private String KinhNghiem;

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }
    
    

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    

    public Boolean getIsTeacher() {
        return IsTeacher;
    }

    public void setIsTeacher(Boolean IsTeacher) {
        this.IsTeacher = IsTeacher;
    }

    public String getKinhNghiem() {
        return KinhNghiem;
    }

    public void setKinhNghiem(String KinhNghiem) {
        this.KinhNghiem = KinhNghiem;
    }
    

    public String getMucLuongMongMuon() {
        return MucLuongMongMuon;
    }

    public void setMucLuongMongMuon(String MucLuongMongMuon) {
        this.MucLuongMongMuon = MucLuongMongMuon;
    }
    

    public String getTruongDangHoc() {
        return TruongDangHoc;
    }

    public void setTruongDangHoc(String TruongDangHoc) {
        this.TruongDangHoc = TruongDangHoc;
    }

    
    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }
    

    public String getHoVaTen() {
        return HoVaTen;
    }

    public void setHoVaTen(String HoVaTen) {
        this.HoVaTen = HoVaTen;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public void setSoDienThoai(String SoDienThoai) {
        this.SoDienThoai = SoDienThoai;
    }

    public String getMonHoc() {
        return MonHoc;
    }

    public void setMonHoc(String MonHoc) {
        this.MonHoc = MonHoc;
    }

    public GiaSu(String Id, String HoVaTen, String SoDienThoai, String MonHoc, String Email, String DiaChi, String TruongDangHoc, String MucLuongMongMuon, Boolean IsTeacher, String KinhNghiem) {
        this.Id = Id;
        this.HoVaTen = HoVaTen;
        this.SoDienThoai = SoDienThoai;
        this.MonHoc = MonHoc;
        this.Email = Email;
        this.DiaChi = DiaChi;
        this.TruongDangHoc = TruongDangHoc;
        this.MucLuongMongMuon = MucLuongMongMuon;
        this.IsTeacher = IsTeacher;
        this.KinhNghiem = KinhNghiem;
    }

    public GiaSu(String Id) {
        this.Id = Id;
    }

    

    

    

    

    @Override
    public String toString() {
        return "GiaSu{" + "Id=" + Id + ", HoVaTen=" + HoVaTen + ", SoDienThoai=" + SoDienThoai + ", MonHoc=" + MonHoc + ", Email=" + Email + ", DiaChi=" + DiaChi + ", TruongDangHoc=" + TruongDangHoc + ", MucLuongMongMuon=" + MucLuongMongMuon + ", IsTeacher=" + IsTeacher + ", KinhNghiem=" + KinhNghiem + '}';
    }

    @Override
    public int compareTo(GiaSu o) {
     return this.Id.compareTo(o.Id);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.Id);
        hash = 53 * hash + Objects.hashCode(this.HoVaTen);
        hash = 53 * hash + Objects.hashCode(this.SoDienThoai);
        hash = 53 * hash + Objects.hashCode(this.MonHoc);
        hash = 53 * hash + Objects.hashCode(this.Email);
        hash = 53 * hash + Objects.hashCode(this.DiaChi);
        hash = 53 * hash + Objects.hashCode(this.TruongDangHoc);
        hash = 53 * hash + Objects.hashCode(this.MucLuongMongMuon);
        hash = 53 * hash + Objects.hashCode(this.IsTeacher);
        hash = 53 * hash + Objects.hashCode(this.KinhNghiem);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final GiaSu other = (GiaSu) obj;
        if (!Objects.equals(this.Id, other.Id)) {
            return false;
        }
        if (!Objects.equals(this.HoVaTen, other.HoVaTen)) {
            return false;
        }
        if (!Objects.equals(this.SoDienThoai, other.SoDienThoai)) {
            return false;
        }
        if (!Objects.equals(this.MonHoc, other.MonHoc)) {
            return false;
        }
        if (!Objects.equals(this.Email, other.Email)) {
            return false;
        }
        if (!Objects.equals(this.DiaChi, other.DiaChi)) {
            return false;
        }
        if (!Objects.equals(this.TruongDangHoc, other.TruongDangHoc)) {
            return false;
        }
        if (!Objects.equals(this.MucLuongMongMuon, other.MucLuongMongMuon)) {
            return false;
        }
        if (!Objects.equals(this.IsTeacher, other.IsTeacher)) {
            return false;
        }
        return Objects.equals(this.KinhNghiem, other.KinhNghiem);
    }

    
    

    

    

    
    
    

   
    

    
    

    
    
    
}
