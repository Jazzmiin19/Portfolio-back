
package com.example.demo.repository;

import com.example.demo.model.Persona;
import com.example.demo.model.Presentacion;
import com.example.demo.model.RedSocial;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IredsocialRepository extends JpaRepository <RedSocial, Integer> {
    
    public List<RedSocial> findByPresentacion(Presentacion presen);
}
