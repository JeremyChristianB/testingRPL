/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */

/**
 *
 * @author hp
 */
import java.util.Scanner;
public class CheckLulusKELRAFAEL{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int Jadwal_MataKuliah;
        int Nilai_MataKuliah;     
        while(num <= 1){       
        System.out.println("Silahkan pilih mata kuliah:");
        System.out.println("1. Dasar-dasar Pemograman");
        System.out.println("2. Analisis Struktur Data");
        System.out.println("3. Pemograman Berbasis Web");
        System.out.println("4. Pemograman Pada Perangkat Lunak");
        System.out.println("5. Rekayasa Perangkat Lunak");
        Jadwal_MataKuliah=sc.nextInt () ; 
        switch(Jadwal_MataKuliah){
            case 1:
                System.out.println("Minimun nilai B");
                break;
            case 2:
                System.out.println("Minimun nilai B");
                break;
            case 3:
                System.out.println("Minimun nilai B");
                break;
            case 4:
                System.out.println("Minimun nilai B");
                break;
            case 5:
                System.out.println("Minimun nilai B");
                break;
            default:
                System.out.println("Silahkan Pilih 1,2,3,4,5");           
            }
        System.out.println("Silahkan Masukan Nilai:");
        System.out.println("1. A");
        System.out.println("2. A-");
        System.out.println("3. B+");
        System.out.println("4. B");
        System.out.println("5. B-");
        System.out.println("6. C+");
        System.out.println("7. C");
        System.out.println("8. D");
        System.out.println("9. E");        
        Nilai_MataKuliah=sc.nextInt();
        switch(Nilai_MataKuliah){
            case 1:
                System.out.println("Lulus");
                break;
            case 2:
                System.out.println("Lulus");
                break;
            case 3:
                System.out.println("Lulus");
                break;
            case 4:
                System.out.println("Lulus");
                break;
            case 5:
                System.out.println("Tidak Lulus");
                break;
            case 6:
                System.out.println("Tidak Lulus");
                break;
            case 7:
                System.out.println("Tidak Lulus");
                break;
            case 8:
                System.out.println("Tidak Lulus");
                break;
            case 9:
                System.out.println("Tidak Lulus");
                break;    
            default:
                System.out.println("Silahkan Pilih 1,2,3,4,5,6,7,8,9");
                break;
        }        
        num++;
        }
    }
}
