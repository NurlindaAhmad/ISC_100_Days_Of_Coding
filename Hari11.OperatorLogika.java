package Linda1;

import java.util.Scanner;


public class Hari11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int nilai = 15;
        int nilaiTebakanKamu;
        boolean isiTebakan;
        
        
        System.out.print("isi tebakan kamu :");
        nilaiTebakanKamu = sc.nextInt();
        System.out.println("Nilai tebakan kamu :" + nilaiTebakanKamu);
        
        isiTebakan = nilaiTebakanKamu == nilai;
        System.out.println("tebakan kamu:" + isiTebakan);
        
        
        System.out.print("coba isi nilai diantara nilai 6 dan 20 :");
        nilaiTebakanKamu = sc.nextInt();
        
        isiTebakan = nilaiTebakanKamu > 6 && nilaiTebakanKamu < 20;
        System.out.println("tebakan kamu :" + isiTebakan);
        
        
    }
    
}
