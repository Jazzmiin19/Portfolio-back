
package com.example.demo.service;

import com.example.demo.model.Estudio;
import com.example.demo.model.Persona;
import com.example.demo.model.Presentacion;
import com.example.demo.repository.IestudioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class estudioService {
    
    @Autowired
    public IestudioRepository estudioRepo;
    
    public List<Estudio> verEstudio(){
        
        return estudioRepo.findAll();
    }
    
    public void crearEstudio(Estudio estudio){
        
        estudioRepo.save(estudio);
    }
    
    
    public void borrarEstudio(int id){
    
        estudioRepo.deleteById(id);
    }
    
    
    public Estudio buscarEstudio(int id){
    
        return estudioRepo.findById(id).orElse(null);
    }
    
    public void editarEstudio(Estudio estudio){
    
        estudioRepo.save(estudio);
    }
    
    
    public List<Estudio> buscarPorPresentacion(Presentacion presentacion){
        
        return estudioRepo.findByPresentacion(presentacion);
    
    }
    
}
