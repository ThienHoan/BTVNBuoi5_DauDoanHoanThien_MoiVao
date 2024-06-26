/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoiTuong;

/**
 *
 * @author hoan6
 */
public class Student extends DoiTuong{
    private String lop, ban;

    public Student(String maDoiTuong, String tenDoiTuong, String yob, boolean sex, String lop, String ban) {
        super(maDoiTuong, tenDoiTuong, yob, sex);
        this.lop = lop;
        this.ban = ban;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getBan() {
        return ban;
    }

    public void setBan(String ban) {
        this.ban = ban;
    }

    @Override
    public String toString() {
        return "Student" + super.toString() + "lop = " + lop + ", ban = " + ban + '}';
    }
    
    
    
}
