/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package InterfCE;

/**
 *
 * @author fauza
 */
public class PembayaranBelanja implements MetodeBayarPakeAplikasi {
   //double uangCash;
    double kembalian;
    //dpuble jumlahTotalBelanjua;
    
    @Override
    public double BayarCash(double cash,double belanja){
        kembalian = cash - belanja;
        return kembalian;
    }

    @Override
    public double bayarGopay(int idUser, double saldo, double belanjaTotal) {
        kembalian = saldo-belanjaTotal;
        System.out.println("id Gopay " + idUser);
        return kembalian;
    }

    @Override
    public double bayarShopee(int idUser, double saldo, double belanjaTotal) {
        kembalian = saldo-belanjaTotal;
        System.out.println("id USER " + idUser);
        return kembalian;
        
    }

    @Override
    public double BayarQRIS(int kodeQris,double saldo,double belanja) {
        kembalian = saldo-belanja;
        System.out.println("KODE QRIS" + kodeQris);
        return kembalian;
    }

    @Override
    public double BayarEwallet(int kodeEwallet,double saldo,double belanja) {
        kembalian = saldo-belanja;
        System.out.println("KODE EWALLET" + kodeEwallet);
        return kembalian;
    }

    @Override
    public double BayarCreditCard(int NomorRekening,double saldo,double belanja) {
        kembalian = saldo-belanja;
        System.out.println("Nomor Rekening "+NomorRekening);
        return kembalian;
    }

    @Override
    public double BayarDebitCard(int NomorRekening,double saldo,double belanja) {
        kembalian = saldo-belanja;
        System.out.println("Nomor Rekening " + NomorRekening);
        return kembalian;
    }
    
    
}
