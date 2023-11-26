/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entities.Employe;
import entities.Service;
import java.util.List;

/**
 *
 * @author anasn
 */
public class EmployeService extends AbstractFacade<Employe>{
   @Override
    protected Class<Employe> getEntityClass() {
        return Employe.class;
    }
    
   

    
}
