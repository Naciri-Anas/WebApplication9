/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domaines;

import entities.Service;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ValueChangeEvent;
import service.ServiceService;

/**
 *
 * @author Lachgar
 */
@ManagedBean
@RequestScoped
public class ServiceBean {
    private Service selectedService;
    private Service service;
    private List<Service> services;
    private ServiceService ss;
    
    /**
     * Creates a new instance of ServiceBean
     */
    public ServiceBean() {
       
        service = new Service();
        ss = new ServiceService();
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public List<Service> getServices() {
        if(services==null){
            services =ss.getAll();
        }
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }
    
    
    public void onCreateAction(){
        ss.create(service);
        service = new Service();
    }
    
    public Service getSelectedService() {
   
    return selectedService;
}
    
    public void setSelectedService(Service selectedService) {
        this.selectedService = selectedService;
    }

    public void updateSelectedService(ValueChangeEvent event) {
    selectedService = (Service) event.getNewValue();
}
    
}
