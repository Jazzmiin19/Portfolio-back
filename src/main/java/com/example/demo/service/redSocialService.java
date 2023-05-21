
package com.example.demo.service;

import com.example.demo.model.Persona;
import com.example.demo.model.Presentacion;
import com.example.demo.model.RedSocial;
import com.example.demo.repository.IredsocialRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class redSocialService {
    
    @Autowired
    public IredsocialRepository redSocialRepo;
    
    public List<RedSocial> verRedSocial(){
        
        return redSocialRepo.findAll();
    }
    
    public void crearRedSocial(RedSocial red){
        
        redSocialRepo.save(red);
    }
    
    
    public void borrarRedSocial(int id){
    
        redSocialRepo.deleteById(id);
    }
    
    
    public RedSocial buscarRedSocial(int id){
    
       return redSocialRepo.findById(id).orElse(null);
    }
    
    public void editarRedSocial(RedSocial red){
    
        redSocialRepo.save(red);
    }
    
    public List<RedSocial> buscarPorPresentacion(Presentacion presen){
        
        
        return redSocialRepo.findByPresentacion(presen);
    
       
    }
    
    
  
    
}
