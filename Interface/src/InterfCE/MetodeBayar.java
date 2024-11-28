/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package InterfCE;

/**
 *
 * @author fauza
 */
public interface MetodeBayar {
    public double BayarCash(double cash, double belanja);
    public double BayarQRIS(int kodeQris,double saldo,double belanja);
    public double BayarEwallet(int kodeEwallet,double saldo,double belanja);
    public double BayarCreditCard(int NomorRekening,double saldo,double belanja);
    public double BayarDebitCard(int NomorRekening,double saldo,double belanja);
}
