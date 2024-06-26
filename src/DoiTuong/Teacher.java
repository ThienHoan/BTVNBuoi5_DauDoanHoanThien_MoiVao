/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoiTuong;

/**
 *
 * @author hoan6
 */
public class Teacher extends DoiTuong{
    private String trinhDo, monDay;

    public Teacher( String maDoiTuong, String tenDoiTuong, String yob, boolean sex, String trinhDo, String monDay) {
        super(maDoiTuong, tenDoiTuong, yob, sex);
        this.trinhDo = trinhDo;
        this.monDay = monDay;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getMonDay() {
        return monDay;
    }

    public void setMonDay(String monDay){ 
        this.monDay = monDay;
    }

    @Override
    public String toString() {
        return "Teacher" + super.toString() + "trinhDo=" + trinhDo + ", monDay=" + monDay ;
    }
    
}
