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
public class NegativeNumberException extends Exception {
    private int Bilangan;
    NegativeNumberException() {
    }
      NegativeNumberException(String pesan){
        super(pesan);
    }
      NegativeNumberException(String pesan, int Nilai){
          super(pesan);
          Bilangan = Nilai;
      }
      public int getBilangan(){
          return Bilangan;
      }
}
