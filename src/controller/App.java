/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DoiTuong.DoiTuong;
import DoiTuong.Student;
import DoiTuong.Teacher;
import ThuVien.Book;
import ThuVien.Paper;
import ThuVien.ThuVien;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author hoan6
 */
public class App {

    static Scanner sc = new Scanner(System.in);

    static ArrayList<DoiTuong> dT = new ArrayList();
    static ArrayList<ThuVien.ThuVien> tV = new ArrayList<>();

    public static void main(String[] args) {

        displayMenu();

    }

    public static void displayMenu() {
        while (true) {
            System.out.println("*****Menu*****");
            System.out.println("1. Them Hoc Sinh");
            System.out.println("2. Them Giao Vien");
            System.out.println("3. Them Book");
            System.out.println("4. Them paper");
            System.out.println("5. Hien thi list cac doi tuong");
            System.out.println("6. Hien thi list sach hoac paper co trong thu vien");
            System.out.println("7. Quit");
            System.out.println("Moi ban chon: ");

            int choice;
            try {
                choice = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Vui long nhap tu 1...4");
                sc.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    addHocSinh();
                    break;
                case 2:
                    addTeacher();
                    break;
                case 3:
                    addBook();
                    break;
                case 4:
                    addPaper();
                    break;
                case 5:
                    printDoiTuong();
                    break;
                case 6:
                    break;
                case 7:
                    break;

            }
        }

    }

    public static void addHocSinh() {

        System.out.println("Moi ban nhap MaDoiTuong: ");
        String maDoiTuong = sc.nextLine();
        System.out.println("Moi ban nhap tenDoiTuong: ");
        String tenDoiTuong = sc.nextLine();
        System.out.println("Moi ban nhap yob: ");
        String yob = sc.nextLine();
        System.out.println("Moi ban nhap sex: ");
        boolean sex = Boolean.parseBoolean(sc.nextLine());
        System.out.println("Moi ban nhap lop: ");
        String lop = sc.nextLine();
        System.out.println("Moi ban nhap ban: ");
        String ban = sc.nextLine();

        Student std = new Student(maDoiTuong, tenDoiTuong, yob, sex, lop, ban);
        dT.add(std);

    }

    public static void addTeacher() {
        System.out.println("Moi ban nhap MaDoiTuong: ");
        String maDoiTuong = sc.nextLine();
        System.out.println("Moi ban nhap tenDoiTuong: ");
        String tenDoiTuong = sc.nextLine();
        System.out.println("Moi ban nhap yob: ");
        String yob = sc.nextLine();
        System.out.println("Moi ban nhap sex: ");
        boolean sex = Boolean.parseBoolean(sc.nextLine());
        System.out.println("Moi ban nhap tringDo: ");
        String lop = sc.nextLine();
        System.out.println("Moi ban nhap monDay: ");
        String ban = sc.nextLine();

        Teacher tC = new Teacher(maDoiTuong, tenDoiTuong, yob, sex, ban, ban);
        dT.add(tC);
    }

    public static void addBook() {
        System.out.println("Moi ban nhap MaTaiLieu: ");
        String maTaiLieu = sc.nextLine();
        System.out.println("Moi ban nhap tenTaiLieu: ");
        String tenTaiLieu = sc.nextLine();
        System.out.println("Moi ban nhap NXB: ");
        String NXB = sc.nextLine();
        System.out.println("Moi ban nhap soTrang: ");
        int soTrang = Integer.parseInt(sc.nextLine());
        
        Book book = new Book(maTaiLieu, tenTaiLieu, NXB, soTrang);
        tV.add(book);
    }
    public static void addPaper(){
        System.out.println("Moi ban nhap MaTaiLieu: ");
        String maTaiLieu = sc.nextLine();
        System.out.println("Moi ban nhap tenTaiLieu: ");
        String tenTaiLieu = sc.nextLine();
        System.out.println("Moi ban nhap NXB: ");
        String NXB = sc.nextLine();
        System.out.println("Moi ban nhap taiban: ");
        int soTrang = Integer.parseInt(sc.nextLine());
        
        Paper paper = new Paper(maTaiLieu, tenTaiLieu, NXB, soTrang);
        tV.add(paper);
        
    }
    public static void printDoiTuong(){
        for (DoiTuong doiTuong : dT) {
            System.out.println(doiTuong);
        }
    }
    public static void printThuVien(){
        for (ThuVien thuVien : tV) {
            System.out.println(thuVien);
        }
    }
    

}
