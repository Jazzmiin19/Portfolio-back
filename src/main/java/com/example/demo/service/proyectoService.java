
package com.example.demo.service;

import com.example.demo.model.Persona;
import com.example.demo.model.Presentacion;
import com.example.demo.model.Proyecto;
import com.example.demo.repository.IproyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class proyectoService {
    
    @Autowired
    public IproyectoRepository proyectoRepo;
    
    public List<Proyecto> ListarProyectos(){
        
        return proyectoRepo.findAll();
    }
    
    public void crearProyecto(Proyecto proye){
        
        proyectoRepo.save(proye);
    }
    
    
    public void borrarProyecto(int id){
    
        proyectoRepo.deleteById(id);
    }
    
    
    public Proyecto buscarProyecto(int id){
    
       return proyectoRepo.findById(id).orElse(null);
    }
    
    public void editarProyecto(Proyecto pers){
    
        proyectoRepo.save(pers);
    }
    
    
    
    public List<Proyecto> buscarPorPresentacion(Presentacion presen){
        
        return proyectoRepo.findByPresentacion(presen);
    
    }
    
}
