/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wesley.urban_cuts.app.factory;

import com.wesley.urban_cuts.domain.Staff;
import java.util.Map;

/**
 *
 * @author User
 */
public class Staff_Factory {
    
    private static Staff_Factory staff_factory = null;
    
    private Staff_Factory(){}
    
        public static Staff_Factory getInstance(){
        if(staff_factory == null){
            staff_factory = new Staff_Factory();
        }
        return staff_factory;
        }

    public Staff getStaff_Factory(Map<String,String>staffValues, double rate_per_hour){

        Staff staff = new Staff();
        staff.setName(staffValues.get("name"));
        staff.setLast_name(staffValues.get("last_name"));
        staff.setCell_no(staffValues.get("cell_no"));
        staff.setRate_per_hour(rate_per_hour);
        return staff;
    }
}
