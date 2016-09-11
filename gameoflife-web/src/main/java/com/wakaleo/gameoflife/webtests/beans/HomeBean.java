/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wakaleo.gameoflife.webtests.beans;

import java.util.Date;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
* This class rocks.
*
* @author johnsmart
*/
@Named
@RequestScoped
public class HomeBean {
    public String index() {
        String datum = new Date().toString();
        
        if(datum=="test"){
            //dit is onzin
        } else if(datum=="blabla"){
            //nog meer onzin
        } else if (datum.equals("tjaaa")){
            //dit is de laatste onzin
        } else if (datum == "thaaa"){
            //asdasdsad
        }
        
        return "home";
    }
    
    public String home() {
        return "home";
    }
}
