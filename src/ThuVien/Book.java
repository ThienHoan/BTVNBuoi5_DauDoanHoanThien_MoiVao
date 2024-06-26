/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThuVien;

/**
 *
 * @author hoan6
 */
public class Book extends ThuVien{
    private int soTrang;

    public Book( String maTL, String tenTL, String NXB, int soTrang) {
        super(maTL, tenTL, NXB);
        this.soTrang = soTrang;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return super.toString() + "soTrang=" + soTrang ;
    }
    
}
