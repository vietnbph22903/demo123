/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLy;
import java.util.ArrayList;
import entity.Phong;
import java.util.Scanner;
import KeThua.PhongHoc;

/**
 *
 * @author v1et
 */
public class QuanLyPhong {
    ArrayList<Phong> listPhong = new ArrayList<>();
    public void nhap(){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Nhap thong tin phong");
        while(true){
            Phong p = new Phong();
            p.nhap();    
            String traloi;
            traloi = sc.nextLine();
            System.out.println("Ban co muon tiep tuc? (Y/N)");
            if(traloi.equalsIgnoreCase("N")){
                break;
            }
        }
    }
    
    public void xuat(){
       for(Phong x:listPhong){
          x.Inthongtin();
       }
    }
    
    public void xuatByTrangThai(){
        
    }
    public void kethua(){

        PhongHoc ph1 = new PhongHoc(1, "P306", 10, 2);
        PhongHoc ph2 = new PhongHoc(1, "P309", 10, 2);
        PhongHoc ph3 = new PhongHoc(2, "P303", 10, 1);
        
    }
}
