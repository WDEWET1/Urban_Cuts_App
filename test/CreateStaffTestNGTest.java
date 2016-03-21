/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.wesley.urban_cuts.app.factory.Payment_Factory;
import com.wesley.urban_cuts.app.factory.Staff_Factory;
import com.wesley.urban_cuts.app.factory.Style_Factory;
import com.wesley.urban_cuts.domain.Payment;
import static com.wesley.urban_cuts.domain.Payment_.date;
import com.wesley.urban_cuts.domain.Staff;
import com.wesley.urban_cuts.domain.Style;
import com.wesley.urban_cuts.services.crud.crudServices.PaymentCrudService;
import com.wesley.urban_cuts.services.crud.crudServices.StaffCrudService;
import com.wesley.urban_cuts.services.crud.crudServices.StyleCrudService;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author User
 */
public class CreateStaffTestNGTest {
    
    private static ApplicationContext ctx;
    private static StaffCrudService staffCrudService;
    private static StyleCrudService styleCrudService;
    private static PaymentCrudService paymentCrudService;
    
    public CreateStaffTestNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void persist_test() {
    
        double rate_per_hour;
        Staff_Factory staff_Factory = Staff_Factory.getInstance();

        Map<String,String>staffValues = new HashMap<>();
        staffValues.put("name", "wesley");
        staffValues.put("last_name", "de wet");
        staffValues.put("cell_no", "0743658427");
        rate_per_hour = 120.99;
        
        Staff staff = staff_Factory.getStaff_Factory(staffValues, rate_per_hour);
        staffCrudService.persist(staff);

    }
    
    @Test
    public void persist_test2() {
    
        double price;
        Style_Factory style_Factory = Style_Factory.getInstance();

        Map<String,String>styleValues = new HashMap<>();
        styleValues.put("style_name", "fader");
        styleValues.put("description", "long on top, short on sides");
        price = 120.99;
        
        Style style = style_Factory.getStyle_Factory(styleValues, price);
        styleCrudService.persist(style);
        
    }
    
    @Test
    public void persist_test3() {
    
        double price;
        Date date = new Date();
        Payment_Factory payment_Factory = Payment_Factory.getInstance();

        Map<String,String>paymentValues = new HashMap<>();
        paymentValues.put("barber_name", "warren");
        paymentValues.put("style_name", "fader");
        price = 120.99;
        
        Payment payment = payment_Factory.getPayment_Factory(paymentValues, price, (Date) date);
        paymentCrudService.persist(payment);
        
    }
    
    
    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new ClassPathXmlApplicationContext("classpath:com/wesley/urban_cuts/app/conf/applicationContext-*.xml");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        staffCrudService = (StaffCrudService) ctx.getBean("StaffCrudService");
        styleCrudService = (StyleCrudService) ctx.getBean("StyleCrudService");
        paymentCrudService = (PaymentCrudService) ctx.getBean("PaymentCrudService");
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
