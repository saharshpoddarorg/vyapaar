package payment;

import customer.Payee;
import customer.Payer;

import java.util.Date;

public class PaymentTransaction
{

    private PaymentMode paymentMode;
    private Date date;
    private double amount;
    private Payee payee;
    private Payer payer;

    public PaymentMode getPaymentMode()
    {
        return paymentMode;
    }

    public Date getDate()
    {
        return date;
    }

    public double getAmount()
    {
        return amount;
    }

    public Payee getPayee()
    {
        return payee;
    }

    public Payer getPayer()
    {
        return payer;
    }

    public PaymentTransaction setPaymentMode(PaymentMode paymentMode)
    {
        this.paymentMode = paymentMode;
        return this;
    }

    public PaymentTransaction setDate(Date date)
    {
        this.date = date;
        return this;
    }

    public PaymentTransaction setAmount(double amount)
    {
        this.amount = amount;
        return this;
    }

    public PaymentTransaction setPayee(Payee payee)
    {
        this.payee = payee;
        return this;
    }

    public PaymentTransaction setPayer(Payer payer)
    {
        this.payer = payer;
        return this;
    }
}
