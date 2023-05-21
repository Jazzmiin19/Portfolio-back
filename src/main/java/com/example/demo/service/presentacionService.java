
package com.example.demo.service;


import com.example.demo.model.Presentacion;
import com.example.demo.repository.IpresentacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class presentacionService {
   
    
    @Autowired
    public IpresentacionRepository presenRepo;
    
    
    public List<Presentacion> verPresentacion(){
        
        return presenRepo.findAll();
    }
    
    public void crearPresentacion(Presentacion presentacion){
        
        presenRepo.save(presentacion);
    }
    
    
    public void borrarPresentacion(int id){
    
        presenRepo.deleteById(id);
    }
    
    
    public Presentacion buscarPresentacion(int id){
    
        return presenRepo.findById(id).orElse(null);
    }
    
    public void editarPresentacion(Presentacion presentacion){
    
        presenRepo.save(presentacion);
    }
    
    
   
    
    
}
