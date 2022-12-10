/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

class Mahasiswa{
    String nama;
    String kelas;
    int NIM;
    double IPK;
}
/**
 *
 * @author user
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("a");
                Mahasiswa mhs = new Mahasiswa();
        mhs.nama = "aji";
        mhs.kelas = "B 2021";
        mhs.NIM = 1234;
        mhs.IPK = 3.9;
              
        System.out.println(mhs.nama);
        System.out.println(mhs.kelas);
        System.out.println(mhs.NIM);
        System.out.println(mhs.IPK);
    }

   
}
