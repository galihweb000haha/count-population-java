/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates for(int i = 0; i <=5; i++){
            System.out.println("balita: "+Balita[i]);
            System.out.println("anak-anak: "+anakanak[i]);            
            System.out.println("remaja: "+remaja[i]);
            System.out.println("dewasa: "+dewasa[i]);     
            

        }
 * and open the template in the editor.
 */
package kiyekeh;

import java.util.Scanner;

/**
 *
 * @author galih
 */
public class kiyekeh {
    public static void main(String[] args){
        String nama, umur;
        int j = 0;
        int k = 0;
        int l = 0;
        int m = 0;
        Scanner key = new Scanner(System.in);
        String [][] penduduk = new String[5][5];
        String [] Balita = new String[5];
        String [] anakanak = new String[5];
        String [] remaja = new String[5];
        String [] dewasa = new String[5];

        
        for(int i = 0; i < 5; i++ ){
            
                System.out.print("masukan nama:");
                penduduk[i][0] = key.nextLine();
                System.out.print("masukan umur:");
                penduduk[i][1] = key.nextLine();
                
                
                System.out.println("");
        }
            System.out.println("----------------------------------");
        for(int i = 0; i < penduduk.length;i++){
            System.out.println("penduduk "+(i+1)+":");
            System.out.println("----------------------------------");
            
            nama = penduduk[i][0];
            umur = penduduk[i][1];            
            System.out.println("nama :"+ nama);
            System.out.println("umur :"+ umur);
            System.out.println("----------------------------------");
            
            if(umur.equals("1") || umur.equals("2") || umur.equals("3")){                                
                Balita[j] = nama;
                j++;
            }else if(umur.equals("4") || umur.equals("5") || umur.equals("6")){
                anakanak[k] = nama;
                k++;
            }else if(umur.equals("7") || umur.equals("8") || umur.equals("9")){
                remaja[l] = nama;
                l++;
            }else{
                dewasa[m] = nama;
                m++;
            }
        }
        System.out.println("Daftar Balita");
        for(int i = 0; i < Balita.length; i++){            
            if(Balita[i] != null){
              System.out.println(i+1+". "+Balita[i]);
            }  
        }
        System.out.println("Daftar Anak-anak");
        for(int i = 0; i < anakanak.length; i++){            
            if(anakanak[i] != null){
                System.out.println(i+1+". "+anakanak[i]);
            }  
        }
        System.out.println("Daftar Remaja");
        for(int i = 0; i < remaja.length; i++){            
            if(remaja[i] != null){
                System.out.println(i+1+". "+remaja[i]);
            }  
        }
        System.out.println("Daftar Dewasa");
        for(int i = 0; i < dewasa.length; i++){            
            if(dewasa[i] != null){
                System.out.println(i+1+". "+dewasa[i]);
            }  
        }
    }
// I want the population to be unlimited, is there anyone who can help me, please..
    
}
