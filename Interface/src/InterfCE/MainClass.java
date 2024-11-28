/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfCE;

/**
 *
 * @author fauza
 */
public class MainClass extends PembayaranBelanja {
    public static void main(String[] args) {
        PembayaranBelanja pbcash = new PembayaranBelanja();
        pbcash.BayarCash(50000, 1000);
        System.out.println("Hasil kembalian CASH = " + pbcash.kembalian);
        
        System.out.println("-----------------------------------------------------");
        
        PembayaranBelanja pbgopay  = new PembayaranBelanja();
        pbgopay.bayarGopay(55,100000, 1000);
        System.out.println("Hasil kembalian  Gopay = " + pbgopay.kembalian);
        
        System.out.println("----------------------------------------------------");
        
        PembayaranBelanja pbShopee  = new PembayaranBelanja();
        pbShopee.bayarShopee(98,75000, 2000);
        System.out.println("Hasil kembalian Shopee = " +  + pbShopee.kembalian);
        
         System.out.println("----------------------------------------------------");
        
        PembayaranBelanja pbqris  = new PembayaranBelanja();
        pbqris.BayarQRIS(22,55000, 11000);
        System.out.println("Hasil kembalian Qris = " + pbqris.kembalian);
        
        
        System.out.println("----------------------------------------------------");
        
        PembayaranBelanja pbEwallet  = new PembayaranBelanja();
        pbEwallet.BayarEwallet(54,300000, 1000);
        System.out.println("Hasil kembalian Ewallet = " + pbEwallet.kembalian);
        
         System.out.println("----------------------------------------------------");
        
        PembayaranBelanja pbCreditCard  = new PembayaranBelanja();
        pbCreditCard.BayarCreditCard(34,70000, 1000);
        System.out.println("Hasil kembalian Credit = " + pbCreditCard.kembalian);
        
         System.out.println("----------------------------------------------------");
        
        PembayaranBelanja pbDebitCard  = new PembayaranBelanja();
        pbDebitCard.BayarDebitCard(81,70000, 1000);
        System.out.println("Hasil kembalian Debit = " + pbDebitCard.kembalian);
        
    }
}
