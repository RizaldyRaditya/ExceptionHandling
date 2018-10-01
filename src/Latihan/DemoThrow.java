/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author Rudi Erwanto
 */
public class DemoThrow {
    public static void main(String[] args) {
        DataMhs DTM = new DataMhs();
        DTM.setNIM("0030391020");
        DTM.setNAME("Rizaldy Raditya Erwanto");
        DTM.setNILAI(100);
        
        System.out.println("NIM : " + DTM.getNIM());
        System.out.println("NAMA : " + DTM.getNAME());
        System.out.println("NILAI : " + DTM.getNILAI());
    }
}
