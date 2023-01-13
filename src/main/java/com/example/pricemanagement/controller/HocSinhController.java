package com.example.pricemanagement.controller;

import com.example.pricemanagement.repository.model.HocSinhModel;
import com.example.pricemanagement.service.HocSinhService;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/student")
public class HocSinhController {
    private final HocSinhService hocSinhService;

    public HocSinhController(HocSinhService hocSinhService) {
        this.hocSinhService = hocSinhService;
    }

    //Get student's information by an input member's id
    @GetMapping("/get-by-id")
    public List<HocSinhModel> getHocSinhById(@RequestParam(value = "id") String id){
        return this.hocSinhService.getHocSinhById(id);
    }

    //Get students' information by an input family's id
    @GetMapping("/get-by-id-shk")
    public List<HocSinhModel> getHocSinhByIdshk(@RequestParam(value = "id_shk") String id){
        return this.hocSinhService.getHocSinhByIdshk(id);
    }
}
