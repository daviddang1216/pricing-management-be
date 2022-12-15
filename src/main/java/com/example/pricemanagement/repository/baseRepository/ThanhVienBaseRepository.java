package com.example.pricemanagement.repository.baseRepository;

import com.example.pricemanagement.repository.model.ThanhVienModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface ThanhVienBaseRepository extends JpaRepository<ThanhVienModel, Long>{
}
