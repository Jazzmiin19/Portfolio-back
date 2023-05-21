
package com.example.demo.repository;

import com.example.demo.model.Estudio;
import com.example.demo.model.Presentacion;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IestudioRepository extends JpaRepository <Estudio, Integer> {
    
    public List<Estudio> findByPresentacion(Presentacion presentacion);
}
