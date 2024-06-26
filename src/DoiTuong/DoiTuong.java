/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoiTuong;

/**
 *
 * @author hoan6
 */
public class DoiTuong {
    protected String maDoiTuong, tenDoiTuong, yob;
    protected boolean sex;

    public DoiTuong(String maDoiTuong, String tenDoiTuong, String yob, boolean sex) {
        this.maDoiTuong = maDoiTuong;
        this.tenDoiTuong = tenDoiTuong;
        this.yob = yob;
        this.sex = sex;
    }

    public String getMaDoiTuong() {
        return maDoiTuong;
    }

    public void setMaDoiTuong(String maDoiTuong) {
        this.maDoiTuong = maDoiTuong;
    }

    public String getTenDoiTuong() {
        return tenDoiTuong;
    }

    public void setTenDoiTuong(String tenDoiTuong) {
        this.tenDoiTuong = tenDoiTuong;
    }

    public String getYob() {
        return yob;
    }

    public void setYob(String yob) {
        this.yob = yob;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "maDoiTuong = " + maDoiTuong + ", tenDoiTuong = " + tenDoiTuong + ", yob = " + yob + ", sex = " + sex ;
    }
    
}
