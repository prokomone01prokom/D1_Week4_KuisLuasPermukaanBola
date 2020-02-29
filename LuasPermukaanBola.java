/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luas.permukaan.bola;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class LuasPermukaanBola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
        
        final int jumlah_soal = 7;
        int jumlah_benar = 0;
        int count = 0;
        long waktu_start = System.currentTimeMillis();
        String output = "";
        
        while(count < jumlah_soal)
        {
        double phi = 3.14;
        int r = (int) (Math.random()*10);
        int m = 4;
        double persegi = Math.pow(r, 2);
                        
        System.out.println("Jawab pertanyaan berikut: ");
        System.out.println(" hitunglah luas Permukaan bola dengan jari-jari = " + r);
        System.out.println(m + "*" + persegi + "*" + phi + " = ");
            int answer = in.nextInt();
            int answerkey = (int) (persegi * m * phi);
                
            if (answer == answerkey)
            {
                System.out.println("Anda Benar!");
                count++;
                    jumlah_benar++;
            }
            else
            {
                System.out.println("Anda Salah!");
                count++;
            }
                output += "\n" + persegi + "" + m + "" + phi + " = " + answer + " >>" + ((answer == answerkey) ? "Benar" : "Salah");
               
            }
        long waktu_finish = System.currentTimeMillis();
        long waktu_tempuh = waktu_finish - waktu_start;
        
        System.out.println("=================================================");
        System.out.println("Berikut hasilnya :" + output);
        System.out.println("\n" + "Anda menjawab benar sebanyak" + jumlah_benar + " soal ");
        System.out.println("Waktu yang ditempuh adalah " + (waktu_tempuh / 1000) + " detik. ");
        System.out.println("=================================================");
            in.nextLine();
    }
}

