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
public class Parents implements Comparable<Parents>{
    private String Id;
    private String StudentName;
    private String DiaChi;
    private String MonHoc;
    private int SoBuoi;
    private String HocPhi;
    private String Bonus;

    public Parents(String Id, String StudentName, String DiaChi, String MonHoc, int SoBuoi, String HocPhi, String Bonus) {
        this.Id = Id;
        this.StudentName = StudentName;
        this.DiaChi = DiaChi;
        this.MonHoc = MonHoc;
        this.SoBuoi = SoBuoi;
        this.HocPhi = HocPhi;
        this.Bonus = Bonus;
    }

    public Parents(String Id) {
        this.Id = Id;
    }
    

    

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getMonHoc() {
        return MonHoc;
    }

    public void setMonHoc(String MonHoc) {
        this.MonHoc = MonHoc;
    }

    public int getSoBuoi() {
        return SoBuoi;
    }

    public void setSoBuoi(int SoBuoi) {
        this.SoBuoi = SoBuoi;
    }

    public String getHocPhi() {
        return HocPhi;
    }

    public void setHocPhi(String HocPhi) {
        this.HocPhi = HocPhi;
    }

    public String getBonus() {
        return Bonus;
    }

    public void setBonus(String Bonus) {
        this.Bonus = Bonus;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    @Override
    public String toString() {
        return "Parents{" + "Id=" + Id + ", StudentName=" + StudentName + ", DiaChi=" + DiaChi + ", MonHoc=" + MonHoc + ", SoBuoi=" + SoBuoi + ", HocPhi=" + HocPhi + ", Bonus=" + Bonus + '}';
    }

    @Override
    public int compareTo(Parents o) {
        return this.Id.compareTo(o.Id);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.Id);
        hash = 47 * hash + Objects.hashCode(this.StudentName);
        hash = 47 * hash + Objects.hashCode(this.DiaChi);
        hash = 47 * hash + Objects.hashCode(this.MonHoc);
        hash = 47 * hash + this.SoBuoi;
        hash = 47 * hash + Objects.hashCode(this.HocPhi);
        hash = 47 * hash + Objects.hashCode(this.Bonus);
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
        final Parents other = (Parents) obj;
        if (this.SoBuoi != other.SoBuoi) {
            return false;
        }
        if (!Objects.equals(this.Id, other.Id)) {
            return false;
        }
        if (!Objects.equals(this.StudentName, other.StudentName)) {
            return false;
        }
        if (!Objects.equals(this.DiaChi, other.DiaChi)) {
            return false;
        }
        if (!Objects.equals(this.MonHoc, other.MonHoc)) {
            return false;
        }
        if (!Objects.equals(this.Bonus, other.Bonus)) {
            return false;
        }
        return Objects.equals(this.HocPhi, other.HocPhi);
    }

    
    

   
    
    
    
}
