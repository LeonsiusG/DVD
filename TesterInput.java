package Tees;

import java.util.Scanner;

public class TesterInput {
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Pilih Product atau DVD atau CD");
        String pilihan = s.nextLine();
       
        if (pilihan.equals("Product")) {
            Product[] p = new Product[5];
            int number; 
            String nama; 
            int quantity; 
            double price;
            p[3] = new Product();
            p[3].print();
        } else if(pilihan.equals("DVD")) {
            CD[] cd = new CD[10];
            String artist; 
            int numSong; 
            String label;
            cd[0] = new CD();
            cd[0].print();
        } else if(pilihan.equals("CD")) {
            DVD[] dvd = new DVD[8];
            int lenght;
            String rating;
            String Studio;
            dvd[6] = new DVD();
            dvd[6].print();
        }

        }
    }
  