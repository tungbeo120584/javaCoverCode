/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi_9;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class TinhTongDanhSachNangCap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintStream out = System.out;
        ArrayList<Double> mangSo = new ArrayList<Double>();
        
        while(true){
            out.printf("Vui long nhap phan tu thu %d: ", mangSo.size());
            mangSo.add(sc.nextDouble());
            sc.nextLine();
            out.print("Ban co muon nhap tiep khong, nhap N de thoat: ");
            String luachon = sc.nextLine();
            if(luachon.equalsIgnoreCase("N")){
                break;
            }
        }
        for (Double x : mangSo) {
            out.println(x);
        }
    }
}
