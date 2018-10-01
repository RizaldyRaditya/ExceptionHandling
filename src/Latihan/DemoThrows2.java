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
public class DemoThrows2 {
    public static void Uji(int Angka)throws NullPointerException, ArithmeticException{
        if(Angka < 0){
            throw new NullPointerException("KESALAHAN : NULL POINTER EXCEPTION");
        }else {
            throw new ArithmeticException("KESALAHAN : ARITHMETIC EXCEPTION");
        }
    }
    public static void main (String [] args){
        try{
            Uji(0);
        }
        catch (Exception e){
            System.out.println("EXCEPTION ditangkap di sini...");
            System.out.println(e.getMessage());
        }
        System.out.println("Statemen setelah block try-catch");
    }
}
