package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/*
Hesap makinesinin fonksiyonları :

1- Toplama İşlemi
2- Çıkarma İşlemi
3- Çarpma İşlemi
4- Bölme işlemi
5- Üslü Sayı Hesaplama
6- Faktoriyel Hesaplama
7- Mod Alma
8- Dikdörtgen Alan ve Çevre Hesabı
 */

public class Main {


    public static void toplama () {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Kaç adet toplama yapıcaksınız ?:  ");
        int k=scanner.nextInt();
        int y=0;
        for (int j = 1; j <= k; j++) {
            System.out.print("Toplanılacak "+j+".Sayıyı giriniz:"  );
            int x = scanner.nextInt();
            y+=x;
            if(j>=k){
                System.out.println("Sonuç: "+y);
                try {
                    Thread.sleep(4000);                 //4 second.
                } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
        }

    }
    public static int cikarma (int a,int b) {
      return  a-b;
            }


    public static void carpma () {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Kaç adet çarpma yapıcaksınız ?:  ");
        int k=scanner.nextInt();
        int y=1;
        for (int j = 1; j <= k; j++) {
            System.out.print("Çarpma yapılacak "+j+".Sayıyı giriniz:"  );
            int x = scanner.nextInt();
            y*=x;
            if(j>=k){
                System.out.println("Sonuç: "+y);
                try {
                    Thread.sleep(4000);                 //4 second.
                } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
    public static int bölme (int a, int b) {
        return a/b;
    }
    public static int üs (int a, int b) {
        return (int)Math.pow(a,b);
    }
    public static int faktoriyel (int a) {
        if(a>0){
        return a*faktoriyel(a-1);
        }
        else
            return 1;
    }
    public static int mod (int a, int b) {
        return a%b;
    }
    public static void dikdortgenalanvecevre () {
        Scanner scanner1=new Scanner(System.in);
        int h,g,f;
        System.out.print("Uzun kenarı giriniz:");
        int x =scanner1.nextInt();
        System.out.print("Kısa kenarı giriniz:");
        int y=scanner1.nextInt();
        System.out.println("çevre sonucu: "+2*(x+y));
        System.out.println("Alan sonucu:"+ x*y);


    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; ; i++) {

            System.out.print("Hesap Makinesi işlemleri Menüsü\n" +
                    "Toplama için 1 basınız.\n" +
                    "Çarpma için 2 basınız.\n" +
                    "Çıkarma için 3 basınız.\n" +
                    "Bölme için 4 basınız.\n" +
                    "Üs alma için 5 basınız.\n" +
                    "Faktoriyel için 6 basınız. \n" +
                    "Mod için 7 basınız.\n" +
                    "Diktorgen çevre ve alan için 8 basınız.\n" +
                    "Çıkış için 0 basınız.\n ");
            int q = scanner.nextInt();
            if(q==0) {
                System.out.println("Döngüden çıkılıyor...");
                try {
                    Thread.sleep(2000);                 //2 second.
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                break;
            }
            switch (q){
                case 1:
                    toplama();break;
                case 2:
                    System.out.print("Çıkartılacak 1. sayıyı giriniz: ");
                    int x = scanner.nextInt();
                    System.out.print("Çıkartılacak 2. sayıyı giriniz: ");
                    int y=scanner.nextInt();
                    System.out.println("Sonuç: "+cikarma(x,y));
                            try {
                                Thread.sleep(4000);                 //4 second.
                            } catch(InterruptedException ex) {
                                Thread.currentThread().interrupt();
                            }break;
                case 3:
                    carpma();break;
                case 4:
                    System.out.print("Bölüm yapılacak 1. sayıyı giriniz: ");
                    int k = scanner.nextInt();
                    System.out.print("Bölüm yapılacak 2. sayıyı giriniz: ");
                    int m=scanner.nextInt();
                    System.out.println("Sonuç: "+bölme(k,m));
                    try {
                        Thread.sleep(4000);                 //4 second.
                    } catch(InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }break;
                case 5:
                    System.out.print("Taban için 1. sayıyı giriniz: ");
                    int l= scanner.nextInt();
                    System.out.print("Üssünnü almak için 2. sayıyı giriniz: ");
                    int w=scanner.nextInt();
                    System.out.println("Sonuç: "+üs(l,w));
                    try {
                        Thread.sleep(4000);                 //4 second.
                    } catch(InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }break;
                case 6:
                    System.out.print("Faktöriyeli alınacak sayıyı giriniz : ");
                    int r= scanner.nextInt();
                    System.out.print("Sonuç: "+faktoriyel(r));
                    try {
                        Thread.sleep(4000);                 //4 second.
                    } catch(InterruptedException ex) {
                        Thread.currentThread().interrupt();}break;
                case 7:
                    System.out.print("Moddu alınacak say giriniz : ");
                    int t= scanner.nextInt();
                    System.out.print("Hangi sayıyı göre modu alınacak giriniz: ");
                    int u=scanner.nextInt();
                    System.out.print("Sonuç: "+mod(t,u));
                    try {
                        Thread.sleep(4000);                 //4 second.
                    } catch(InterruptedException ex) {
                        Thread.currentThread().interrupt();}break;
                case 8:
                   dikdortgenalanvecevre();
                    try {
                        Thread.sleep(4000);                 //4 second.
                    } catch(InterruptedException ex) {
                        Thread.currentThread().interrupt();}break;
        }
}

}}