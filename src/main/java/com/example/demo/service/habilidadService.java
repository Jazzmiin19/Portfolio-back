
package com.example.demo.service;

import com.example.demo.model.Habilidad;
import com.example.demo.model.Persona;
import com.example.demo.model.Presentacion;
import com.example.demo.repository.IhabilidadRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class habilidadService {
   
    @Autowired
    public IhabilidadRepository habilidadRepo;
    
    
    
    public List<Habilidad> verHabilidad(){
        
        return habilidadRepo.findAll();
    }
    
    public void crearHabilidad(Habilidad habili){
        
        habilidadRepo.save(habili);
    }
    
    
    public void borrarHabilidad(int id){
    
        habilidadRepo.deleteById(id);
    }
    
    
    public Habilidad buscarHabilidad(int id){
    
       return habilidadRepo.findById(id).orElse(null);
    }
    
    public void editarHabilidad(Habilidad presen){
    
        habilidadRepo.save(presen);
    }
    
    
    public List<Habilidad> buscarPorPresentacion(Presentacion presen){
        
        return habilidadRepo.findByPresentacion(presen);
    
    }
    

}
