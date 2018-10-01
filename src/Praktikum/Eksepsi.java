/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

import java.util.Scanner;

/**
 *
 * @author Rudi Erwanto
 */
public class Eksepsi extends Exception {
       public static void main(String[] args) {
     try{
         int Umur;
         Scanner U = new Scanner(System.in);
         System.out.print("Masukkan umur anda : ");
         Umur = U.nextInt();
         System.out.println("Umur anda adalah : " +Umur);
     }
     catch(Exception e){
         System.out.println("Masukkan umur anda " + "jangan pakai huruf / symbol");
     }
           
    }
}
