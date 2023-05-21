
package com.example.demo.repository;

import com.example.demo.model.Persona;
import com.example.demo.model.Presentacion;
import com.example.demo.model.Proyecto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IproyectoRepository extends JpaRepository <Proyecto, Integer> {
    
    public List<Proyecto> findByPresentacion(Presentacion presentacion);
}
