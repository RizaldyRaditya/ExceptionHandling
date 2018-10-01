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
public class DataMhs {
    private String NIM;
    private String NAME;
    private double NILAI;
    
    public void setNIM(String vNIM){
        try{
            NIM = vNIM;
            if (NIM == null){
                throw new NullPointerException();
            }
        }
        catch(NullPointerException npe){
            System.out.println("KESALAHAN : " + "NIM MAHASISWA TIDAK BOLEH NULL");
        }
    }
    public String getNIM(){
        return NIM;
    }
    public void setNAME(String vNAME){
        try{
            NAME = vNAME;
            if (NAME == null){
                throw new NullPointerException();
            }
        }
        catch (NullPointerException npe){
            System.out.println("KESALAHAN : " + "NAMA MAHASISWA TIDAK BOLEH NULL");
        }
    }
    public String getNAME(){
        return NAME;
    }
    public void setNILAI(int vNILAI){
        NILAI = vNILAI;
    }
    public double getNILAI(){
        return NILAI;
    }
}
