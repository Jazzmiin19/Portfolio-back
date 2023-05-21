
package com.example.demo.repository;

import com.example.demo.model.Experiencia;
import com.example.demo.model.Persona;
import com.example.demo.model.Presentacion;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface IexperienciaRepository extends JpaRepository <Experiencia, Integer>{
    
    public List<Experiencia> findByPresentacion(Presentacion presentacion);
    
}
