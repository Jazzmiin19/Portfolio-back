
package com.example.demo.repository;

import com.example.demo.model.Habilidad;
import com.example.demo.model.Persona;
import com.example.demo.model.Presentacion;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IhabilidadRepository extends JpaRepository <Habilidad, Integer> {
 
    
    public List<Habilidad> findByPresentacion(Presentacion presentacion);

}
