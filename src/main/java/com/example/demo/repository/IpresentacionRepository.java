

package com.example.demo.repository;

import com.example.demo.model.Presentacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IpresentacionRepository extends JpaRepository <Presentacion, Integer> {
    
}
