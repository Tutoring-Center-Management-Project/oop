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
        private String id;
        private String studentName;
        private String diaChi;
        private String monHoc;
        private int soBuoi;
        private String hocPhi;
        private String bonus;

    public Parents(String id, String studentName, String diaChi, String monHoc, int soBuoi, String hocPhi, String bonus) {
        this.id = id;
        this.studentName = studentName;
        this.diaChi = diaChi;
        this.monHoc = monHoc;
        this.soBuoi = soBuoi;
        this.hocPhi = hocPhi;
        this.bonus = bonus;
    }

    public Parents(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getMonHoc() {
        return monHoc;
    }

    public void setMonHoc(String monHoc) {
        this.monHoc = monHoc;
    }

    public int getSoBuoi() {
        return soBuoi;
    }

    public void setSoBuoi(int soBuoi) {
        this.soBuoi = soBuoi;
    }

    public String getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(String hocPhi) {
        this.hocPhi = hocPhi;
    }

    public String getBonus() {
        return bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Parents{" + "id=" + id + ", studentName=" + studentName + ", diaChi=" + diaChi + ", monHoc=" + monHoc + ", soBuoi=" + soBuoi + ", hocPhi=" + hocPhi + ", bonus=" + bonus + '}';
    }
    
    @Override
    public int compareTo(Parents o) {
        return this.id.compareTo(o.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id , studentName , diaChi , monHoc , soBuoi, hocPhi, bonus);
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
        return Objects.equals(id, other.id);
    }

    
    

   
    
    
    
}
