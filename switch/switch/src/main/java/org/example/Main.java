package org.example;

public class Main {
    public static void main(String[] args) {
        char grade = 'G';

        switch (grade){
            case 'A':
                System.out.println("mükemmel, geçtiniz");
                break;
            case 'B':
                System.out.println("çok güzel, geçtiniz");
                break;
            case 'C':
                System.out.println("iyi, geçtiniz");
                break;
            case 'D':
                System.out.println("idare eder, geçtiniz");
                break;
            case 'F':
                System.out.println("malesef, kaldınız");
                break;
            default:
                System.out.println("GEÇERSİZ NOT GİRDİNİZ");
        }
    }
}