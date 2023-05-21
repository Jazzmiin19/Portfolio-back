
package com.example.demo.service;

import com.example.demo.model.Experiencia;
import com.example.demo.model.Persona;
import com.example.demo.model.Presentacion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.IexperienciaRepository;

@Service
public class experienciaService {
    
    @Autowired
    public IexperienciaRepository expeRepo;
    
    public List<Experiencia> verExperiencias(){
        
        return expeRepo.findAll();
    }
    
    public void crearExperiencia(Experiencia expe){
        
        expeRepo.save(expe);
    }
    
    
    public void borrarExperiencia(int id /*Experiencia expe*/){
    
        expeRepo.deleteById(id);
       // expeRepo.delete(expe);
    }
    
    
    public Experiencia buscarExperiencia(int id){
    
       return expeRepo.findById(id).orElse(null);
    }
    
    public void editarExperiencia(Experiencia expe){
    
        expeRepo.save(expe);
    }


    
    public List<Experiencia> buscarPorPresentacion(Presentacion presen){
        
        return expeRepo.findByPresentacion(presen);
    
       
    }
    
    
    
}
