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
    private String id;
    private String hoVaTen;
    private String soDienThoai;
    private String monHoc;
    private String email;
    private String diaChi;
    private String truongDangHoc;
    private String mucLuongMongMuon;
    private Boolean isTeacher;
    private String kinhNghiem;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getMonHoc() {
        return monHoc;
    }

    public void setMonHoc(String monHoc) {
        this.monHoc = monHoc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getTruongDangHoc() {
        return truongDangHoc;
    }

    public void setTruongDangHoc(String truongDangHoc) {
        this.truongDangHoc = truongDangHoc;
    }

    public String getMucLuongMongMuon() {
        return mucLuongMongMuon;
    }

    public void setMucLuongMongMuon(String mucLuongMongMuon) {
        this.mucLuongMongMuon = mucLuongMongMuon;
    }

    public Boolean getIsTeacher() {
        return isTeacher;
    }

    public void setIsTeacher(Boolean isTeacher) {
        this.isTeacher = isTeacher;
    }

    public String getKinhNghiem() {
        return kinhNghiem;
    }

    public void setKinhNghiem(String kinhNghiem) {
        this.kinhNghiem = kinhNghiem;
    }

    public GiaSu(String id, String hoVaTen, String soDienThoai, String monHoc, String email, String diaChi, String truongDangHoc, String mucLuongMongMuon, Boolean isTeacher, String kinhNghiem) {
        this.id = id;
        this.hoVaTen = hoVaTen;
        this.soDienThoai = soDienThoai;
        this.monHoc = monHoc;
        this.email = email;
        this.diaChi = diaChi;
        this.truongDangHoc = truongDangHoc;
        this.mucLuongMongMuon = mucLuongMongMuon;
        this.isTeacher = isTeacher;
        this.kinhNghiem = kinhNghiem;
    }
    
    

    

    public GiaSu(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "GiaSu{" + "id=" + id + ", hoVaTen=" + hoVaTen + ", soDienThoai=" + soDienThoai + ", monHoc=" + monHoc + ", email=" + email + ", diaChi=" + diaChi + ", truongDangHoc=" + truongDangHoc + ", mucLuongMongMuon=" + mucLuongMongMuon + ", isTeacher=" + isTeacher + ", kinhNghiem=" + kinhNghiem + '}';
    }

    

    

    

    

    

    

    @Override
    public int compareTo(GiaSu o) {
     return this.id.compareTo(o.id);
    }

    @Override
    public int hashCode() {
     return Objects.hash(id, hoVaTen, soDienThoai, monHoc,  email, diaChi,  truongDangHoc,  mucLuongMongMuon, isTeacher, kinhNghiem);
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
        return Objects.equals(id, other.id);
       
    }

    

    
    

    

    

    
    
    

   
    

    
    

    
    
    
}
