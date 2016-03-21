/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wesley.urban_cuts.app.factory;

import com.wesley.urban_cuts.domain.Staff;
import com.wesley.urban_cuts.domain.Style;
import java.util.Map;

/**
 *
 * @author User
 */
public class Style_Factory {
    
    private static Style_Factory style_factory = null;
    
    private Style_Factory(){}
    
        public static Style_Factory getInstance(){
        if(style_factory == null){
            style_factory = new Style_Factory();
        }
        return style_factory;
        }

    public Style getStyle_Factory(Map<String,String>styleValues, double price){

        Style style = new Style();
        style.setStyle_name(styleValues.get("style_name"));
        style.setDescription(styleValues.get("description"));
        style.setPrice(price);
        
        return style;
    }
}
