/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Rudi Erwanto
 */
public class DemoInputString {
    public static void main(String[] args) throws IOException {
        System.out.print("Masukkan Nama Anda : ");
        String Nama;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        Nama = br.readLine();
        System.out.println("Hallo " + Nama + ", sudakah anda mengerti java");
    }
}
