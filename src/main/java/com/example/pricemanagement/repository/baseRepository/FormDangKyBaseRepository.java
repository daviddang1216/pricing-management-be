package com.example.pricemanagement.repository.baseRepository;

import com.example.pricemanagement.repository.model.FormDangKyModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface FormDangKyBaseRepository extends JpaRepository<FormDangKyModel, Long>{
    @Query(value = "SELECT * FROM formdangky f INNER JOIN hocsinh hs ON f.ma_giay_khai_sinh = hs.ma_giay_khai_sinh", nativeQuery = true)
    List<FormDangKyModel>  getFormWithStudent();

    @Query(value = "SELECT * FROM formdangky f INNER JOIN hocsinh hs ON f.ma_giay_khai_sinh = hs.ma_giay_khai_sinh WHERE f.trang_thai = 'Xác nhận'", nativeQuery = true)
    List<FormDangKyModel>  getAcceptedForm();
}
