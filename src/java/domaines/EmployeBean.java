/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domaines;

import entities.Employe;
import entities.Service;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import service.EmployeService;
import service.ServiceService;

/**
 *
 * @author 
 */
@ManagedBean
@RequestScoped
public class EmployeBean {
    private Employe employe;
    private List<Employe> employes;
    private EmployeService ee;
    
    @ManagedProperty(value="#{serviceBean}")
    private ServiceBean serviceBean;
    
      public void setServiceBean(ServiceBean serviceBean) {
        this.serviceBean = serviceBean;
    }
      
    /**
     * Creates a new instance of EmployeBean
     */
    public EmployeBean() {
        employe = new Employe();
        ee = new EmployeService();
        
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public List<Employe> getEmployes() {
        if(employes == null){
            employes = ee.getAll();
        }
        return employes;
    }

    public void setEmployes(List<Employe> employes) {
        this.employes = employes;
    }
    
    public void onCreateAction(){
      employe.setService(serviceBean.getSelectedService());
         ee.create(employe);
         employe = new Employe();
         employes = null;
        
    }
    
}
