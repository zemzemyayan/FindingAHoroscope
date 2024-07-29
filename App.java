package Projects;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        /*
         * 
         * Oğlak Burcu : 22 Aralık - 21 Ocak
         * 
         * Kova Burcu : 22 Ocak - 19 Şubat
         * 
         * Balık Burcu : 20 Şubat - 20 Mart
         * 
         * Koç Burcu : 21 Mart - 20 Nisan
         * 
         * Boğa Burcu : 21 Nisan - 21 Mayıs
         * 
         * İkizler Burcu : 22 Mayıs - 22 Haziran
         * 
         * Yengeç Burcu : 23 Haziran - 22 Temmuz
         * 
         * Aslan Burcu : 23 Temmuz - 22 Ağustos
         * 
         * Başak Burcu : 23 Ağustos - 22 Eylül
         * 
         * Terazi Burcu : 23 Eylül - 22 Ekim
         * 
         * Akrep Burcu : 23 Ekim - 21 Kasım
         * 
         * Yay Burcu : 22 Kasım - 21 Aralık
         * 
         * 
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("doğum aynızı giriniz:");
        String month = sc.nextLine();
        System.out.println("dogum gununu giriniz: ");
        int gun = sc.nextInt();
        switch (month) {
            case "1":
                if (gun > 1 && gun <= 21) {
                    System.out.println("oğlak burcu");
                } else if (gun > 21 && gun <= 30) {
                    System.out.println("kova burcu");
                }
                break;

            case "2":
                if (gun >= 1 && gun <= 19) {
                    System.out.println("kova burcu");
                } else if (gun > 19 && gun <= 28) {
                    System.out.println("balık burcu");
                }
                break;

            case "3":
                if (gun >= 1 && gun <= 20) {
                    System.out.println("balık burcu");
                } else if (gun > 20 && gun <= 30) {
                    System.out.println("koç burcu");
                }
                break;

            case "4":
                if (gun >= 1 && gun <= 20) {
                    System.out.println("koç burcu");
                } else if (gun > 20 && gun <= 30) {
                    System.out.println("boğa burcu.");
                }
                break;

            case "5":
                if (gun >= 1 && gun <= 21) {
                    System.out.println("boğa burcu");
                } else if (gun > 21 && gun <= 31) {
                    System.out.println("ikizler burcu");
                }
                break;

            case "6":
                if (gun >= 1 && gun <= 22) {
                    System.out.println("ikizler");
                } else if (gun > 22 && gun <= 31) {
                    System.out.println("yengeç burcu");
                }
                break;

            case "7":
                if (gun >= 1 && gun <= 22) {
                    System.out.println("yengeç burcu");
                } else if (gun > 22 && gun <= 31) {
                    System.out.println("aslan burcu");
                }
                break;

            case "8":
                if (gun >= 1 && gun <= 22) {
                    System.out.println("aslan burcu");
                } else if (gun > 22 && gun <= 31) {
                    System.out.println("başak burcu");
                }
                break;

            case "9":
                if (gun >= 1 && gun <= 22) {
                    System.out.println("başak burcu");
                } else if (gun > 22 && gun <= 31) {
                    System.out.println("terazi burcu");
                }
                break;

            case "10":
                if (gun >= 1 && gun <= 22) {
                    System.out.println("terazi burcu");
                } else if (gun > 22 && gun <= 31) {
                    System.out.println("akrep burcu");
                }
                break;

            case "11":
                if (gun >= 1 && gun <= 22) {
                    System.out.println("akrep burcu");
                } else if (gun > 22 && gun <= 31) {
                    System.out.println("yay burcu");
                }
                break;

            case "12":
                if (gun >= 1 && gun <= 22) {
                    System.out.println("yay burcu");
                } else if (gun > 22 && gun <= 31) {
                    System.out.println("oğlak burcu");
                }
                break;

        }

        sc.close();
    }
}
