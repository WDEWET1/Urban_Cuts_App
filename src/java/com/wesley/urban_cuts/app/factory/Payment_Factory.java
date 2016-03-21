/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wesley.urban_cuts.app.factory;

import com.wesley.urban_cuts.domain.Payment;
import java.util.Date;
import java.util.Map;

/**
 *
 * @author User
 */
public class Payment_Factory {
    
    private static Payment_Factory payment_factory = null;
    
    private Payment_Factory(){}
    
        public static Payment_Factory getInstance(){
        if(payment_factory == null){
            payment_factory = new Payment_Factory();
        }
        return payment_factory;
        }

    public Payment getPayment_Factory(Map<String,String>paymentValues, double price, Date date){

        Payment payment = new Payment();
        payment.setBarber_name(paymentValues.get("barber_name"));
        payment.setStyle_name(paymentValues.get("style_name"));
        payment.setDate(date);
        payment.setPrice(price);
        
        return payment;
    }
}
