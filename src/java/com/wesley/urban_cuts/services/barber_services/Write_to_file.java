/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wesley.urban_cuts.services.barber_services;

import com.wesley.urban_cuts.services.crud.crudServices.PaymentCrudService;
import com.wesley.urban_cuts.services.crud.crudServices.StaffCrudService;
import com.wesley.urban_cuts.services.crud.crudServices.StyleCrudService;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author User
 */
public class Write_to_file {
    private static ApplicationContext ctx;
    private static StaffCrudService staffCrudService;
    private static StyleCrudService styleCrudService;
    private static PaymentCrudService paymentCrudService;
    private List<String> allPayments;

    public Write_to_file() {
        ctx = new ClassPathXmlApplicationContext("classpath:com/wesley/urban_cuts/app/conf/applicationContext-*.xml");
        staffCrudService = (StaffCrudService) ctx.getBean("StaffCrudService");
        styleCrudService = (StyleCrudService) ctx.getBean("StyleCrudService");
        paymentCrudService = (PaymentCrudService) ctx.getBean("PaymentCrudService");
        
    }
    
    public void write_to_file(String data1, String data2, String data3){
    Date d = new Date();
    Writer writer = null;
    try {
        writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Urban Cuts Log"+".txt"), "utf-8"));
        
        writer.append("");
        writer.append(data1+"   "+data2+"   "+data3+"   "+d);
        
    
    } catch (IOException ex) {
           System.out.println("couldn't write to file"); 
        } finally {
        try {writer.close();} catch (Exception ex) {/*ignore*/}
        }
    }
}
